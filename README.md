# Automation Using Cucumber BDD

## Project Description
This project is a test automation framework developed using Cucumber BDD, Selenium WebDriver, and Java. It follows the Behavior Driven Development approach, where test scenarios are written in Gherkin syntax to improve readability and collaboration.

The framework is designed to automate web application test cases in a structured and maintainable way.

---

## Objective
- Implement a BDD-based automation framework using Cucumber  
- Automate web application test scenarios using Selenium  
- Create reusable and maintainable test scripts  

---

## Technologies Used
- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- JUnit / TestNG 
- Maven  

---

## Project Structure
- Feature Files: Contains test scenarios written in Gherkin format  
- Step Definitions: Java methods that implement the steps  
- Runner Class: Used to execute the test cases  
- Utilities (if applicable): Common reusable functions  

---

## Key Features
- Uses Given-When-Then syntax for test scenarios  
- Clear separation between test logic and implementation  
- Reusable step definitions  
- Maintainable and scalable framework structure  

---

## How to Execute

1. Clone the repository  
   git clone https://github.com/Hariprakash-R-2410/Automation-Using-Cucumber-BDD.git  

2. Open the project in an IDE such as Eclipse or IntelliJ  

3. Install dependencies using Maven  
   mvn clean install  

4. Run the Runner class to execute the test cases  

---

## Example Scenario

Feature: Login functionality  

Scenario: Valid login  
Given user is on login page  
When user enters valid credentials  
Then user is redirected to the home page  

---

## Future Enhancements
- Add reporting (Extent Reports or Allure)  
- Integrate with CI/CD tools such as Jenkins  
- Implement cross-browser testing  
- Increase test coverage  

---

## Author
Hariprakash R  
GitHub: https://github.com/Hariprakash-R-2410
