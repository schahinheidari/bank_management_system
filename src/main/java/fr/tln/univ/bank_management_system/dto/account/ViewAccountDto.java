package fr.tln.univ.bank_management_system.dto.account;

import fr.tln.univ.bank_management_system.dto.base.ViewBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ViewAccountDto extends ViewBaseDto {
    private String accountNumber;
    private String accountType;
    private String clientName;
}
