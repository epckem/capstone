BEGIN TRANSACTION;

DROP TABLE IF EXISTS event_voting, events, restaurants, users;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE restaurants (
    restaurant_id SERIAL,
    img varchar(255) NULL,
    name varchar(50) NOT NULL,
    description varchar(1000) NULL,
    type varchar(50) NOT NULL,
    address varchar(50) NOT NULL UNIQUE,
    city varchar(50) NOT NULL,
    state_abbrev varchar(50) NOT NULL,
    zip_code varchar(12) NOT NULL,
    open_time TIME NOT NULL,
    close_time TIME NOT NULL,
    rating numeric(5,1) NOT NULL,
    phone varchar(14) NULL,
    img2 varchar(255) NULL,
    img3 varchar(255) NULL,
    mapimg varchar(255) NULL,
    CONSTRAINT PK_restaurant PRIMARY KEY (restaurant_id)

);

CREATE TABLE events (
    event_id SERIAL,
    user_id int,
    eventName VARCHAR(200) NOT NULL,
    location VARCHAR(50) NOT NULL,
    decisionDate TIMESTAMP NOT NULL,
    inviteCode VARCHAR(250) NOT NULL,
    CONSTRAINT PK_event PRIMARY KEY (event_id),
    CONSTRAINT FK_event FOREIGN KEY (user_id) REFERENCES users (user_id)
);

CREATE TABLE event_voting (
    event_id int NOT NULL,
    restaurant_id int NOT NULL,
    vote_up int NULL,
    vote_down int NULL,
    CONSTRAINT FK_event FOREIGN KEY (event_id) REFERENCES events (event_id),
    CONSTRAINT FK_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurants (restaurant_id)
);

COMMIT TRANSACTION;
