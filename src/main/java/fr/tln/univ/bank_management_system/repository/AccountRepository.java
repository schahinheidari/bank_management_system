package fr.tln.univ.bank_management_system.repository;

import fr.tln.univ.bank_management_system.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {
}
