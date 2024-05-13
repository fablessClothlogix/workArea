package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.SezioneDAO;
import com.fabless.clothlogix.DAO.impl.SezioneDAOImpl;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.SezioneEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class SezioneService {

    private SezioneDAOImpl repo;

    @Autowired
    public  SezioneService(SezioneDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<SezioneEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListSezione(risposta);
    }

    public Optional<SezioneEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.sezioneFindById(id, risposta);
    }
    @Transactional
    public void create(SezioneEntity sezioneEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciSezione(sezioneEntity,risposta);
    }

    @Transactional
    public void upload(SezioneEntity sezioneEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.aggiornaSezione(sezioneEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.eliminaSezione(id, risposta);
    }
}
