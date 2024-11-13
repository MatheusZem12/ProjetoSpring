package com.dslist.dslist.repository;

import com.dslist.dslist.entity.GameList;
import com.dslist.dslist.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesListRepository extends JpaRepository<GameList,Long> {
}
