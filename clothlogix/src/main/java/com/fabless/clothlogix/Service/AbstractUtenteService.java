package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.UtenteEntity;

import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractUtenteService {

    Iterable<UtenteEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<UtenteEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(UtenteEntity utenteEntity, Map<String, Object> risposta) throws DataException;

    void upload(UtenteEntity utenteEntity, Map<String, Object> risposta) throws  DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws  DataException;
}
