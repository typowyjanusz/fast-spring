Insert into beer(id, name, abv) values(4,'Task 1',100);
Insert into beer(id, name, abv) values(5,'porter',100);
Insert into beer(id, name, abv) values(6,'ipa',100);
Insert into task(id, name, description, budget, done) values(1,'Task 1', 'Description of task 1', 100.00, TRUE);
Insert into task(id, name, description, budget, done) values(2,'Task 2', 'Litwo! Ojczyzno moja! ty jesteś jak zdrowie Ile cię trzeba cenić, ten tylko się dowie,Kto cię stracił. Dziś piękność twą w całej ozdobie Widzę i opisuję, bo tęsknię po tobie.', 100.00, TRUE);
Insert into task(id, name, description, budget, done) values(3,'Task 3', 'Description of task 3 Do', 50.00, FALSE);
insert into content(object,subject) values('Litwo! Ojczyzno moja! ty jesteś jak zdrowie Ile cię trzeba cenić, ten tylko się dowie,Kto cię stracił. Dziś piękność twą w całej ozdobie Widzę i opisuję, bo tęsknię po tobie.','Inwokacja');
insert into content(object,subject) values('Nie bój się kurwo, Ta noc już się rodzi, Nie bój się wódy, Ta nigdy nie zwodzi, Naparstek w naparstek, Kielichy jak dzwony','Odraza Wielki Mizogin');
insert into content(object,subject) values('Za sny o pustce, Wysoka cena płacona, Bywa niczym, Kiedy zapłata, Nic nie warta.','Furia');

drop table if exists user_roles;
drop table if exists users;
CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));

INSERT INTO users(username,password,enabled)
VALUES ('andrzej','duda', true);
INSERT INTO users(username,password,enabled)
VALUES ('noob','noob', true);
INSERT INTO users(username,password,enabled)
VALUES ('admin','admin', true);

INSERT INTO user_roles (username, role)
VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('admin', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('andrzej', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('noob', 'ROLE_USER');
