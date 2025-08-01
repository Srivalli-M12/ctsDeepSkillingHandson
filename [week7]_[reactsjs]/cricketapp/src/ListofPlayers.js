import React from 'react';

function ListofPlayers() {
  const players = [
    { name: 'Virat Kohli', score: 95 },
    { name: 'Rohit Sharma', score: 88 },
    { name: 'Shikhar Dhawan', score: 67 },
    { name: 'KL Rahul', score: 45 },
    { name: 'Rishabh Pant', score: 72 },
    { name: 'Hardik Pandya', score: 38 },
    { name: 'Ravindra Jadeja', score: 81 },
    { name: 'Bhuvneshwar Kumar', score: 55 },
    { name: 'Mohammed Shami', score: 60 },
    { name: 'Jasprit Bumrah', score: 40 },
    { name: 'Yuzvendra Chahal', score: 30 }
  ];

  const lowScorePlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((p, index) => (
        <p key={index}>{p.name} - {p.score}</p>
      ))}

      <h2>Players with score below 70</h2>
      {lowScorePlayers.map((p, index) => (
        <p key={index}>{p.name} - {p.score}</p>
      ))}
    </div>
  );
}

export default ListofPlayers;
