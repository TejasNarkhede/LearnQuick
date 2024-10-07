## Java Data Types

### Primitive Data Types

A primitive data type is predefined by the language and is named by a keyword or reserved keyword. There are eight types of primitive data types in Java:

* **boolean:** Stores true or false values.
* **byte:** 8-bit signed two's complement integer (-128 to 127).
* **short:** 16-bit signed two's complement integer (-32768 to 32767).
* **int:** 32-bit signed two's complement integer (-2,147,483,648 to 2,147,483,648).
* **long:** 64-bit signed two's complement integer (-2^63 to 2^63-1).
* **float:** Single-precision 32-bit IEEE 754 floating-point number (6-7 decimal digits).
* **double:** Double-precision 64-bit IEEE 754 floating-point number.
* **char:** Single 16-bit Unicode character.

### In-built Methods

* **Integer.parseInt():** Converts a string to an int.
* **Integer.valueOf():** Converts a string to an Integer object.

### Variables

* **Scope:** The part of the program where a variable is accessible.
* **Types:**
  * **Local Variables:** Inside blocks, method bodies, or constructors.
  * **Member Variables/Class Variables:** Inside classes, outside methods.

### Arrays

* **Jagged Arrays:** Arrays where elements can be of different sizes.

### String

* **String Pool:** A pool of shared string objects for efficiency.
* **Immutable:** String objects cannot be modified after creation.

### String Methods

- **equals():** Compares the value of two strings.
- **==:** Compares the references of two strings.
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


### OOPS (Object-Oriented Programming)

* **Encapsulation:** Bundling data and methods within a class.
* **Abstraction:** Hiding unnecessary details from the user.
* **Inheritance:** Creating new classes based on existing ones.
* **Polymorphism:** Ability of objects to take on multiple forms.