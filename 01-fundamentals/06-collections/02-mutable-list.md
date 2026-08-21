# Mutable List

A `MutableList` is an ordered collection whose elements can be added, removed, or updated.

---

## 1. Creating a Mutable List

Use `mutableListOf()`.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.add(40)

println(numbers)
```

Output:

```text
[10, 20, 30, 40]
```

---

## 2. Adding Elements

### `add()`

Adds an element to the end.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.add(40)
```

### `add(index, element)`

Adds an element at a specific index.

```kotlin
numbers.add(1, 15)

println(numbers)
```

---

## 3. Updating Elements

Use the index to replace an element.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers[1] = 100

println(numbers)
```

Output:

```text
[10, 100, 30]
```

---

## 4. Removing Elements

### `remove()`

Removes the specified element.

```kotlin
numbers.remove(100)
```

### `removeAt()`

Removes the element at an index.

```kotlin
numbers.removeAt(0)
```

### `clear()`

Removes all elements.

```kotlin
numbers.clear()
```

---

## 5. Checking the List

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.size)
println(numbers.contains(20))
println(numbers.isEmpty())
```

---

## 6. Iterating

```kotlin
for (number in numbers) {
    println(number)
}
```

With index:

```kotlin
for ((index, value) in numbers.withIndex()) {
    println("$index -> $value")
}
```

---

## 7. Read-Only View

A mutable list can be referenced through a read-only `List`.

```kotlin
val mutable = mutableListOf(10, 20, 30)
val readOnly: List<Int> = mutable
```

You cannot modify it through `readOnly`:

```kotlin
// readOnly.add(40) // Error
```

But the original mutable list can still change:

```kotlin
mutable.add(40)

println(readOnly)
```

> **Key Point:** Use `MutableList` when the collection itself needs to change.