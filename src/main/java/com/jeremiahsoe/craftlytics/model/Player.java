package com.jeremiahsoe.craftlytics.model;

import jakarta.persistence.*;
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

}
