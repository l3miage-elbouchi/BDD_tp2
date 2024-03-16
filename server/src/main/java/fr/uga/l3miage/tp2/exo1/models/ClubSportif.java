package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class ClubSportif {
    @Id
    private long id;

    private String nom;
    private String description;

    @ManyToMany(mappedBy = "clubs")
    private Set<Etudiant> etudiants;
}
