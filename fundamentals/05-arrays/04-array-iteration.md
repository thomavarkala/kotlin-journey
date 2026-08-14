# Array Iteration

Arrays can be traversed using `for`, indexes, `forEach`, and other iteration methods.

---

## 1. Using `for`

The simplest way to iterate over an array.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (number in numbers) {
    println(number)
}
```

---

## 2. Using Indexes

Use `indices` when you need the index.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (i in numbers.indices) {
    println("$i -> ${numbers[i]}")
}
```

Output:

```text
0 -> 10
1 -> 20
2 -> 30
```

---

## 3. Using `until`

You can iterate using the array size.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (i in 0 until numbers.size) {
    println(numbers[i])
}
```

`indices` is usually cleaner:

```kotlin
for (i in numbers.indices) {
    println(numbers[i])
}
```

---

## 4. `withIndex()`

Use `withIndex()` when you need both the index and value.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for ((index, value) in numbers.withIndex()) {
    println("$index -> $value")
}
```

---

## 5. `forEach`

`forEach` executes a block for every element.

```kotlin
val numbers = intArrayOf(10, 20, 30)

numbers.forEach {
    println(it)
}
```

You can give the element a meaningful name:

```kotlin
numbers.forEach { number ->
    println(number)
}
```

---

## 6. `forEachIndexed`

Use `forEachIndexed` when you need both the index and value.

```kotlin
val numbers = intArrayOf(10, 20, 30)

numbers.forEachIndexed { index, value ->
    println("$index -> $value")
}
```

---

## 7. Reverse Iteration

Use `reversedArray()` or a reversed index range.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (i in numbers.indices.reversed()) {
    println(numbers[i])
}
```

Output:

```text
30
20
10
```

---

## 8. Iterating with a Step

You can skip elements using `step`.

```kotlin
val numbers = intArrayOf(10, 20, 30, 40, 50)

for (i in numbers.indices step 2) {
    println(numbers[i])
}
```

Output:

```text
10
30
50
```

---

## 9. Iteration with Conditions

You can combine iteration with `if`.

```kotlin
val numbers = intArrayOf(10, 15, 20, 25, 30)

for (number in numbers) {
    if (number % 2 == 0) {
        println(number)
    }
}
```

Output:

```text
10
20
30
```

---

## 10. Nested Array Iteration

Useful for two-dimensional arrays.

```kotlin
val matrix = arrayOf(
    intArrayOf(1, 2, 3),
    intArrayOf(4, 5, 6),
    intArrayOf(7, 8, 9)
)

for (row in matrix) {
    for (value in row) {
        print("$value ")
    }
    println()
}
```

Output:

```text
1 2 3
4 5 6
7 8 9
```

> **Key Point:** Use `for` for simple traversal, `indices` when you need indexes, and `forEach` when a functional style is convenient.