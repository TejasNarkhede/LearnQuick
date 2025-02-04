# Java

## Get Started

[DataTypes](#java-data-types)  
[Variables](#variables)  
[Memory](#memory-management)  
[Arrays](#arrays)  
[Strings](#strings)  
[Abstract Class](#abstract-class)  
[Interfaces](#interfaces)  
[OOPS](#oops-object-oriented-programming)  
[Wrapper Classes](#wrapper-classes)  
[Miscellaneous](#miscellaneous)  
[Multi-Threading](#multi-threading)  
[Math](#java-math)  
[JSP](#jsp)  
[Servlet](#servlet)  
[JDBC](#jdbc)  
[Restful API](#restful-api)  
[OAuth2.0](#oauth20)

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

## Memory Management [^](#get-started)

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

### Strings Vs StringBuilder Vs StringBuffer [^](#get-started)

![Strings Vs StringBuilder Vs StringBuffer](Notesimages\StringsBuilderBuffer.png)

## Abstract Class [^](#get-started)

An abstract class in programming is a class that cannot be instantiated directly. It serves as a blueprint for other classes. Abstract classes can contain abstract methods, which are methods without implementation that must be overridden in derived classes, as well as regular methods with implementations.

Abstract Methods: These methods are declared without an implementation and must be overridden in subclasses.
Concrete Methods: These methods have an implementation and can be used directly by subclasses.
Instantiation: You cannot create an instance of an abstract class directly.

Abstract Keyword : Abstract is a non-access modifier in java applicable for classes, and methods but **not** variables. It is used to achieve abstraction

## Interfaces [^](#get-started)
An interface in Java is a `blueprint` of a class that contains static constants and abstract methods. 
It is used to achieve `abstraction` and `multiple inheritance` in Java.
Is a reference type that can contain only constants, default methods, which are implicitly public and abstract.  
Can not instantiated but implemented by classes.  
By default `public` and `abstract`.  
Variables are final and static.  
Since `Java 8`, interfaces can also have `default` and `static methods`, and since `Java 9`, they can have `private methods`.

### Declaring Interface

An interface is declared using the ***interface*** keyword. 

A class that implements an interface must implement all the methods declared in the interface.

```java
// Interface declaration
interface Animal {
    void animalSound(); // interface method (does not have a body)

    void sleep(); // interface method (does not have a body)
}

// Implementing the interface
class Dog implements Animal {
    public void animalSound() {
        System.out.println("dog barks");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
    }
}
```

#### implements Keyword
The `implements` keyword is used by a class to implement an interface.  
It becomes compulsory to implement all abstract methods.

### Why use interfaces?

There are several reasons to use interfaces in Java:

1. **Abstraction**: Interfaces provide a way to achieve abstraction by defining methods that must be implemented by classes.
2. **Multiple Inheritance**: Java does not support multiple inheritance with classes, but it can be achieved with interfaces. A class can implement multiple interfaces.
3. **Loose Coupling**: Interfaces help in achieving loose coupling by allowing the implementation to be changed without affecting the code that uses the interface.

#### Types of Interfaces
- Normal Interface
- Functional/SAM (Single abstract method) Interface
- Marker Interface


### OOPS (Object-Oriented Programming) [^](#get-started)

- **Encapsulation:**  
  Fundamental principle of object-oriented programming.  
  Involves bundling data (variables) and the methods within a single unit, a class.
  Features -
  Data Hiding
  Abstraction
  Maintainability
  Flexible

- **Abstraction:** Hiding unnecessary details from the user.
- **Inheritance:** Creating new classes based on existing ones.
- **Polymorphism:** Ability of objects to take on multiple forms.

## Wrapper Classes [^](#get-started)

A wrapper class in Java is used to convert primitive data types into objects. This is particularly useful when working with collections that can only store objects, such as `ArrayList`, `HashMap`, etc. Each of the eight primitive data types has a corresponding wrapper class:

- `byte` -> `Byte`
- `short` -> `Short`
- `int` -> `Integer`
- `long` -> `Long`
- `float` -> `Float`
- `double` -> `Double`
- `char` -> `Character`
- `boolean` -> `Boolean`

### Autoboxing

Autoboxing is the automatic conversion of primitive datatypes (like `int`, `char`, etc.) intotheir corresponding object wrapper classes (`Integer`, `Character`, etc.)

```java
int primitiveInt = 5;
Integer wrappedInt = primitiveInt; // Autoboxing
```

### Autounboxing

Autounboxing is the reverse process where the  wrapper class are converted by to their corresponding primitive types.

```java
Integer wrappedInt = 10;
int primitiveInt = wrappedInt; // Autounboxing
```
## Miscellaneous

### Exception Handling [^](#get-started)
Exception handling in Java allows developers to manage runtime errors effectively.
An Exception is an `unwanted` or `unexpected` event that occurs during the execution of a program (i.e., at runtime) and disrupts the normal flow of the program’s instructions.

Base classs -> `Throwable`  
Branch 1 : `Exception`
NullPointerException,
IndexOutOfBoundException, etc  
Branch 2 : `Error`
Virtual Machine Error
StackOverflowError
OutOfMemory

**Build-in Exceptions:**  
- **Checked Exceptions: (compile-time exceptions)** Must be either caught or declared in the method signature using throws.  
- **Unchecked Exceptions:** Include RuntimeException and its subclasses. They do not need to be declared or caught.

Types Of Errors:
- Compile Time Errors
- RunTime Errors
- Logical Errors


**Try-Catch Block:** Used to catch exceptions that might be thrown within the `try` block.
```
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```

**Finally Block:** Executes code after the `try` and `catch` blocks, regardless of whether an exception was thrown or not.
```
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that will always execute
}
```

**Throwing Exceptions:** You can throw exceptions using the `throw` keyword.
```
if (someCondition) {
    throw new ExceptionType("Error message");
}
```

**Custom Exceptions:** You can create your own exception classes by extending `Exception` or `RuntimeException`.
```
public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
```

---

### Acesss Specifiers / Modifiers [^](#get-started)

Control the visibility and accessibility of classes, methods, and variables.

1. **Public** : Accessible to: Any class in any package.
   Keyword: public
2. **Protected** : Accessible to: Classes within the same package, subclasses in any package.
   Keyword: protected
3. **Default (Package-Private)** : Accessible to: Classes within the same package.
   No keyword: If no access specifier is used, it defaults to package-private.
4. **Private** : Accessible to: Only within the same class.
   Keyword: private

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

### Multi-Threading [^](#get-started)

#### Synchronization in Java

Synchronization in Java is a mechanism that ensures only one thread can access a shared resource at a time, preventing data inconsistency and race conditions.

**Importance :**

- **Thread Interference :**
  When multiple threads access shared data concurrently, their operations might interleave, leading to unexpected and incorrect results.
- **Memory Consistency Errors :**
  Without proper synchronization, the compiler or processor might reorder instructions, leading to inconsistent data views across different threads.

**Synchronized Keyword :**
Declaring a method as synchronized ensures that only one thread can execute the method at a time on the same object.

```
public synchronized void increment() {
    count++;
}
```

#### Thread safe

In Java, thread safety means that a piece of code can be accessed by multiple threads concurrently without causing data corruption or unexpected results.

**Achieve Thread Safety in Java**

- **1 Synchronization**
- **2 Atomic variables**
- **3 Immutable Objects**
- **4 Thread Confinement**
- **5 Read-only date**
- **6 Avoiding Shared state**
- **7 Testing**

Serialization

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

## RESTful API [^](#get-started)

RESTful API (Representational State Transfer)

- Relies on Server Client Architecture, stateless protocol
- Everything in a RESTful API is considered a resource, which can be a document, image...
- The server does not store any state about the client session on the server side.

Client-Server Architecture: The client and server are separate entities. The client sends requests to the server, and the server processes these requests and returns the appropriate responses.

HTTTP - (Hypertext transfer protocol)  
HTTP Methods: RESTful APIs use standard HTTP methods to perform operations on resources:

- GET/user: Retrieve a resource.
- POST/user: Create a new resource.
- PUT/user: Update an existing resource.
- PATCH/user: Partial Updates
- DELETE/user: Remove a resource.

Best Practices
Post/updateUser x | PATCH/user ✓
Post/createUser x | POST/user ✓
GET/getUser x | GET/user ✓

C - Create - POST
R - Read - GET
U - Update - PUT/PATCH
D - Delete - DELETE


## OAuth2.0 [^](#get-started)

In Short Term Sign in google facility  
Open Authorization / Authorization Protocol  
JSON Web Token (JWT) - Access Token
