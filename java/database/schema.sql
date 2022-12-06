BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, restaurants;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE restaurants (
    restaurant_id SERIAL,
    name varchar(50) NOT NULL,
    type varchar(50) NOT NULL,
    address varchar(50) NOT NULL UNIQUE,
    city varchar(50) NOT NULL,
    state_abbrev varchar(50) NOT NULL,
    zip_code int NOT NULL,
    open_time TIME NOT NULL,
    close_time TIME NOT NULL,
    open_status varchar(50) NULL,
    CONSTRAINT PK_restaurant PRIMARY KEY (restaurant_id)

);

COMMIT TRANSACTION;
