// src/components/AnalyticsCard.js
import React from 'react';

const AnalyticsCard = ({ analytics }) => {
  return (
    <div className="analytics-card">
      <h2>Analytics</h2>
      <p>Followers: {analytics.followers}</p>
      <p>Following: {analytics.following}</p>
      <p>Posts: {analytics.posts}</p>
      <p>Reached: {analytics.reached}</p>
      <p>Engaged: {analytics.engaged}</p>
      <p>Active Promotions: {analytics.activePromotions}</p>
      <p>Total Stories: {analytics.totalStories}</p>
      <p>Total Saves: {analytics.totalSaves}</p>
      <p>Total Comments: {analytics.totalComments}</p>
      <p>Total Shares: {analytics.totalShares}</p>
    </div>
  );
};

export default AnalyticsCard;
