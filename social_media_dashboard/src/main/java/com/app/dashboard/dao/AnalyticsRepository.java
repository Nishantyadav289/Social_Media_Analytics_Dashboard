package com.app.dashboard.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dashboard.pojo.Analytics;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Long>{

	Optional<Analytics> findByUserId(Long userId);

}
