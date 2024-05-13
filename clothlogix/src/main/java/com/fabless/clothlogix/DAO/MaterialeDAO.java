package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.MaterialeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface MaterialeDAO  {

    List<MaterialeEntity> getListMateriale(Map<String, Object> risposta);

    void inserisciMateriale(MaterialeEntity materialeEntity, Map<String, Object> risposta );

    void aggiornaMateriale(MaterialeEntity materialeEntity, Map<String, Object> risposta );

    void eliminaMateriale(Long id, Map<String, Object> risposta );

    Optional<MaterialeEntity> materialeFindById(Long id, Map<String, Object> risposta);
}
