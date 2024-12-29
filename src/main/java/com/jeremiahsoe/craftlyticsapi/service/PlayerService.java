package com.jeremiahsoe.craftlyticsapi.service;

import com.jeremiahsoe.craftlyticsapi.model.Player;
import com.jeremiahsoe.craftlyticsapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player updateOrInsertPlayer(String playerUuid, String playerName){
        Player player = playerRepository.findByPlayerUuid(playerUuid);
        if(player == null){
            player = new Player();
            player.setPlayerUuid(playerUuid);
            player.setFirstSeen(LocalDateTime.now());
        }
        player.setPlayerName(playerName);
        player.setLastSeen(LocalDateTime.now());
        return playerRepository.save(player);
    }

    public Player getPlayerByUuid(String playerUuid){
        return playerRepository.findByPlayerUuid(playerUuid);
    }
}
