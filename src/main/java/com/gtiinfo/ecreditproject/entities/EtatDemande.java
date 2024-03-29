package com.gtiinfo.ecreditproject.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EtatDemande {
    @Id
    @SequenceGenerator(name = "etat_demande_seq", sequenceName = "ETAT_DEMANDE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etat_demande_seq")
    private Long id;
    private String etape;
    private boolean enAttente;

    @OneToOne
    @JoinColumn(name = "demande_id")
    private Demande demande;
}