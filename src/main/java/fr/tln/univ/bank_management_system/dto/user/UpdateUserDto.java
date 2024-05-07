package fr.tln.univ.bank_management_system.dto.user;

import fr.tln.univ.bank_management_system.dto.base.UpdateBaseDto;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateUserDto extends UpdateBaseDto {
    @NotBlank
    private String name;

    @NotBlank
    private String family;

    @NotBlank
    private String gender;

    @NotNull
    private Long birthdayTime;

    @NotBlank
    private String password;

    @NotNull
    private String postalCode;

    @NotBlank
    private String phoneNumber;

    @NotNull
    private String email;
}
