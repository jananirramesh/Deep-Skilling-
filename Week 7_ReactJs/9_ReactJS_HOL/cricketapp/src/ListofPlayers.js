import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Ramesh", score: 80 },
    { name: "Suresh", score: 65 },
    { name: "Dinesh", score: 90 },
    { name: "Madhesh", score: 50 },
    { name: "Rahuman", score: 75 },
    { name: "Vijay", score: 60 },
    { name: "Rahul", score: 85 },
    { name: "Rangith", score: 45 },
    { name: "Sam", score: 70 },
    { name: "Watson", score: 95 },
    { name: "will", score: 55 },
  ];

  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name}: {player.score}</li>
        ))}
      </ul>

      <h3>List of Players having Scores Less than &lt; 70</h3>
      <ul>
        {filtered.map((player, index) => (
          <li key={index}>{player.name}: {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
