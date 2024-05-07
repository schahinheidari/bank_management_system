package fr.tln.univ.bank_management_system.repository;

import fr.tln.univ.bank_management_system.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends BaseRepository<Client, Long> {
}
