# HashMap

## Methods

```java
boolean containsKey(Object key);
boolean containsValue(Object value);
V put(K key, V value);
```

## Tips
1. If the keys only have limited possibilities (and somehow have a order to index), for example all the characters, you can try an array instead. 
    - However, if the number of possibilities is huge, a HashMap will be better.