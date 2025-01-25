# Spring Boot

## Get Started

[Annotations](#annotations)  
[Spring MVC](#spring-mvc)  
[Dependency Injection](#dependency-injection)

Spring Boot is the quickest and most popular way to start Spring projects.  
No need for much code or configuration.
Spring Boot is an extension of the Spring framework that simplifies the setup of new Spring applications. It provides defaults for code and annotation configuration to quickly start new Spring projects.
Spring was created to overcome issues in J2EE/Jakarta EE.

Prerequisites:
Core java
Collections
OOPS
Build Tools Maven/Gradle
JDBC
Hibernate
XML/JSON

- **Auto Configuration**: Automatically configures your Spring application based on the jar dependencies you have added.
- **Standalone**: Spring Boot applications can be run independently using the embedded server.
- **Production-ready**: Includes features like health checks, metrics, and externalized configuration.

### Annotations

Are metadata used to provide additional information about classes, methods, and fields.  
Helps in configuring and managing componenets.

### @RestController

A specialized version of the Spring MVC Controller, Designed for building RESTful web services.  
It combines the functionality of `@Controller` and `@ResponseBody`, meaning that the methods in a `@RestController` return data directly instead of a view.

### @GetMapping

Used to handle HTTP GET requests.  
It is a composed annotation that acts as a shortcut for `@RequestMapping(method = RequestMethod.GET)`.
It is typically used to retrieve data from the server.

```
@GetMapping("/example")
public ResponseEntity<String> getExample() {
    return ResponseEntity.ok("GET Response");
}
```

### @PostMapping

Used to handle HTTP POST requests.  
It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).  
It is typically used to create new resources on the server.

```
@PostMapping("/example")
public ResponseEntity<String> postExample(@RequestBody String request) {
    return ResponseEntity.ok("POST Response");
}
```

### @PutMapping

Used to handle HTTP PUT requests.  
It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.PUT).  
It is typically used to update existing resources on the server.

```
@PutMapping("/example")
public ResponseEntity<String> putExample(@RequestBody String request) {
    return ResponseEntity.ok("PUT Response");
}
```

### @DeleteMapping

Used to handle HTTP DELETE requests.  
It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.DELETE).  
It is typically used to delete resources on the server.

```
@DeleteMapping("/example")
public ResponseEntity<String> deleteExample() {
    return ResponseEntity.ok("DELETE Response");
}
```

## Dependency Injection [^](#get-started)

**Dependency Injection (DI)** is a design pattern used in Spring Boot to manage object creation and dependencies, promoting loose coupling and easier testing. Here are key points about DI in Spring Boot.  
**Loose Coupling:** Loose coupling in Spring Boot is achieved through dependency injection, which allows components to be independent of each other and makes the application more flexible and maintainable.

### **Autowired in Spring**

@Autowired in Spring is an annotation used for dependency injection, a key feature that promotes loose coupling and enhances the modularity and scalability of applications. It allows Spring to automatically inject dependencies into a class, eliminating the need for manual configuration.

## 3 major types of dependency injection (DI):

- **Constructor Injection**: Dependencies are passed to the constructor of the class as arguments. Preferred method for injecting dependencies. It ensures that the object is fully initialized when created and promotes immutability. Here’s an example:
  ```java
  public class MyClass {
      private final MyDependency myDependency;

      public MyClass(MyDependency myDependency) {
          this.myDependency = myDependency;
      }
  }

  ```
- **Setter Injection**: Dependencies are injected using setter methods. This approach involves creating a setter method for each dependency that needs to be injected. Spring Boot calls these setter methods to inject the dependencies after the object is created. While still supported, it is less preferred due to potential issues with object state management. It can lead to objects being in an incomplete state if dependencies are not set correctly. Here’s an example:
  ```java
  public class MyClass {
      private MyDependency myDependency;

      @Autowired
      public void setMyDependency(MyDependency myDependency) {
          this.myDependency = myDependency;
      }
  }

  ```
- **Field Injection**: Least preferred method because it makes the class less testable and harder to maintain. It involves directly annotating dependencies into the class fields using the `@Autowired` annotation. This is the simplest way to perform DI, but it is generally not recommended because it can make it difficult to see what dependencies a class has. Here’s an example:
  ```java
  public class MyClass {
      @Autowired
      private MyDependency myDependency;
  }

  ```
  
### Spring MVC

Spring MVC (Model-View-Controller) is a framework for building web applications. It separates the application into three interconnected components.

- **Model**: Represents the application's data and business logic.
- **View**: Represents the presentation layer (UI).
- **Controller**: Handles user input and interacts with the model to render the appropriate view.

### Three-Tier Architecture

Three-tier architecture is a client-server software architecture pattern that separates the application into three logical layers.

1. **Presentation Layer**: The user interface layer, which interacts with the user.
2. **Business Logic Layer**: The application layer, which processes data between the presentation and data layers.
3. **Data Layer**: The database layer, which stores and retrieves data.
