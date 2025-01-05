package ynu.sxp.demoapp.common.config;

// OpenApiConfig是一个配置类，用于配置SpringDoc的OpenAPI
// SpringDoc是一个用于生成OpenAPI的工具
// 通过SpringDoc，可以根据Spring Boot项目中的API自动生成OpenAPI文档
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "${api.title: DemoApp}",
                version = "${api.version: v1}",
                description = "${api.description: This is a demo app}",
                contact = @Contact(name = "SunXP", url = "https://github.com/sxpynu"),
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")
        )
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SpringDocConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        String[] publicPaths = {"/auth/**", "/doc/**", "/captcha/**"};
        return GroupedOpenApi.builder().group("可匿名调用的API接口")
                .pathsToMatch(publicPaths)
                .build();
    }

    @Bean
    public GroupedOpenApi protectedApi() {
        return GroupedOpenApi.builder().group("需认证后才可调用的API接口")
                .pathsToMatch("/api/**")
                .build();
    }

}
