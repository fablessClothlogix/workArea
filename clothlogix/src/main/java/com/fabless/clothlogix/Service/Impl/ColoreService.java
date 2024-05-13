package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.impl.ColoreDAOImpl;
import com.fabless.clothlogix.Service.AbstractColoreService;
import com.fabless.clothlogix.model.entities.ColoreEntity;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;
import java.util.Optional;

@Service
public class ColoreService implements AbstractColoreService {

    private ColoreDAOImpl repo;

    @Autowired
    public  ColoreService(ColoreDAOImpl repo){
        this.repo = repo;
    }

    public Iterable<ColoreEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListColore(risposta);
    }

    public Optional<ColoreEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.coloreFindById(id, risposta);
    }
    @Transactional
    public void create(ColoreEntity coloreEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciColore(coloreEntity,risposta);
    }

    @Transactional
    public void upload(ColoreEntity coloreEntity, Map<String, Object> risposta) throws  DataException{
          repo.aggiornaColore(coloreEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws  DataException{
        repo.eliminaColore(id, risposta);
    }

}
