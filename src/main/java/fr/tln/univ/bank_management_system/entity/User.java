package fr.tln.univ.bank_management_system.entity;

import fr.tln.univ.bank_management_system.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
public class User extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String family;

    @Column(unique = true, updatable = false)
    private long nationalCode;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date birthday;

    @Column(nullable = false, unique = true, updatable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;





}
