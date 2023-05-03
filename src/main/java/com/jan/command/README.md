# Command Pattern in Java
## Description
The Command pattern is a behavioral design pattern that encapsulates a request or command as an object,  
allowing the request to be passed as a method argument, queued, logged, or otherwise manipulated.  
It decouples the object that invokes the request from the one that knows how to perform it, promoting loose coupling, separation of concerns, and flexibility in the design.

## Description
This package contains the implementation of the Command pattern in Java.
It includes a bankcommands sub-package that contains the `Command` interface and two concrete
implementations: `DepositMoney` and `TransferMoney`  
Additionally, there is a domain sub-package that includes the `User` class and the `BankCommandInvoker` class.
Finally, there is a runner class that demonstrates how the Command pattern can be used to provide do/undo and logging functionality.

## Output
![image](https://user-images.githubusercontent.com/84196929/235813878-22ca3ec3-8de6-46b9-8427-f08c00338650.png)
