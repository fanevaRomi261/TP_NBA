
-- Vue pour stat individuel
create view vw_statindividuel as
SELECT
    max(actionsmatch.id) as id,
    joueur.id as idjoueur,
    joueur.nom,
    joueur.prenom,
    actionsMatch.idaction,
    COUNT(CASE WHEN actionsMatch.etat = 0 THEN 1 END) AS manque,
    COUNT(CASE WHEN actionsMatch.etat = 1 THEN 1 END) AS reussi,
    SUM(CASE WHEN actionsMatch.etat = 1 THEN actions.points ELSE 0 END) AS total_points
FROM actionsMatch
JOIN actions ON actions.id = actionsMatch.idaction
JOIN matchJoueur ON matchJoueur.id = actionsMatch.idmatchjoueur
JOIN joueur ON joueur.id = matchJoueur.idjoueur
GROUP BY actionsMatch.idaction, joueur.id, joueur.nom, joueur.prenom;

-- Vue pour avoir le classement des joueurs
create view vw_joueur as
SELECT
    joueur.id, joueur.nom, joueur.prenom, joueur.idequipe, max(equipe.nom) as equipe, joueur.dtn,
    (SELECT COUNT(idmatch) FROM matchjoueur WHERE idjoueur = joueur.id) AS total_match,
    SUM(total_points) AS points_totaux
FROM vw_statindividuel
join joueur on vw_statindividuel.idjoueur = joueur.id
join equipe on joueur.idequipe = equipe.id
GROUP BY joueur.id, joueur.nom, joueur.prenom
ORDER BY points_totaux DESC;