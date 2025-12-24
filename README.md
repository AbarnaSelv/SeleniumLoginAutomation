# Selenium Automation – Basic POM + TestNG Example

## Overview

This is a compact and beginner-friendly **Selenium automation project** built to demonstrate how a clean **Page Object Model (POM)** framework works with **TestNG**.

The goal of this project is to keep things simple while still following **professional automation practices**. It focuses on basic user flows that are commonly asked in interviews and expected in real projects.

---

## Tech Stack Used

- **Java 17**
- **Selenium 4**
- **TestNG**
- **Page Object Model (POM) using PageFactory**
- **Maven** for dependency and build management

---

## Test Scenarios Covered

This project includes three simple and clear automation flows implemented using **TestNG**:

1. **Login**  
   User logs into the application using valid credentials.

2. **Logout**  
   User opens the menu and logs out using explicit waits for stability.

3. **Add Product to Cart → Verify → Logout**  
   - Add *Sauce Labs Backpack* to the cart  
   - Open the cart and verify the product is present  
   - Logout from the application

These flows are intentionally kept small to make the framework easy to understand and extend.

---

## Project Structure

src/main/java/com/abarnaselenium/pages  
Page Object classes

- **BasePage.java** – Common reusable page utilities  
- **LoginPage.java** – Login-related actions  
- **HomePage.java** – Home page actions like menu and logout  
- **ProductPage.java** – Product selection and cart verification  

src/test/java/com/abarnaselenium/tests  
Test classes

- **BaseTest.java** – WebDriver setup and teardown  
- **LoginTest.java** – Login test case  
- **ProductTest.java** – Add to cart and verification test  

Other important files:

- **pom.xml** – Maven dependencies and build configuration  
- **testng.xml** – TestNG suite configuration  

---

## Key Features

- **Reusable Page Objects** implemented using PageFactory  
- **Explicit waits** for stable and reliable execution  
- **TestNG** for structured test execution  
- **Maven** for dependency management  
- **Simple and maintainable framework design**  
- Easy to extend with more test cases

---

## Demo Video

Execution demo video is available here:  
https://drive.google.com/file/d/1f4yjHHmAyfma9dk7YlcTrJ2XFoGHkviS/view?usp=sharing

---

## Screenshots

Execution screenshots are available inside the repository under the **Project_Demo/** folder.

---

## How to Run the Project

### Option 1: Run from IDE (Simplest Way)

1. Open the project in **IntelliJ IDEA** or **Eclipse**
2. Right-click on **testng.xml**
3. Click **Run**

Done.

### Option 2: Run using Maven

1. Clone the repository
2. Open terminal inside the project folder
3. Run:
