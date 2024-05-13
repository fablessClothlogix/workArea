package com.fabless.clothlogix.Service;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.LoginEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractLoginService {

    Iterable<LoginEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<LoginEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(LoginEntity coloreEntity, Map<String, Object> risposta) throws DataException;

    void upload(LoginEntity coloreEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException;
}
