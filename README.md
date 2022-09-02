# SofkaU: Polymorphism

This is the second assignment in the _SofkaU Software Development Course_ brought by Sofka University. It consists of a program that lets the user add, interact and see some info of different types of spacecrafts. The spacecrafts were classified according to [this](https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales/) article.

## Table of contents

  - [Program structure](#program-structure)
    - [Assignment class (main class)](#assignment-class-main-class)
    - [Objects](#objects)
    - [Methods](#methods)
  - [Program limitations](#program-limitations)
  - [License](#license)

## Program structure

This is a basic console-driven program that takes user input in the form of numeral options and written text and then transforms that input into what the user wants to do. It is executed using the main class called `Assignment.java` and it will keep executing for as long as the user wants it to. There is an option to exit the program when the user is done using it. The program will reset everytime it is launched, meaning data is stored only for as long as the program is running.

This program defines an abstract class named `Spacecraft` and three main objects that inherit the attributes and methods of the `Spacecraft` class. Each object has its own methods and attributes as well.

This program also contains three classes which contain static methods used to manipulate things such as user input, spacecraft info and more. The methods were classified in different classes according to the user's input in order to simplify code.

_<sup>Now that I think about it, I could have just done a class named "methods" or something and declare all the methods inside it, no need to create a class for each group of methods but hey, baby steps, am I right?.</sup>_


### Assignment class (main class)

It executes the program and basically what it does is:

* It adds the sample data as soon as the program starts
* Displays the first menu to let the user type what he wants to do
* Executes the correct method according to the user input
* Displays the information as cleanly as possible in the console to improve user readability
  
### Objects

The objects in this program are defined as each spacecraft category. In the article in which the program was based, it is possible to classify the different types of spacecrafts there are into 3 categories:

* Shuttles (Also known as launch vehicles)
* Manned spacecrafts (Design to send people to and from space)
* Unmanned spacecrafts (Mostly science and communications satellites)

Each object has inherited attributes and methods, individual attributes and a method to add the sample data that the program uses to show some examples of the information about the different types of spacecrafts.

### Methods

The methods are defined inside classes that correspond to the initial user input. Each one of these classes contains one or more methods necessaries to execute the desired user action.

## Program limitations

The program was made trying to comply with the requirements of the assignment. It contains some Java functionality that is not being evaluated in this assignment, but this was done purely to improve the program execution and the user experience.

Similarly, the program does not contain concepts or methods that would have made the program better in some aspects, this, again, is because the program is only trying to do what it was asked in the assignment.

## License

You are free to use this program as you like. This project is licensed under the terms of the [MIT](https://github.com/IgorAntun/node-chat/blob/master/LICENSE) license. 