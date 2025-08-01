import React from 'react';

function IndianPlayers() {
  const players = ['Virat Kohli', 'Rohit Sharma', 'KL Rahul', 'Rishabh Pant', 'Hardik Pandya', 'Ravindra Jadeja'];

  const oddPlayers = players.filter((_, index) => index % 2 !== 0);
  const evenPlayers = players.filter((_, index) => index % 2 === 0);

  const T20players = ['Virat Kohli', 'Rohit Sharma', 'KL Rahul'];
  const RanjiTrophyPlayers = ['Cheteshwar Pujara', 'Ajinkya Rahane'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {oddPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Even Team Players</h2>
      {evenPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Merged Players List</h2>
      {mergedPlayers.map((p, i) => <p key={i}>{p}</p>)}
    </div>
  );
}

export default IndianPlayers;
