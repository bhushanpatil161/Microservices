insert into user_details(id, birth_date,name) values (1001, current_date(), 'Bhushan');
insert into user_details(id, birth_date,name) values (1002, current_date(), 'Ashish');
insert into user_details(id, birth_date,name) values (1003, current_date(), 'Rewati');

insert into post(id,description, user_id) values (20001, "I want to connect AWS", 1001);
insert into post(id,description, user_id) values (20002, "I want to connect Microservices", 1002);
insert into post(id,description, user_id) values (20003, "I want to connect Security", 1003);