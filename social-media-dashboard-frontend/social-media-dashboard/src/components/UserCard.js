import React from 'react';

const UserCard = ({ user }) => {
  return (
    <div className="user-card">
      <h2>{user.name}</h2>
      <p>Category: {user.category}</p>
      <p>Bio: {user.bio}</p>
      <p>Contact: {user.contactOptions}</p>
      <a href={user.links} target="_blank" rel="noopener noreferrer">Visit Profile</a>
    </div>
  );
};

export default UserCard;
