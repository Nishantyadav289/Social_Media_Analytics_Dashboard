// src/components/PostList.js
import React from 'react';

const PostList = ({ posts }) => {
  return (
    <div className="post-list">
      <h2>Posts</h2>
      {posts.map(post => (
        <div key={post.id} className="post">
          <p>{post.content}</p>
          <p>Likes: {post.likes}</p>
          <p>Comments: {post.comments}</p>
          <p>Shares: {post.shares}</p>
        </div>
      ))}
    </div>
  );
};

export default PostList;
