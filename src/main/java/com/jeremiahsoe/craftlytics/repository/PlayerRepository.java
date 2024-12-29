package com.jeremiahsoe.craftlytics.repository;

import com.jeremiahsoe.craftlytics.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByPlayerUuid(String playerUuid);
}
