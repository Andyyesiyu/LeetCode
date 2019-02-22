# Map

## Methods

```java
boolean containsKey(Object key);
boolean containsValue(Object value);
V put(K key, V value);
```

## Tips

1. If the keys only have limited possibilities (and somehow have a order to index), for example all the characters, you can try an array instead.
   - However, if the number of possibilities is huge, a HashMap will be better.
2. If you want to preserve order, use a TreeMap!

   ```java
   Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
   // Or:
   NavigableMap nmap = map.descendingMap();

   for (Map.Entry<Integer, String> entry : map.entrySet()) {
           int key = entry.getKey();
           String value = entry.getValue();
   }
   ```
