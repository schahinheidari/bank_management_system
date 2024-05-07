package fr.tln.univ.bank_management_system.dto.employee;

import fr.tln.univ.bank_management_system.dto.base.AddBaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddEmployeeDto extends AddBaseDto {
    @Positive
    private double salary;

    @NotBlank
    private String role;
}
