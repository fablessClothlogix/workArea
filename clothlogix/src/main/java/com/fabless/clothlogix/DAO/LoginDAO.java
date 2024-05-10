package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDAO extends JpaRepository<LoginEntity, Long> {
}
