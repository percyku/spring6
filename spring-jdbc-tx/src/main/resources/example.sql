

-- 建立使用者並設定密碼 (MySQL 8.0 語法)
CREATE USER IF NOT EXISTS 'spring-db-user'@'localhost' IDENTIFIED BY 'spring-db-user';

-- 授予對 spring 資料庫的所有權限
GRANT ALL PRIVILEGES ON spring.* TO 'spring-db-user'@'localhost';

-- 務必執行這行讓權限生效
FLUSH PRIVILEGES;







CREATE DATABASE  `spring`;

use `spring`;
CREATE TABLE `t_emp`(
	`id` int(11) NOT NULL auto_increment,
    `name` varchar(20) default null comment '姓名',
    `age` int(11) default null comment '年齡',
    `sex` varchar(20) default null comment '性別',
    PRIMARY KEY(`id`)
) engine=InnoDB DEFAULT CHARSET=utf8mb4;
select * from t_emp;



use `spring`;
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`(
                         `book_id` int(11) NOT NULL auto_increment comment '主鍵',
                         `book_name` varchar(20) default null comment '書名',
                         `price` int(11) default null comment '價格',
                         `stock` int(10) unsigned default null comment '庫存',
                         PRIMARY KEY(`book_id`)
) engine=InnoDB auto_increment=3 DEFAULT CHARSET=utf8mb4;

insert into `t_book`(`book_id`,`book_name`,`price`,`stock`) values (1,'致富心態',80,100);
insert into `t_book`(`book_id`,`book_name`,`price`,`stock`) values (2,'一如繼往',50,100);

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`(
                         `user_id` int(11) NOT NULL auto_increment comment '主鍵',
                         `username` varchar(20) default null comment '書名',
                         `balance` int(11) unsigned default null comment '價格',
                         PRIMARY KEY(`user_id`)
) engine=InnoDB auto_increment=2 DEFAULT CHARSET=utf8mb4;

insert into `t_user`(`user_id`,`username`,`balance`) values (1,'admin',50);
insert into `t_user`(`user_id`,`username`,`balance`) values (2,'percy',5000);

insert into `t_user`(`user_id`,`username`,`balance`) values (3,'peter',100);