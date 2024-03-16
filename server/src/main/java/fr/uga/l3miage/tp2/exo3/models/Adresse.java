package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse {
    @Id
    String rue;
    String numero;
    String codePostal;
    String ville;
    @OneToOne
    private Client client;
}
