package fr.tln.univ.bank_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<E, ID> extends JpaRepository<E, ID> {

}
