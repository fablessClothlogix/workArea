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
@Table(name = "tipo")
public class TipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name =  "descrizione")
    private String descrizione;

    @ManyToMany(mappedBy = "tipi")
    private Set<ProdottoEntity> prodotti ;

    public TipoEntity(){}

    public TipoEntity(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
