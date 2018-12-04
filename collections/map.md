# Map in Java
## Map Interface in Java
An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
* package: **java.util.Map**
* Some implementations allow null key and null value like the **HashMap** and **LinkedHashMap**, but some do not like the **TreeMap**.
* The order of a map depends on specific implementations, e.g **TreeMap** and **LinkedHashMap** have predictable order, while **HashMap** does not.
* There are two interfaces for implementing Map in java: **Map** and **SortedMap**, and three classes: **HashMap, TreeMap and LinkedHashMap**.

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

## SortedMap Interface in Java
SortedMap is an interface in collection framework. This interface extends Map inrerface and provides a total ordering of its elements (elements can be traversed in sorted order of keys).
The main characteristic of a SortedMap is that, it orders the keys by their natural ordering, or by a specified comparator. So consider using a TreeMap when you want a map that satisfies the following criteria:

* null key or null value are not permitted.
* The keys are sorted either by natural ordering or by a specified comparator.

### Useful Methods of SortedMap

* **subMap**(K fromKey, K toKey): Returns a view of the portion of this Map whose keys range from fromKey, inclusive, to toKey, exclusive.
* **headMap**(K toKey): Returns a view of the portion of this Map whose keys are strictly less than toKey.
* **tailMap**(K fromKey): Returns a view of the portion of this Map whose keys are greater than or equal to fromKey.
* **firstKey**(): Returns the first (lowest) key currently in this Map.
* **lastKey**(): Returns the last (highest) key currently in this Map.
* **comparator**(): Returns the Comparator used to order the keys in this Map, or null if this Map uses the natural ordering of its keys.
* **values**(): Returns a Collection view of the values contained in this map.
* **keySet**(): Returns a Set view of the keys contained in this map.
* **entrySet**(): Returns a Set view of the mappings contained in this map.

```
public interface SortedMap extends Map
{
    Comparator comparator();
    SortedMap subMap(K fromKey, K toKey);
    SortedMap headMap(K toKey);
    SortedMap tailMap(K fromKey);
    K firstKey();
    K lastKey();
}

// Java code to demonstrate SortedMap 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.SortedMap; 
import java.util.TreeMap; 

public class SortedMapExample 
{ 
	public static void main(String[] args) 
	{ 
		SortedMap<Integer, String> sm = 
					new TreeMap<Integer, String>(); 
		sm.put(new Integer(2), "practice"); 
		sm.put(new Integer(3), "quiz"); 
		sm.put(new Integer(5), "code"); 
		sm.put(new Integer(4), "contribute"); 
		sm.put(new Integer(1), "geeksforgeeks"); 
		Set s = sm.entrySet(); 

		// Using iterator in SortedMap 
		Iterator i = s.iterator(); 

		// Traversing map. Note that the traversal 
		// produced sorted (by keys) output . 
		while (i.hasNext()) 
		{ 
			Map.Entry m = (Map.Entry)i.next(); 

			int key = (Integer)m.getKey(); 
			String value = (String)m.getValue(); 

			System.out.println("Key : " + key + 
							" value : " + value); 
		} 
	} 
} 

//Output
Key : 1  value : geeksforgeeks
Key : 2  value : practice
Key : 3  value : quiz
Key : 4  value : contribute
Key : 5  value : code
```
## Map vs Dictionary
