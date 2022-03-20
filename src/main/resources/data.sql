-- users table
insert into users(email, password, username) values('masgan@gmail.com', '123qweasd', 'masgan');
insert into users(email, password, username) values('edwin@gmail.com', '123qweasd', 'edwin');
insert into users(email, password, username) values('rafly@gmail.com', '123qweasd', 'rafly');
-- insert into users(email, password, username) values('azis@gmail.com', '123qweasd', 'azis');
-- insert into users(email, password, username) values('ilham@gmail.com', '123qweasd', 'ilham');
-- insert into users(email, password, username) values('indra@gmail.com', '123qweasd', 'indra');
-- insert into users(email, password, username) values('syawal@gmail.com', '123qweasd', 'sywal');
-- insert into users(email, password, username) values('wendy@gmail.com', '123qweasd', 'wendy');
-- insert into users(email, password, username) values('wayan@gmail.com', '123qweasd', 'wayan');
-- insert into users(email, password, username) values('anwar@gmail.com', '123qweasd', 'anwar');
-- insert into users(email, password, username) values('naruto@gmail.com', '123qweasd', 'naruto');
-- insert into users(email, password, username) values('sasuke@gmail.com', '123qweasd', 'sasuke');
-- insert into users(email, password, username) values('hilman@gmail.com', '123qweasd', 'hilman');
-- insert into users(email, password, username) values('kakashi@gmail.com', '123qweasd', 'kakashi');
-- insert into users(email, password, username) values('deidara@gmail.com', '123qweasd', 'deidara');
-- insert into users(email, password, username) values('itachi@gmail.com', '123qweasd', 'itachi');

-- posts table
insert into posts(content, post_slug, post_title, user_id) values('typesetting industry', 'dummy-text', 'Lorem ipsum', 1);
insert into posts(content, post_slug, post_title, user_id) values('Lorem Ipsum', 'why-do', 'Why do we use it?', 1);
insert into posts(content, post_slug, post_title, user_id) values('fact that a reader', 'more-or-less', 'When looking', 3);
insert into posts(content, post_slug, post_title, user_id) values('now use Lorem Ipsum', 'where-can', 'Where can I get some ?', 2);

-- cities table
insert into cities(user_id, city) values(1, 'depok');
insert into cities(user_id, city) values(2, 'purwokerto');
insert into cities(user_id, city) values(3, 'semarang');

-- categories table
INSERT INTO `categories` (`name`) VALUES ('News'), ('Event'), ('Gallery'), ('Catalog');

-- post category table
INSERT INTO `post_category` (`post_id`, `category_id`) VALUES ('1', '1'), ('1', '2'), ('2', '1'), ('3', '3'), ('3', '1'), ('4', '4'), ('4', '2'), ('4', '3');