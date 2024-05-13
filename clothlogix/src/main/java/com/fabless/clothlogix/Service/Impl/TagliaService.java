package com.fabless.clothlogix.Service.Impl;



import com.fabless.clothlogix.DAO.impl.TagliaDAOImpl;

import com.fabless.clothlogix.model.entities.TagliaEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class TagliaService {

    private TagliaDAOImpl repo;

    @Autowired
    public  TagliaService(TagliaDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<TagliaEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListTaglia(risposta);
    }

    public Optional<TagliaEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.tagliaFindById(id, risposta);
    }
    @Transactional
    public void create(TagliaEntity tagliaEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciTaglia(tagliaEntity,risposta);
    }

    @Transactional
    public void upload(TagliaEntity tagliaEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.aggiornaTaglia(tagliaEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.eliminaTaglia(id, risposta);
    }
}
