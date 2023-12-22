# COLLEGE_WEBSITE


# Simple Website with Database Connection

This is a simple website with three pages: Home (index.html), Login (login.html), and Contact Us (contactus.html). The website is designed to connect to a MySQL database for login and contact form data storage.
se)

## Features

- Home page with basic content.
- Login page with a simple form (no actual authentication logic implemented in this example).
- Contact Us page with a form to submit user queries.
- Responsive design with a basic stylesheet (styles.css).
- Basic JavaScript functions for form interaction (script.js).
- Simple Java code (Main.java) for database connection (MySQL).

## File Structure

- index.html: Home page HTML file.
- login.html: Login page HTML file.
- contactus.html: Contact Us page HTML file.
- styles.css: CSS file for styling.
- script.js: JavaScript file for client-side interactions.
- Main.java: Java file for database connection (modify with your actual database logic).

## Getting Started

1. Clone this repository
  
2. Open the project in your preferred text editor or integrated development environment (IDE).

3. Customize the HTML, CSS, and JavaScript files to suit your needs.

## Database Configuration

1. Replace the placeholder values in Main.java with your actual database information:

   java
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://your-database-host:your-database-port/your-database-name";
   static final String USER = "your-username";
   static final String PASS = "your-password";
   

2. Ensure that you have a MySQL database set up with the specified information.

## Usage

1. Open the index.html, login.html, or contactus.html file in a web browser to view the corresponding pages.

2. Interact with the forms on the Login and Contact Us pages (Note: No actual authentication logic is implemented in this example).

## Contributing

Feel free to contribute to this project by opening issues or pull requests.

