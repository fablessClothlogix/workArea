package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.TipoDAO;
import com.fabless.clothlogix.model.entities.TipoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@Repository
public class TipoDAOImpl implements TipoDAO {
    @Override
    public List<TipoEntity> getListTipo(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciTipo(TipoEntity tipoEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaTipo(TipoEntity tipoEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaTipo(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<TipoEntity> tipoFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
