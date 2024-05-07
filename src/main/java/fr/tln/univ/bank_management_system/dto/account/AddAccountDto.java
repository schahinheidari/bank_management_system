package fr.tln.univ.bank_management_system.dto.account;

import fr.tln.univ.bank_management_system.dto.base.AddBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddAccountDto extends AddBaseDto {
    @NotNull
    private String accountNumber;

    @NotBlank
    private String accountType;
}
