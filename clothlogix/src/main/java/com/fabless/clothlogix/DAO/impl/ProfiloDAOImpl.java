package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.ProfiloDAO;
import com.fabless.clothlogix.model.entities.ProfiloEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProfiloDAOImpl implements ProfiloDAO {
    @Override
    public List<ProfiloEntity> getListProfilo(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciProfilo(ProfiloEntity profiloEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaProfilo(ProfiloEntity profiloEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaProfilo(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<ProfiloEntity> profiloFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
