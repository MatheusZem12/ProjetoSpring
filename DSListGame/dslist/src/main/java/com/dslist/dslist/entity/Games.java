package com.dslist.dslist.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String shortDescription;
    private String longDescription;
    private String platform;
    private String imgUrl;
    private Integer launchYear;
    private Double score;

    @OneToMany(mappedBy = "games")
    private List<Belonging> belongings = new ArrayList<>();

}
