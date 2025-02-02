# MySQL

### Database

Database is collection of data in a format that can be easily accessed (Digital)

A software application used to manage our DB is called DBMS (Database Management System)

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
    
    CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL
    );
    

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

CREATE TABLE table_name (
     column_name1 datatype constraint,
);

Select & View ALL columns

SELECT * FROM table_name;

Insert

INSERT INTO table_name col_name VALUES(101, “Name”); 
