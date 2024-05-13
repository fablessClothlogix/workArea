package com.fabless.clothlogix.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@ToString
@Entity
@Table(name = "taglia")
public class TagliaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name =  "descrizione")
    private String descrizione;

    public TagliaEntity(){}

    public TagliaEntity(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
