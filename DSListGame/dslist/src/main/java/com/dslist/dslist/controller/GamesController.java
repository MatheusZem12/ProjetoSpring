package com.dslist.dslist.controller;

import com.dslist.dslist.dto.GameDTO;
import com.dslist.dslist.dto.GameMinDTO;
import com.dslist.dslist.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameMinDTO> findAllGames(){
        return gamesService.findAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO findByIdGame(@PathVariable Long id){
        return gamesService.findByIdGame(id);
    }
}
