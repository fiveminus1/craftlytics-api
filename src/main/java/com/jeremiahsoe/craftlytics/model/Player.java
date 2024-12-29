package com.jeremiahsoe.craftlytics.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable = false)
    private String playerUuid;

    private String playerName;
    private LocalDateTime firstSeen;
    private LocalDateTime lastSeen;

    //GETTERS
    public Long getId(){
        return this.id;
    }
    public String getPlayerUuid(){
        return this.playerUuid;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public LocalDateTime getFirstSeen(){
        return this.firstSeen;
    }
    public LocalDateTime getLastSeen(){
        return this.lastSeen;
    }

    //SETTERS
    public void setId(Long id){
        this.id = id;
    }
    public void setPlayerUuid(String playerUuid){
        this.playerUuid = playerUuid;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public void setFirstSeen(LocalDateTime firstSeen){
        this.firstSeen = firstSeen;
    }
    public void setLastSeen(LocalDateTime lastSeen){
        this.lastSeen = lastSeen;
    }



}
