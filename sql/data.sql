insert into saison values(1, 2023, 2024);

-- Ajout des équipes
INSERT INTO equipe (nom) VALUES
    ('Lakers'),
    ('Warriors'),
    ('Bulls'),
    ('Heat');

-- Ajout des joueurs pour les Lakers
INSERT INTO joueur (idequipe, nom, prenom, dtn) VALUES
    (1, 'James', 'LeBron', '1984-12-30'),
    (1, 'Davis', 'Anthony', '1993-03-11'),
    (1, 'Schroder', 'Dennis', '1993-09-15'),
    (1, 'Caldwell-Pope', 'Kentavious', '1993-02-18'),
    (1, 'Gasol', 'Marc', '1985-01-29'),
    (1, 'Kuzma', 'Kyle', '1995-07-24'),
    (1, 'Horton-Tucker', 'Talen', '2000-11-25'),
    (1, 'Caruso', 'Alex', '1994-02-28');

-- Ajout des joueurs pour les Warriors
INSERT INTO joueur (idequipe, nom, prenom, dtn) VALUES
    (2, 'Curry', 'Stephen', '1988-03-14'),
    (2, 'Thompson', 'Klay', '1990-02-08'),
    (2, 'Green', 'Draymond', '1990-03-04'),
    (2, 'Wiggins', 'Andrew', '1995-02-23'),
    (2, 'Wiseman', 'James', '2001-03-31'),
    (2, 'Oubre', 'Kelly', '1995-12-09'),
    (2, 'Paschall', 'Eric', '1997-11-04'),
    (2, 'Poole', 'Jordan', '1999-06-19');

-- Ajout des joueurs pour les Bulls
INSERT INTO joueur (idequipe, nom, prenom, dtn) VALUES
    (3, 'LaVine', 'Zach', '1995-03-10'),
    (3, 'Vucevic', 'Nikola', '1990-10-24'),
    (3, 'DeRozan', 'DeMar', '1989-08-07'),
    (3, 'Ball', 'Lonzo', '1997-10-27'),
    (3, 'White', 'Coby', '2000-02-16'),
    (3, 'Williams', 'Patrick', '1998-08-26'),
    (3, 'Caruso', 'Alex', '1994-02-28'),
    (3, 'Jones', 'Derrick', '1997-02-15');

-- Ajout des joueurs pour le Heat
INSERT INTO joueur (idequipe, nom, prenom, dtn) VALUES
    (4, 'Butler', 'Jimmy', '1989-09-14'),
    (4, 'Adebayo', 'Bam', '1997-07-18'),
    (4, 'Herro', 'Tyler', '2000-01-20'),
    (4, 'Robinson', 'Duncan', '1994-04-22'),
    (4, 'Dragic', 'Goran', '1986-05-06'),
    (4, 'Nunn', 'Kendrick', '1995-08-03'),
    (4, 'Olynyk', 'Kelly', '1991-04-19'),
    (4, 'Iguodala', 'Andre', '1984-01-28');

-- Ajout d'actions
INSERT INTO actions (points, nom) VALUES
    (2, 'Panier à deux points'),
    (3, 'Panier à trois points'),
    (1, 'Lancer franc'),
    (0, 'Rebond');


-- Ajout de deux matchs
INSERT INTO match (idequipe1, idequipe2, idsaison) VALUES
    (1, 2, 1),
    (3, 4, 1);

-- Ajout de six matchs pour le premier match (idmatch = 1)
INSERT INTO matchJoueur (idjoueur, idmatch, minuteentree, minutesortie) VALUES
    (1, 3, 0, 30),
    (2, 3, 0, 28),
    (3, 3, 15, 45),
    (4, 3, 5, 25),
    (5, 3, 0, 20),
    (6, 3, 10, 40);

-- Ajout de six matchs pour le deuxième match (idmatch = 2)
INSERT INTO matchJoueur (idjoueur, idmatch, minuteentree, minutesortie) VALUES
    (7, 4, 0, 32),
    (8, 4, 5, 28),
    (9, 4, 15, 40),
    (10, 4, 2, 22),
    (11, 4, 0, 18),
    (12, 4, 8, 38);