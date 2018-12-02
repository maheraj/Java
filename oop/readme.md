# OOP JAVA
## Prerequisite

### SOLID
In object-oriented computer programming, SOLID is a mnemonic acronym for five design principles intended to make software designs more understandable, flexible and maintainable. It is not related to the GRASP software design principles. The principles are a subset of many principles promoted by Robert C. Martin.

* S - Single responsibility principle
The single responsibility principle is a computer programming principle that states that every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class. such an entity can allow its behaviour to be extended without modifying its source code. The name open/closed principle has been used in two ways. (a) Inheritance (b) abstracted interfaces

* O - Open / Close principle
In object-oriented programming, the open/closed principle states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; 
* L - Liskov substitution principle
Substitutability is a principle in object-oriented programming stating that, in a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S

* I - Interface segregation principle
In the field of software engineering, the interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use. The principle states:
(a) High-level modules should not depend on low-level modules. Both should depend on abstractions.
(b) Abstractions should not depend on details. Details should depend on abstractions.


* D - Dependency inversion principle
In object-oriented design, the dependency inversion principle is a specific form of decoupling software modules. 

### Can we Overload or Override static methods in java ?
We can overload static method but we can not override static method. If we declare same static method in subclass then parent one will be hidden. It is called method hidding.

### How to create Immutable class in Java?
Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like String, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well.

**Following are the requirements:**
* Class must be declared as final (So that child classes can’t be created)
* Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
* A parameterized constructor
* Getter method for all the variables in it
* No setters(To not have option to change the value of the instance variable)

```
// An immutable class 
public final class Student 
{ 
    final String name; 
    final int regNo; 
  
    public Student(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 
```
### Static vs Dynamic Binding in Java
**Static Binding:** The binding which can be resolved at compile time by compiler is known as static or early binding. Binding of all the static, private and final methods is done at compile-time.

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

## Association, Composition and Aggregation in Java
**Association**
Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many. Composition and Aggregation are the two forms of association.

**Aggregation**
Aggregation is a special form of association.
* Has-A relationship
* unidirectional assocation - one way. department can have students but vice versa is not possible
* both entities can survive individually

**Composition**
Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
* part-of relationship
* In composition, both the entities are dependent on each other.
* When there is a composition between two entities, the composed object cannot exist without the other entity.
* Human, Heart relationship

### Aggregation vs Composition
* Dependency: Aggregation < Composition
* Type of Relationship: Has-a, part-of
* Type of association: week, strong



