# List

## Implementations

- LinkedList
  - Quick for serial access.
- ArrayList
  - Quick for random access.

## Methods

```java
boolean	add(E e) # Appends the specified element to the end of this list (optional operation).
void add(int index, E element)
boolean	contains(Object o)
E	get(int index)
E	remove(int index)
boolean	remove(Object o)
int	size()
boolean	addAll(Collection<? extends E> c)

Object	clone() // Returns a shallow copy of this LinkedList.
/*
LinkedList sec_list = new LinkedList();
sec_list = (LinkedList) list.clone();
*/

// Better method for copying: using constructor.
// Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
LinkedList(Collection<? extends E> c)

List<List<Integer>> result;
List<Integer> temp;
result.add(new LinkedList<Integer>(temp));
```

## Notes

1. For LinkedList, you can always try to add a sentinel node to avoid special cases. (See 19)
   - Especially when you need to delete the first element.
