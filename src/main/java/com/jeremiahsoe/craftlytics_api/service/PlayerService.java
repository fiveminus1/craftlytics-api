package com.jeremiahsoe.craftlytics_api.service;

import com.jeremiahsoe.craftlytics_api.model.Player;
import com.jeremiahsoe.craftlytics_api.model.PlayerKill;
import com.jeremiahsoe.craftlytics_api.repository.PlayerKillRepository;
import com.jeremiahsoe.craftlytics_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerKillRepository playerKillRepository;


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

    public PlayerKill logPlayerKill(String playerUuid, String killedPlayerUuid){
        PlayerKill playerKill = new PlayerKill();
        playerKill.setPlayerUuid(playerUuid);
        playerKill.setKilledPlayerUuid(killedPlayerUuid);
        playerKill.setTimestamp(LocalDateTime.now());
        return playerKillRepository.save(playerKill);
    }
}
