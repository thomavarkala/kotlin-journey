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

---

## 2. Accessing Elements

Indexes start from `0`.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers[0]) // 10
println(numbers[2]) // 30
```

You can also use:

```kotlin
println(numbers.get(1)) // 20
```

---

## 3. Size

Use `size` to get the number of elements.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 4. First and Last Elements

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.first()) // 10
println(numbers.last())  // 30
```

---

## 5. Checking Elements

Use `contains()` or `in`.

```kotlin
val numbers = listOf(10, 20, 30)

println(numbers.contains(20)) // true
println(30 in numbers)        // true
println(50 in numbers)        // false
```

---

## 6. Read-Only Means No Structural Changes

```kotlin
val numbers = listOf(10, 20, 30)

// numbers.add(40)    // Error
// numbers.remove(10) // Error
```

A read-only `List` does not provide modification operations.

---

## 7. Iterating Through a List

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

> **Key Point:** `List` is ordered and indexed. Use `MutableList` when you need to add, remove, or update elements.