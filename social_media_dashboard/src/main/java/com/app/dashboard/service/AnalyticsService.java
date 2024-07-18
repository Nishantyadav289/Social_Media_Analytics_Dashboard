package com.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.dao.AnalyticsRepository;
import com.app.dashboard.pojo.Analytics;

@Service
public class AnalyticsService {

	@Autowired
	private AnalyticsRepository analyticsRepository;

	public List<Analytics> getAllAnalytics() {
		System.out.println("AnalyticsService.getAllAnalytics()");
		return analyticsRepository.findAll();
	}

	public Optional<Analytics> getAnalyticsByUserId(Long userId) {
		System.out.println("AnalyticsService.getAnalyticsByUserId()");
		return analyticsRepository.findByUserId(userId);
	}

	public Analytics createAnalytics(Analytics analytics) {
		System.out.println("AnalyticsService.createAnalytics()");
		return analyticsRepository.save(analytics);
	}

	public void deleteAnalytics(Long id) {
		System.out.println("AnalyticsService.deleteAnalytics()");
		analyticsRepository.deleteById(id);
	}

}
