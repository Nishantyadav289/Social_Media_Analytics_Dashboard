// src/App.js
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import UserCard from './components/UserCard';
import PostList from './components/PostList';
import AnalyticsCard from './components/AnalyticsCard';
import './App.css';

const App = () => {
  const [user, setUser] = useState(null);
  const [posts, setPosts] = useState([]);
  const [analytics, setAnalytics] = useState(null);

  useEffect(() => {
    // Fetch user data
    axios.get('http://localhost:8080/api/users/1')
      .then(response => setUser(response.data))
      .catch(error => console.error('Error fetching user data:', error));

    // Fetch posts data
    axios.get('http://localhost:8080/api/posts?userId=1')
      .then(response => setPosts(response.data))
      .catch(error => console.error('Error fetching posts data:', error));

    // Fetch analytics data
    axios.get('http://localhost:8080/api/analytics?userId=1')
      .then(response => setAnalytics(response.data))
      .catch(error => console.error('Error fetching analytics data:', error));
  }, []);

  return (
    <div className="App">
      {user && <UserCard user={user} />}
      {posts.length > 0 && <PostList posts={posts} />}
      {analytics && <AnalyticsCard analytics={analytics} />}
    </div>
  );
};

export default App;
