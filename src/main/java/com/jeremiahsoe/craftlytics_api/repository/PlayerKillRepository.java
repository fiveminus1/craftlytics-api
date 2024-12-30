package com.jeremiahsoe.craftlytics_api.repository;

import com.jeremiahsoe.craftlytics_api.model.PlayerKill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerKillRepository extends JpaRepository<PlayerKill, Long> {
}
