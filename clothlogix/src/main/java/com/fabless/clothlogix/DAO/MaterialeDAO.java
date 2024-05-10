package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.MaterialeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialeDAO extends JpaRepository<MaterialeEntity, Long> {
}
