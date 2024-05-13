package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.UtenteDAO;
import com.fabless.clothlogix.model.entities.UtenteEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UtenteService {

    private UtenteDAO repo;

    @Autowired
    public  UtenteService(UtenteDAO repo){
        this.repo = repo;
    }

    public Iterable<UtenteEntity> findAll() throws DataException {
        return repo.findAll();
    }

    public Optional<UtenteEntity> findById(Long id) throws DataException{
        return repo.findById(id);
    }
    @Transactional
    public UtenteEntity create(UtenteEntity utenteEntity) throws DataException{
        return  repo.save(utenteEntity);
    }
    @Transactional
    public void upload(UtenteEntity utenteEntity) throws EntityNotFoundException, DataException{
        repo.save(utenteEntity);
    }
    @Transactional
    public void deleteByid(Long id) throws EntityNotFoundException, DataException{
        repo.deleteById(id);
    }
}
