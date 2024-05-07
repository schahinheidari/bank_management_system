package fr.tln.univ.bank_management_system.dto.base;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateBaseDto {
    @NotNull
    private Long id;
}
