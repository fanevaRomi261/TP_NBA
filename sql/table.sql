create database nba;


create table saison(
    id serial primary key,
    anneedebut integer,
    anneefin integer
);

create table equipe(
    id serial primary key,
    nom varchar(50)
);

create table joueur(
    id serial primary key,
    idequipe int,
    nom varchar(50),
    prenom varchar(50),
    dtn date,
    foreign key(idequipe) references equipe(id)
);

create table match(
    id serial primary key,
    idequipe1 integer,
    idequipe2 integer,
    idsaison integer,
    foreign key(idequipe1) references equipe(id),
    foreign key(idequipe2) references equipe(id),
    foreign key(idsaison) references saison(id)
);

create table actions(
    id serial primary key,
    points int,
    nom varchar(50)
);

create table matchJoueur(
    id serial primary key,
    idjoueur integer,
    idmatch integer,
    minuteentree decimal,
    minutesortie decimal,
    foreign key(idjoueur) references joueur(id),
    foreign key(idmatch) references match(id)
);

create table actionsMatch(
    id serial primary key,
    idmatchjoueur integer,
    idaction integer,
    etat integer,
    temps decimal,
    foreign key(idmatchjoueur) references matchjoueur(id),
    foreign key(idaction) references actions(id)
);

