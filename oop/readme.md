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

