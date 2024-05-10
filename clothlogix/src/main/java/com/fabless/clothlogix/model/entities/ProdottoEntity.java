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
@Table(name = "prodotto")
public class ProdottoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "prezzo")
    private Integer prezzo;

    @Column(name = "codice_prodotto")
    private String codiceProdotto;

    @ManyToMany
    @JoinTable(
            name = "prodotto_colore_rel",
            joinColumns = @JoinColumn(name = "id_prodotto"),
            inverseJoinColumns = @JoinColumn(name = "id_colore")
    )
    private Set<ColoreEntity> colori;

    @ManyToMany
    @JoinTable(
            name = "prodotto_taglia_rel",
            joinColumns = @JoinColumn(name = "id_prodotto"),
            inverseJoinColumns = @JoinColumn(name = "id_taglia")
    )
    private Set<TagliaEntity> taglie;

    @ManyToMany
    @JoinTable(
            name = "prodotto_materiale_rel",
            joinColumns = @JoinColumn(name = "id_prodotto"),
            inverseJoinColumns = @JoinColumn(name = "id_materiale")
    )
    private Set<MaterialeEntity> materiali;

    @ManyToMany
    @JoinTable(
            name = "prodotto_tipo_rel",
            joinColumns = @JoinColumn(name = "id_prodotto"),
            inverseJoinColumns = @JoinColumn(name = "id_tipo")
    )
    private Set<TipoEntity> tipi;

    @ManyToMany
    @JoinTable(
            name = "prodotto_sezione_rel",
            joinColumns = @JoinColumn(name = "id_prodotto"),
            inverseJoinColumns = @JoinColumn(name = "id_sezione")
    )
    private Set<SezioneEntity> sezioni;

    @ManyToOne
    @JoinColumn(name = "magazzino_id")
    private MagazzinoEntity magazzino;

    public ProdottoEntity() {}

    public ProdottoEntity(Long id, String descrizione, Integer prezzo, String codiceProdotto, Set<ColoreEntity> colori, Set<TagliaEntity> taglie, Set<MaterialeEntity> materiali, Set<TipoEntity> tipi, Set<SezioneEntity> sezioni) {
        this.id = id;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.codiceProdotto = codiceProdotto;
        this.colori = colori;
        this.taglie = taglie;
        this.materiali = materiali;
        this.tipi = tipi;
        this.sezioni = sezioni;
    }
}

