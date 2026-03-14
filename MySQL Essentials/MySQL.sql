MySQL BASICS : 

CHEATSHEETS

CREATE DATABASE :
CREATE DATABASE demodatabase;

USE DATABASE / SELECT DATABASE TO WORK :
USE demodatabase;

SHOW TABLES / CHECK TABLES IN DATABASE:
SHOW TABLES;

CREATE A TABLE :

CREATE TABLE demotable(
Id INT PRIMARY KEY AUTOINCREMENT,
Name VARCHAR(100) NOT NULL,
Email VARCHAR(100) UNIQUE NOT NULL,
Phone CHAR(10) NOT NULL
);

DESCRIBE TABLE INFO :
DESC demotable;

SQl and MYSQL
Normalization In SQL
one to one relationship (pan card and person)
one to many relationship (school and student)
many to many relationship (customers and products)

PRIMARY IS COMBINATION OF NOT NULL AND UNIQUE,ONE ONE PRIMARY KEY PER TABLE
FOREIGN KEY IS USED TO CONNECT OR LINK BETWEEN TO TABLES, One Table Has Many Foreign Key, But Only One Primary Key !


CREATE DATABASE company;
USE company;

CREATE TABLE department (
Id INT PRIMARY KEY,
Name VARCHAR(100) NOT NULL
);

CREATE TABLE employee(
Id INT PRIMARY KEY,
Name VARCHAR(100) NOT NULL,
Salary INT,
Department_id INT,
CONSTRAINT emp_depart  -- foreign-key name 
FOREIGN KEY (Department_id) REFERENCES department(Id)
);

DESC employee;

INSERT INTO department
VALUES 
(1, "I.T"),
(2, "H.R"),
(3, "OPERATION")
SELECT * FROM department;

INSERT INTO employee
VALUES
(101, "A", 23000, 1),
(102, "B", 45000, 2),
(103, "C", 15000, 3)
SELECT * FROM employee



create table student (
Id int primary key,
Name varchar(50)
);
create table school (
Id int primary key,
Name varchar(100) not null,
student_id int not null,
constraint school_student
foreign key (student_id) references student(Id)
);
-- ALTER : USED TO MODIFY THE TABLE COLUMNS 

-- TO ADD COLUMN
   ALTER TABLE student ADD COLUMN address VARCHAR(250) NOT NULL;

-- TO DROP COLUMN
   ALTER TABLE student DROP COLUMN address;

-- ADD AFTER COLUMN
   ALTER TABLE student ADD COLUMN Marks INT AFTER Email;

-- ADD FIRST COLUMN 
   ALTER TABLE student ADD COLUMN Course_Id INT FIRST;

-- RENAME COLUMN 
   ALTER TABLE student RENAME COLUMN DOB TO Date_of_Birth;

-- TO MODIFY COLUMN
   ALTER TABLE student MODIFY COLUMN Age VARCHAR(100); -- TO MODIFY DATATYPE

-- TO ADD CONSTRAINT
   ALTER TABLE student ADD CONSTRAINT UNIQUE 

-- CONSTRAINTS IN SQL

   CREATE TABLE check_default (
   col_1 INT PRIMARY KEY AUTO_INCREMENT,
   col_2 VARCHAR(100) NOT NULL,
   col_3 CHAR(10) UNIQUE,
   col_4 INT CHECK (col_1 > 3),
   col_5 INT DEFAULT 111
   );

   CREATE TABLE check_default (
   col_1 INT CHECK (col_1 > 3),
   col_2 INT DEFAULT 111
   );

   CREATE TABLE check_constraints (
   Id INT PRIMARY KEY AUTO_INCREMENT,
   Name VARCHAR(100) NOT NULL,
   Phone CHAR(10) UNIQUE,
   Email VARCHAR(50) UNIQUE NOT NULL,
   Age INT CHECK (Age > 18),
   Date DATE DEFAULT (CURRENT_DATE)
   );


-- CREATE INDEXING

   CREATE INDEX demo ON student (Id, Name, Age, Email);
   ALTER TABLE student DROP INDEX demo;


-- CREATE VIEW

   CREATE VIEW demo_view AS SELECT Id, Name, Email, Age FROM student;
   DROP VIEW demo_view;


-- STORED PROCEDURE 

   DELIMITER //
   CREATE PROCEDURE demo_procedure()
   BEGIN
   CREATE DATABASE demo_db;
   CREATE TABLE demo_db.demo_table (
   Id INT AUTO_INCREMENT PRIMARY KEY,
   Name VARCHAR(100) NOT NULL,
   Email VARCHAR(100) UNIQUE NOT NULL
   );
   INSERT INTO demo_db.demo_table (Id, Name, Email)
   VALUES 
   (1, "Akshay Gohrava", "akshay@gmail.com"),
   (2, "Arjun Gohrava", "arjun@gmail.com");
   SELECT * FROM demo_db.demo_table;
   END //
   DELIMITER ;
 
   CALL demo_procedure;

   DROP PROCEDURE demo_procedure;




