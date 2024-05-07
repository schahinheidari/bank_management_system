package fr.tln.univ.bank_management_system.dto.user;

import fr.tln.univ.bank_management_system.dto.base.ViewBaseDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ViewUserDto extends ViewBaseDto {

    private String name;

    private String family;

    private String gender;

    private Long birthdayTime;

    private String password;

    private String postalCode;

    private String phoneNumber;

    private String email;
}
