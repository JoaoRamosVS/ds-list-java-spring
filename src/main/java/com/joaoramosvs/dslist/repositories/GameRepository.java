package com.joaoramosvs.dslist.repositories;

import com.joaoramosvs.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
