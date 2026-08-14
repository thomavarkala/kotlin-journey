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

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.first()) // 10
println(numbers.last())  // 30
```

With conditions:

```kotlin
println(numbers.first { it > 10 }) // 20
```

---

## 6. `any()` and `all()`

`any()` checks whether at least one element matches.

```kotlin
val numbers = listOf(1, 2, 3, 4)

println(numbers.any { it > 3 }) // true
```

`all()` checks whether every element matches.

```kotlin
println(numbers.all { it > 0 }) // true
```

---

## 7. `count()`

Counts elements matching a condition.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

println(numbers.count { it % 2 == 0 }) // 2
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

These return a new sorted list.

---

## 11. `reversed()`

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.reversed())
// [30, 20, 10]
```

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

## 13. `joinToString()`

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

## 14. `groupBy()`

Groups elements based on a key.

```kotlin
val words = listOf("apple", "ant", "banana", "ball")

val result = words.groupBy { it.first() }

println(result)
```

---

## 15. `associateWith()`

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

## 16. Chaining Functions

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

> **Key Point:** Collection functions make it easy to search, filter, transform, sort, and aggregate data without manually managing indexes.