package com.supdevinci.tournamentmanager.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Player entity
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pseudo;

    @Column(nullable = false)
    private String postalAdress;

    @ManyToMany(mappedBy = "players")
    private List<Team> teams;

    /**
     * Constructor.
     * 
     * @param id
     * @param pseudo
     * @param postalAdress
     */
    public Player(Long id, String pseudo, String postalAdress) {
        this.id = id;
        this.pseudo = pseudo;
        this.postalAdress = postalAdress;
    }

}
