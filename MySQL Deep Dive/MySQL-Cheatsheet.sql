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

***************************
DEMO DATABASE TO TEST DATA IN ITVEDANT

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    gender VARCHAR(10),
    course VARCHAR(50),
    city VARCHAR(50),
    marks INT,
    admission_year INT
);
desc students;


INSERT INTO students VALUES
(101,'Amit Sharma',21,'Male','Java','Mumbai',78,2023),
(102,'Priya Mehta',20,'Female','Python','Pune',85,2024),
(103,'Rahul Patil',22,'Male','Java','Mumbai',65,2022),
(104,'Sneha Joshi',21,'Female','Data Science','Delhi',92,2023),
(105,'Rohan Deshmukh',23,'Male','Python','Nagpur',70,2022),
(106,'Anjali Verma',20,'Female','Java','Pune',88,2024),
(107,'Karan Singh',24,'Male','Data Science','Delhi',60,2021),
(108,'Pooja Nair',22,'Female','Java','Mumbai',95,2023),
(109,'Vikas Gupta',21,'Male','Python','Bangalore',72,2024),
(110,'Neha Kulkarni',23,'Female','Java','Pune',81,2022),
(111,'Aditya Yadav',22,'Male','Data Science','Delhi',77,2023),
(112,'Meera Iyer',21,'Female','Python','Chennai',89,2024),
(113,'Saurabh Jain',24,'Male','Java','Indore',66,2021),
(114,'Kavita Sharma',22,'Female','Data Science','Mumbai',90,2023),
(115,'Arjun Reddy',23,'Male','Python','Hyderabad',74,2022);

SELECT * FROM students;

***************************


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


************************************************************
CONSTRAINTS MODIFICATION IN MYSQL :

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


show databases;
use demo;
show tables;

-- select * from product;

-- select * from product_orders;

-- create table customers (
-- Id int,
-- Name varchar(60),
-- Email varchar(100),
-- is_active boolean,
-- Phone_no varchar(10) default "NA"
-- );

-- Modifying Constraints, Adding And Removing

-- alter table customers add primary key(Id);

-- alter table customers drop primary key;

-- alter table customers modify Name varchar(70) not null;

-- alter table customers modify Name varchar(70);

-- alter table customers add constraint check_id check  (Id > 999);

-- alter table customers drop constraint check_id;

-- alter table customers add unique(Email);

-- alter table customers drop index Email;

DESC customers;

************************************************************

   -- CLAUSES IN MYSQL

   ORDERBY CLAUSE:
   SELECT * FROM student ORDER BY Marks; -- Default ASC, ACENDING 
   SELECT * FROM student ORDER BY Marks DESC; 
   SELECT * FROM student ORDER BY Marks Name;
   SELECT * FROM student ORDER BY Age DESC, Marks DESC; 
   SELECT * FROM student WHERE City = "Mumbai" ORDER BY Marks;

   GROUPBY CLAUSE :
   Groupby is To Group Column Data , into one set

   SELECT Salesperson, SUM(Amount) as TotalSales
   FROM Sales
   GROUP BY Salesperson;

   HAVING CLAUSE :
   HAVING Clause is Used After Grouping the Data,Similar to WHERE, But Here We can use Aggregate FUNCS !

   SELECT Salesperson, SUM(Amount) as TotalSales
   FROM Sales
   GROUP BY Salesperson
   HAVING SUM(Amount) > 1200;


*********************************************************************************

-- LIKE , TO PATTERN MATCHES IN SELECT QUERY

SELECT * FROM student WHERE Name LIKE "A%"; -- Start with Letter A
SELECT * FROM student WHERE Name LIKE "%A"; -- End With Letter A
SELECT * FROM student WHERE Name LIKE "%A%";  -- IF Contains an Letter A
SELECT * FROM student WHERE Name LIKE "_a%"; -- Second Character Must Be a 
SELECT * FROM student WHERE Name LIKE "__a%"; -- Third Character Must Be a 
SELECT * FROM student WHERE Name LIKE "%i_"; -- Second Last Character Must Be i

-- AND , OR OPERATOR
SELECT * FROM student WHERE City = "Mumbai" AND admission_year = 2023 ORDER BY Marks; 

-- BETWEEN 

SELECT * FROM student WHERE Age BETWEEN 20 AND 22;

-- SELCT MULTIPLE COLUMN VALUES USING OR 

SELECT * FROM student WHERE Course_Id = 102 OR Course_Id = 105 OR Course_Id = 108;

SELECT * FROM student WHERE Course_Id IN (102, 105, 108);

SELECT * FROM student WHERE City IN ("Mumbai", "Pune", "Nagpur"); -- All student from Mumbai , Pune, Nagpur City !


