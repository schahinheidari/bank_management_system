package fr.tln.univ.bank_management_system.dto.account;

import fr.tln.univ.bank_management_system.dto.base.UpdateBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateAccountDto extends UpdateBaseDto {
    @NotNull
    private String accountNumber;

    @NotBlank
    private String accountType;
}
