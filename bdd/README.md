CREATE DATABASE bdd_Y_Share;


use bdd_Y_Share;

CREATE TABLE IF NOT EXISTS Utilisateur (
		num integer(10) NOT NULL,
		pseudo varchar(60) NOT NULL,
		mdp varchar(120) NOT NULL,
		mail varchar(120) NOT NULL,
		numero integer(10) NOT NULL,
		primary key (num)
);

CREATE TABLE  Particulier(
    nom varchar(60) NOT NULL,
	prenom varchar(60) NOT NULL
) INHERITS (Utilisateur);

CREATE TABLE  Commercant(
    nom varchar(60) NOT NULL,
	typeEtablissement varchar(160) NOT NULL
) INHERITS (Utilisateur);

CREATE TABLE IF NOT EXISTS Localisation(
		num integer(10) NOT NULL,
		lon float(100000) NOT NULL,
		lat float(100000) NOT NULL,
		rayon float(1000000),
		#num integer(10) NOT NULL,
		#Num integer(10) NOT NULL,
		Primary key (num),
		Foreign key (#num) references Utilisateur(num),
		Foreign key (#Num) references Event(Num)
);

CREATE TABLE IF NOT EXISTS Stat(
		num integer(10) NOT NULL,
		vendu integer(10),
		recu integer(10),
		donner integer(10),
		achater integer(10),
		#num integer(10) NOT NULL,
		Primary key (num),
		Foreign key (#num) references Utilisateur(num)
);

CREATE TABLE Event (
	Num NUMBER (10) NOT NULL,
	Nom VARCHAR (50) NOT NULL,
	Detail VARCHAR (500) NOT NULL,
	PRIMARY KEY (Num)
);

CREATE TABLE Offre (
	Num NUMBER (10) NOT NULL,
	Nom VARCHAR (50) NOT NULL,
	Detail VARCHAR (500) NOT NULL,
	CheminImage VARCHAR (200),
	PRIMARY KEY (Num)
);

CREATE TABLE Bien (
	Nom VARCHAR (50) NOT NULL,
	Prix NUMBER (10) NOT NULL
	CONSTRAINT C1_Prix CHECK (Prix > 0),
) INHERITS (Offre);

CREATE TABLE RDV (
	NbPersonnes NUMBER (3) NOT NULL,
	Date VARCHAR (10) NOT NULL
	CONSTRAINT C1_NbPersonnes CHECK (NbPersonnes > 0)
) INHERITS (Offre);

CREATE TABLE Service (
	Heure NUMBER (2) NOT NULL,
	Date VARCHAR (10) NOT NULL,
	Competences VARCHAR (500) NOT NULL,
	CONSTRAINT C1_Heure CHECK (Heure >= 0),
	CONSTRAINT C2_Heure CHECK (Heure <= 24),
) INHERITS (Offre);







