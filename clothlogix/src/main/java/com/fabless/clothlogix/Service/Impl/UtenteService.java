package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.UtenteDAO;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.UtenteEntity;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class UtenteService {

    private UtenteDAO repo;

    @Autowired
    public  UtenteService(UtenteDAO repo){
        this.repo = repo;
    }


    public Iterable<UtenteEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListUtente(risposta);
    }

    public Optional<ColoreEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.utenteFindById(id, risposta);
    }
    @Transactional
    public void create(UtenteEntity utenteEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciUtente(utenteEntity,risposta);
    }

    @Transactional
    public void upload(UtenteEntity utenteEntity, Map<String, Object> risposta) throws DataException{
        repo.aggiornaUtente(utenteEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws  DataException{
        repo.eliminaUtente(id, risposta);
    }
}
