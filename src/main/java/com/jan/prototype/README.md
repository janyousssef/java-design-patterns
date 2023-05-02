# Prototype Pattern in Java
## Pattern
The Prototype pattern is a creational pattern that allows creating new objects by copying or cloning existing object. 
It provides a mechanism for creating new objects based on existing ones, with the same state and properties. 
This pattern promotes efficiency and reduces complexity by allowing the creation of new objects without explicitly specifying their concrete classes, 
which makes it easier to add new types of objects to the system.  
## Description
This package is an implementation of the prototype design pattern in Java. 
It contains an abstract Shape and a concrete implementation Circle that extends Shape.

The Circle class implements the clone method,
This can be used to create new Circle objects based on an existing one, 
without going through the expensive process of creating a new object from scratch.

The package also contains a Runner class that demonstrates the functionality of the Circle class.
The Runner creates an instance of Circle and clones it to create a new object with the same properties as the original, 
and illustrates that they are in fact not the same object.
## Output
![image](https://user-images.githubusercontent.com/84196929/235734404-73db0714-744a-4a6e-939f-2fccca2f6e25.png)
