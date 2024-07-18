package com.app.dashboard.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Analytics {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private int followers;
    private int following;
    private int posts;
    private int reached;
    private int engaged;
    private int activePromotions;
    private int totalStories;
    private int totalSaves;
    private int totalShares;
    private int totalComments;
    // getters and setters
	
}