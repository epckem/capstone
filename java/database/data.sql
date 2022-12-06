BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('Rhinegeist Brewery', '', 'Brewery', '1910 Elm St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Taft''s Ale House', '', 'Brewery', '1429 Race St', 'Cincinnati', 'OH', '45202','11:00:00', '23:00:00', '4.5', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'BrewDog Cincinnati', '', 'Brewery', '316 Reading Rd', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Braxting Brewing Cincinnati', '', 'Brewery', '331 E 13th St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
    	VALUES ('','Samuel Adams Cincinnati Taproom', '', 'Brewery', '1727 Logan St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Condado Tacos', '', 'Mexican', '195 E Freedom Way', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('','Bakersfield', '', 'Mexican', '1213 Vine St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Gomez Salsa', '', 'Mexican', '107 E 12th St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.6', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Nada', '', 'Mexican', '600 Walnut St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.4', '');
INSERT INTO restaurants(img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone)
	VALUES ('', 'Mita''s Restaurant', '', 'Mexican', '501 Race St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.6', '');

COMMIT TRANSACTION;
