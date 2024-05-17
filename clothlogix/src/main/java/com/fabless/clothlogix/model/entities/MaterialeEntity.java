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
@Table(name = "materiale")
public class MaterialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name =  "descrizione")
    private String descrizione;

    @ManyToMany(mappedBy = "materiali")
    private Set<ProdottoEntity> prodotti ;

    public MaterialeEntity() {}

    public MaterialeEntity(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
