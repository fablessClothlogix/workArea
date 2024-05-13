package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.SezioneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface SezioneDAO {

    List<SezioneEntity> getListSezione(Map<String, Object> risposta);

    void inserisciSezione(SezioneEntity sezioneEntity, Map<String, Object> risposta );

    void aggiornaSezione(SezioneEntity sezioneEntity, Map<String, Object> risposta );

    void eliminaSezione(Long id, Map<String, Object> risposta );

    Optional<SezioneEntity> sezioneFindById(Long id, Map<String, Object> risposta);
}
