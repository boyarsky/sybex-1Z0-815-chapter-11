# sybex-1Z0-815-chapter-11
Code and commands from OCP Oracle Certified Professional Java SE 11 Programmer I Study Guide:: Exam 1Z0-815 by Jeanne Boyarsky and Scott Selikoff

The code in chapter 11 (modules) is a lot of file creation. Additionally, the commands are hard to type in. Therefore we are providing a repository with the code from the book to facilitate running the example.

Also see:
* Our [main book page](https://www.selikoff.net/ocp11-1/)
* To buy the book: [Amazon](https://www.amazon.com/Oracle-Certified-Professional-Programmer-Study/dp/1119584701)

Below is an outline of the chapter and the commands. Note that in this github repo, the commands are one line so you can copy/paste them intro your command line. In the book, we used multiple lines for ease in reading/studying.

# Creating and Running a Modular Program
## Creating the files
See the feeding folder for module zoo.animal.feeding
## Compiling our first module
Compile program
```
javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
```
Alternate forms of javac command
```
javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java

javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java

javac -p mods -d feeding feeding/zoo/animal/feeding/Task.java feeding/module-info.java
```
## Running our first module
Run program
```
java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task
```
Alternate form of java command
```
java -p feeding -m zoo.animal.feeding/zoo.animal.feeding.Task
```
## Packaging our first module
Create jar
```
jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .
```
Run program from jar
```
java -p mods -m zoo.animal.feeding/zoo.animal.feeding.Task
```