package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.ProdottoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface ProdottoDAO {

    List<ProdottoEntity> getListProdotto(Map<String, Object> risposta);

    void inserisciProdotto(ProdottoEntity prodottoEntity, Map<String, Object> risposta );

    void aggiornaProdotto(ProdottoEntity prodottoEntity, Map<String, Object> risposta );

    void eliminaProdotto(Long id, Map<String, Object> risposta );

    Optional<ProdottoEntity> prodottoFindById(Long id, Map<String, Object> risposta);
}