-- LIMITS IN SQL
   SELECT * FROM students LIMIT 5;  -- SELECT TOP 5 DATA

   SELECT * FROM students LIMIT 1, 3;  -- SKIP 1ST ROW DATA, AND THEN NEXT 3 DATA 


  Different LIMIT commands:
Command	Skip	Show	Result
LIMIT 1	0	1	75000 (highest)
LIMIT 1,1 or LIMIT 1 OFFSET 1	1	1	60000 (2nd highest)
LIMIT 2,1 or LIMIT 1 OFFSET 2	2	1	55000 (3rd highest)
LIMIT 0,3 or LIMIT 3 OFFSET 0	0	3	75000, 60000, 55000 (top 3)
Simple Analogy 🎬
Movie theater seats (in order of salary highest to lowest):

Command	What it means
LIMIT 1	Take first seat only
LIMIT 1,1	Skip 1 seat, then take 1 seat
LIMIT 3	Take first 3 seats
LIMIT 2 OFFSET 1	Skip 1 seat, then take 2 seats
One Line Summary
LIMIT a,b = Skip 'a' rows, show 'b' rows
LIMIT b OFFSET a = Show 'b' rows after skipping 'a' rows

For 2nd highest salary: Skip the highest (1 row), show the next (1 row) → LIMIT 1,1 ✅
  SELECT salary FROM employee ORDER BY salary DESC LIMIT 1 OFFSET 1;
--                                      show 1 row, skip 1 row



************************************************************************************************
   FUNCTIONS IN MYSQL & SQL

   * STRING FUNCTIONS
   * BUILDIN FUNCTIONS
   * AGGREGATE FUNCTIONS

1. STRING FUNCTIONS

SELECT LOWER("HELLO");
SELECT UPPER("hello world");

SELECT name, LOWER(name) as lowercasename FROM students;

SELECT CONCAT("Hello", " ", "Akshay Gohrava");  -- Adding two Strings
SELECT CONCAT(name, " ", course) FROM students; -- Name and Course in One Column 

SELECT SUBSTRING("AKSHAY", 1, 4);  -- AKSH
SELECT SUBSTR("AKSAHY", 2, 4);  -- KASH

SELECT LENGTH("FINDMYLENGTH");  -- LENGTH OF THE STRING
SELECT * FROM students WHERE LENGTH(name) < 12;

BUILT-IN FUNCTIONS : 

-- Build -In FUnctions 
DELIMITER $ 
CREATE FUNCTION addition(a INT, b INT)
RETURNS INT
DETERMINISTIC 
BEGIN
     RETURN a+b;
END$

DELIMITER 

SELECT addition(14, 70);   -- Calling Function
-- OUTPUT : 84



-- Build -In FUnctions 
DELIMITER $

CREATE FUNCTION is_even(n INT)
RETURNS BOOLEAN
DETERMINISTIC
BEGIN 
    RETURN n % 2 = 0;
END$

DELIMITER ;

SELECT is_even(5); -- Calling Function


-- Build -In FUnctions 
DELIMITER $
   CREATE FUNCTION student_marks(marks INT)
   RETURNS TEXT
   DETERMINISTIC
   BEGIN 
       IF marks>35 THEN 
          RETURN "PASS";
		ELSE 
           RETURN "FAILS";
           END IF;
   END$
DELIMITER ;

-- Test with different marks
SELECT student_marks(85);  -- Returns: PASS
SELECT student_marks(35);  -- Returns: FAIL
SELECT student_marks(20);  -- Returns: FAIL
SELECT student_marks(100); -- Returns: PASS

SELECT 
    *, 
    student_marks(marks) AS result
FROM students;   -- USED IN A TABLE COLUMN NAMED marks 


DELIMITER $

CREATE FUNCTION grade(marks INT)
RETURNS TEXT
DETERMINISTIC
BEGIN
    IF marks BETWEEN 1 AND 35 THEN 
        RETURN 'C';
    ELSEIF marks BETWEEN 36 AND 75 THEN 
        RETURN 'B';
    ELSEIF marks BETWEEN 76 AND 100 THEN 
        RETURN 'A';
    ELSE 
        RETURN 'INVALID MARKS';
    END IF;
END$

DELIMITER ;

SELECT grade(40); -- Retruns B

************************************************************************************************
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



***********************************************************************************************

TRIGGER :

A trigger is like an automatic action that happens when something specific occurs in your database (INSERT, UPDATE, or DELETE).

Think of it as: "When this happens, automatically do that.

"Use a trigger when you want something to happen automatically every time someone INSERT, UPDATE, or DELETE data.






