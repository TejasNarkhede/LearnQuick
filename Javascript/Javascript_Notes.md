# Javascript

ECMAScript is the official name of the language.

## Get Started
[Variables](#javascript-variables)  
[Datatypes](#javascript-datatypes)  
[Operators](#operators)  
[Conditionals](#conditional-statements)  
[Loops](#loops)  
[Functions](#functions)  
[Strings](#strings)


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
