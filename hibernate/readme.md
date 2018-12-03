# Hibernate

## Hibernate Inheritance Mapping
* MappedSuperclass
* Single Table
* Joined Table
* Table-Per-Class

### MappedSuperClass
Using the MappedSuperclass strategy, inheritance is only evident in the class, but not the entity model.

```
@MappedSuperclass
public class Person {
 
    @Id
    private long personId;
    private String name;
 
    // constructor, getters, setters
}

@Entity
public class MyEmployee extends Person {
    private String company;
    // constructor, getters, setters 
}

```

### Single Table
The Single Table strategy creates one table for each class hierarchy

```
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MyProduct {
    @Id
    private long productId;
    private String name;
 
    // constructor, getters, setters
}

@Entity
public class Book extends MyProduct {
    private String author;
}

@Entity
public class Pen extends MyProduct {
    private String color;
}

// by defalut Discriminator Value is class name
@Entity(name="products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type", discriminatorType=DiscriminatorType.INTEGER)
public class MyProduct {

}

@Entity
@DiscriminatorValue("1")
public class Book extends MyProduct{
}

@Entity
@DiscriminatorValue("2")
public class Pen extends MyProduct{
}
```

### Joined Table
Using this strategy, each class in the hierarchy is mapped to its table.

```
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
  @Id
    private long animalId;
    private String species;
}

@Entity
public class Pet extends Animal {
    private String name;
 
    // constructor, getters, setters
}
```

### Table Per Class
The Table Per Class strategy maps each entity to its table which contains all the properties of the entity, including the ones inherited.

```
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
    @Id
    private long vehicleId;
 
    private String manufacturer;
 
    // standard constructor, getters, setters
}

```
