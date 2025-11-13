CREATE DATABASE IF NOT EXISTS hibernate_db;
USE hibernate_db;

CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(50),
    age INT
);
