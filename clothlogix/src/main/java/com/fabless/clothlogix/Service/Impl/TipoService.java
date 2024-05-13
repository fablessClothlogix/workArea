package com.fabless.clothlogix.Service.Impl;




import com.fabless.clothlogix.DAO.impl.TipoDAOImpl;

import com.fabless.clothlogix.model.entities.TipoEntity;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class TipoService {

    private TipoDAOImpl repo;

    @Autowired
    public  TipoService(TipoDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<TipoEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListTipo(risposta);
    }

    public Optional<TipoEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.tipoFindById(id, risposta);
    }
    @Transactional
    public void create(TipoEntity tipoEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciTipo(tipoEntity,risposta);
    }

    @Transactional
    public void upload(TipoEntity tipoEntity, Map<String, Object> risposta) throws  DataException{
        repo.aggiornaTipo(tipoEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws  DataException{
        repo.eliminaTipo(id, risposta);
    }
}
