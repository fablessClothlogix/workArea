package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.MaterialeDAO;
import com.fabless.clothlogix.DAO.impl.MaterialeDAOImpl;

import com.fabless.clothlogix.model.entities.MaterialeEntity;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class MaterialeService {

    private MaterialeDAO repo;

    @Autowired
    public  MaterialeService(MaterialeDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<MaterialeEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListMateriale(risposta);
    }

    public Optional<MaterialeEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.materialeFindById(id, risposta);
    }
    @Transactional
    public void create(MaterialeEntity materialeEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciMateriale(materialeEntity,risposta);
    }

    @Transactional
    public void upload(MaterialeEntity materialeEntity, Map<String, Object> risposta) throws  DataException{
        repo.aggiornaMateriale(materialeEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws  DataException{
        repo.eliminaMateriale(id, risposta);
    }
}
