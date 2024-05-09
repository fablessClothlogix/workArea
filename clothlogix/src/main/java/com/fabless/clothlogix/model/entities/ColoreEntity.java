package com.fabless.clothlogix.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "colore")
public class ColoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column(name =  "descrizione")
    private String descrizione;

    public ColoreEntity(Integer id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
