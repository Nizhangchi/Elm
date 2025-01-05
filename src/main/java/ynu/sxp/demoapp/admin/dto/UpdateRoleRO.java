package ynu.sxp.demoapp.admin.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import ynu.sxp.demoapp.common.TrimString;

import java.util.UUID;
@Data
public class UpdateRoleRO {

    @NotNull
    public UUID id;

    @Schema(description = "角色名称", maxLength = 20)
    @NotEmpty @Length(min = 1, max = 20)
    @JsonDeserialize(using = TrimString.class)
    public String name;
}
