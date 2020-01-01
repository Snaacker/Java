# Abstract factorry pattern   

![alt text](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg "Abstract Factory Pattern")   
Source: Tutorialspoint.com   

## Pros:   

1. Allows you to hide implementation of an application seam (the core interfaces that make up your application)   
2. Allows you to easily test the seam of an application (that is to mock/stub) certain parts of your application so you can build and test the other parts   
3. Allows you to change the design of your application more readily, this is known as loose coupling   

## Cons   

1. Makes code more difficult to read as all of your code is behind an abstraction that may in turn hide abstractions.   
2. Can be classed as an anti-pattern when it is incorrectly used, for example some people use it to wire up a whole application when using an IOC container, instead use Dependency Injection.   

