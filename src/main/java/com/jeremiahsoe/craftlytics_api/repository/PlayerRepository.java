package com.jeremiahsoe.craftlytics_api.repository;

import com.jeremiahsoe.craftlytics_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByPlayerUuid(String playerUuid);
}
