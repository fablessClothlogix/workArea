package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.SezioneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SezioneDAO extends JpaRepository<SezioneEntity, Long> {
}
