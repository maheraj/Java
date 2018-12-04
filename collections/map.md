# Map in Java
## Map Interface in Java
An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
* package: java.util.Map;
* Some implementations allow null key and null value like the **HashMap** and **LinkedHashMap**, but some do not like the **TreeMap**.
* The order of a map depends on specific implementations, e.g **TreeMap and LinkedHashMap** have predictable order, while **HashMap** does not.
* There are two interfaces for implementing Map in java: **Map and SortedMap**, and three classes: **HashMap, TreeMap and LinkedHashMap**.

```
public interface Map<K,V>
```

## Map vs Dictionary
