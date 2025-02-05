# MySQL

### Database

Database is collection of data in a format that can be easily accessed (Digital)

A software application used to manage our DB is called DBMS (Database Management System)

```sql
-- A schema is the blueprint or structure that defines how data is organized and stored in a database.
```

### Types of Databases

| Relational (RDBMS) | Non-relational (NoSQL) |
| --- | --- |
| Data stored in tables | Data not stored in tables |
| MySQL | MongoDB |

### What is SQL?

Structured Query Language

SEQUEL - Structured English Query Langauage

SQL is a programming language used to interact with relational databases.

It is used to perform CRUD operations :

Create, Read, Update, Delete

- **Creating our First DB**
    
    Our first SQL Query
    CREATE DATABASE db-name;
    DROP DATABASE db_name;
    
    Creating our First table
    
    USE college;
    ```SQL
    CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL
    );
    ```

### Datatypes

They define the type of values that can be stored in a column

| **DATATYPE** | **DESCRIPTION** | **USAGE** |
| --- | --- | --- |
| **CHAR** | String (0-255), can store characters of fixed length | CHAR(50) |
| **VARCHAR** | String (0-255), can store characters up to given length | VARCHAR(50) |
| **BLOB** | String (0-65535), can store binary large object | BLOB(1000) |
| **INT** | Integer (-2,147,483,648 to 2,147,483,647) | INT |
| **TINYINT** | Integer (-128 to 127) | TINYINT |
| **BIGINT** | Integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) | BIGINT |
| **BIT** | Can store x-bit values. x can range from 1 to 64 | BIT(2) |
| **FLOAT** | Decimal number - with precision to 23 digits | FLOAT |
| **DOUBLE** | Decimal number - with 24 to 53 digits | DOUBLE |
| **BOOLEAN** | Boolean values 0 or 1 | BOOLEAN |
| **DATE** | Date in format of YYYY-MM-DD ranging from 1000-01-01 to 9999-12-31 | DATE |
| **YEAR** | Year in 4-digit format ranging from 1901 to 2155 | YEAR |

### Signed vs Unsigned in SQL

In SQL, the `SIGNED` and `UNSIGNED` attributes are **used to define the range of values an integer column can hold**.

- **SIGNED**: Can store both positive and negative numbers. For example, an `INT` can range from −231 to 231−1.
- **UNSIGNED**: Can only store non-negative numbers (zero and positive numbers). For an `INT`, the range shifts to 0 to 231−1.

When deciding which to use, consider whether the column will ever need to store negative values. If not, using `UNSIGNED` can provide a larger range for positive numbers and is often used for auto-increment primary keys. However, note that `UNSIGNED` is a MySQL-specific feature and not part of the standard SQL specification, which may complicate future migrations to other RDBMS systems.

## Types of SQL Commands

### DDL (Data Definition Language) : create, alter, rename, truncate & drop

### DQL (Data Query Language) : select

### DML (Data Manipulation Language) : insert, update & delete

### DCL (Data Control Language) : grant & revoke permission to users

### TCL (Transaction Control Language) : start transaction, commit, rollback

## Database related Queries

- CREATE DATABASE db_name;
- CREATE DATABASE IF NOT EXISTS db_name; (warns)
- DROP DATABASE db_name;
- DROP DATABASE IF EXISTS db_name;
- USE DATABASE;
- SHOW DATABASES;
- SHOW TABLES;

## Table related Queries

Creating tables
```SQL
CREATE TABLE table_name (
     column_name1 datatype constraint,
);
```

Select & View ALL columns  
```SQL
SELECT * FROM table_name;
```

Insert  
```SQL
INSERT INTO table_name col_name VALUES(101, “Name”); 
```

## Keys

### Primary Key

It is a column (or set of columns) in a table that uniquely identifies each row. (a unique id)  
There is only 1 primary key and it should not be null.

2 Ways to define
- age int PRIMARY KEY, …
- PRIMARY KEY (id, name, …) ensures unqiue combinations from both columns

### Foreign Key

A foreign key is a column (or set of columns) in a table that refers to the primary key in other table.
There can be multiple Foreign Keys.
Foreign Keys can have duplicate and null values.

## Constraints

SQL Constraints are used to specify rules for data in a table.  

```SQL
CHAR : Fixed-length, occupy fixed storage, padded with spaces, faster.  
VARCHAR : Variable-length, occupy as per need, no padding, more storage-efficient.  
```

