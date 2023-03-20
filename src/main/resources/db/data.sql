insert into user_tb(username, password, email,  created_at) values ('ssar', '1234', 'ssar@nate.com', now());
insert into user_tb(username, password, email,  created_at) values ('cos', '1234', 'cos@nate.com', now());

insert into board_tb(title,content, user_id, created_at) values ('title1', 'content1', '1', now());
insert into board_tb(title,content, user_id, created_at) values ('title2', 'content2', '2', now());
insert into board_tb(title,content, user_id, created_at) values ('title3', 'content3', '2', now());
insert into board_tb(title,content, user_id, created_at) values ('title4', 'content4', '1', now());
insert into board_tb(title,content, user_id, created_at) values ('title5', 'content5', '1', now());
commit;