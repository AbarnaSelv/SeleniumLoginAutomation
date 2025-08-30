# Selenium Automation — Basic POM + TestNG Example

## Overview
This is a compact, beginner-friendly Selenium automation project built with:
- **Java 17**
- **Selenium 4**
- **TestNG**
- **Page Object Model (using PageFactory)**
- **Maven** for build and dependency management

This repo demonstrates a minimal, professional structure and three simple flows implemented as TestNG tests:
1. **Login** — authenticate to the site.
2. **Logout** — open the menu and logout (with explicit waits).
3. **Add product to cart → verify → logout** — add *Sauce Labs Backpack* to cart, open cart, verify item present, then logout.

---
### Project Structure

src/main/java/com/abarnaselenium/pages – Page Object classes
- BasePage.java – Common page utilities
- LoginPage.java – Login functionality
- HomePage.java – Home page actions (logout, menu, etc.)
- ProductPage.java – Product selection & cart verification

src/test/java/com/abarnaselenium/tests – Test classes
- BaseTest.java – Driver setup & teardown
- LoginTest.java – Login test case
- ProductTest.java – Add to cart & verify

pom.xml – Maven dependencies & build configuration  
testng.xml – TestNG suite configuration

---


## Key Features
- Reusable Page Objects using PageFactory
- Explicit waits for stable element interaction
- TestNG for structured test execution
- Maven for dependency management and build
- Simple and maintainable framework
- Easy to add more test cases

---


## 🎥 Demo Video  
▶️ [Click here to watch the execution video](https://drive.google.com/file/d/1f4yjHHmAyfma9dk7YlcTrJ2XFoGHkviS/view?usp=sharing)  

---

## 📸 Screenshots  
Execution screenshots are included inside the repository under the `Project_Demo/` folder.  

---

## How to Run

### 1. Using TestNG Suite (IDE)
- Right-click on `testng.xml` in your IDE
- Select **Run As → TestNG Suite**

### 2. Using Maven
```bash
git clone https://github.com/AbarnaSelv/SeleniumLoginAutomation.git
cd SeleniumLoginAutomation
mvn clean install
mvn test

