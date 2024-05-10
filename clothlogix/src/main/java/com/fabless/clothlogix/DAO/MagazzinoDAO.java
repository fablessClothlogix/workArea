package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.MagazzinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazzinoDAO extends JpaRepository<MagazzinoEntity, Long> {
}
