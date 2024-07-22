# appium-java
Mobile Automation (Android)

## Pre-requisites
- Make sure to **have applied** the [first prerequisites](https://github.com/mrisqiamiruladieb/appium-java/tree/master?tab=readme-ov-file#pre-requisites)
- Go to **pom.xml** *add dependencies tag* and *add the following dependencies* to it:
    - Go to [Cucumber Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java) and [Cucumber JUnit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit), *copy* the content on **the Maven navbar** both, and *paste* it inside the dependencies tag
    - Click *Load Maven Changes (logo)* to install or sync the dependency

## Steps
- _BDD_
  - **Create** a scenario file. _Example:_ src/test/java/cucumber/features/**Register.feature**
  - **Create** step def script file by **hovering** over _the step scenario_ in _scenario.feature_ (**lamp icon**) or create manually. _Example:_ src/test/java/cucumber/stepDef/**MyStepdefs.java**
- _TDD_
  - **Create** a scenario data file. _Example:_ src/test/java/cucumber/features/**RegisterTDD.feature**
  - **Create** step def tdd script file by **hovering** over _the step scenario_ in _scenario.feature_ (**lamp icon**) or create manually. _Example:_ src/test/java/cucumber/stepDef/**MyStepdefs.java**

## Run Test
  - _Method 1_
    - **Click** _run_ (**play icon**) on **scenario.feature**
  - _Method 2_
    - **Create** a runner file. _Example:_ src/test/java/cucumber/runner/**runner.java**
    - **Click** _run_ (**play icon**) on **runner.java**

## HTML report
- **After** _running_ with _method 2_
- **Open** the generated _html report_ in a **browser** (_the file path_ in runner.java)

## Helper
- ([Reference](https://github.com/mrisqiamiruladieb/myskill-live-CucumberTest/blob/master/README.md))

## Issues and Solutions
- **No suggestion** to _create step def_ when **hovering** over _scenario.feature_ (**lamp icon**)
  - _Solution:_ **install plugin** cucumber for java
- Run test **method 1** error
  - _Solution:_ **Click** _run_ (**play icon**) &rarr; **Debug** on **scenario.feature**