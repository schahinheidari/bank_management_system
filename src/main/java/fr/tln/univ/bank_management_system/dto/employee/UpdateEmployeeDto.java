package fr.tln.univ.bank_management_system.dto.employee;

import fr.tln.univ.bank_management_system.dto.base.UpdateBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateEmployeeDto extends UpdateBaseDto {
    @Positive
    private double salary;

    @NotBlank
    private String role;
}
