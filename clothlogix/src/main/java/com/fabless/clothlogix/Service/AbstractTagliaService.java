package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.TagliaEntity;

import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractTagliaService {

    Iterable<TagliaEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<TagliaEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(TagliaEntity tagliaEntity, Map<String, Object> risposta) throws DataException;

    void upload(TagliaEntity tagliaEntity, Map<String, Object> risposta) throws  DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws  DataException;
}
