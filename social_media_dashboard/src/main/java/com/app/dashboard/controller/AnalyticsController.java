package com.app.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dashboard.pojo.Analytics;
import com.app.dashboard.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
	
    @Autowired 
    private AnalyticsService analyticsService;
    

    @GetMapping
    public List<Analytics> getAllAnalytics() {
    	System.out.println("AnalyticsController.getAllAnalytics()");
        return analyticsService.getAllAnalytics();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Analytics> getAnalyticsByUserId(@PathVariable Long userId) {
    	System.out.println("AnalyticsController.getAnalyticsByUserId()");
        Optional<Analytics> analytics = analyticsService.getAnalyticsByUserId(userId);
        return analytics.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Analytics createAnalytics(@RequestBody Analytics analytics) {
    	System.out.println("AnalyticsController.createAnalytics()");
        return analyticsService.createAnalytics(analytics);
    }

    @DeleteMapping("/{id}")
    public void deleteAnalytics(@PathVariable Long id) {
    	System.out.println("AnalyticsController.deleteAnalytics()");
        analyticsService.deleteAnalytics(id);
    }
}