# Javascript

ECMAScript is the official name of the language.

## Variable Naming Convention

$ and _ Allowed  
No Leading Numbers  
No Leading Special Characters

## Javascript Variables

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

## Javascript Datatypes

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

## Operators

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



### Conditional Statements
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

Else if Statement :
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

Switch Statement:
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

ternary operators continue...

## Strings

**String Concatenation:** String concatenation is the process of joining two or more strings together using the + operator.
```
let username = "Prakash";
let age = 99;
let message = "My name is " + username + " and I am " + age + " years old.";
console.log(message);
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
