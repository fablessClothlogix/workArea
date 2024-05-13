package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.ColoreDAO;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@Repository
public class ColoreDAOImpl implements ColoreDAO {
    @Override
    public List<ColoreEntity> getListColore(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciColore(ColoreEntity coloreEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaColore(ColoreEntity coloreEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaColore(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<ColoreEntity> coloreFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
