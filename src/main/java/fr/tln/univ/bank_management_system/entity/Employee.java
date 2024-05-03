package fr.tln.univ.bank_management_system.entity;

import fr.tln.univ.bank_management_system.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Employee extends User{

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
}
