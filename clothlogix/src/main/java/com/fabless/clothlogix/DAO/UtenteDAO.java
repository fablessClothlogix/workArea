package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.UtenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAO extends JpaRepository<UtenteEntity, Long> {
}
