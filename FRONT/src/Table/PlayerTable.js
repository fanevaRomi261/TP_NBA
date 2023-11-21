import React from "react";

import "./PlayerTable.css";

function getValue(player, idAction) {
  for (let index = 0; index < player.statsaction.length; index++) {
    const element = player.statsaction[index];
    if (element.idaction == idAction) {
      return element.reussi;
    }
  }
  return 0;
}

function calculFG(player) {
  return Math.round((getTirReussi(player) * 100) / getTirTotal(player));
}

function getTirReussi(player) {
  var total = 0;
  for (let index = 0; index < player.statsaction.length; index++) {
    const element = player.statsaction[index];
    if (
      element.idaction == 1 ||
      element.idaction == 2 ||
      element.idaction == 3
    ) {
      total += element.reussi;
    }
  }
  return total;
}

function getTirTotal(player) {
  var total = 0;
  for (let index = 0; index < player.statsaction.length; index++) {
    const element = player.statsaction[index];
    if (
      element.idaction == 1 ||
      element.idaction == 2 ||
      element.idaction == 3
    ) {
      total += element.manque + element.reussi;
    }
  }
  return total;
}

function calculPercentage(player, idAction) {
  for (let index = 0; index < player.statsaction.length; index++) {
    const element = player.statsaction[index];
    if (element.idaction == idAction) {
      return Math.round(
        (element.reussi * 100) / (element.manque + element.reussi)
      );
    }
  }
  return "";
}

const PlayerStatsTable = ({ players }) => {
  if (players == null) {
    return;
  }
  return (
    <div className="player-stats-table">
      <h2>Player Statistics</h2>
      <table>
        <thead>
          <tr>
            <th>Classement</th>
            <th>Joueur</th>
            <th>Equipe</th>
            <th>M</th>
            <th>MJ</th>
            <th>PPM</th>
            <th>RPM</th>
            <th>PDPM</th>
            <th>MPM</th>
            <th>EFF</th>
            <th>FG%</th>
            <th>3P%</th>
          </tr>
        </thead>
        <tbody>
          {players.map((player, index) => (
            <tr key={index}>
              <td>{index + 1}</td>
              <td>
                {player.nom} {player.prenom}
              </td>
              <td>{player.equipe}</td>
              <td>{player.total_match}</td>
              <td>{player.total_match}</td>
              <td>{player.points_totaux}</td>
              <td>{getValue(player, 4)}</td>
              <td>{getValue(player, 5)}</td>
              <td>--:--</td>
              <td>{calculPercentage(player, 2)}</td>
              <td>{calculFG(player)}</td>
              <td>{calculPercentage(player, 2)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default PlayerStatsTable;
