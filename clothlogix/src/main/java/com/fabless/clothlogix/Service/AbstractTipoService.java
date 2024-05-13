package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.TipoEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractTipoService {

    Iterable<TipoEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<TipoEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(TipoEntity tipoEntity, Map<String, Object> risposta) throws DataException;

    void upload(TipoEntity tipoEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException;
}
