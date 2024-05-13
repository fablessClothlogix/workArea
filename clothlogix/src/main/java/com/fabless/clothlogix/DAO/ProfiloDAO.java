package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.ProfiloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface ProfiloDAO  {

    List<ProfiloEntity> getListProfilo(Map<String, Object> risposta);

    void inserisciProfilo(ProfiloEntity profiloEntity, Map<String, Object> risposta );

    void aggiornaProfilo(ProfiloEntity profiloEntity, Map<String, Object> risposta );

    void eliminaProfilo(Long id, Map<String, Object> risposta );

    Optional<ProfiloEntity> profiloFindById(Long id, Map<String, Object> risposta);

}
