## Design Patterns

--------------------------------------------------------------

#### Creational patterns

--------------------------------------------------------------

In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

--------------------------------------------------------------

##### 1.Singleton

Ensure a class only has one instance, and provide a global point of access to it. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/singleton.png)
--------------------------------------------------------------

##### 2.Factory Method

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
 
 ![alt text](http://www.design-patterns-stories.com/assets/img/uml/factorymethod.png)
 --------------------------------------------------------------

##### 3.Abstract Factory

Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".

![alt text](http://www.design-patterns-stories.com/assets/img/uml/abstractfactory.png)
 --------------------------------------------------------------

##### 4.Builder

Separate the construction of a complex object from its representation so that the same construction process can create different representations. Note: Handles complex constructors, large number of parameters, immutability Short definition: Pattern for handling the construction of objects that might contain a lot of parameters, and we want to make the object immutable when we done the construction.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/builder.png)
 
 --------------------------------------------------------------

##### 5.Prototype

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. Prototype is often an alternative to Abstract Factory. Short definition: Used when the type of object to create is determined by a prototypical instance which is cloned to produce an new instance. Ofter prototype is used to get a unique instance of the same object. 
 
 ![alt text](http://www.design-patterns-stories.com/assets/img/uml/prototype.png) 
  --------------------------------------------------------------

#### Structural patterns

--------------------------------------------------------------

These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality.

--------------------------------------------------------------

##### 6.Adapter

Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. 
 
 ![alt text](http://www.design-patterns-stories.com/assets/img/uml/classadapter.png)
 
  --------------------------------------------------------------
  
 ##### 7.Bridge
 
 Decouple an abstraction from its implementation so that the two can vary independently. Short definition: The Bridge pattern is very similar to the Adapter with a main difference: bridge works with new code whereas an Adapter works with legacy code.
 
 
![alt text](http://www.design-patterns-stories.com/assets/img/uml/bridge.png)
--------------------------------------------------------------

##### 8.Composite

Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat Short definition: Composite is a hierarchical type pattern that deals with tree structures of information. individual objects and compositions of objects uniformly. Composite is often used with Iterator or Visitor.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/composite.png)
--------------------------------------------------------------

##### 9.Decorator

 Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. Structure diagrams of Composite and Decorator are similar 
 
 ![alt text](http://www.design-patterns-stories.com/assets/img/uml/decorator.png)
 --------------------------------------------------------------

##### 10.Facade

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/facade.png)
--------------------------------------------------------------

##### 11.Flyweight

Use sharing to support large numbers of fine-grained objects efficiently. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/flyweight.png)
--------------------------------------------------------------

##### 12.Proxy

Provide a surrogate or placeholder for another object to control access to it. Short Definition: Proxy - is a pattern that act as an interface to something else.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/proxy.png)
--------------------------------------------------------------

#### Behavioral patterns

--------------------------------------------------------------

In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

--------------------------------------------------------------

##### 13.Chain of Responsibility

 Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it. Short Definition: It's behavioral pattern that decouples request from a handling object in a chain of handlers util it is finally recognized.
 
 ![alt text](http://www.design-patterns-stories.com/assets/img/uml/chainofresponsibility.png)
 ------------------------------------
 
 ##### 14.Interpreter
 
  Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language. Short Definition: It's behavioral pattern that you use to represent the grammar of the language. 
  
   ![alt text](http://www.design-patterns-stories.com/assets/img/uml/interpreter.png)
   ----------------------
   
   ##### 15.Template Method
   
   Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure. Short Definition: Used to define an algorithm that allows subclasses to redefine parts of the algorithm without changing it's structure. 
   
   ![alt text](http://www.design-patterns-stories.com/assets/img/uml/templatemethod.png)
   ----------------------
   
   ##### 16.Command
   
  Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations. Short Definition: It's a design pattern that lets you encapsulate each request as an object.
  
  ![alt text](http://www.design-patterns-stories.com/assets/img/uml/command.png)
--------------

##### 17.Iterator

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation. Short Definition: It's a design pattern for providing navigation without exposing of a structure of an object. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/iterator.png)
   ----------------

##### 18.Mediator

Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. Short Definition: Pattern that used to define how objects interacts with one another without have them refer to each other explicitly.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/mediator.png)
   ----------------
   
##### 19.Memento

Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later. Short Definition: Pattern that used to externalize an object state usually to provide rollback functionality. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/memento.png)
--------

##### 20.Observer

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. Short Definition: Observer is a decoupling pattern, when we have a subject that need to be observed by one or more observers.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/observer.png)
------

##### 21.State

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class. Short Definition: Used when we need to represent state of an application. 

![alt text](http://www.design-patterns-stories.com/assets/img/uml/state.png)
-----

##### 22.Strategy

Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. Short Definition: Used when you want to enable the strategy or algorithm to be selected at runtime.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/strategy.png)
------

##### 23.Visitor

Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates. Short Definition: Way to separate an algorithm from an object structure.

![alt text](http://www.design-patterns-stories.com/assets/img/uml/visitor.png)
--------

#### Creational patterns:

    1. Singleton - the sole instance of a class
    2. Factory Method - subclass of object that is instantiated
    3. Abstract Factory - families of product objects
    4. Builder - how to composite object gets created
    5. Prototype - class of object that is instantiated
   --------
#### Structural patterns:
 
     6. Adapter - interface to an object
     7. Bridge - implementation of an object
     8. Composite - structure and composition of an object
     9. Decorator - responsibilities of an object without subclassing
    10. Facade - interface to a subsystem
    11. Flyweight - storage costs of objects
    12. Proxy - how to object is accessed; its lication
  --------
  
#### Behavioral patterns:
   
       13. Chain of Responsibility - object that can fulfill a request
       14. Interpreter - grammar and interpretation of a language
       15. Template Method - steps of an algorithm
       16. Command - when and how a request is fullfilled
       17. Iterator - how an aggregate's elements are accessed, traversed
       18. Mediator - how and which objects interact with each other
       19. Memento - what private information is stored outside an object, and when
       20. Observer - number of objects that depend on another object; how the dependent objects stay up to date
       21. State - states of an object
       22. Strategy - an algorithm
       23. Visitor - operations that can be applied to object(s) without changing their class(es)
