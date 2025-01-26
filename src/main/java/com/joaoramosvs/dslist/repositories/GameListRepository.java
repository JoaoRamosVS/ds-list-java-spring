package com.joaoramosvs.dslist.repositories;

import com.joaoramosvs.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
