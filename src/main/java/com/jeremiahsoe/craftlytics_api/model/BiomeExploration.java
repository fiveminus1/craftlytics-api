package com.jeremiahsoe.craftlytics_api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class BiomeExploration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String playerUuid;

    private String biomeName;
    private String location;
    private LocalDateTime timestamp;

    //GETTERS
    public Long getId(){
        return this.id;
    }
    public String getPlayerUuid(){
        return this.playerUuid;
    }
    public String getBiomeName(){
        return this.biomeName;
    }
    public String getLocation(){
        return this.location;
    }
    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }


    //SETTERS
    public void setId(Long id){
        this.id = id;
    }
    public void setPlayerUuid(String playerUuid){
        this.playerUuid = playerUuid;
    }
    public void setBiomeName(String biomeName){
        this.biomeName = biomeName;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

}
