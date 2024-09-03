# **Automation Framework for Portfolio Website**

This project is an automation framework developed using Maven, TestNG, and Selenium. The framework is structured using the Page Object Model (POM) and is designed to automate the testing of my portfolio website.

## **Table of Contents**
- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Folder Structure](#folder-structure)

## **Project Overview**
This framework automates the testing of the portfolio website, ensuring that all key functionalities are validated. The framework follows best practices in test automation, including the use of the Page Object Model (POM) design pattern for better code maintainability and readability.

## **Technology Stack**
- **Programming Language:** Java
- **Build Tool:** Maven
- **Test Framework:** TestNG
- **Web Automation Tool:** Selenium WebDriver
- **Design Pattern:** Page Object Model (POM)
- **Reporting:** TestNG Reports, Extent Reports (optional)

## **Folder Structure**
T# **Automation Framework for Portfolio Website**

This project is an automation framework developed using Maven, TestNG, and Selenium. The framework is structured using the Page Object Model (POM) and is designed to automate the testing of my portfolio website.

## **Table of Contents**
- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Folder Structure](#folder-structure)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)
- [Test Reports](#test-reports)
- [Contributing](#contributing)
- [License](#license)

## **Project Overview**
This framework automates the testing of the portfolio website, ensuring that all key functionalities are validated. The framework follows best practices in test automation, including the use of the Page Object Model (POM) design pattern for better code maintainability and readability.

## **Technology Stack**
- **Programming Language:** Java
- **Build Tool:** Maven
- **Test Framework:** TestNG
- **Web Automation Tool:** Selenium WebDriver
- **Design Pattern:** Page Object Model (POM)
- **Reporting:** TestNG Reports, Extent Reports (optional)

## **Folder Structure**
The project is organized as follows:

```plaintext
├── pom.xml                  # Maven project configuration file
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── portfolio
│   │               ├── base
│   │               │   └── BaseTest.java     # Base class for setup and teardown
│   │               ├── pages
│   │               │   ├── HomePage.java     # Page class for the homepage
│   │               │   └── ContactPage.java  # Page class for the contact page
│   │               └── utils
│   │                   └── WebDriverFactory.java  # WebDriver configuration
│   └── test
│       └── java
│           └── com
│               └── portfolio
│                   └── tests
│                       ├── HomePageTest.java   # Test class for homepage tests
│                       └── ContactPageTest.java # Test class for contact page tests
└── test-output               # TestNG default output folder (auto-generated)
```
### **Key Folders and Files:**
- **`pom.xml`**: Contains the project’s dependencies, plugins, and build configurations.
- **`src/main/java/com/portfolio/base/BaseTest.java`**: The base class containing setup and teardown methods.
- **`src/main/java/com/portfolio/pages`**: Contains Page Object classes, each representing a specific page of the portfolio website.
- **`src/main/java/com/portfolio/utils/WebDriverFactory.java`**: Utility class for WebDriver configuration and management.
- **`src/test/java/com/portfolio/tests`**: Contains test classes where each class corresponds to tests for specific pages or features.

## **Setup and Installation**

### **Prerequisites:**
- Java 8 or higher
- Maven 3.6 or higher
- Git
