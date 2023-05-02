# Abstract Factory Design Pattern in Java
## Pattern 
The Abstract Factory design pattern is a creational pattern that provides an interface for creating families of related objects without specifying their concrete classes. It allows the client code to create objects without knowing their specific implementation details by using a common interface to create objects of different but related types.  

## Description
This package is an implementation of the abstract factory design pattern in Java.  
It contains 3 interfaces: `Chair`, `Table`, and `Bed`. Each interface has 2 implementations, a Wooden version and a Sturdy version.  
For example, Chair is implemented by WoodenChair and SturdyChair.

The package also contains a subpackage for factories. We have a factory interface with an abstract static method that returns a `WoodenFactory` or a `SturdyFactory` 
based on the argument passed to the function. The WoodenFactory returns wooden items only, while the SturdyFactory returns sturdy items only.

Finally, the package contains a Runner class that runs all the other classes. This class can be used to test and demonstrate the functionality of the package.

## Output
![image](https://user-images.githubusercontent.com/84196929/235719442-9e54f6bf-dd9f-465c-b8a4-dceb71b61aa6.png)
