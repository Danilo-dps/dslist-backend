package com.danilodps.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilodps.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}