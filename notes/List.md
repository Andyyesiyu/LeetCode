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

List<List<Integer>> result;
List<Integer> temp;
result.add(new LinkedList<Integer>(temp));
```
