# Map

A `Map` stores data as **key-value pairs**.

Each key is unique, while multiple keys can have the same value.

---

## 1. Creating a Map

Use `mapOf()`.

```kotlin
val ages = mapOf(
    "Tom" to 25,
    "Sam" to 30,
    "John" to 28
)
```

---

## 2. Accessing Values

Use the key to access a value.

```kotlin
println(ages["Tom"]) // 25
```

If the key does not exist, `[]` returns `null`.

```kotlin
println(ages["Alex"]) // null
```

---

## 3. Checking Keys and Values

```kotlin
val ages = mapOf(
    "Tom" to 25,
    "Sam" to 30
)

println("Tom" in ages)              // true
println(25 in ages.values)          // true
println(ages.containsKey("Sam"))    // true
println(ages.containsValue(30))     // true
```

---

## 4. Size

```kotlin
println(ages.size)
```

---

## 5. Iterating Through a Map

```kotlin
for ((name, age) in ages) {
    println("$name -> $age")
}
```

You can iterate over keys and values separately:

```kotlin
for (key in ages.keys) {
    println(key)
}

for (value in ages.values) {
    println(value)
}
```

---

## 6. Duplicate Keys

A map cannot contain duplicate keys.

```kotlin
val ages = mapOf(
    "Tom" to 25,
    "Tom" to 30
)

println(ages["Tom"])
```

Output:

```text
30
```

The later value replaces the earlier value.

> **Key Point:** A `Map` provides efficient key-based access to values and requires unique keys.