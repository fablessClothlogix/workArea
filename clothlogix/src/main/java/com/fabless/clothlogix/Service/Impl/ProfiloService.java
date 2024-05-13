package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.impl.ProfiloDAOImpl;

import com.fabless.clothlogix.model.entities.ProfiloEntity;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class ProfiloService {

    private ProfiloDAOImpl repo;

    @Autowired
    public  ProfiloService(ProfiloDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<ProfiloEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListProfilo(risposta);
    }

    public Optional<ProfiloEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.profiloFindById(id, risposta);
    }
    @Transactional
    public void create(ProfiloEntity profiloEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciProfilo(profiloEntity,risposta);
    }

    @Transactional
    public void upload(ProfiloEntity profiloEntity, Map<String, Object> risposta) throws  DataException{
        repo.aggiornaProfilo(profiloEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws DataException{
        repo.eliminaProfilo(id, risposta);
    }
}
