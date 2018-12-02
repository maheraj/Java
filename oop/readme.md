# OOP JAVA

## Class
* Modifiers
* Class Name
* Superclass - extends
* Interfaces - implements
* Body

## Object
* State
* Behavior
* Identity

## Initializing an Object
* new - keyword
* Default Constructor
* Parameterized Constructor

## Anonymous objects
Anonymous objects are the objects that are instantiated but are not stored in a reference variable.

## How are Java objects stored in memory?
In Java, all objects are dynamically allocated on Heap.

## Different ways to create objects in Java?
* Using new Keyword - Object obj = new Object()
* New Instance - Class cls = Class.forName("Object"); Object obj = cls.newInstance();
* clone() method - JVM creates a new object and copies all content of the previous object into it. It does not invoke any constructor. To use clone() on a object we need to implement Clonable and define the clone() method.
* Deserialization - serialize and then deserialize an object, JVM creates a separate object. JVM does not use any constructor call. To deserialize we need to implement the serializable interface
* Reflection

## How to swap or exchange objects in Java?
Solution is to use Wrapper Class.

## Pillars of OOP
* Inheritance
* polymorphism
* Encapsulation

## Inheritance of Java
* Inherit fields and methods
* Super Class - base class or parent class
* Sub Class - derived class or sub child class
* Reusability
* extends - keyword
In practice, inheritance and polymorphism are used together in java to achieve fast performance and readability of code. Java does not support multiple inheritance with classes. But it support with interfaces.
### Types of Inheritance in Java
* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance
* Multiple Inheritance (Through Interfaces)
* Hybrid Inheritance(Through Interfaces)

### Important facts about inheritance in Java
* Default superclass (Object) - except Object
* Superclass can only be one - does not support multiple inheritance with class
* Constructor is not inherited as it is not a member of the class
* Inheritance inherit fields, methods, nested classes
* Private members are not inherited
* Static fields and methods are not inherited (?)

## Encapsulation
Encapsulation is defined as the wrapping up of data under a single unit. it is a protective shield that prevents the data from being accessed by the code outside this shield.
* Data Hiding
* Getter, Setter - Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
* Allows to make variables Read Only or write only - using geter and setter method
* Reusability and easy to change
* easy for unit testing


