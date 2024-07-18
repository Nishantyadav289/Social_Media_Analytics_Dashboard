package com.app.dashboard.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.dashboard.dao.AnalyticsRepository;
import com.app.dashboard.dao.PostRepository;
import com.app.dashboard.dao.UserRepository;
import com.app.dashboard.pojo.Analytics;
import com.app.dashboard.pojo.Post;
import com.app.dashboard.pojo.User;

@Configuration
public class DataLoader {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Bean
    CommandLineRunner loadData() {
        return args -> {
            User user1 = new User();
            user1.setName("John Doe");
            user1.setCategory("Influencer");
            user1.setBio("Lifestyle and travel blogger");
            user1.setContactOptions("email: john@example.com");
            user1.setLinks("https://instagram.com/johndoe");

            user1 = userRepository.save(user1);

            Post post1 = new Post();
            post1.setUserId(user1.getId());
            post1.setContent("Exploring the beautiful beaches of Hawaii!");
            post1.setLikes(120);
            post1.setComments(30);
            post1.setShares(10);

            postRepository.save(post1);

            Analytics analytics1 = new Analytics();
            analytics1.setUserId(user1.getId());
            analytics1.setFollowers(1500);
            analytics1.setFollowing(300);
            analytics1.setPosts(75);
            analytics1.setReached(5000);
            analytics1.setEngaged(1200);
            analytics1.setActivePromotions(2);
            analytics1.setTotalStories(50);
            analytics1.setTotalSaves(100);
            analytics1.setTotalComments(200);
            analytics1.setTotalShares(150);

            analyticsRepository.save(analytics1);
        };
    }
}
