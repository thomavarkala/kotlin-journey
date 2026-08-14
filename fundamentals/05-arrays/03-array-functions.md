# Array Functions

Kotlin provides useful functions and properties for working with arrays.

---

## 1. `size`

Returns the number of elements.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 2. `first()` and `last()`

Return the first and last elements.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.first()) // 10
println(numbers.last())  // 30
```

---

## 3. `contains()`

Checks whether an element exists.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.contains(20)) // true
println(numbers.contains(50)) // false
```

You can also use `in`:

```kotlin
println(20 in numbers) // true
```

---

## 4. `indexOf()`

Returns the index of the first matching element.

```kotlin
val numbers = intArrayOf(10, 20, 30, 20)

println(numbers.indexOf(20)) // 1
println(numbers.indexOf(50)) // -1
```

---

## 5. `lastIndexOf()`

Returns the index of the last matching element.

```kotlin
val numbers = intArrayOf(10, 20, 30, 20)

println(numbers.lastIndexOf(20)) // 3
```

---

## 6. `sum()`

Returns the sum of the elements.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.sum()) // 60
```

---

## 7. `minOrNull()` and `maxOrNull()`

Find the smallest and largest elements.

```kotlin
val numbers = intArrayOf(10, 5, 30, 20)

println(numbers.minOrNull()) // 5
println(numbers.maxOrNull()) // 30
```

For an empty array, these return `null`.

---

## 8. `average()`

Returns the average.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.average()) // 20.0
```

---

## 9. `count()`

Returns the number of elements.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.count()) // 3
```

You can also count elements matching a condition:

```kotlin
println(numbers.count { it > 15 }) // 2
```

---

## 10. `reversedArray()`

Creates a new array with the elements in reverse order.

```kotlin
val numbers = intArrayOf(10, 20, 30)

val reversed = numbers.reversedArray()

println(reversed.contentToString())
```

Output:

```text
[30, 20, 10]
```

---

## 11. `sortedArray()`

Creates a sorted copy of the array.

```kotlin
val numbers = intArrayOf(30, 10, 20)

val sorted = numbers.sortedArray()

println(sorted.contentToString())
```

Output:

```text
[10, 20, 30]
```

---

## 12. `contentToString()`

Converts the array contents into a readable string.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.contentToString())
```

Output:

```text
[10, 20, 30]
```

---

## 13. `copyOf()`

Creates a copy of an array.

```kotlin
val numbers = intArrayOf(10, 20, 30)

val copy = numbers.copyOf()

println(copy.contentToString())
```

You can also change the size:

```kotlin
val copy = numbers.copyOf(5)

println(copy.contentToString())
```

Output:

```text
[10, 20, 30, 0, 0]
```

> Most array functions that transform or sort an array return a new array rather than changing the original.