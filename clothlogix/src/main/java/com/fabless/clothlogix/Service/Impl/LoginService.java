package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.LoginDAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.LoginEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class LoginService {

    private LoginDAO repo;

    @Autowired
    public  LoginService(LoginDAO repo){
        this.repo = repo;
    }

    public Iterable<LoginEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListLoing(risposta);
    }

    public Optional<LoginEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.loginFindById(id, risposta);
    }
    @Transactional
    public void create(LoginEntity loginEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciLogin(loginEntity,risposta);
    }

    @Transactional
    public void upload(LoginEntity loginEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.aggiornaLogin(loginEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.eliminaLogin(id, risposta);
    }
}
