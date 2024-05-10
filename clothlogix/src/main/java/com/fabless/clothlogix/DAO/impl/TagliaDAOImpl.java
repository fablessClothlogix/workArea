package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.TagliaDAO;
import com.fabless.clothlogix.model.entities.TagliaEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TagliaDAOImpl implements TagliaDAO {
    @Override
    public List<TagliaEntity> getListTaglia(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciTaglia(TagliaEntity tagliaEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaTaglia(TagliaEntity tagliaEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaTaglia(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<TagliaEntity> tagliaFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
