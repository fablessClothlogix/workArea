package com.fabless.clothlogix.DAO;

import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.model.entities.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface LoginDAO  {

    List<LoginEntity> getListLoing(Map<String, Object> risposta);

    void inserisciLogin(LoginEntity loginEntity, Map<String, Object> risposta );

    void aggiornaLogin(LoginEntity loginEntity, Map<String, Object> risposta );

    void eliminaLogin(Long id, Map<String, Object> risposta );

    Optional<LoginEntity> loginFindById(Long id, Map<String, Object> risposta);

}
