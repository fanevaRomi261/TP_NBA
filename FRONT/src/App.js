import logo from "./logo.svg";
import "./App.css";
import React, { useState, useEffect } from "react";
import PlayerStatsTable from "./Table/PlayerTable";

function App() {
  const [playerData, setPlayerData] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch("http://172.50.112.79:8080/Stat/Joueurs");
        console.log(response);
        if (!response.ok) {
          throw new Error("Network response was not ok");
        }
        const data = await response.json();
        setPlayerData(data); // Update state with fetched data
      } catch (error) {
        setError(error); // Handle errors
      }
    };

    fetchData();
  }, []);
  const players = [
    {
      rank: 1,
      playerName: "LeBron James",
      team: "Los Angeles Lakers",
      matches: 82,
      minutesPlayed: 35.2,
      pointsPerMatch: 27.4,
      reboundsPerMatch: 8.5,
      assistsPerMatch: 8.3,
      fieldGoalPercentage: 51.6,
      threePointPercentage: 34.6,
      freeThrowPercentage: 73.1,
      efficiency: 28.6,
    },
    {
      rank: 2,
      playerName: "Kevin Durant",
      team: "Brooklyn Nets",
      matches: 68,
      minutesPlayed: 33.8,
      pointsPerMatch: 26.9,
      reboundsPerMatch: 7.1,
      assistsPerMatch: 5.6,
      fieldGoalPercentage: 52.3,
      threePointPercentage: 45.0,
      freeThrowPercentage: 86.3,
      efficiency: 27.5,
    },
    // Add more players as needed
  ];
  return (
    <div className="app">
      <h1>Basketball Player Statistics</h1>
      <PlayerStatsTable players={playerData} />
    </div>
    // <div className="app">
    //   <h1>Player Stats from Web Service</h1>
    //   {error ? (
    //     <p>Error: {error.message}</p>
    //   ) : playerData ? (
    //     <div>
    //       <h2>Players Data</h2>
    //       <pre>{JSON.stringify(playerData, null, 2)}</pre>
    //     </div>
    //   ) : (
    //     <p>Loading...</p>
    //   )}
    // </div>
  );
}

export default App;
