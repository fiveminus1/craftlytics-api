package com.jeremiahsoe.craftlytics_api.repository;

import com.jeremiahsoe.craftlytics_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByPlayerUuid(String playerUuid);

    Optional<Player> findByPlayerName(String playerName);
}
