INSERT INTO tb_user (name, email, password) VALUES ('Alex','alex@gmail.com', '123456');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '123456');

INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_VIP');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);