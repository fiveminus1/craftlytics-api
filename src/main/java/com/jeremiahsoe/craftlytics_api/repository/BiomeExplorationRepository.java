package com.jeremiahsoe.craftlytics_api.repository;

import com.jeremiahsoe.craftlytics_api.model.BiomeExploration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiomeExplorationRepository extends JpaRepository<BiomeExploration, Long> {
    List<BiomeExploration> findByPlayerUuid(String playerUuid);
}
