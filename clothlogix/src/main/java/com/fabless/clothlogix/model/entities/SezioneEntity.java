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
@Table(name = "sezione")
public class SezioneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name =  "scaffale")
    private String scaffale;

    @Column(name =  "fila")
    private String fila;

//    @ManyToOne(mappedBy = "sezioni")
//    private MagazzinoEntity magazzino;

    @OneToMany(mappedBy = "sezioni")
    private Set<ProdottoEntity> prodotti ;

    public SezioneEntity(){}

    public SezioneEntity(Long id, String scaffale, String fila) {
        this.id = id;
        this.scaffale = scaffale;
        this.fila = fila;
    }
}
