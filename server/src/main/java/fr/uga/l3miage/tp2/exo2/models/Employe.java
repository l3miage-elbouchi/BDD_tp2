package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//car c facile a utiliser et la plus utiliser. et on aura une seul table ce qui facilite la modification
//inconvinion: on aura des null dans notre table.
@DiscriminatorColumn(name="TYPE",length=3)

public class Employe {
    @Id
    Long Id;
    String nom;
    String email;
    double salaire;
}
