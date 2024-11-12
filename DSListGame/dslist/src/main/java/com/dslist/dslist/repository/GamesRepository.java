package com.dslist.dslist.repository;

import com.dslist.dslist.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games,Long> {
}
