# Selenium

To execute the jar, you need Java 1.8.191 and Google Chrome installed.

To execute the java application, download the Exercise2.jar and chromedriver.exe file in the same location. Then, use the CMD, go to that location and execute: java -jar Exercise2.jar

The ComputerModelTest.java is the code that implement the test to execute, that add a computer, search the computer created and delete it in the website http://computer-database.gatling.io/computers

The Executor.java is the class to create the executionable JAR and execute the test case.

The structure of the code is:
src -> selenium -> Executor.java
test -> selenium -> ComputerModelTest.java

If there is any problem with the chromedriver, just install the latest version of Google Chrome and the latest version of the chromedriver.exe in http://chromedriver.chromium.org/downloads
