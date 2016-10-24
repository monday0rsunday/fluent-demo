CREATE DATABASE IF NOT EXISTS fluent;

USE fluent;

CREATE TABLE IF NOT EXISTS info (
  id int auto_increment,
  created_at timestamp,
  line varchar(512),
  primary key(id) 
);
CREATE TABLE IF NOT EXISTS other (
  id int auto_increment,
  created_at timestamp,
  line varchar(512),
  primary key(id) 
);
