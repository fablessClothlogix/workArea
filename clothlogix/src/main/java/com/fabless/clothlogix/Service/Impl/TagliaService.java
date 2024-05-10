package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.TagliaDAO;

import com.fabless.clothlogix.model.entities.TagliaEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TagliaService {

    private TagliaDAO repo;

    @Autowired
    public  TagliaService(TagliaDAO repo){
        this.repo = repo;
    }

    public Iterable<TagliaEntity> findAll() throws DataException {
        return repo.findAll();
    }

    public Optional<TagliaEntity> findById(Long id) throws DataException{
        return repo.findById(id);
    }
    @Transactional
    public TagliaEntity create(TagliaEntity tagliaEntity) throws DataException{
        return  repo.save(tagliaEntity);
    }
    @Transactional
    public void upload(TagliaEntity tagliaEntity) throws EntityNotFoundException, DataException{
        repo.save(tagliaEntity);
    }
    @Transactional
    public void deleteByid(Long id) throws EntityNotFoundException, DataException{
        repo.deleteById(id);
    }
}
