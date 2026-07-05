# java-programs-sdet
A comprehensive collection of Java programs covering foundational core Java concepts, modern Java 8+ features, and essential Data Structures &amp; Algorithms (DSA), complete with detailed explanations for future reference.


# Java Programming Hub: Basics, Java 8+, and DSA 🚀

Welcome to my Java repository! This project is a curated, comprehensive collection of Java programs designed as a personal reference guide and a helpful resource for anyone looking to master Java. It covers everything from foundational concepts to modern Java 8+ features and core Data Structures & Algorithms (DSA)—all complete with clear code and detailed explanations.

---

## 📌 Repository Structure

The repository is organized logically into three main pillars:

### 1. 📂 Core & Basic Java
Perfect for brushing up on foundational programming concepts.
* **Basics:** Data types, variables, operators, and conditional loops (`if-else`, `for`, `while`).
* **Object-Oriented Programming (OOPs):** Inheritance, Polymorphism, Encapsulation, and Abstraction.
* **Core APIs:** String handling, Exception handling, and File I/O.

### 2. ⚡ Modern Java 8+ Features
Transitioning from traditional Java to functional, clean, and efficient modern development.
* **Lambda Expressions:** Writing concise, functional code.
* **Functional Interfaces:** Custom and built-in interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`).
* **Stream API:** Powerful data processing pipelines (filtering, mapping, reducing).
* **Optional Class:** Elegant null-pointer prevention.
* **Method References & Default Methods.**

### 3. 🧠 Data Structures & Algorithms (DSA)
Problem-solving implementations with step-by-step logic.
* **Data Structures:** Arrays, Linked Lists, Stacks, Queues, Trees, and Graphs.
* **Algorithms:** Searching (Linear, Binary) and Sorting (Bubble, Merge, Quick).
* **Concepts:** Recursion, Time & Space Complexity analysis.

---

## 💡 How to Use This Repo

Every program in this repository follows a clean blueprint:
1. **The Problem:** A clear statement of what the code achieves.
2. **The Code:** Documented, well-commented, and production-ready Java code.
3. **The Explanation:** A breakdown of *how* the logic works and the efficiency (Time/Space Complexity) of the solution.

Feel free to explore the folders, clone the repository, run the code locally, or use the explanations to prep for technical interviews!

---

## 🛠️ Tech Stack & Prerequisites

* **Language:** Java 8 or higher
* **IDE:** IntelliJ IDEA, Eclipse, or VS Code
* **Build Tool :** Maven 
---
⚙️ Prerequisites
Java 8 or later installed (java -version)

Maven installed (mvn -version)

Git installed (git --version)


🚀 How to Run
1. Clone the repository
bash
git clone https://github.com/<your-username>/java-programs-sdet.git
cd java-programs-sdet
2. Compile the project
bash
mvn compile
3. Run a program directly
If your main class is basic.HelloWorld:

bash
mvn exec:java -Dexec.mainClass="basic.HelloWorld"
4. Run tests
bash
mvn test
5. Package into JAR
bash
mvn clean package
This creates:

Code
target/java-programs-sdet-1.0-SNAPSHOT.jar
6. Run the JAR
bash
java -jar target/java-programs-sdet-1.0-SNAPSHOT.jar
👉 Make sure your pom.xml has the correct <mainClass> set (e.g., basic.HelloWorld) inside the Shade plugin configuration.

📝 Example Program
src/main/java/basic/HelloWorld.java:

java
package basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from basic package!");
    }
}


Running Different Programs
This project contains multiple packages (basic, dsa, java8) with independent classes that have their own main() methods. You can run any of them directly using Maven without changing the pom.xml.

Run a class from the basic package
bash
mvn exec:java -Dexec.mainClass="basic.HelloWorld"
Run a class from the dsa package
bash
mvn exec:java -Dexec.mainClass="dsa.ArrayDemo"
Run a class from the java8 package
bash
mvn exec:java -Dexec.mainClass="java8.StreamExamples"

📦 Packaging into JAR
If you want a single executable JAR, you can configure the pom.xml with one <mainClass> (e.g., basic.HelloWorld). Then build and run:

bash
mvn clean package
java -jar target/java-programs-sdet-1.0-SNAPSHOT.jar

👉 But if you have multiple entry points, it’s usually easier to run them with mvn exec:java as shown above, instead of rebuilding the JAR each time.

🧪 Testing
All test classes under src/test/java will be picked up automatically:

bash
mvn test

🔒 Git Ignore
The .gitignore file excludes IDE files and build artifacts:

Code
.idea/
*.iml
target/
*.log
This way, your README explains both approaches:

Quick run with mvn exec:java for any class.

Packaged JAR run for a single designated entry point.

That makes it clear for collaborators or interviewers who clone your repo.

Would you like me to also add a “Common Issues & Fixes” section (like handling ClassNotFoundException, cleaning target, or fixing Java version mismatches) so your README is extra helpful?

yes
Perfect — let’s add a “Common Issues & Fixes” section to your README so anyone using your repo can quickly troubleshoot. This makes your project look polished and professional.

⚠️ Common Issues & Fixes
1. ClassNotFoundException
Cause: The package name in your Java file doesn’t match the folder structure.
Fix: Ensure the first line of your file matches the directory.
Example:
File: src/main/java/basic/HelloWorld.java

java
package basic;
2. Unsupported major.minor version
Cause: Java version mismatch (e.g., compiling with Java 8 but running with Java 11).
Fix:

Check your Java version: java -version

Update pom.xml to match:

xml
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>
3. Old build artifacts causing errors
Cause: Stale files in target/.
Fix: Clean and rebuild:

bash
mvn clean compile
4. Running the wrong main class
Cause: Multiple classes with main() exist.
Fix: Use Maven Exec plugin to specify:

bash
mvn exec:java -Dexec.mainClass="basic.HelloWorld"
5. .idea folder or target/ committed accidentally
Cause: Missing .gitignore.
Fix: Add .gitignore:

Code
.idea/
*.iml
target/
Then remove from Git history:

bash
git rm -r --cached .idea target
git commit -m "Remove IDE and build files"
6. Tests not running
Cause: Test class name doesn’t follow convention.
Fix: Name test classes as ClassNameTest.java and place them under src/test/java.

✅ Quick Checklist
Always run mvn clean package before pushing.

Use mvn exec:java for multiple entry points.

Keep .gitignore updated to avoid committing IDE/build files.

Match package names with folder structure.

🔒 Git Ignore
The .gitignore file excludes IDE files and build artifacts:

Code
.idea/
*.iml
target/
*.log




This README gives anyone cloning your repo a step-by-step guide to build, test, and run your Maven-based Java programs.

⭐ **If you find this repository helpful for your learning or reference, don't forget to give it a star!**
