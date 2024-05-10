package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.TipoDAO;

import com.fabless.clothlogix.model.entities.TipoEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TipoService {

    private TipoDAO repo;

    @Autowired
    public  TipoService(TipoDAO repo){
        this.repo = repo;
    }

    public Iterable<TipoEntity> findAll() throws DataException {
        return repo.findAll();
    }

    public Optional<TipoEntity> findById(Long id) throws DataException{
        return repo.findById(id);
    }

    @Transactional
    public TipoEntity create(TipoEntity tipoEntity) throws DataException{
        return  repo.save(tipoEntity);
    }

    @Transactional
    public void upload(TipoEntity tipoEntity) throws EntityNotFoundException, DataException{
        repo.save(tipoEntity);
    }

    @Transactional
    public void deleteByid(Long id) throws EntityNotFoundException, DataException{
        repo.deleteById(id);
    }
}
