package fr.uga.l3miage.tp2.exo3.models;

import org.yaml.snakeyaml.events.Event;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
public class Commande {
    @Id
    private long id;

    private Date date;
    private double montantTotal;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "commande")
    private Set<Produit> produits;
}
