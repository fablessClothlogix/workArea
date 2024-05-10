package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.SezioneDAO;
import com.fabless.clothlogix.model.entities.SezioneEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SezioneService {

    private SezioneDAO repo;

    @Autowired
    public  SezioneService(SezioneDAO repo){
        this.repo = repo;
    }

    public Iterable<SezioneEntity> findAll() throws DataException {
        return repo.findAll();
    }

    public Optional<SezioneEntity> findById(Long id) throws DataException{
        return repo.findById(id);
    }
    @Transactional
    public SezioneEntity create(SezioneEntity sezioneEntity) throws DataException{
        return  repo.save(sezioneEntity);
    }
    @Transactional
    public void upload(SezioneEntity sezioneEntity) throws EntityNotFoundException, DataException{
        repo.save(sezioneEntity);
    }
    @Transactional
    public void deleteByid(Long id) throws EntityNotFoundException, DataException{
        repo.deleteById(id);
    }
}
