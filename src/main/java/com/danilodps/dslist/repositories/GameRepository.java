package com.danilodps.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilodps.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}