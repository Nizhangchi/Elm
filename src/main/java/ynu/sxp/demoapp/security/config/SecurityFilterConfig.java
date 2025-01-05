package ynu.sxp.demoapp.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.RequestCacheConfigurer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Collection;
import java.util.stream.Collectors;

@Configuration
@EnableMethodSecurity
public class SecurityFilterConfig {

    @Bean
    SecurityFilterChain apiSecurityfilterChain(HttpSecurity http) throws Exception {
        // 公开的API路径
        var publicPaths = new String[]{"/doc/**", "/auth/**", "/captcha/**"};


        http.cors(cors -> {
            cors.configurationSource(request -> {
                var corsConfig = new CorsConfiguration();
                corsConfig.setAllowCredentials(false); // 不允许携带凭证
                corsConfig.addAllowedOrigin("*"); // 允许所有来源
                corsConfig.addAllowedHeader("*"); // 允许所有请求头
                corsConfig.addAllowedMethod("*");  // 允许所有请求方法
                corsConfig.setMaxAge(3600L); // 1小时内不需要再预检
                return corsConfig;
            });
        }).authorizeHttpRequests(authorize ->
                authorize.requestMatchers(publicPaths).permitAll()
                        .anyRequest().authenticated()
        );

        http.oauth2ResourceServer(server->{
            server.jwt(jwtConfigurer -> jwtConfigurer.jwtAuthenticationConverter(getJwtConverter()));
        });

        disableUnusedFilter(http);
        return http.build();
    }

    /** 用于创建一个jwt信息的转换器 */
    private Converter<Jwt, AbstractAuthenticationToken> getJwtConverter() {
        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
        // 将 jwt 中的 roles 信息转换成权限对象
        converter.setJwtGrantedAuthoritiesConverter(jwt -> {

            Collection<String> authorities = jwt.getClaimAsStringList("roles");
            System.out.printf("roles: %s\n", authorities);

            return authorities.stream()
                    .map(r->new SimpleGrantedAuthority("ROLE_"+ r))
                    .collect(Collectors.toList());

        });

        return converter;
    }

    /** 对于无状态的RESTFul风格的应用，需要禁用掉这些被默认启用的过滤器 */
    private void disableUnusedFilter(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .headers(AbstractHttpConfigurer::disable)
                .anonymous(AbstractHttpConfigurer::disable)
                .logout(AbstractHttpConfigurer::disable)
                .sessionManagement(AbstractHttpConfigurer::disable)
                .requestCache(RequestCacheConfigurer::disable);
    }

}
