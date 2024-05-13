package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.UtenteEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface UtenteDAO {

    List<UtenteEntity> getListUtente(Map<String, Object> risposta);

    void inserisciUtente(UtenteEntity utenteEntity, Map<String, Object> risposta );

    void aggiornaUtente(UtenteEntity utenteEntity, Map<String, Object> risposta );

    void eliminaUtente(Long id, Map<String, Object> risposta );

    Optional<ColoreEntity> utenteFindById(Long id, Map<String, Object> risposta);
}
