# Mutable Map

A `MutableMap` allows key-value pairs to be added, removed, and updated.

---

## 1. Creating a Mutable Map

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30
)
```

---

## 2. Adding Elements

Use `put()` or `[]`.

```kotlin
ages["John"] = 28
```

Equivalent to:

```kotlin
ages.put("John", 28)
```

---

## 3. Updating a Value

Assign a new value to an existing key.

```kotlin
ages["Tom"] = 26

println(ages["Tom"]) // 26
```

---

## 4. Removing Elements

Use `remove()`.

```kotlin
ages.remove("Sam")
```

Remove all elements:

```kotlin
ages.clear()
```

---

## 5. Checking the Map

```kotlin
println(ages.size)
println(ages.isEmpty())
println(ages.containsKey("Tom"))
println(ages.containsValue(26))
```

---

## 6. `getOrDefault()`

Returns the value for a key, or a default value if the key does not exist.

```kotlin
val ages = mutableMapOf(
    "Tom" to 25
)

println(ages.getOrDefault("Sam", 0))
```

Output:

```text
0
```

---

## 7. `getOrPut()`

Returns the existing value or inserts a default value if the key does not exist.

```kotlin
val counts = mutableMapOf<String, Int>()

val count = counts.getOrPut("Kotlin") { 0 }

println(count)
```

---

## 8. Iterating

```kotlin
for ((name, age) in ages) {
    println("$name -> $age")
}
```

> **Key Point:** Use `MutableMap` when key-value pairs need to be added, removed, or updated.