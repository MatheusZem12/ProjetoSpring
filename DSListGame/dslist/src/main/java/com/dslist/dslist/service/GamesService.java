package com.dslist.dslist.service;

import com.dslist.dslist.dto.GameMinDTO;
import com.dslist.dslist.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GamesRepository gamesRepository;
    public List<GameMinDTO> findAllGames(){
        return gamesRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
