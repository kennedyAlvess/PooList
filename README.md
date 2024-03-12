# Object-Oriented Programming (OOP) List Resolution

This project contains the resolution of the list proposed in class for the Object-Oriented Programming discipline.

## Description

The exercise list covers the fundamental concepts of OOP, including classes, objects, inheritance, polymorphism, encapsulation, among others. Each exercise is accompanied by a detailed description of the problem and the requirements to be implemented.

## Project Structure

The project is organized as follows:

- Introduction to Java
- Class Creation
- Array and ArrayList
- Class Reusability
- Abstract Classes
- Polymorphism and Interfaces
- Generic Collections
- Exceptions

## Switching to the "dev" Branch

To switch to the "dev" branch, where the most up-to-date code is being developed, follow the steps below:

1. Open the terminal or command prompt.
2. Navigate to the directory of your local repository using the `cd` command.
3. Execute the command `git checkout dev`.

After executing these steps, you will be on the "dev" branch and can work with the most updated code in development.

## Instructions to run the project with maven:

Make sure you have Maven and JDK installed on your system. You can check by running the command mvn -v in your terminal or command prompt. If Maven is not installed, you can download it from the Apache Maven website and follow the installation instructions.

- Install JDK: [JDK 21](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe)
- Install Apache Maven: [apache-maven-3.9.6-bin.zip](https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip)


Extract the maven files to a directory of your choice and configure the environment variable.

1. Right-click your computer icon and click Properties.
2. Click Advanced System Settings.
3. Click the Environment Variables button within the Advanced tab. 
5. Select the PATH environment variable from the list and click Edit.
6. Click the New button and add the maven bin folder path:
   - Example: ```C:\ProgramFiles\Java\apache-maven-3.9.6\bin```
7. Check if the JAVA_HOME environment variable exists.

- To test whether the maven setup worked, open your computer's command prompt and type ```mvn -v```.

Among your system's environment variables, check if there is already an environment variable called JAVA_HOME that contains the path to the JDK installed on your computer.

- You can check if you have jdk configured by running ```java --version``` in your terminal or command prompt.

If it does not exist, you need to create this new environment variable by clicking on New... and entering the name JAVA_HOME and the value with the path to the folder where your JDK is installed.
- Example: ```C:\ProgramFiles\Java\jdk.version```

-----
Open your terminal or command prompt and navigate to the root directory of your Maven project where the pom.xml file is present.

```cd path/to/ur/project```

Build the project by running the command ```mvn clean install```. This will compile the source code, run tests, and package the project into a JAR or WAR file.

Once the build is successful, you can run the project using the command ```mvn exec:java```.

Maven will execute your project and you should see the output in the terminal or command prompt.

That's it! You have successfully run the project.

