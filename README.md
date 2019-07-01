## Design Patterns

--------------------------------------------------------------

####Creational patterns

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