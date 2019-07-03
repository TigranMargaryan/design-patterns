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