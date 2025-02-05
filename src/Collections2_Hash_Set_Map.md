
# Collections Part 2: HashMap and HashSet Core Concepts

content:
- Hashing Fundamentals
- Hash Tables
- Collision Handling
- HashMap vs HashSet
- Implementation Details
- Working with HashMaps
  -- Basic Operations
  -- Iteration Methods
- Best Practices
  -- Key Considerations
  -- Performance Optimization
- Common Pitfalls and Solutions
  -- Mutable Keys
  -- Null Handling


## Core Concepts

### Hashing Fundamentals
- Hashing maps values to integer indices in an array
- Hash function: algorithm converting values to array indices
- Basic integer hash: `index = value % array_length`  ([[modulo - hash function]])
- Every Java object has a `hashCode()` method returning an integer

### Hash Tables
- Underlying structure for HashMap and HashSet
- Uses array to store elements via hashing
- Load factor affects performance (elements/array size)
- Provides O(1) average case for add/remove/contains

### Collision Handling
1. Collision: when multiple elements hash to same index
2. Resolution Methods:
   - Linear Probing: check next available slot
   - Chaining: maintain linked list at each index
3. Chaining Benefits:
   - Avoids clustering problems
   - No "running out" of space
   - Better for high load factors

### HashMap vs HashSet
- HashSet: stores unique elements
- HashMap: stores key-value pairs
- Both use hashing for element organization
- Both don't maintain insertion order

## Implementation Details

### HashMap Internal Structure
```java
index | value
-------------------
0     | null
1     | Entry("key1", value1) -> Entry("key2", value2)
2     | null
3     | Entry("key3", value3)
```

### Key Operations
```java
// HashMap
put(K key, V value)     // O(1) average
get(K key)              // O(1) average
remove(K key)           // O(1) average
containsKey(K key)      // O(1) average

// HashSet
add(E element)          // O(1) average
remove(E element)       // O(1) average
contains(E element)     // O(1) average
```

## StudentGrades Example Analysis

### Key Implementation Points
1. Creation and Basic Operations:
   ```java
   HashMap<String, Integer> grades = new HashMap<>();
   grades.put("Alice", 85);           // Add entry
   int grade = grades.get("Alice");   // Retrieve
   grades.remove("Alice");            // Remove entry
   ```

2. Iteration Methods:
   ```java
   // Method 1: Entry Set
   for (Map.Entry<String, Integer> entry : grades.entrySet()) {
       String student = entry.getKey();
       int grade = entry.getValue();
   }

   // Method 2: Key Set
   for (String student : grades.keySet()) {
       int grade = grades.get(student);
   }
   ```

### Best Practices
1. Key Considerations:
   - Use immutable keys when possible
   - Override hashCode() and equals() for custom key objects
   - Consider initial capacity for known size
   
2. Performance Implications:
   - Avoid frequent resizing
   - Monitor load factor
   - Consider collision probability

## Common Pitfalls
1. Mutable Keys:
   ```java
   // DON'T: Using mutable objects as keys
   HashMap<List<String>, Integer> map = new HashMap<>();
   
   // DO: Use immutable keys
   HashMap<String, Integer> map = new HashMap<>();
   ```

2. Null Handling:
   ```java
   // HashMap allows null keys and values
   grades.put(null, null);  // Legal
   
   // HashSet allows single null element
   HashSet<String> set = new HashSet<>();
   set.add(null);  // Legal
   ```

3. Initial Capacity:
   ```java
   // Better performance for known size
   HashMap<String, Integer> grades = new HashMap<>(expectedSize);
   ```
