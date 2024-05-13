package com.fabless.clothlogix.Service.Impl;


import com.fabless.clothlogix.DAO.impl.ProdottoDAOImpl;

import com.fabless.clothlogix.model.entities.ProdottoEntity;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class ProdottoService {

    private ProdottoDAOImpl repo;

    @Autowired
    public  ProdottoService(ProdottoDAOImpl repo){
        this.repo = repo;
    }


    public Iterable<ProdottoEntity> findAll(Map<String, Object> risposta) throws DataException {
        return repo.getListProdotto(risposta);
    }

    public Optional<ProdottoEntity> findById(Long id,Map<String, Object> risposta) throws DataException{
        return repo.prodottoFindById(id, risposta);
    }
    @Transactional
    public void create(ProdottoEntity prodottoEntity, Map<String, Object> risposta) throws DataException{
        repo.inserisciProdotto(prodottoEntity,risposta);
    }

    @Transactional
    public void upload(ProdottoEntity prodottoEntity, Map<String, Object> risposta) throws  DataException{
        repo.aggiornaProdotto(prodottoEntity,risposta);
    }
    @Transactional
    public void deleteByid(Long id, Map<String, Object> risposta) throws  DataException{
        repo.eliminaProdotto(id, risposta);
    }
}
