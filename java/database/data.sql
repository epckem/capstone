BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/OlSTGctE1S6-cGDYBy3Hkw/o.jpg','Rhinegeist Brewery', 'Brewing hoppy & sessionable craft beer and investing in the character of the Over the Rhine and greater brewing communities.', 'Brewery', '1910 Elm St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '(513) 381-1356','https://s3-media0.fl.yelpcdn.com/bphoto/D7hdCMvZQS7MscTghzr71A/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/Q6ouwz-5AGRgFxpsJUfAzA/o.jpg','https://thumbs2.imgbox.com/80/90/MDB4yOZf_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/QSq_E9GG1bz_vqFStMuSJw/o.jpg', 'Taft''s Ale House', '10+ brewed in house craft beers on tap, Tri-Tip Steak, Salads, Chicken, Salmon, all in the setting of a renovated old church that was built in 1850.', 'Brewery', '1429 Race St', 'Cincinnati', 'OH', '45202','11:00:00', '23:00:00', '4.5', '(513) 334-1393','https://s3-media0.fl.yelpcdn.com/bphoto/je4pp7sIm4WvUf4IiH45GQ/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/k0SPXzueGYJw3DPmlgRzuA/o.jpg','https://thumbs2.imgbox.com/51/0d/VcgBxcD7_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/1n8OCPWXvOHa2N5mhzsizA/o.jpg', 'BrewDog Cincinnati', 'Two hours south of our American HQ we opened an 8,500 sq ft craft beer mecca! With 24 taps of craft beer glory, a mezzanine chock full of games, and a beer school space for everything beer geekery, BrewDog Cincinnati is THE place to experience craft beer in The Queen City. We are also dog friendly in our outside areas, so you can bring your furry friend with you!', 'Brewery', '316 Reading Rd', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '(513) 457-5287','https://s3-media0.fl.yelpcdn.com/bphoto/GMfvsaY6yaNAT5ukCndG2g/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/nPqiXTX5KjwaIuXcX9a00A/o.jpg','https://thumbs2.imgbox.com/36/a1/HMQjwJvs_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/WI539QW-S5HfGJLCr_w3eg/o.jpg', 'Braxton Brewing Cincinnati', 'Braxton Brewing Company melds the 500 year-old tradition of making beer with new age consumer technology. Located in Greater Cincinnati our Taproom of the Future will be a showcase to our craft beers, and redefine the beer drinking experience. We are creating the brewery of your dreams in the heart of the new Midwest, and cannot wait to pour you a pint!', 'Brewery', '331 E 13th St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '(859) 261-5600','https://s3-media0.fl.yelpcdn.com/bphoto/SyoJKOUgTnZINF16ZxBpCQ/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/0P_mQ082nyQgUSpc_Blh6A/o.jpg','https://thumbs2.imgbox.com/a3/e9/0XJc2pHS_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/jvrukYvnNZVELWtP0cLb5w/o.jpg','Samuel Adams Cincinnati Taproom', 'Located in the Over-The Rhine neighborhood, just a block away from historic Findlay Market, our Cincinnati Taproom features pints and flights of our innovative styles, rotating experimental beers, as well as fan-favorites like Samuel Adams Boston Lager, and seasonal brews like Samuel Adams Summer Ale.', 'Brewery', '1727 Logan St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '(513) 412-3300','https://s3-media0.fl.yelpcdn.com/bphoto/0PwBXOnnBdOefXXJyATwtw/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/qr6xOQtT7v7CwDotqV1fkA/o.jpg','https://thumbs2.imgbox.com/9d/61/aqiyThic_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/ASZ6LlJDpWTb6xFtGiS8AA/o.jpg', 'Condado Tacos', 'We are all about the tacos, tequila + margaritas here at Condado Cincinnati Banks, but the main attraction is our build-your-own tacos! Choices range from toppings + proteins, to shells + sauces. We pride ourselves on having fresh ingredients made every single day and -- unlike other joints -- tacos made your way.', 'Mexican', '195 E Freedom Way', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.0', '(513) 263-1172','https://s3-media0.fl.yelpcdn.com/bphoto/DiCTI9XZ-VCcbjGVa8CEaA/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/yDE9jk-rtPyVoDvpPsjcRQ/o.jpg','https://thumbs2.imgbox.com/9f/87/KZmTNSwl_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/l_1XaopysuQ7gV8oYoHulQ/o.jpg','Bakersfield', 'Serving up authentic, Mexican street fare, and a selection of over 100 tequilas and American whiskeys. Bakersfield is a spot where the food is simple, the service is warm and the atmosphere is alive.', 'Mexican', '1213 Vine St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.5', '(513) 579-0446','https://s3-media0.fl.yelpcdn.com/bphoto/U8JpknIvaFxdVwxjJn8Y_g/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/vQbcvx0jrRSOXRO7sIt0Vw/o.jpg','https://thumbs2.imgbox.com/46/2a/Q7LGViHk_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/EPDLAjjDpGByG4u_zJtYIw/o.jpg', 'Gomez Salsa', 'Gomez Salsa began in the small town of Brownsville, Texas where the best taco of my life was assembled by my abuelita (grandmother), Oralia Gomez. She also hand-chopped the most authentic salsa I’ve ever encountered, which my father made weekly for our family. From them, I learned to make salsa the way they did and began producing and selling Gomez Salsa around the Cincinnati area.', 'Mexican', '107 E 12th St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.6', '(513) 381-1596','https://s3-media0.fl.yelpcdn.com/bphoto/uwUpYJUaiF2xUKS_pT76NQ/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/H9yApB_eUBptwsJSZ05XdA/o.jpg', 'https://thumbs2.imgbox.com/a6/99/YkiZ3fPk_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/8-vSLJIEmAi7lwXmxlPQlQ/o.jpg', 'Nada', 'Reservations, Outdoor Seating, Seating, Television, Highchairs Available, Wheelchair Accessible, Serves Alcohol, Full Bar, Free Wifi, Accepts Credit Cards, Table Service, Wine and Beer, Gift Cards Available', 'Mexican', '600 Walnut St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.4', '(513) 721-6232','https://s3-media0.fl.yelpcdn.com/bphoto/Vg8aXCfi-Y89kk400OoIiQ/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/lmpURaw7efMkaOJbbjBzxQ/o.jpg','https://thumbs2.imgbox.com/91/93/NgldOLFh_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
	VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/QPWnDvzAIsiuOPy4iT062w/o.jpg', 'Mita''s Restaurant', 'Mitas eclectic, farm-inspired menu focuses on both the traditional and modern foods and beverages of Spain and Latin America - with tapas, ceviches, cured hams, cheeses and large plates.  The wine program emphasizes Spain and the Old World.', 'Mexican', '501 Race St', 'Cincinnati', 'OH', '45202', '11:00:00', '23:00:00', '4.6', '(513) 421-6482','https://s3-media0.fl.yelpcdn.com/bphoto/vKVtLTQXoa6ZNqgJXYK0mw/o.jpg', 'https://s3-media0.fl.yelpcdn.com/bphoto/0rrX3VUxINhW1mlMTnxd_Q/o.jpg','https://thumbs2.imgbox.com/94/b4/IP5FJF8P_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/Q644ykLvH35z9P9_kmYYhA/o.jpg', 'Hofbrauhaus Newport', 'Traditional bier brewed on site every day. An award-winning menu of German favorites and American classics. A vibrant environment modeled after the Munich original featuring live music and a beautiful biergarten.', 'Brewery', '200 E 3rd St', 'Newport', 'KY', '41071', '11:00:00', '23:00:00', '4.0', '(859) 491-7200','https://s3-media0.fl.yelpcdn.com/bphoto/xeClfN3pFh9VB3WmUV5Nlg/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/E_46qxz5QUukbfE5L8bNOw/o.jpg','https://thumbs2.imgbox.com/eb/61/cdp4dIam_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/0_cBaLy97Y1t0NIMCRDlUQ/o.jpg', 'Wooden Cask Brewing Company', 'Wooden Cask Brewing Company is a modern microbrewery designed to honor traditional English pubs. Our 4000 square-foot taproom is home to a standard menu of 18 Wooden Cask beers, a rotating menu of small-batch brews, wines from our own winery, and an extensive bourbon selection. As a family-run business, we are proud to serve our Northern Kentucky community. Our taproom is fully renovated, and we offer private event space for personal and corporate use. Come enjoy our brews, grab a bite to eat, and relax with friends at Wooden Cask.', 'Brewery', '629 York St', 'Newport', 'KY', '41071', '11:00:00', '23:00:00', '4.5', '(859) 261-2172','https://s3-media0.fl.yelpcdn.com/bphoto/E8kGe0K86aIeeD3PA31Eyw/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/Efy97KJ0vwnnFrZHXtluGg/o.jpg','https://thumbs2.imgbox.com/89/d6/hYV93BGG_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/iN4cwzU8KiccNJz5owNphA/o.jpg', 'Mazunte Taqueria', 'Authentic street-style Mexican food. Tacos, enchiladas, toastadas, quesadillas, guacamole, queso, elote, margaritas. Vegetarian, vegan, and gluten-free friendly.', 'Mexican', '5207 Madison Rd Ste 100', 'Cincinnati', 'OH', '45227', '11:00:00', '23:00:00', '4.5', '(513) 785-0000','https://s3-media0.fl.yelpcdn.com/bphoto/GebdMu0Q9H9_24CZJpfV8g/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/vE_MqzB3wmXbxM4Lee_G5A/o.jpg','https://thumbs2.imgbox.com/85/92/wXOl1w6V_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/x9A5aA7AGb8n9xIr0dOslQ/o.jpg', 'Agave & Rye - Covington', 'We believe food is an adventure, taking you somewhere playful with every bite. We have made it our promise to deliver a chef inspired take on the standard taco. Elevating this simple food into something Epic. If you enjoy creative delicious food, and an endless selection of Bourbon, Tequila and Craft Cocktails, we promise Agave & Rye is the place for you.', 'Mexican', '635 Madison Ave', 'Covington', 'KY', '41011', '11:00:00', '23:00:00', '4.0', '(859) 360-1060','https://s3-media0.fl.yelpcdn.com/bphoto/-N2QmiYGvNL7xUBUel3Dqg/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/Qc3b_p18pgm9jYdmiRaARQ/o.jpg','https://thumbs2.imgbox.com/6a/2c/rPeQ0GVF_t.jpg');
INSERT INTO restaurants(img, name, description, type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg)
    VALUES ('https://s3-media0.fl.yelpcdn.com/bphoto/qJ1w-Bha1TXVFqgWfnpBug/o.jpg', 'MadTree Brewing', 'raft beer and excellent food from Catch-A-Fire Café. The large outdoor beer garden provide great space with an additional bar so you can soak in the outdoors and hang out with your pets. Boasts two private event spaces and venues for parties small to large.', 'Brewery', '3301 Madison Rd', 'Cincinnati', 'OH', '45209', '11:00:00', '23:00:00', '4.5', '(513) 836-8733','https://s3-media0.fl.yelpcdn.com/bphoto/fHd8GcQUk1nL2fPOqOuC-w/o.jpg','https://s3-media0.fl.yelpcdn.com/bphoto/50kBvSv-ZUb3CuTVTKucMQ/o.jpg','https://thumbs2.imgbox.com/5f/7c/8VzsbvBv_t.jpg');
INSERT INTO events(user_id, eventName, location, decisionDate, inviteCode)
	VALUES (1, 'Saturday Dinner', '45202', '2022-12-10 10:00:00', 'testURL');
COMMIT TRANSACTION;
