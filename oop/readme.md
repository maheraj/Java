# OOP JAVA
## Prerequisite

### Static vs Dynamic Binding in Java
**Static Binding:** The binding which can be resolved at compile time by compiler is known as static or early binding. Binding of all the static, private and final methods is done at compile-time 
**Dynamic Binding:** In Dynamic binding compiler doesn’t decide the method to be called. Overriding is a perfect example of dynamic binding. In overriding both parent and child classes have same method . Let’s see by an example

### Using final with Inheritance in Java
final is a keyword in java used for restricting some functionalities. We can declare variables, methods and classes with final keyword.
* Using final with inheritance - declaring a method final will restrict sub classes to use the same implementation. final will now allow to override
* Using final to Prevent Inheritance - A finla class can not be subclass and any other class can not extend it. This is particularly useful, for example, when creating an immutable class like the predefined String class.
* Declaring a class as final implicitly declares all of its methods as final, too
* It is illegal to declare a class as both abstract and final since an abstract class is incomplete by itself and relies upon its subclasses to provide complete implementations.
* Using final to Prevent Overriding - When a method is declared as final then it cannot be overridden by subclasses.
### Checked vs Unchecked Exceptions in Java
* Unchecked Exception: are not checked at compile time - Error and RuntimeException, and their subclasses are unchecked. Ex: IOException
* Checked Exception: checked at compile time. All exceptions under Throwable except Error and RuntimeExceptions and their subclasses. Ex: ArithmeticException

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
* Abstraction

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

## Abastraction in Java
Only essential details are displayed to the user. Ex: Car is viewed as a car instead of its individual component. Data Abstraction can be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. A driver know pressing break will slow down the car. But he does not know how on pressing the break slow down the car.

* Abastraction in Java achieved by interface and abstract class. 
* 100% abstraction can be achieved by interface.
* Abstract Class - abstract keyword
* Abstract Method - without implementation
* No object of abstract class - no new operator
* Abstract class can have parameterized constructor and default constructor is always there.

### When to use abstract classes and abstract methods with an example
Shape, Circle, Rectangle example. Shape is abstract class. Circle and Rectangle are sub class of shape. Shape has area() abstract method. Circle and Rectangle has implemented area() method.

### Encapsulation vs Data Abstraction
* Encapsulation is data hiding (inforamtion hiding) while abstraction is details hiding (implementation hiding)
* While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation.

### Advantages of Abstraction
* reduces the complexity of viewing the things
* Avoids code duplication and increase resuablility
* Helps to increase security of and application or program or program as only important details are provided to the user.

## Polymorphism in Java
* Method Overloading - compile time Polymorphism
* Method Overriding - Run time Polymorphism

### Overriding in Java
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
* Method of sub class override method of super class

### Covariant return types in Java
Before JDK 5.0, it was not possible to override method by changing the return type. Now it is possible to use different return type for a overriding method in child class. But return time must be sub type. int(parent) => short(child)
* Specific return type
* No type casting issue
* Prevent run-time class cast exceptions

### Rules for method overriding
* Overriding and Access-Modifiers - more access not less. like if parent method is protected then child method can not be made private. It can be made public.
* Final methods can not be overridden
* Static methods can not be overridden(Method Overriding vs Method Hiding) 
* Private methods can not be overridden
* The overriding method must have same return type (or subtype) 
* Invoking overridden method from sub-class - supper.show()
* Overriding and constructor - can not override constructor.
* Overriding and Exception-Handling - (a) parent method does not throw, child method can only through unchecked exception. (b) parent method through, child method can ignore throwing. child method can through same or sub class exception

## Overloading in Java
Overloading allows different methods to have same name, but different signatures where signature can differ by number of input parameters or type of input parameters or both. Overloading is related to compile time (or static) polymorphism.
* Can we overload methods on return type? - NO
* Can we overload static methods? - YES
* Can we overload methods that differ only by static keyword? - NO
* Can we overload main() in Java? - Yes
