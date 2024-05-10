package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ProfiloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfiloDAO extends JpaRepository<ProfiloEntity, Long> {
}
