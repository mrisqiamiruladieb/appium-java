# appium-java
Mobile Automation (Android)

## Pre-requisites
- Open **Intellij Idea** &rarr; **File** &rarr; **New** &rarr; **Project (Java)**
- Setup **JDK: Java Version**, **Build System: Maven**
- Go to **pom.xml** *add dependencies tag* and *add the following dependencies* to it:
    - Go to [Appium Java](https://mvnrepository.com/artifact/io.appium/java-client) and [JUnit Vintage Engine](https://mvnrepository.com/artifact/org.junit.vintage/junit-vintage-engine), *copy* the content on **the Maven navbar** both, and *paste* it inside the dependencies tag
    - Click *Load Maven Changes (logo)* to install or sync the dependency
- **Configure** appium (_server/inspector_) & device (_emulator/real_) ([reference](https://github.com/mrisqiamiruladieb/MobileAutomation-RobotFramework/blob/main/README.md#persiapan-awal))
  - _Tips:_ use the **record feature** in _the appium inspector_ to make it easier to get the element address

## Steps
- **Create** a script file. _Example:_ src/test/java/**mobile.java**
- Import required _libraries_
- _Code_ and click **run** (_the play logo_)

## Issues and Solutions
- **Error** when **Running Test**
  - _Error Messages:_ org.openqa.selenium.SessionNotCreatedException:could not start a new session.Possible causes are invalid address of the remote server or browser start-up failure
  - _Solution:_ **Update** _appium java_ library with **compatible** selenium ([reference](https://discuss.appium.io/t/org-openqa-selenium-sessionnotcreatedexception-could-not-start-a-new-session-possible-causes-are-invalid-address-of-the-remote-server-or-browser-start-upfailure/42105))