package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.MaterialeEntity;

import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractMaterialeService {

    Iterable<MaterialeEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<MaterialeEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(MaterialeEntity materialeEntity, Map<String, Object> risposta) throws DataException;

    void upload(MaterialeEntity materialeEntity, Map<String, Object> risposta) throws  DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws  DataException;
}
