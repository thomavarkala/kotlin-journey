# List

A `List` is an ordered collection of elements. Elements can be accessed using their index.

A `List` is **read-only** by default.

---

## 1. Creating a List

Use `listOf()` to create a read-only list.

```kotlin
val numbers = listOf(10, 20, 30, 40)
val names = listOf("Tom", "Sam", "John")
```

You can also create an empty list:

```kotlin
val numbers = emptyList<Int>()
```

---

## 2. Accessing Elements

Indexes start from `0`.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers[0]) // 10
println(numbers[2]) // 30
```

You can also use `get()`:

```kotlin
println(numbers.get(1)) // 20
```

### Safe Access

`getOrNull()` returns `null` instead of throwing an exception for an invalid index.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.getOrNull(1)) // 20
println(numbers.getOrNull(10)) // null
```

---

## 3. Size

Use `size` to get the number of elements.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 4. Checking Empty Lists

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.isEmpty())    // false
println(numbers.isNotEmpty()) // true
```

---

## 5. First and Last Elements

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.first()) // 10
println(numbers.last())  // 30
```

Safe versions:

```kotlin
println(numbers.firstOrNull()) // 10
println(numbers.lastOrNull())  // 30
```

For an empty list:

```kotlin
val numbers = emptyList<Int>()

println(numbers.firstOrNull()) // null
println(numbers.lastOrNull())  // null
```

---

## 6. Checking Elements

Use `contains()` or `in`.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.contains(20)) // true
println(30 in numbers)        // true
println(50 in numbers)        // false
```

You can also use `containsAll()`:

```kotlin
val numbers = listOf(10, 20, 30, 40)

println(numbers.containsAll(listOf(10, 30))) // true
```

---

## 7. Read-Only Means No Structural Changes

```kotlin
val numbers = listOf(10, 20, 30)

// numbers.add(40)    // Error
// numbers.remove(10) // Error
```

A read-only `List` does not provide modification operations.

> **Important:** Read-only does not necessarily mean immutable. A `List` interface only prevents modification through that reference.

---

## 8. Iterating Through a List

Using `for`:

```kotlin
val numbers = listOf(10, 20, 30)

for (number in numbers) {
    println(number)
}
```

Using `forEach`:

```kotlin
numbers.forEach {
    println(it)
}
```

Using index:

```kotlin
for (i in numbers.indices) {
    println(numbers[i])
}
```

Using `withIndex()`:

```kotlin
for ((index, value) in numbers.withIndex()) {
    println("$index -> $value")
}
```

---

## 9. Finding an Element

### `indexOf()`

Returns the first index of an element.

```kotlin
val numbers = listOf(10, 20, 30, 20)

println(numbers.indexOf(20)) // 1
println(numbers.indexOf(50)) // -1
```

### `lastIndexOf()`

Returns the last index of an element.

```kotlin
val numbers = listOf(10, 20, 30, 20)

println(numbers.lastIndexOf(20)) // 3
```

### `indexOfFirst()`

Find the index of the first element matching a condition.

```kotlin
val numbers = listOf(10, 15, 20, 25)

println(numbers.indexOfFirst { it > 18 }) // 2
```

### `indexOfLast()`

```kotlin
val numbers = listOf(10, 15, 20, 25)

println(numbers.indexOfLast { it > 10 }) // 3
```

---

## 10. Finding Elements by Condition

### `find()`

Returns the first matching element, or `null`.

```kotlin
val numbers = listOf(10, 15, 20, 25)

val result = numbers.find { it > 18 }

println(result) // 20
```

### `findLast()`

```kotlin
val numbers = listOf(10, 15, 20, 25)

println(numbers.findLast { it > 18 }) // 25
```

---

## 11. Checking Conditions

### `any()`

Returns `true` if at least one element matches.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.any { it > 25 }) // true
```

### `all()`

Returns `true` if every element matches.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.all { it > 5 }) // true
```

### `none()`

Returns `true` if no element matches.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.none { it < 0 }) // true
```

---

## 12. Counting Elements

### `count()`

```kotlin
val numbers = listOf(10, 20, 20, 30)

println(numbers.count()) // 4
```

You can also count using a condition:

```kotlin
println(numbers.count { it == 20 }) // 2
```

---

## 13. Filtering

### `filter()`

Returns a new list containing elements that match the condition.

```kotlin
val numbers = listOf(10, 15, 20, 25, 30)

val result = numbers.filter { it > 20 }

println(result) // [25, 30]
```

### `filterNot()`

