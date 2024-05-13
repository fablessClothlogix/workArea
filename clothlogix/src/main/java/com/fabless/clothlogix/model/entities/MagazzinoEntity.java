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
@Table(name = "magazzino")
public class MagazzinoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name= "quantita")

    private Integer quantita;
    @Column(name="disponibilita")

    private Boolean disponibilita;

    @OneToMany(mappedBy = "magazzino", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProdottoEntity> prodotti;

    @OneToMany(mappedBy = "magazzino", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SezioneEntity> sezioni;

    public MagazzinoEntity() {}


    public MagazzinoEntity(Long id, Integer quantita, Boolean disponibilita, ProdottoEntity prodotto, SezioneEntity sezione) {
        this.id = id;
        this.quantita = quantita;
        this.disponibilita = disponibilita;
        this.prodotti = prodotti;
        this.sezioni = sezioni;
    }
}
