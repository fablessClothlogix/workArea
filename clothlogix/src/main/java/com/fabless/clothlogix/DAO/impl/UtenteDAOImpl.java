package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.UtenteDAO;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.UtenteEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@Repository
public class UtenteDAOImpl implements UtenteDAO {
    @Override
    public List<UtenteEntity> getListUtente(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciUtente(UtenteEntity utenteEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaUtente(UtenteEntity utenteEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaUtente(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<ColoreEntity> utenteFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
