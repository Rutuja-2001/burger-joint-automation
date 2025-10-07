# burger-joint-automation
Selenium + TestNG automation for Burger Joint Case Study with reporting and screenshots
 Burger Joint Automation Project

This project automates the **Burger Joint Case Study** on SimulationHub using **Selenium WebDriver**, **TestNG**, and **ExtentReports**.  
It demonstrates dynamic waits, JavaScript-based interaction, screenshot capture, and professional HTML reporting.

---

## 🔗 Important Links

- **Simulation Gallery (Homepage):** [https://autonomous-hvac-cfd.simulationhub.com/simulation-gallery](https://autonomous-hvac-cfd.simulationhub.com/simulation-gallery)  
- **Burger Joint Case Study Results:** [https://autonomous-hvac-cfd.simulationhub.com/public/Ktr3DDf/results](https://autonomous-hvac-cfd.simulationhub.com/public/Ktr3DDf/results)

---

## 🔧 Technologies Used

- **Java 17**
- **Maven**
- **Selenium WebDriver 4.16.1**
- **WebDriverManager 5.5.3**
- **TestNG 7.9.0**
- **ExtentReports 5.0.9**
- **Apache Commons IO 2.11.0**

---

## 📋 Requirements

Before running this project, ensure you have:

- ✅ **Java 17** installed and configured in your system path  
- ✅ **Maven** installed (`mvn -v` should work in terminal)  
- ✅ **Chrome browser** installed (latest version recommended)  
- ✅ **Internet access** to load the SimulationHub website  
- ✅ IntelliJ IDEA or any Java IDE (optional but recommended)

---

## 📂 Project Structure

burger-joint-automation/
├── pom.xml
├── README.md
├── src/
│ └── test/
│ └── java/
│ └── com/
│ └── example/
│ └── NavigationTest.java
├── target/
│ └── screenshots/
│ ├── success.png
│ └── failure.png
│ └── ExtentReport.html

yaml
Copy code

---

## 🚀 How to Run

1. **Clone the repository**:

```bash
git clone https://github.com/yourusername/burger-joint-automation.git
cd burger-joint-automation
Run the test:
mvn clean test

View the results:
Open target/ExtentReport.html in your browser

Screenshots are saved in target/screenshots/

✅ What the Test Does
Launches Chrome browser using WebDriverManager

Navigates to the Simulation Gallery:
https://autonomous-hvac-cfd.simulationhub.com/simulation-gallery

Clicks on the Burger Joint Case Study link

Waits for the results page to load

Clicks the OPEN RESULTS button

Captures screenshots on success or failure

Logs all actions in an HTML report


💡 Notes
This project is built using Maven and Java 17. Ensure your environment supports both.
