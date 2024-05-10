package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ProdottoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoDAO extends JpaRepository<ProdottoEntity, Long> {
}
