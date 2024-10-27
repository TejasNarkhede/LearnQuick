# Java

## Get Started

[Memory](#memory-management)  
[DataTypes](#java-data-types)  
[Variables](#variables)  
[Arrays](#arrays)  
[Strings](#strings)  
[OOPS](#oops-object-oriented-programming)  
[Miscellaneous](#miscellaneous)  
[Math](#java-math)
[JSP](#jsp)  
[Servlet](#servlet)  
[JDBC](#jdbc)  

## Memory Management

### Heap Memory

**Divided into two main areas:**

- Young Generation
- Old Generation

**Young Generation:**
Where new objects are created. Divided into 3 parts:

- Eden Space,
- Survivor Spaces (S0 and S1)

Minor GC collects unreachable objects and moves surviving objects to a Survivor Space.
Objects that survive multiple Minor GCs are promoted to the Old Generation.

**Old Generation:**
Holds objects that have survived multiple Minor GCs.
Objects in this space are generally considered to be long-lived.
Major GC collects unreachable objects from the Old Generation.

**Benefits of this separation:**

- Efficient memory management
- Faster garbage collection
- Reduced fragmentation

## Java Data Types

### Primitive Data Types [^](#get-started)

Also known as reference type because they refer to objects  
A primitive data type is predefined by the language and is named by a keyword or reserved keyword. There are eight types of primitive data types in Java:

- **boolean:** Stores true or false values.
- **byte:** 8-bit signed two's complement integer (-128 to 127).
- **short:** 16-bit signed two's complement integer (-32768 to 32767).
- **int:** 32-bit signed two's complement integer (-2,147,483,648 to 2,147,483,648).
- **long:** 64-bit signed two's complement integer (-2^63 to 2^63-1).
- **float:** Single-precision 32-bit IEEE 754 floating-point number (6-7 decimal digits).
- **double:** Double-precision 64-bit IEEE 754 floating-point number.
- **char:** Single 16-bit Unicode character.

### In-built Methods

- **Integer.parseInt():** Converts a string to an int.
- **Integer.valueOf():** Converts a string to an Integer object.

### Variables

- **Scope:** The part of the program where a variable is accessible.
- **Types:**
  - **Local Variables:** Inside blocks, method bodies, or constructors.
  - **Member Variables/Class Variables:** Inside classes, outside methods.

### Arrays [^](#get-started)

- **Jagged Arrays:** Arrays where elements can be of different sizes.

### Strings [^](#get-started)

A String variable contains a collection of characters surrounded by **double quotes ("String")**

- **String Pool:** A pool of shared string objects for efficiency.
- **Immutable:** String objects cannot be modified after creation.

### String Methods

- **length():** Find length of String

```
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

- **toUpperCase()** & **toLowerCase()**

```
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

- **indexOf():** The indexOf() method returns the index (the position) of the **first occurrence** of a specified text in a string (including whitespace):

```
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

- **lastIndexOf():** This method returns the index of the **last occurrence** of a specified character or substring within a string. If not found, it returns -1.

```
String str = "Hello, world!";
int lastIndex = str.lastIndexOf("o"); // lastIndex will be 8
```

- **concat():** method to concatenate two strings

```
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

- **contains()** - (boolean) Checks whelter string contains sequence of characters

```
String str = "Hello World";
System.out.println(str.contains("Hello")); //true
```

- **replace()** - Returns a new string with newly replace characters

```
String str = "Hello World";
System.out.println(str.replace("World", "String")); // Hello String
```

- **startsWith() :** This method checks if a string starts with a specified prefix. It returns a boolean value.

```
String str = "Hello, world!";
boolean result = str.startsWith("Hello"); // result will be true
```

- **endsWith()** : This method checks if a string ends with a specified suffix. It returns a boolean value.

```
String str = "Hello, world!";
boolean result = str.endsWith("world!"); // result will be true
```

- **equals():** Compares the value of two strings.

- **==:** Compares the references of two strings.

### OOPS (Object-Oriented Programming) [^](#get-started)

- **Encapsulation:** Bundling data and methods within a class.
- **Abstraction:** Hiding unnecessary details from the user.
- **Inheritance:** Creating new classes based on existing ones.
- **Polymorphism:** Ability of objects to take on multiple forms.

## Miscellaneous

### Java Math [^](#get-started)

The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

- **Math.max(a,b)** - Find **highest** value among two

- **Math.min(a,b)** - Find **lowest** value among two

- **Math.sqrt(x)** - Returns the **square root** of x

- **Math.abs(x)** - Returns absolute **positive value**

- **Math.random()** - returns a random number between **0.0** and **1.0**

```
int randomNum = (int)(Math.random() * 101);  // 0 to 100
```

### JSP [^](#get-started)

JSP Java/Jakarta Server Pages  
Server Side Technology  
Creating dynamic web pages.  
JSP files are compiled into Java servlets at runtime.  
JSP allows you to embed Java code within HTML, making it easier to create dynamic content.  
JSP are extended version of servlet

### Servlet [^](#get-started)
A **Java class** that extends the capabilities of a web server and responds to incoming requests.  
A Servlet is a Java class that extends the HttpServlet class or implements the Servlet interface.  
Servlets handle HTTP requests and generate HTTP responses.  
They can be used to perform server-side processing, such as database access, business logic, and dynamic content generation.

### Advantages of Servlets
- **Portability :** Written in Java, so they can run on any platform with a Java Virtual Machine (JVM).
- **Efficiency :** Servlets are loaded only once when the web server starts, and then reused to handle multiple requests.
- **Scalability :** Scaled to handle large numbers of requests.
- **Security :** Secure environment for web applications.

## JDBC [^](#get-started)

JDBC -> **Java Database Connectivity**  
**API** provides standard way to interact with databases  
Acts like a **bridge** between java applications and various database system  
**Data Manipulation** : Performs querying, inserting, updating, deleting data.

### JDBC Key components of JDBC:

- **DriverManager**: Responsible for establishing connections to databases using connection URLs.
- **Connection**: Represents an **active connection** to a database.
- **Statement**: Executes **SQL statements** and retrieves results.
- **ResultSet**: Stores the **results** of a query.
- **PreparedStatement**: A precompiled statement for executing parameterized SQL queries, offering performance and security benefits.

### JDBC Workflow

- **Load the JDBC driver**: Class.forName() method to load the appropriate driver for your database.
- **Establish a connection**: Create a Connection object using the DriverManager.getConnection() method, providing the connection URL, username, and password.
- **Create a statement**: Use createStatement() or prepareStatement() to create a statement object.
  **Execute SQL statements**: Execute SQL queries using executeQuery(), executeUpdate(), or execute().
- **Process results**: Iterate over the ResultSet object to extract and process the query results.
- **Close resources**: Close the ResultSet, Statement, and Connection objects to release database resources.


```
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

            // Process results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
```
