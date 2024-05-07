package fr.tln.univ.bank_management_system.dto.employee;

import fr.tln.univ.bank_management_system.dto.base.ViewBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ViewEmployeeDto extends ViewBaseDto {
    private double salary;

    private String role;
}
