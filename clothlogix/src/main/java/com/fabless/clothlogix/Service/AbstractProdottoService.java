package com.fabless.clothlogix.Service;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.ProdottoEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractProdottoService {

    Iterable<ProdottoEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<ProdottoEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(ProdottoEntity prodottoEntity, Map<String, Object> risposta) throws DataException;

    void upload(ProdottoEntity prodottoEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException;
}
