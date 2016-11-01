CREATE DATABASE IF NOT EXISTS fluent;

USE fluent;

CREATE TABLE IF NOT EXISTS stdout (
  id int auto_increment,
  created_at timestamp,
  source varchar(64),
  log varchar(2048),
  container_id varchar(512),
  container_name varchar(512),
  primary key(id) 
);

CREATE TABLE IF NOT EXISTS stderr (
  id int auto_increment,
  created_at timestamp,
  source varchar(64),
  log varchar(2048),
  container_id varchar(512),
  container_name varchar(512),
  primary key(id) 
);
CREATE TABLE IF NOT EXISTS other (
  id int auto_increment,
  created_at timestamp,
  source varchar(64),
  log varchar(2048),
  container_id varchar(512),
  container_name varchar(512),
  primary key(id) 
);