```kotlin
val numbers = listOf(10, 15, 20, 25)

val result = numbers.filterNot { it > 20 }

println(result) // [10, 15, 20]
```

### `filterIndexed()`

The index is also available.

```kotlin
val numbers = listOf(10, 20, 30, 40)

val result = numbers.filterIndexed { index, value ->
    index % 2 == 0
}

println(result) // [10, 30]
```

---

## 14. Mapping Elements

### `map()`

Transforms every element and returns a new list.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val doubled = numbers.map { it * 2 }

println(doubled) // [2, 4, 6, 8]
```

### `mapIndexed()`

```kotlin
val numbers = listOf(10, 20, 30)

val result = numbers.mapIndexed { index, value ->
    index + value
}

println(result) // [10, 21, 32]
```

### `mapNotNull()`

Ignores `null` results.

```kotlin
val values = listOf("10", "20", "abc", "30")

val numbers = values.mapNotNull { it.toIntOrNull() }

println(numbers) // [10, 20, 30]
```

---

## 15. Sorting

### `sorted()`

Returns a new list in ascending order.

```kotlin
val numbers = listOf(40, 10, 30, 20)

val sortedNumbers = numbers.sorted()

println(sortedNumbers) // [10, 20, 30, 40]
```

The original list is unchanged:

```kotlin
println(numbers)        // [40, 10, 30, 20]
println(sortedNumbers)  // [10, 20, 30, 40]
```

### `sortedDescending()`

```kotlin
val numbers = listOf(40, 10, 30, 20)

val sortedNumbers = numbers.sortedDescending()

println(sortedNumbers) // [40, 30, 20, 10]
```

### `sortedBy()`

Sort using a property or calculated value.

```kotlin
val names = listOf("Tom", "Alexander", "Sam")

val result = names.sortedBy { it.length }

println(result) // [Tom, Sam, Alexander]
```

### `sortedByDescending()`

```kotlin
val names = listOf("Tom", "Alexander", "Sam")

val result = names.sortedByDescending { it.length }

println(result) // [Alexander, Tom, Sam]
```

### `sortedWith()`

Useful for custom sorting.

```kotlin
val numbers = listOf(10, 5, 30, 20)

val result = numbers.sortedWith(compareBy { it })

println(result) // [5, 10, 20, 30]
```

> **Key Point:** `sorted()` returns a new sorted list. It does not modify the original read-only `List`.

---

## 16. Taking Elements

### `take()`

Takes the first `n` elements.

```kotlin
val numbers = listOf(10, 20, 30, 40, 50)

println(numbers.take(3)) // [10, 20, 30]
```

### `takeLast()`

```kotlin
println(numbers.takeLast(2)) // [40, 50]
```

### `drop()`

Removes the first `n` elements from the result.

```kotlin
println(numbers.drop(2)) // [30, 40, 50]
```

### `dropLast()`

```kotlin
println(numbers.dropLast(2)) // [10, 20, 30]
```

---

## 17. Taking or Dropping While a Condition Is True

### `takeWhile()`

```kotlin
val numbers = listOf(2, 4, 6, 7, 8)

println(numbers.takeWhile { it % 2 == 0 })
// [2, 4, 6]
```

Stops at the first element that does not match.

### `dropWhile()`

```kotlin
val numbers = listOf(2, 4, 6, 7, 8)

println(numbers.dropWhile { it % 2 == 0 })
// [7, 8]
```

---

## 18. `distinct()`

Removes duplicate elements.

```kotlin
val numbers = listOf(10, 20, 10, 30, 20)

val result = numbers.distinct()

println(result) // [10, 20, 30]
```

### `distinctBy()`

Removes duplicates based on a selected property.

```kotlin
val names = listOf("Tom", "Sam", "Tim", "John")

val result = names.distinctBy { it.first() }

println(result) // [Tom, Sam, John]
```

---

## 19. `reversed()`

Returns a new list in reverse order.

```kotlin
val numbers = listOf(10, 20, 30)

val result = numbers.reversed()

println(result) // [30, 20, 10]
```

The original list is unchanged.

---

## 20. `asReversed()`

Provides a reversed view of the list.

```kotlin
val numbers = listOf(10, 20, 30)

val result = numbers.asReversed()

println(result) // [30, 20, 10]
```

---

## 21. `subList()`

Returns a portion of a list.

The `toIndex` is exclusive.

```kotlin
val numbers = listOf(10, 20, 30, 40, 50)

val result = numbers.subList(1, 4)

