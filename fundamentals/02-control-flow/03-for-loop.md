# For Loop

The `for` loop is used to iterate over ranges, collections, arrays, and other iterable objects.

---

## 1. Basic `for` Loop

```kotlin
for (i in 1..5) {
    println(i)
}
```

Output:

```text
1
2
3
4
5
```

---

## 2. Iterating Over a Range

```kotlin
for (i in 0..10) {
    println(i)
}
```

`..` includes both the start and end values.

---

## 3. `until`

`until` excludes the upper bound.

```kotlin
for (i in 0 until 5) {
    println(i)
}
```

Output:

```text
0
1
2
3
4
```

This is commonly useful for indexing.

```kotlin
val arr = intArrayOf(10, 20, 30)

for (i in 0 until arr.size) {
    println(arr[i])
}
```

---

## 4. `downTo`

Use `downTo` for descending iteration.

```kotlin
for (i in 5 downTo 1) {
    println(i)
}
```

Output:

```text
5
4
3
2
1
```

---

## 5. `step`

`step` changes the amount by which the loop moves.

```kotlin
for (i in 1..10 step 2) {
    println(i)
}
```

Output:

```text
1
3
5
7
9
```

Descending:

```kotlin
for (i in 10 downTo 1 step 2) {
    println(i)
}
```

Output:

```text
10
8
6
4
2
```

---

## 6. Iterating Over an Array

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (number in numbers) {
    println(number)
}
```

---

## 7. Iterating Over a Collection

```kotlin
val names = listOf("Tom", "Sam", "John")

for (name in names) {
    println(name)
}
```

---

## 8. Index and Value

Use `indices` when you need the index.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (i in numbers.indices) {
    println("$i -> ${numbers[i]}")
}
```

Or use `withIndex()`:

```kotlin
for ((index, value) in numbers.withIndex()) {
    println("$index -> $value")
}
```

---

## 9. `forEach`

Collections and arrays can also be iterated using `forEach`.

```kotlin
val numbers = listOf(10, 20, 30)

numbers.forEach {
    println(it)
}
```

You can give the value a custom name:

```kotlin
numbers.forEach { number ->
    println(number)
}
```

---

## 10. Nested `for` Loops

A loop can be placed inside another loop.

```kotlin
for (i in 1..3) {
    for (j in 1..3) {
        println("$i $j")
    }
}
```

---

## 11. Loop with Conditions

```kotlin
for (i in 1..10) {
    if (i % 2 == 0) {
        println(i)
    }
}
```

> **Key Point:** Kotlin's `for` loop works with ranges, arrays, collections, and anything that provides an iterator.