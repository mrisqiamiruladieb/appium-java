# appium-java
Mobile Automation (Android)

## Pre-requisites
- Go to **pom.xml** *add dependencies tag* and *add the following dependencies* to it:
    - Go to [Cucumber Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java) and [Cucumber JUnit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit), *copy* the content on **the Maven navbar** both, and *paste* it inside the dependencies tag
    - Click *Load Maven Changes (logo)* to install or sync the dependency

## Steps
- ([Reference](https://github.com/mrisqiamiruladieb/myskill-live-CucumberTest/blob/master/README.md)) **Create** a scenario file. _Example:_ src/test/java/cucumber/features/**Register.feature**
- **Create** step def script file by **hovering** over _the step scenario_ in _scenario.feature_ (**lamp icon**) or create manually. _Example:_ src/test/java/cucumber/stepDef/**MyStepdefs.java**
- **Create** a runner file. _Example:_ src/test/java/cucumber/runner/**runner.java**
- **Run Test**
  - _Method 1_
    - **Click** _run_ (**play icon**) on **scenario.feature**
  - _Method 2_
    - **Click** _run_ (**play icon**) on **runner.java**
- **Open** the generated _html report_ in a **browser** (_the file path_ in runner.java)

## Issues and Solutions
- **No suggestion** to _create step def_ when **hovering** over _scenario.feature_ (**lamp icon**)
  - _Solution:_ **install plugin** cucumber for java