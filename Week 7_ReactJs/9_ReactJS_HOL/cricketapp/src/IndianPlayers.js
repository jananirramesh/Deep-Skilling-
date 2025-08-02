import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ["Ramesh", "Suresh", "Dinesh", "Madhesh", "Rahuman", "Vijay"];
  const evenTeam = ["Rahul", "Rangith", "Sam", "Watson", "will"];

  const [T20players, RanjiTrophyPlayers] = [
    ["Mr. First Player", "Mr. Second Player"],
    ["Mr. Third Player", "Mr. Fouth Player"]
  ];

  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddTeam.map((name, index) => <li key={index}>{name}</li>)}
      </ul>

      <h2>Even Players</h2>
      <ul>
        {evenTeam.map((name, index) => <li key={index}>{name}</li>)}
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allPlayers.map((name, index) => <li key={index}>{name}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
