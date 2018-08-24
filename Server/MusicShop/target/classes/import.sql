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


-- kategorije
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

-- podartikli
insert into article_category(id,name,category_id,sub_category_id) values(1,'gitare',1,1);
insert into article_category(id,name,category_id,sub_category_id) values(2,'violine',1,1);
insert into article_category(id,name,category_id,sub_category_id) values(3,'tamburice',1,1);
insert into article_category(id,name,category_id,sub_category_id) values(4,'trube',1,2);
insert into article_category(id,name,category_id,sub_category_id) values(5,'frule',1,2);
insert into article_category(id,name,category_id,sub_category_id) values(6,'roland',2,5);
insert into article_category(id,name,category_id,sub_category_id) values(7,'ibanez',2,5);
insert into article_category(id,name,category_id,sub_category_id) values(8,'marshall',2,5);
insert into article_category(id,name,category_id,sub_category_id) values(9,'simens',2,6);
insert into article_category(id,name,category_id,sub_category_id) values(10,'sal',2,6);

-- artikli
insert into article(id,name,price,article_category_id) values (1,'ibanez grg 270', 1500,1);
insert into article(id,name,price,article_category_id) values (2,'fender stratocaster', 150,1);
insert into article(id,name,price,article_category_id) values (3,'BC Rich warlock', 3000,1);
insert into article(id,name,price,article_category_id) values (4,'RX acoustic', 750,1);
insert into article(id,name,price,article_category_id) values (5,'Strativari', 3500,2);
insert into article(id,name,price,article_category_id) values (6,'Dominique', 5000,2);
insert into article(id,name,price,article_category_id) values (7,'Tamburica', 1000,3);
insert into article(id,name,price,article_category_id) values (8,'Moller', 1500,4);
insert into article(id,name,price,article_category_id) values (9,'TR 100', 4500,4);
insert into article(id,name,price,article_category_id) values (10,'Yamaha', 8000,4);
insert into article(id,name,price,article_category_id) values (11,'Amati kraslice ATR202', 6600,4);
insert into article(id,name,price,article_category_id) values (12,'Kosa frula', 100,5);
insert into article(id,name,price,article_category_id) values (13,'Pan frula', 150,5);
insert into article(id,name,price,article_category_id) values (14,'Roland Micro Cube-GX RD', 5000,6);
insert into article(id,name,price,article_category_id) values (15,'Roland STREET CUBE BK', 5400,6);
insert into article(id,name,price,article_category_id) values (16,'Ibanez IBZ10G V2', 5400,7);
insert into article(id,name,price,article_category_id) values (17,'Ibanez MIMX150H', 5400,7);
insert into article(id,name,price,article_category_id) values (18,'Marshall Code 50', 35000,8);
insert into article(id,name,price,article_category_id) values (19,'Marshall MG15CFX', 45000,8);
insert into article(id,name,price,article_category_id) values (20,'Simens zvucnik X35', 7000,9);
insert into article(id,name,price,article_category_id) values (21,'Simens zvucnik 55T', 7500,9);
insert into article(id,name,price,article_category_id) values (22,'SAL 5', 1000,10);
insert into article(id,name,price,article_category_id) values (23,'XMG SAL T88', 1100,10);
insert into article(id,name,price,category_id) values (24,'trzalica', 75,3);
insert into article(id,name,price,category_id) values (25,'stimer', 150,3);
insert into article(id,name,price,category_id) values (26,'set zica', 800,3);
insert into article(id,name,price,category_id) values (27,'opruge za gitare', 500,3);







