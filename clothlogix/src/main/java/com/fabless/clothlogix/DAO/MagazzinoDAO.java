package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.MagazzinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface MagazzinoDAO {

    List<MagazzinoEntity> getListMagazzino(Map<String, Object> risposta);

    void inserisciMagazzino(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta );

    void aggiornaMagazzino(MagazzinoEntity magazzinoEntity, Map<String, Object> risposta );

    void eliminaMagazzino(Long id, Map<String, Object> risposta );

    Optional<MagazzinoEntity> magazzinoFindById(Long id, Map<String, Object> risposta);
}
