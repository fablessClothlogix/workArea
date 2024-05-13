package com.fabless.clothlogix.Service.Impl;

import com.fabless.clothlogix.DAO.MagazzinoDAO;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.MagazzinoEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class MagazzinoService {

    private MagazzinoDAO repo;

    @Autowired
    public  MagazzinoService(MagazzinoDAO repo){
        this.repo = repo;
    }


    public Iterable<MagazzinoEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListMagazzino(risposta);
    }

    public Optional<MagazzinoEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.magazzinoFindById(id, risposta);
    }
    @Transactional
    public void create(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciMagazzino(magazzinoEntity,risposta);
    }

    @Transactional
    public void upload(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.aggiornaMagazzino(magazzinoEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException{
        repo.eliminaMagazzino(id, risposta);
    }
}
