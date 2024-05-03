package fr.tln.univ.bank_management_system.entity;

import fr.tln.univ.bank_management_system.enums.AccountType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Account extends BaseEntity{
    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
     private Client client;

}
