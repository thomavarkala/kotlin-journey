# Collection Functions

Kotlin provides many functions for filtering, transforming, searching, sorting, and aggregating collections.

---

## 1. `filter()`

Returns elements that satisfy a condition.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val result = numbers.filter { it % 2 == 0 }

println(result)
```

Output:

```text
[2, 4]
```

---

## 2. `map()`

Transforms every element.

```kotlin
val numbers = listOf(1, 2, 3)

val result = numbers.map { it * 2 }

println(result)
```

Output:

```text
[2, 4, 6]
```

---

## 3. `forEach()`

Performs an action for every element.

```kotlin
val numbers = listOf(10, 20, 30)

numbers.forEach {
    println(it)
}
```

---

## 4. `find()`

Returns the first element matching a condition, or `null`.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val result = numbers.find { it > 2 }

println(result) // 3
```

---

## 5. `first()` and `last()`

Returns the first or last element.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.first()) // 10
println(numbers.last())  // 30
```

With conditions:

```kotlin
println(numbers.first { it > 10 }) // 20
```

For nullable results when the collection may be empty, use `firstOrNull()` or `lastOrNull()`.

```kotlin
val numbers = emptyList<Int>()

println(numbers.firstOrNull()) // null
println(numbers.lastOrNull())  // null
```

---

## 6. `any()`, `all()`, and `none()`

`any()` checks whether at least one element matches.

```kotlin
val numbers = listOf(1, 2, 3, 4)

println(numbers.any { it > 3 }) // true
```

`all()` checks whether every element matches.

```kotlin
println(numbers.all { it > 0 }) // true
```

`none()` checks whether no elements match.

```kotlin
println(numbers.none { it < 0 }) // true
```

---

## 7. `count()`

Counts elements matching a condition.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

println(numbers.count { it % 2 == 0 }) // 2
```

Without a condition, it returns the collection size.

```kotlin
println(numbers.count()) // 5
```

---

## 8. `sum()` and `average()`

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.sum())     // 60
println(numbers.average()) // 20.0
```

---

## 9. `minOrNull()` and `maxOrNull()`

Returns the smallest or largest element, or `null` for an empty collection.

```kotlin
val numbers = listOf(10, 5, 30, 20)

println(numbers.minOrNull()) // 5
println(numbers.maxOrNull()) // 30
```

---

## 10. `sorted()` and `sortedDescending()`

```kotlin
val numbers = listOf(30, 10, 20)

println(numbers.sorted())
// [10, 20, 30]

println(numbers.sortedDescending())
// [30, 20, 10]
```

These return a new sorted list and do not modify the original collection.

For sorting by a property or calculated value, use `sortedBy()`.

```kotlin
val words = listOf("cat", "elephant", "dog")

val result = words.sortedBy { it.length }

println(result)
// [cat, dog, elephant]
```

---

## 11. `reversed()`

Returns the elements in reverse order.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.reversed())
// [30, 20, 10]
```

This returns a new list and does not modify the original collection.

---

## 12. `distinct()`

Removes duplicate elements.

```kotlin
val numbers = listOf(1, 2, 2, 3, 3, 3)

println(numbers.distinct())
```

Output:

```text
[1, 2, 3]
```

---

## 13. `contains()`

Checks whether an element exists in the collection.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.contains(20)) // true
println(numbers.contains(50)) // false
```

The `in` operator can also be used.

```kotlin
println(20 in numbers) // true
```

---

## 14. `indexOf()` and `lastIndexOf()`

Returns the index of an element.

```kotlin
val numbers = listOf(10, 20, 30, 20)

println(numbers.indexOf(20))     // 1
println(numbers.lastIndexOf(20)) // 3
```

Returns `-1` if the element is not found.

```kotlin
println(numbers.indexOf(50)) // -1
```

---

## 15. `joinToString()`

Converts collection elements into a string.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.joinToString(" "))
```

Output:

```text
10 20 30
```

You can customize the output:

```kotlin
println(numbers.joinToString(", ", "[", "]"))
```

Output:

```text
[10, 20, 30]
```

---

## 16. `reduce()`

Combines all elements into a single result.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val result = numbers.reduce { total, number ->
    total + number
}

println(result) // 10
```

The accumulator starts with the first element.

Conceptually:

```text
1 + 2 = 3
3 + 3 = 6
6 + 4 = 10
```

> `reduce()` throws an exception if the collection is empty.

---

## 17. `fold()`

Similar to `reduce()`, but allows you to provide an initial value.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val result = numbers.fold(0) { total, number ->
    total + number
}

println(result) // 10
```

The `0` is the initial accumulator value.

`fold()` is useful when you need to start the calculation from a specific value or safely process an empty collection.

---

## 18. `groupBy()`

Groups elements based on a key.

```kotlin
val words = listOf("apple", "ant", "banana", "ball")

val result = words.groupBy { it.first() }

println(result)
```

Output:

```text
{a=[apple, ant], b=[banana, ball]}
```

---

## 19. `associateWith()`

Creates a map using collection elements as keys.

```kotlin
val names = listOf("Tom", "Sam")

val result = names.associateWith { it.length }

println(result)
```

Output:

```text
{Tom=3, Sam=3}
```

---

## 20. `associateBy()`

Creates a map using a property or calculated value as the key.

```kotlin
val names = listOf("Tom", "Sam", "John")

val result = names.associateBy { it.length }

println(result)
```

> If multiple elements produce the same key, the last element replaces the previous one.

---

## 21. `getOrDefault()`

Returns the value associated with a key, or a default value if the key does not exist.

```kotlin
val scores = mapOf(
    "Tom" to 10,
    "Sam" to 20
)

println(scores.getOrDefault("Tom", 0))  // 10
println(scores.getOrDefault("John", 0)) // 0
```

This is especially useful when working with frequency maps.

```kotlin
val frequency = mutableMapOf<Char, Int>()

val ch = 'a'

frequency[ch] = frequency.getOrDefault(ch, 0) + 1

println(frequency)
// {a=1}
```

---

## 22. `getOrPut()`

Returns the existing value for a key or inserts and returns a new value if the key does not exist.

```kotlin
val map = mutableMapOf<String, MutableList<Int>>()

map.getOrPut("even") { mutableListOf() }.add(2)
map.getOrPut("even") { mutableListOf() }.add(4)

println(map)
// {even=[2, 4]}
```

This is useful when building grouped data.

---

## 23. Chaining Functions

Collection functions can be combined.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5, 6)

val result = numbers
    .filter { it % 2 == 0 }
    .map { it * 10 }

println(result)
```

Output:

```text
[20, 40, 60]
```

More functions can be chained together:

```kotlin
val numbers = listOf(5, 2, 8, 2, 1, 8)

val result = numbers
    .filter { it > 2 }
    .distinct()
    .sorted()

println(result)
// [5, 8]
```

> **Key Point:** Collection functions make it easy to search, filter, transform, sort, group, and aggregate data without manually managing indexes. These functions are especially useful when solving Kotlin problems involving arrays, lists, sets, and maps.