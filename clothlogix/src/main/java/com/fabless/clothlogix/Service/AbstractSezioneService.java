package com.fabless.clothlogix.Service;


import com.fabless.clothlogix.model.entities.SezioneEntity;

import org.hibernate.exception.DataException;

import java.util.Map;
import java.util.Optional;

public interface AbstractSezioneService {

    Iterable<SezioneEntity> findAll(Map<String, Object> risposta) throws DataException;

    Optional<SezioneEntity> findById(Long id, Map<String, Object> risposta) throws DataException;

    void create(SezioneEntity sezioneEntity, Map<String, Object> risposta) throws DataException;

    void upload(SezioneEntity sezioneEntity, Map<String, Object> risposta) throws  DataException;

    void deleteByid(Long id, Map<String, Object> risposta) throws  DataException;
}
