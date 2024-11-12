package com.dslist.dslist.service;

import com.dslist.dslist.dto.GameDTO;
import com.dslist.dslist.dto.GameMinDTO;
import com.dslist.dslist.repository.GamesRepository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GamesRepository gamesRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames(){
        return gamesRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    public GameDTO findByIdGame(Long id){
        return gamesRepository.findById(id).map(GameDTO::new).orElseThrow(() -> new EntityNotFoundException("Game not found with id " + id));
    }
}
