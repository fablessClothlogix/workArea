package com.fabless.clothlogix.model.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "materiale")
public class MaterialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column(name =  "descrizione")
    private String descrizione;

    public MaterialeEntity(Integer id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }
}
