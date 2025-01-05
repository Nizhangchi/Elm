package ynu.sxp.demoapp.admin.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import ynu.sxp.demoapp.common.TrimString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewRoleRO {
    @Schema(description = "角色名称")
    @NotEmpty @Length(max = 20)
    @JsonDeserialize(using = TrimString.class)
    public String name;
}

