package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.ProfiloDAO;
import com.fabless.clothlogix.model.entities.ProfiloEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProfiloService {

    private ProfiloDAO repo;

    @Autowired
    public  ProfiloService(ProfiloDAO repo){
        this.repo = repo;
    }

    public Iterable<ProfiloEntity> findAll() throws DataException {
        return repo.findAll();
    }

    public Optional<ProfiloEntity> findById(Long id) throws DataException{
        return repo.findById(id);
    }
    @Transactional
    public ProfiloEntity create(ProfiloEntity profiloEntity) throws DataException{
        return  repo.save(profiloEntity);
    }
    @Transactional
    public void upload(ProfiloEntity profiloEntity) throws EntityNotFoundException, DataException{
        repo.save(profiloEntity);
    }
    @Transactional
    public void deleteByid(Long id) throws EntityNotFoundException, DataException{
        repo.deleteById(id);
    }
}
