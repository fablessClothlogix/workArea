package com.fabless.clothlogix.model.entities;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "profili")
public class ProfiloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "can_create")
    private Boolean canCreate;

    @Column(name = "can_read")
    private Boolean canRead;

    @Column(name = "can_update")
    private Boolean canUpdate;

    @Column(name = "can_delete")
    private Boolean canDelete;

    @ManyToMany(mappedBy = "profili")
    private Set<UtenteEntity> utenti;

    public ProfiloEntity() {}

    public ProfiloEntity(Integer id, String descrizione, Boolean canCreate, Boolean canRead, Boolean canUpdate, Boolean canDelete) {
        this.id = id;
        this.descrizione = descrizione;
        this.canCreate = canCreate;
        this.canRead = canRead;
        this.canUpdate = canUpdate;
        this.canDelete = canDelete;
    }
}
