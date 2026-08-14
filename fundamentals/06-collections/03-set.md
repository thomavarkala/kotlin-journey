# Set

A `Set` is a collection that stores **unique elements**. Duplicate elements are ignored.

Unlike a `List`, a `Set` does not provide indexed access.

---

## 1. Creating a Set

Use `setOf()`.

```kotlin
val numbers = setOf(10, 20, 30, 20, 10)

println(numbers)
```

Output:

```text
[10, 20, 30]
```

Duplicates are removed.

---

## 2. Checking Elements

Use `contains()` or `in`.

```kotlin
val numbers = setOf(10, 20, 30)

println(20 in numbers)  // true
println(50 in numbers)  // false
```

---

## 3. Size

```kotlin
val numbers = setOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 4. Iterating

```kotlin
val numbers = setOf(10, 20, 30)

for (number in numbers) {
    println(number)
}
```

---

## 5. Mutable Set

Use `mutableSetOf()` when elements need to be added or removed.

```kotlin
val numbers = mutableSetOf(10, 20, 30)

numbers.add(40)
numbers.remove(20)

println(numbers)
```

Adding an existing element has no effect:

```kotlin
numbers.add(10)
```

---

## 6. Set Operations

Kotlin provides useful operations for sets.

### Union

Combines elements from both sets.

```kotlin
val a = setOf(1, 2, 3)
val b = setOf(3, 4, 5)

println(a union b)
```

Output:

```text
[1, 2, 3, 4, 5]
```

### Intersection

Returns common elements.

```kotlin
println(a intersect b)
```

Output:

```text
[3]
```

### Subtraction

Returns elements present in the first set but not the second.

```kotlin
println(a subtract b)
```

Output:

```text
[1, 2]
```

> **Key Point:** Use `Set` when uniqueness matters and indexed access is not required.