# Javascript

**ECMAScript** is the official name of the language.  
In Javascript, **lexical structure** refers to the syntax and set of rules that define how code is written and interpreted.

## Get Started
[Variables](#javascript-variables)  
[Type Conversion](#type-conversion)  
[Scopes](#scopes)  
[Datatypes](#javascript-datatypes)  
[Operators](#operators)  
[Conditionals](#conditional-statements)  
[Loops](#loops)  
[Functions](#functions)  
[Strings](#strings)  
[Arrays](#arrays)  
[Errors](#)


## Javascript Variables
**Containers for data** : Variables are like storage containers that hold data values.  
**Dynamic typing** : JavaScript allows you to declare variables without specifying their data type. The type is determined at runtime based on the value assigned to the variable.  
**Variables are Case Senstive**

### Types of variables
**Var**

- Global Scope
- Can reassign and redeclare values

**Let**

- Block Scope
- Can reassign values

**Const**

- Block Scope
- Constant (can not change value)
- Cannot reassign

### Variable Naming Convention
$ and _ Allowed  
No Leading Numbers  
No Leading Special Characters  

## Type Conversion [^](#get-started)

Type conversion in JavaScript refers to the process of converting a value from one data type to another. This can happen either implicitly (automatically by JavaScript) or explicitly (manually by the developer).

#### 1. **Implicit Type Conversion (Type Coercion)**

JavaScript performs type coercion when an operation requires a certain type but encounters a different type. It automatically converts one type into another.

##### Examples:

- **String + Number (concatenation):**
  ```javascript
  let result = '5' + 2;   // '52' (Number 2 is coerced to string)
  ```
  
- **Number + String (coercion happens here too):**
  ```javascript
  let result = 2 + '5';   // '25' (Number 2 is coerced to string)
  ```

- **Boolean Coercion:**
  JavaScript coerces values to booleans in conditional statements.
  ```javascript
  if ('') {
    console.log('This won\'t run');
  } else {
    console.log('Empty string is falsy');
  }
  // Output: Empty string is falsy
  ```

- **Comparison operators:**
  ```javascript
  let result = '5' == 5;   // true (String '5' is coerced to number 5)
  ```

#### 2. **Explicit Type Conversion**

This involves manually converting a value from one type to another using JavaScript functions.

##### Common Methods for Explicit Conversion:

- **To String:**
  - Using `String()`:
    ```javascript
    let num = 123;
    let str = String(num);  // '123'
    ```
  - Using `toString()` method:
    ```javascript
    let num = 123;
    let str = num.toString();  // '123'
    ```

- **To Number:**
  - Using `Number()`:
    ```javascript
    let str = '123';
    let num = Number(str);   // 123
    ```
  - Using `parseInt()` or `parseFloat()`:
    ```javascript
    let str = '123.45';
    let num = parseInt(str);  // 123 (parses only the integer part)
    let floatNum = parseFloat(str);  // 123.45
    ```

- **To Boolean:**
  - Using `Boolean()`:
    ```javascript
    let str = '';
    let bool = Boolean(str);  // false (empty string is falsy)
    ```

- **To Object:**
  - Using `Object()`:
    ```javascript
    let num = 5;
    let obj = Object(num);  // [Number: 5]
    ```

#### 3. **Coercion in Different Contexts**

- **Equality comparison:**
  The `==` operator does type coercion while `===` does strict comparison (no coercion).
  ```javascript
  5 == '5';   // true (coercion occurs)
  5 === '5';  // false (strict equality, types differ)
  ```

- **Unary `+` Operator:**
  The unary `+` operator tries to convert a value into a number.
  ```javascript
  let str = '123';
  let num = +str;  // 123 (string '123' is converted to number)
  ```

- **Null and Undefined:**
  - `null` can be coerced into `0` in arithmetic operations.
  - `undefined` coerces into `NaN` in numeric operations.

#### 4. **Falsy and Truthy Values**

In JavaScript, some values are considered falsy (coerced to `false`) and others are truthy (coerced to `true`).

- **Falsy values** include:
  - `false`
  - `0`
  - `""` (empty string)
  - `null`
  - `undefined`
  - `NaN`

- **Truthy values** are any values that are not falsy, e.g., `'0'`, `[]`, `{}`, `42`.

##### Example:
```javascript
if ('hello') {
  console.log('This runs');  // Output: This runs
}

if (0) {
  console.log('This won\'t run');
}
```

#### 5. **Type Conversion with `JSON.parse()` and `JSON.stringify()`**

- **`JSON.parse()`** converts a JSON string into a JavaScript object.
  ```javascript
  let jsonString = '{"name": "John", "age": 30}';
  let obj = JSON.parse(jsonString);  // {name: "John", age: 30}
  ```

- **`JSON.stringify()`** converts a JavaScript object into a JSON string.
  ```javascript
  let obj = {name: 'John', age: 30};
  let jsonString = JSON.stringify(obj);  // '{"name": "John", "age": 30}'
  ```

#### 6. **Other Implicit Coercions**

- **Automatic Coercion in Arithmetic Operations:**
  - In cases like `'5' * 2`, JavaScript coerces the string `'5'` into a number.
  ```javascript
  let result = '5' * 2;  // 10 (String '5' is coerced to number)
  ```

- **Automatic Coercion with `+` Operator:**
  The `+` operator is special because it can both add numbers and concatenate strings. In cases involving strings and numbers, it will convert numbers to strings.
  ```javascript
  let result = 5 + '5';  // '55' (Number 5 is coerced to string)
  ```

---

### Key Takeaways:

- **Implicit Type Conversion** is automatic, occurring during operations.
- **Explicit Type Conversion** is manually controlled, using built-in functions like `String()`, `Number()`, etc.
- **`==` vs `===`**: The `==` operator performs type coercion, while `===` checks for both value and type equality.
- **Falsy and Truthy values** affect flow control in JavaScript, especially in conditionals.

Understanding type conversion is crucial for handling different types effectively in JavaScript.



## Scopes [^](#get-started)
**Global Scope :**  
Variables declared outside of any function or block.  
Accessible from anywhere withtin js code.

**Local Scope (Function Scope) :**  
Variables declared inside a function have local scope.  
Only accessible within that function and any **nested functions**.  
When the function execution ends, the local variables are destroyed.  

**Block Scope (Introduced in ES6) :**  
Variables declared with **let** or **const** within a block (e.g., if statement, for loop, or a block enclosed in curly braces) have block scope.  
They are only accessible within that block.

## Javascript Datatypes [^](#get-started)
**Datatypes** : Define the type of data that a variable can store.  
**typeof** : The typeof operator returns the data type of a JavaScript variable.

### Primitive Types
**Strings** - Sequence of characters enclosed in quotes ',",`;

```
let username = "your name";
console.log(username); // Outputs: your name
```

**Numbers** - Integers Or Floating Point Numbers

```
let year = 2024;
console.log(typeof year); // Outputs: number
```

**BigInt** - Integer value too big to be represented by a normal JavaScript Number.

```
let x = BigInt("123456789012345678901234567890");
```

**Boolean** - True or False

```
let isStudent = true;
console.log(typeof isStudent); // Outputs: boolean
```

**Undefined** - A variable that is declared but not assigned has this type.

```
let username;
console.log(username); // Outputs: undefined
console.log(typeof username); // Outputs: undefined
```

**Null** - Represents no value

```
let user = null;
console.log(user); // Outputs: null
console.log(typeof user); // Outputs: object
```

**Objects** - Non-Primitive datatype allow to store collection of data

```
const mobileBrands = {
    Apple: "Iphone 16 pro max",
    Samsung: "Galaxy S24 Ultra",
    Google: "Pixel 9 XL"
};
console.log(typeof mobileBrands); // Outputs: object
```

**Arrays** - Object used to store multiple values, using square brackets [].

```
const numbers = [1, 2, 3, 4, 5];
console.log(typeof numbers); // object
```

**Tip**
Use **_typeof_** Operator find the type of a JavaScript variable.

## Operators [^](#get-started)

### Comparison operators
Returns true or false (**boolean**)  
This operators are used in logical statements to determine equality or difference between variables or values.

**Equality (==)** :
Equal to. Checks if the values are equal, regardless of their data types.

**Inequality (!=)** : 
Not equal to. Checks if the values are not equal, regardless of their data types.

**Strict equality (===)** : 
Strict equal to. Checks if the values are equal and of the same data type.

**Strict inequality (!==)** : 
Strict not equal to. Checks if the values are not equal or of different data types.


### Relational Operators
Relational operators in JavaScript are used to compare two values and return a Boolean value (true or false) based on the relationship between them.

**Greater than operator (>)** : Greater than.

**Greater than or equal operator (>=)** : Greater than or equal to.

**Less than operator (<)** : Less than.

**Less than or equal operator (<=)** : Less than or equal to.

### Logical Operators
Logical operators are used to combine multiple conditions into a single expression.  
Types of logical operators:  
**Logical AND (&&)** : Returns true only if both conditions are true.  
**Logical OR (||)** : Returns true if at least one condition is true.  
**Logical NOT (!)** : Reverses the value of a condition (e.g., true becomes false, false becomes true).  
```
let age = 25;
let isStudent = true;

if (age >= 18 && isStudent) {
  console.log("You are eligible for student discounts.");
}
else (age < 18 || !isStudent) {
  console.log("You are not eligible for student discounts.");
}
```
## Conditional Statements [^](#get-started)
Conditional statements allow you to control the flow of your JavaScript code based on specific conditions.

**If Statement** :
Executes a block of code if a specified condition is true.
```
if (condition) {
    // Code to be executed if condition is true
}
```

**If-else Statement** :
Executes one block of code if a condition is true, and another block if it's false.
```
if (condition) {
    // Code to be executed if condition is true
} else {
    // Code to be executed if condition is false
}
```

**Else if Statement** :
Allows you to check multiple conditions sequentially.
```
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition1 is false and condition true
} else {
    // Code to be executed if all conditions are false
}
```

**Switch Statement** :
Compares a value against multiple cases and executes the corresponding code block.
```
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    default:
        // Code to be executed if no case matches
}
```

**Ternary Operator** :
Short hand if else.  
Concise way to write an if-else statement in a single line of code.   
**Syntax** :
condition ? expression1 : expression2
```
let age = 25;
let message = age >= 18 ? "You are an adult." : "You are a minor.";
console.log(message);
```

## Loops [^](#get-started)
Loops in JavaScript are **control flow statements** that allow you to repeatedly execute code blocks until a certain condition is met.  
**Types of loops**

- **for loop :**
Executes a block of code a specified number of times.
```
for (let i = 0; i < 5; i++) {
    console.log("Iteration " + (i + 1));
}
```

- **while loop :**
Executes a block of code as long as a specified condition is true.
```
let count = 1;
while (count <= 5) {
    console.log("Count: " + count);
    count++;
}
```

- **do-while loop :**
Executes a block of code at least once, and then repeatedly as long as a specified condition is true.  
```
let num = 1;
do {
    console.log("Number: " + num);
    num++;
} while (num <= 5);
```

- **for..in loop :**
Iterates over the properties of an object.
```
const person = {
    name: "Alice",
    age: 30,
    city: "New York"
};

for (let property in person) {
    console.log(property + ": " + person[property]);
}
```

- **for...of loop :**
Iterates over the values of an iterable object (like arrays, strings, and sets)
```
const fruits = ["apple", "banana", "orange"];

for (let fruit of fruits) {
    console.log(fruit);
}
```

## Functions [^](#get-started)
Functions are fundamental **building blocks** in JavaScript.  
Allows you to encapsulate **reusable code** & organize your program's logic.  
Essential for creating **modular**, **efficient**, and **maintainable** code.

### Parameters and Arguments:  
**Parameters :** Variables defined within the function's parentheses that receive values passed to the function when it's called.  
**Arguments :** The actual values passed to a function when it's called.  
**Return Values :** Functions can return values using the return keyword.
The returned value can be used in expressions or assigned to variables.

#### Function declaration  
```
function greet(name) {
    console.log("Hello, " + name + "!");
}
greet("Alice");
```

#### Function expression
```
const add = function(num1, num2) {
    return num1 + num2;
};
const result = add(5, 3);
console.log(result); // Output: 8
```

#### Arrow Function
```
const square = (num) => {
    return num * num;
};
const squared = square(4);
console.log(squared); // Output: 16
```


## Strings [^](#get-started)
Strings are **sequences of characters** enclosed in **single**, **double**, or **backticks**. They are fundamental data types in JavaScript and are used to represent text.

**String Concatenation:** String concatenation is the process of joining two or more strings together using the + operator.
```
let username = "Prakash";
let age = 99;
let message = "My name is " + username + " and I am " + age + " years old.";
console.log(message);
```

**String Methods**

- **length :** Returns the length of the string.
```
const str = "Hello, world!";
// Length
console.log(str.length); // Output: 13
```

- **slice(start, end) :** Extracts portion from start index (inclusive) to the specified end index (exclusive).
```
const str = "Hello, world!";
// Slice
console.log(str.slice(0, 5)); // Output: Hello
```

- **replace(old, new) :** Replaces all occurrences of the old substring with the new substring.
```
const str = "Hello, world!";
// Replace
console.log(str.replace("world", "there")); // Output: Hello, there!
```

- **concat(str1, str2, ...) :** Combines the string with one or more other strings.
```
const str = "Hello, world!";
// Concat
console.log(str.concat(" How are you?")); // Output: Hello, world! How are you?
```

- **trim() :** Removes leading and trailing whitespace
```
const str = "Hello, world!";
// Trim
console.log(str.trim()); // Output: Hello, world!
```

- **charAt(index) :** Returns the character at the specified index.
```
const str = "Hello, world!";
// CharAt
console.log(str.charAt(6)); // Output: w
```

- **indexOf(search, start) :** Returns the index of the first occurrence of the specified search string within the string, starting from the optional start index.
```
const str = "Hello, world!";
// IndexOf
console.log(str.indexOf("world")); // Output: 7
```

- **startsWith(search, start) :** Checks if the string starts with the specified search string, starting from the optional start index.
```
const str = "Hello, world!";
// StartsWith
console.log(str.startsWith("Hello")); // Output: true
```

- **endsWith(search, length) :** Checks if the string ends with the specified search string, up to the optional length parameter.
```
const str = "Hello, world!";
// EndsWith
console.log(str.endsWith("!")); // Output: true
```

**Template Literals:** Template literals provide a more readable and convenient way to include variables in strings.

- enclosed by backticks (`)
- embedded expressions using ${}.
```
let username = "Tejas";
let age = 22;
let message = `My name is ${username} and I am ${age} years old.`;
console.log(message);
```

## Arrays [^](#get-started)
Non primitive datatype  
A way to store and manage collections of data efficiently.

**Creating Arrays - Sqaure brackets [] separate by commas.**
```
let students = ["Tejas", "Divya", "Venkat"];
console.log(students);
```

**Could add multiple datatypes**
```
let mixedArray = ["Prakash", 42, [1, 2, 3], { schoolName: "SIES" }];
console.log(mixedArray);
```

**Iterating through Array - regular for loop**
```
for(let names of students) {
    console.log(names);
}
```

**Iterating through indices of Array -  for in**
```
for(let index in students) {
    console.log(students[index]);
}
```

**Modifying Arrays**
- **Adding Elements**
```
students.push("Khushal");
```

- **Removing Arrays**
```
students.pop();
```

Array Methods
- map  
Creates a new array with the results of calling a function for every array element:
```
let upperCaseNames = studentNames.map(name => name.toUpperCase());
```

- filter
Creates a new array with elements that pass a test provided by a function:
```
let longNames = studentNames.filter(name => name.length > 5);
```



## Errors [^](#get-started)

### The `try` - `catch` Statement
The `try` - `catch` statement allows you to test a block of code for errors and handle them if they occur.

#### Syntax:
```javascript
try {
  // Block of code to try
} catch (err) {
  // Block of code to handle errors
}
```

**The finally Statement:**
The `finally` statement lets you execute code, after `try` and `catch`, regardless of the result:
```javascript
try {
  // Block of code to try
}
catch(err) {
  // Block of code to handle errors
}
finally {
  // Block of code to be executed regardless of the try / catch result
}
```

**The Error Object:**  
The error object provides two useful properties: `name` and `message`.

**Error Name Values:**  
**EvalError:**	An error has occurred in the eval() function  
**RangeError:**	A number "out of range" has occurred  
**ReferenceError:**	An illegal reference has occurred  
**SyntaxError:**	A syntax error has occurred  
**TypeError:**	A type error has occurred  
**URIError:** An error in encodeURI() has occurred


**throw** : The `throw` statement allows you to create a custom error.