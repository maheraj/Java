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

![Map Hirarchy in Java](map_hierarchy_in_java.png)

## Why and When to use Maps?
Maps are perfect to use for key-value association mapping such as dictionaries. The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys. Some examples are:

* A map of error codes and their descriptions.
* A map of zip codes and cities.

## Useful Methods in Map Interface
* public Object **put**(Object key, Object value): This method is used to insert an entry in this map.
* public void **putAll**(Map map): This method is used to insert the specified map in this map.
* public Object **remove**(Object key): This method is used to delete an entry for the specified key.
* public Object **get**(Object key):This method is used to return the value for the specified key.
* public boolean **containsKey**(Object key): This method is used to search the specified key from this map.
* public Set **keySet**(): This method is used to return the Set view containing all the keys.
* public Set **entrySet**(): This method is used to return the Set view containing all the keys and values.

## Map vs Dictionary
