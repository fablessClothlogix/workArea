package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.ProfiloEntity;

import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractProfiloService {

    Iterable<ProfiloEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<ProfiloEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(ProfiloEntity profiloEntity, Map<String, Object> risposta) throws DataException;

    void upload(ProfiloEntity profiloEntity, Map<String, Object> risposta) throws  DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws  DataException;
}
