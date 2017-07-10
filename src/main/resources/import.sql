CREATE TABLE user_details (id SERIAL NOT NULL CONSTRAINT user_details_pkey PRIMARY KEY, email varchar(255), first_Name varchar(255), last_Name varchar(255), password varchar(255));
INSERT INTO user_details(email,first_name,last_name,password) VALUES ('vasia@mail.com','admin','admin','admin');
INSERT INTO user_details(email,first_name,last_name,password) VALUES ('dima@yandex.com','Dima','Ivanov','divanov');
INSERT INTO user_details(email,first_name,last_name,password) VALUES ('larisa@rambler.com','Larisa','Bigova','lbigova');