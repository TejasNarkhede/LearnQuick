## HTML Basic Structure

The basic structure of an HTML document includes essential elements that define the layout and content of a web page. Here's the structure

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>
</head>
<body>
    <!-- Page content goes here -->
</body>
</html>
```

## HTML Tags

HTML tags are special keywords that define how data is displayed or formatted. Web browsers differentiate between HTML and plain content.

---

### Types of Tags

**Container tags** are divided into 3 parts:

- `<opening tag>` -content- `</closing tag>`

**Empty tags** have no closing tag:

- `<img>`

---

### HTML Attributes

**Attributes** are special words placed in opening tags that define the characteristics/behaviour of an HTML element. They are written as name-value pairs.

**Syntax:**

<tag attribute_name="value">

### HTML Heading Tags

Heading Tags are used to define headings on a web page.

```
<h1>This is a heading 1</h1>
<h2>This is a heading 2</h2>
<h3>This is a heading 3</h3>
<h4>This is a heading 4</h4>
<h5>This is a heading 5</h5>
<h6>This is a heading 6</h6>
```

### HTML Paragraph Tag

This tag defines a paragraph.  
Browsers automatically add some space before and after each `<p>` element.

```
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
```

### HTML Comments

Comments are used to insert notes in the HTML code. They are not displayed by the browser.  
Syntax:  
`<!-- This is a comment -->`

### SEO Tags

SEO (Search Engine Optimization) tags help improve the visibility of a web page in search engines.

`<main>` tag is used to specify the main content of an HTML document.  
The content inside the `<main>` tag should be unique to the document and not contain any content that is repeated across multiple pages (like sidebars, navigation links, or footer content).

**Void elements are HTML elements that do not have a closing tag. Examples include `<img>`, `<br>`, `<hr>`, etc.**

### HTML Image Tag

The <img> tag is used to embed an image in an HTML page. It is a void element.

Attributes:
**src:** Specifies the path to the image.
**alt:** Provides alternative text for the image if it cannot be displayed.

```
<img src="image.jpg" alt="Description of image">
```

### Pre tag
### HTML Pre Tag

The `<pre>` tag is used to display preformatted text.  
Text inside a `<pre>` element is displayed in a fixed-width font (usually Courier),  
And it preserves both spaces and line breaks.

```
<pre>
This is preformatted text.
    It preserves spaces and
    line breaks.
</pre>
```

### HTML Target Attribute

The target attribute specifies where to open the linked document.
Values:

**\_self:** Opens the document in the same window/tab (default).  
**\_blank:** Opens the document in a new window/tab.  
**\_parent:** Opens the document in the parent frame.  
**\_top:** Opens the document in the full body of the window.

```
<a href="https://www.example.com" target="_blank">Visit Example</a>
```

### HTML Section Tag

The `<section>` tag defines sections in a document, such as chapters, headers, footers, or any other sections of the document.

```
<section>
    <h2>Section Title</h2>
    <p>Content of the section.</p>
</section>
```

### HTML List Tags

**Ordered List `<ol>`:** Defines an ordered list.  
**Unordered List `<ul>`:** Defines an unordered list.  
**List Item `<li>`:** Defines a list item.

```
<ol>
    <li>First item</li>
    <li>Second item</li>
</ol>
<ul>
    <li>First item</li>
    <li>Second item</li>
</ul>
```

### HTML Figure Tag

The `<figure>` tag specifies self-contained content, like illustrations, diagrams, photos, code listings, etc.

```
<figure>
    <img src="image.jpg" alt="Description of image">
    <figcaption>Caption for the image</figcaption>
</figure>
```

### HTML Figcaption Tag

The `<figcaption>` tag defines a caption for a `<figure>` element.

```
<figure>
    <img src="image.jpg" alt="Description of image">
    <figcaption>Caption for the image</figcaption>
</figure>
```

### HTML Em Tag

The `<em>` tag is used to emphasize text.  
The content inside is typically displayed in italic.

```
<p>This is an <em>important</em> word.</p>
```

### HTML Strong Tag

The `<strong>` tag is used to define text with strong importance.  
The content inside is typically displayed in bold.

```
<p>This is a <strong>very important</strong> word.</p>
```

### HTML Form Tag

The `<form>` tag is used to create an HTML form for user input.  
Attributes:
**action:** Specifies where to send the form data when the form is submitted.

```
<form action="/submit-form">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <input type="submit" value="Submit">
</form>
```

### HTML Input Tag

The `<input>` tag is used to create interactive controls in a web form.
Attributes:  
**type:** Specifies the type of input element to display.
Common type values:

- **text:** Single-line text input.
- **password:** Password input.
- **submit:** Submit button.
- **radio:** Radio button.
- **checkbox:** Checkbox.
- **placeholder:** Provides a hint to the user of what can be entered in the input field.
- **required:** Indicates that the input field must be filled out before submitting the form.
- **value:** Specifies the initial value of the input element.

Example:
```html
<form action="/submit-form">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name" required>
    <input type="submit" value="Submit">
</form>
```

### HTML Button Tag
The <button> tag defines a clickable button.  
It can contain text or images, and it can be used to submit forms or trigger JavaScript functions.
- type: Specifies the type of button. Common type values include:
- button: A clickable button that does not submit the form.
- submit: A button that submits the form.
- reset: A button that resets the form fields to their initial values.

```
<button type="button" onclick="alert('Button clicked!')">Click Me!</button>
```

### HTML Radio Button
The <input type="radio"> tag is used to create a radio button.  
Radio buttons allow the user to select one option from a set.
name: Groups radio buttons together. Only one radio button in a group can be selected at a time.
value: Specifies the value that will be submitted if the radio button is selected.
Example:
```
<form action="/submit-form">
    <label for="option1">Option 1:</label>
    <input type="radio" id="option1" name="options" value="1">
    <label for="option2">Option 2:</label>
    <input type="radio" id="option2" name="options" value="2">
    <input type="submit" value="Submit">
</form>
```

### HTML Label Tag
The <label> tag defines a label for an <input> element. It improves the usability of forms by making it easier to select input fields.  
Specifies which form element a label is bound to. The value should match the id of the input element.
```
<label for="name">Name:</label>
<input type="text" id="name" name="name">
```

### HTML ID Attribute
The id attribute specifies a unique identifier for an HTML element.  
It is used to link labels to input elements and to apply styles or scripts to specific elements.
```
<input type="text" id="name" name="name">
<label for="name">Name:</label>
```

### HTML Fieldset Tag
The <fieldset> tag is used to group related elements in a form.  
It helps to organize complex forms and improve accessibility.
```
<fieldset>
    <legend>Personal Information</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email">
</fieldset>
```

### HTML Legend Tag
The <legend> tag defines a caption for the <fieldset> element. It provides a title for the grouped elements.  
```
<fieldset>
    <legend>Personal Information</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email">
</fieldset>
```

