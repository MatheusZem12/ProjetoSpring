package com.dslist.dslist.service;

import com.dslist.dslist.entity.Games;
import com.dslist.dslist.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GamesRepository gamesRepository;
    private List<Games> findAllGames(){
        List<Games> result =  gamesRepository.findAll();
        return result;
    }
}
