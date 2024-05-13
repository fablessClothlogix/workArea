package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.TagliaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface TagliaDAO {

    List<TagliaEntity> getListTaglia(Map<String, Object> risposta);

    void inserisciTaglia(TagliaEntity tagliaEntity, Map<String, Object> risposta );

    void aggiornaTaglia(TagliaEntity tagliaEntity, Map<String, Object> risposta );

    void eliminaTaglia(Long id, Map<String, Object> risposta );

    Optional<TagliaEntity> tagliaFindById(Long id, Map<String, Object> risposta);
}