| **Constraint** | **Description** | **Example** |
| --- | --- | --- |
| **NOT NULL** | Columns cannot have null values | `col1 INT NOT NULL` |
| **UNIQUE** | All values in column are different | `col2 INT UNIQUE` |
| **PRIMARY KEY** | Makes a column unique & not null but used only for one column | `id INT PRIMARY KEY` |
| **FOREIGN KEY** | Prevent actions that would destroy links between tables | ```SQL CREATE TABLE temp ( cust_id INT, FOREIGN KEY (cust_id) REFERENCES customer(id) ); ``` |
| **DEFAULT** | Sets the default value of a column | `salary INT DEFAULT 25000` |
| **CHECK** | Limits the values allowed in a column | ```SQL age INT CHECK (age >= 18)``` ```CREATE TABLE city ( age INT, CONSTRAINT age_check CHECK (age >= 18 AND city = 'DELHI') ); ``` |

## SQL Commands

### SELECT
Used to select any data from the database

Basic Syntax
```SQL
SELECT col1, col2 FROM table_name;
```
TO Select All
```SQL
SELECT * FROM table_name;
```
TO select unique values
```SQL
SELECT DISTINCT col1 FROM table_name;
```

### WHERE Clause
To define some conditions

```SQL
SELECT col1, col2 FROM table_name
WHERE conditions;
```

### Using Operators in WHERE

Arithmetic operators : + , - , * , / , %

Comparsion operators : = , ≠ , < , > , ≤ , ≥

Logical operators : AND, OR, NOT, IN, BETWEEN, ALL, LIKE, ANY

Bitwise operators : & (Bitwise AND) , | (Bitwise OR)

## Operators

### AND (to check both conditions to be true)

```sql
SELECT * FROM student WHERE (marks > 80 AND location="Pune");
```

### OR (to check for one of the conditions to be true)

```sql
SELECT * FROM student WHERE (marks > 90 OR location="Pune");
```

### BETWEEN (selects for a given range)

```sql
SELECT * FROM student WHERE marks BETWEEN 80 AND 90; 
```

### IN (matches any value in the list)

```sql
SELECT * FROM student WHERE location IN ("Pune", "Mumbai", "Delhi"); 
```

### NOT (to neglect/reverse the given condition)

```sql
SELECT * FROM student WHERE location NOT IN ("Pune", "Mumbai", "Delhi"); 
```

### LIMIT Clause

Sets an upper limit on number of rows to be returned.

```sql
SELECT * FROM student LIMIT 5;
```

### ORDER BY Clause

To sort  in (ASC) ascending or (DESC) descending order

```sql
SELECT * FROM student ORDER BY name ASC;
```

```sql
-- Top 3 student
SELECT * FROM student ORDER BY marks DESC LIMIT 3;
```

## Aggregate Functions

Aggregate functions perform a calculation on a set of values, and return a single value.

- COUNT()
- MAX()
- MIN()
- SUM()
- AVG()

```sql
SELECT MAX(marks) FROM student;
```

### GROUP BY Clause

The GROUP BY clause in SQL is a powerful tool used to arrange identical data into groups

It collects data from multiple records and groups the result by one ore more column.
Generally we use GROUP BY with some aggregate function.

```sql
SELECT name,location, COUNT(id) 
FROM student 
GROUP BY name,location;
```

### Having Clause

Similar to WHERE i.e applies some condition on rows

Used when we want to apply any condition after grouping.

```sql
SELECT location, count(id) 
FROM student 
GROUP BY location 
HAVING MAX(marks) > 80;
```

## General Order

```sql
SELECT columns
FROM table_name
WHERE condition -- on rows
GROUP BY columns
HAVING condition -- on groups
ORDER BY columns ASC/DESC
```

## Table related Queries

### UPDATE (to update existing rows)

```sql
UPDATE student
SET grade = "0"
WHERE marks > 90;
```

### DELETE (to delete existing rows)

```sql
DELETE FROM student
WHERE marks < 25;
```

## Cascading for FOREIGN KEY

### ON DELETE CASCADE

When we create a foreign key using this option, it deletes the referencing rows in the child table when the referenced row is deleted in the parent table which has a primary key.

### ON UPDATE CASCADE

When we create a foreign key using this UPDATE CASCADE the referencing rows are updated in the child table when the referenced row  is updated in the parent table which has a primary key.

```sql
FOREIGN KEY (dept_id) REFERENCES course(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
```

## ALTER (to change the schema)

### ADD Column

```sql
ALTER TABLE student
ADD COLUMN age INT; 
```

### DROP Column

```sql
 ALTER TABLE student
 DROP COLUMN age; 
```

### RENAME Column

```sql
 ALTER TABLE student
 RENAME TO students ;
```

### CHANGE Column (rename)

```sql
 ALTER TABLE students
 CHANGE location city VARCHAR(20);
```

### MODIFY Column (modify datatype/constraint)

```sql
 ALTER TABLE students
 MODIFY name VARCHAR(50);
```

## TRUNCATE (to empty contents of table / deletes only data without deleting table)

```sql
TRUNCATE TABLE table_name;
```