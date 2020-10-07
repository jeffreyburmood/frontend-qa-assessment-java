
## Prerequisites

* Install [Git](https://github.com/saucelabs-training/demo-java/blob/master/docs/prerequisites.md#install-git)
* Install [IntelliJ (or another IDE)](https://github.com/saucelabs-training/demo-java/blob/master/docs/prerequisites.md#install-intellij)
* Install [JDK](https://github.com/saucelabs-training/demo-java/blob/master/docs/prerequisites.md#install-the-jdk)
* Install [Maven](https://github.com/saucelabs-training/demo-java/blob/master/docs/prerequisites.md#install-maven)

<br />

## Project Setup
* [Import the Project](#import-the-project)
* [Set Your Sauce Labs Credentials](#set-your-sauce-labs-credentials)
* [Run a Maven Test](#run-a-maven-test)
 
<br />


#### Import the Project

1. Create a directory on your machine.
2. Clone this repository into said directory.
    ```
    $ git clone git@github.com:cpothier/frontend-qa-assessment-java.git
    ```
2. Import the project into your IntelliJ (or IDE of your choice) as a **Maven Project**.
3. Click through the prompts, and confirm when it asks to **Import from Sources**
4. Choose the **selenium3-testng-framework** directory as the **root** directory of the project.


<br />

#### Run a Maven Test

1. Run the following command to update any package dependencies:
    ```
    $ mvn dependency:resolve
    ```
2. Then run the following command to compile your test code:
    ```
    $ mvn test-compile
    ```
3. Finally, run the following test to see if you've properly configured the test environment:
    ```
    $  mvn test

    ```
