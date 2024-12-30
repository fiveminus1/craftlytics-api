package com.jeremiahsoe.craftlytics_api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PlayerKill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerUuid;
    private String killedPlayerUuid;
    private LocalDateTime timestamp;

    // Getters
    public Long getId(){
        return this.id;
    }
    public String getPlayerUuid(){
        return this.playerUuid;
    }
    public String getKilledPlayerUuid(){
        return this.killedPlayerUuid;
    }
    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }

    // Setters
    public void setPlayerUuid(String playerUuid){
        this.playerUuid = playerUuid;
    }
    public void setKilledPlayerUuid(String killedPlayerUuid){
        this.killedPlayerUuid = killedPlayerUuid;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

}
