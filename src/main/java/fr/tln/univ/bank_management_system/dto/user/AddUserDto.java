package fr.tln.univ.bank_management_system.dto.user;

import fr.tln.univ.bank_management_system.dto.base.AddBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddUserDto extends AddBaseDto {
    @NotBlank
    private String name;

    @NotBlank
    private String family;

    @Positive
    private long nationalCode;

    @NotBlank
    private String gender;

    @NotNull
    private Long birthdayTime;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String postalCode;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String email;


}