println(result) // [20, 30, 40]
```

---

## 22. `chunked()`

Splits a list into groups of a given size.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5, 6, 7)

val result = numbers.chunked(3)

println(result)
// [[1, 2, 3], [4, 5, 6], [7]]
```

---

## 23. `windowed()`

Creates sliding windows.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val result = numbers.windowed(3)

println(result)
// [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
```

You can specify the step:

```kotlin
val result = numbers.windowed(
    size = 3,
    step = 2
)

println(result)
// [[1, 2, 3], [3, 4, 5]]
```

---

## 24. `zip()`

Combines two lists element by element.

```kotlin
val names = listOf("Tom", "Sam", "John")
val ages = listOf(20, 25, 30)

val result = names.zip(ages)

println(result)
// [(Tom, 20), (Sam, 25), (John, 30)]
```

---

## 25. `unzip()`

Splits a list of pairs into two lists.

```kotlin
val data = listOf(
    "Tom" to 20,
    "Sam" to 25,
    "John" to 30
)

val (names, ages) = data.unzip()

println(names) // [Tom, Sam, John]
println(ages)  // [20, 25, 30]
```

---

## 26. `joinToString()`

Converts list elements into a string.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.joinToString())
// 10, 20, 30
```

You can customize the separator:

```kotlin
println(numbers.joinToString(" - "))
// 10 - 20 - 30
```

---

## 27. `sum()` and `sumOf()`

### `sum()`

For numeric lists:

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.sum()) // 60
```

### `sumOf()`

Useful when summing a property or calculated value.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.sumOf { it * 2 }) // 120
```

---

## 28. `average()`

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.average()) // 20.0
```

---

## 29. `minOrNull()` and `maxOrNull()`

```kotlin
val numbers = listOf(10, 30, 20)

println(numbers.minOrNull()) // 10
println(numbers.maxOrNull()) // 30
```

For an empty list, both return `null`.

```kotlin
val numbers = emptyList<Int>()

println(numbers.minOrNull()) // null
println(numbers.maxOrNull()) // null
```

---

## 30. `minByOrNull()` and `maxByOrNull()`

Find the element with the smallest or largest calculated value.

```kotlin
val names = listOf("Tom", "Alexander", "Sam")

println(names.minByOrNull { it.length }) // Tom
println(names.maxByOrNull { it.length }) // Alexander
```

---

## 31. `reduce()`

Combines elements from left to right.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val result = numbers.reduce { total, value ->
    total + value
}

println(result) // 10
```

> `reduce()` throws an exception if the list is empty.

---

## 32. `fold()`

Like `reduce()`, but you provide an initial value.

```kotlin
val numbers = listOf(1, 2, 3, 4)

val result = numbers.fold(0) { total, value ->
    total + value
}

println(result) // 10
```

Unlike `reduce()`, `fold()` can safely work with an empty list because an initial value is provided.

---

## 33. `groupBy()`

Groups elements using a key.

```kotlin
val names = listOf("Tom", "Sam", "Tim", "John")

val result = names.groupBy { it.first() }

println(result)
// {T=[Tom, Tim], S=[Sam], J=[John]}
```

---

## 34. `associateBy()`

Creates a map using a selected key.

```kotlin
val names = listOf("Tom", "Sam", "John")

val result = names.associateBy { it.length }

println(result)
```

If multiple elements produce the same key, the last element wins.

---

## 35. `partition()`

Splits a list into two lists based on a condition.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val (even, odd) = numbers.partition { it % 2 == 0 }

println(even) // [2, 4]
println(odd)  // [1, 3, 5]
```

---

## 36. `onEach()`

Performs an action for every element and returns the original list.

```kotlin
val numbers = listOf(1, 2, 3)

val result = numbers.onEach {
    println(it)
}

println(result) // [1, 2, 3]
```

It is useful for debugging or side effects in a chain.

---

## 37. `getOrElse()`

Provides a fallback value when an index is invalid.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.getOrElse(1) { -1 })  // 20
println(numbers.getOrElse(10) { -1 }) // -1
```

---

## 38. `elementAtOrNull()`

Gets an element by index and returns `null` if the index is invalid.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.elementAtOrNull(1))  // 20
println(numbers.elementAtOrNull(10)) // null
```

---

## 39. `random()`

Returns a random element.

```kotlin
val numbers = listOf(10, 20, 30, 40)

println(numbers.random())
```

For an empty list, `random()` throws an exception.

Use `randomOrNull()` if the list might be empty:

```kotlin
val numbers = emptyList<Int>()

println(numbers.randomOrNull()) // null
```