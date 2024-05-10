package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.TipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDAO extends JpaRepository<TipoEntity, Long> {
}
