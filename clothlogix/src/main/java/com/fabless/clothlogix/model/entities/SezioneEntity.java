package com.fabless.clothlogix.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




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

    @ManyToOne
    @JoinColumn(name = "magazzino_id")
    private MagazzinoEntity magazzino;

    public SezioneEntity(){}

    public SezioneEntity(Long id, String scaffale, String fila) {
        this.id = id;
        this.scaffale = scaffale;
        this.fila = fila;
    }
}
