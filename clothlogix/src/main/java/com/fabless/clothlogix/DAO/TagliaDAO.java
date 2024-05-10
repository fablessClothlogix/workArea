package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.TagliaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagliaDAO extends JpaRepository<TagliaEntity, Long> {
}
