-- role
insert into role(id,name) values (1,'USER');

insert into role(id,name) values (2,'ADMIN');

-- users
insert into user (id,email,username,password_hash,role_id) values (1,'ivan@ivan.com','ivan','ivan',1);

insert into user (id,email,username,password_hash,role_id) values (2,'vladimir@vladimir.com','vladimir','vladimir',1);

insert into user (id,email,username,password_hash,role_id) values (3,'marko@marko.com','marko','marko',1);

insert into user (id,email,username,password_hash,role_id) values (4,'mika@mika.com','mika','mika',1);

insert into user (id,email,username,password_hash,role_id) values (5,'stevan@stevan.com','stevan','stevan',1);


-- admins
insert into user (id,email,username,password_hash,role_id) values (6,'adminPera@pera.com','pera','pera',2);

insert into user (id,email,username,password_hash,role_id) values (7,'adminLaza@laza.com','laza','laza',2);


-- kategorine
insert into category (id,name) values (1,'instrumenti');

insert into category (id,name) values (2,'ozvucenja');

insert into category (id,name) values (3,'oprema');

-- subcategorije
insert into sub_category (id,name,category_id) values(1,'zicani',1);

insert into sub_category (id,name,category_id) values(2,'duvacki',1);

insert into sub_category (id,name,category_id) values(3,'dirke',1);

insert into sub_category (id,name,category_id) values(4,'miksete',2);

insert into sub_category (id,name,category_id) values(5,'pojacala',2);

insert into sub_category (id,name,category_id) values(6,'zvucnici',2);

insert into sub_category (id,name,category_id) values(7,'stimeri',3);

insert into sub_category (id,name,category_id) values(8,'zice',3);




