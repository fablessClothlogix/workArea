package com.fabless.clothlogix.Service;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.MagazzinoEntity;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractMagazzinoService {

    Iterable<MagazzinoEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<MagazzinoEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta) throws DataException;

    void upload(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta) throws EntityNotFoundException, DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws EntityNotFoundException, DataException;
}