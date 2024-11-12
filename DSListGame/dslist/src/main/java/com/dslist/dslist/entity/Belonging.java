package com.dslist.dslist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Integer position;

    @ManyToOne
    @JoinColumn(name = "games_id")
    private Games games;


    @ManyToOne
    @JoinColumn(name = "games_list_id")
    private GameList gameList;
}
