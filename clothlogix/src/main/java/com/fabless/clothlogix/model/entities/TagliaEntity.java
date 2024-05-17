package com.fabless.clothlogix.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;


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

    @ManyToMany(mappedBy = "taglie")
    private Set<ProdottoEntity> prodotti ;

    public TagliaEntity(){}

    public TagliaEntity(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
