package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.TipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface TipoDAO {

    List<TipoEntity> getListTipo(Map<String, Object> risposta);

    void inserisciTipo(TipoEntity tipoEntity, Map<String, Object> risposta );

    void aggiornaTipo(TipoEntity tipoEntity, Map<String, Object> risposta );

    void eliminaTipo(Long id, Map<String, Object> risposta );

    Optional<TipoEntity> tipoFindById(Long id, Map<String, Object> risposta);
}
