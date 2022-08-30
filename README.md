# AutomationPractice
Introduction:
---------------


This Test Automation Framework is created using Java + Selenium Web Driver + TestNG. Which can be used across different web based applications.
In this approach, the endeavor is to build a lot of applications independent reusable keyword components so that they can directly used for another web application without spending any extra effort. 
With this framework in place, whenever we need to automate a web based application, we would not need to start from scratch, but use the application independent keyword components to the extent possible and create application specific components for the specific needs.

Prerequisites:
---------------
*	Windows 10  
*	Java jdk version 1.8.0
*	Apache Maven 3.8.6 
*	Eclips IDE 
*	TestNG plugin version 7.4.0
*	Maven plugin



Execution:
---------------
*	Clone the repository.
*	can be executed with TestNG plugin for Eclipse IDE testng.xml file as a TestNG testSuite
*	The framework is Cross-browser support where the user can pass the chosen browser via the testng.xml by giving a value to browser from (Chrome, Firfox, or Edge)
*	framework can read the url and the string inputs of search from CSV file named Data.csv in //src/test/java/data



Screenshot:
---------------
*	to Capture Screenshot in WebDriver when some kind of error or exception surfaces while practicing testing, to resolve the same the framework has a method. 
*	screenshotOnFailure() is used to indicates driver to capture a screenshot and store it in //ScreenShots directory.

Reporting:
---------------
*  The framework produce Assesment Test.html report. It resides in the same 'test-output\VOIS' folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.
*  You can find emailable-report.html from 'test-output' to email the test reports. As this is a html report you can open it with browser.


Heirarchy:
---------------
*	PageBase module contain all the basic action will be used in all modules like drive decleration, costructor, clickButton method, sendText method,and Hover method.
*	HomePage module when driver lands on the specified url (automationPractic in our case) and specify the concerned components and the actions
*	SignUp module when the driver lands on the page specifed by the user when he clicks on sign in button then signUp as the scinario.
*	Registration module when the driver lands on the next page to user choise (when clicks Create an Account) and specify concerned components and the actions
*	Order module when the driver lands on the next page to user choise (when start to make the order) and specify concerned components and the actions
*	testBase module where the driver is initiated according to user choice , intiate csv reader , screenshotOnFailure, before and aftersuit operations  
*	SignUpTest module test the basic functions user can perform 
*	RegistrationTest module test the basic functions user can perform and fill all concerned data using the CSV
*	OrderTest module test basic functions user can perform and assert that the order was successfully purchased 
