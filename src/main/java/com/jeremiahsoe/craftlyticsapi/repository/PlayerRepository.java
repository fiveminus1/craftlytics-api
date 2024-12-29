package com.jeremiahsoe.craftlyticsapi.repository;

import com.jeremiahsoe.craftlyticsapi.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByPlayerUuid(String playerUuid);
}
