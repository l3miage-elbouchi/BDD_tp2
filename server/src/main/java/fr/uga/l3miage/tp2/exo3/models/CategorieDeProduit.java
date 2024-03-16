package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class CategorieDeProduit {
    @Id
    private long id;

    private String nom;

    @ManyToMany(mappedBy = "categories")
    private Set<Produit> produits;
}
