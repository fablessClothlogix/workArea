package com.fabless.clothlogix.DAO.impl;

import com.fabless.clothlogix.DAO.LoginDAO;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.LoginEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LoginDAOImpl implements LoginDAO {
    @Override
    public List<LoginEntity> getListLoing(Map<String, Object> risposta) {
        return List.of();
    }

    @Override
    public void inserisciLogin(LoginEntity loginEntity, Map<String, Object> risposta) {

    }

    @Override
    public void aggiornaLogin(LoginEntity loginEntity, Map<String, Object> risposta) {

    }

    @Override
    public void eliminaLogin(Long id, Map<String, Object> risposta) {

    }

    @Override
    public Optional<LoginEntity> loginFindById(Long id, Map<String, Object> risposta) {
        return null;
    }
}
