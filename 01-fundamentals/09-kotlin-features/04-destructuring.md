# Destructuring

Destructuring declarations allow you to **unpack an object into multiple variables** in a single statement.

---

## 1. Basic Destructuring

A `Pair` can be destructured into two variables.

```kotlin
val pair = Pair(10, 20)

val (first, second) = pair

println(first)  // 10
println(second) // 20
```

Instead of:

```kotlin
val first = pair.first
val second = pair.second
```

you can use:

```kotlin
val (first, second) = pair
```

---

## 2. Destructuring a `Triple`

A `Triple` can be unpacked into three variables.

```kotlin
val data = Triple("Tom", 25, true)

val (name, age, active) = data

println(name)
println(age)
println(active)
```

---

## 3. Data Class Destructuring

Data classes automatically support destructuring.

```kotlin
data class User(
    val name: String,
    val age: Int
)

val user = User("Tom", 25)

val (name, age) = user

println(name)
println(age)
```

The variables are assigned according to the order of the properties.

---

## 4. Ignoring Values

Use `_` when you don't need a particular value.

```kotlin
val user = User("Tom", 25)

val (name, _) = user

println(name)
```

The second value is ignored.

---

## 5. Destructuring in Loops

Destructuring is commonly used when iterating over a `Map`.

```kotlin
val ages = mapOf(
    "Tom" to 25,
    "Sam" to 30
)

for ((name, age) in ages) {
    println("$name -> $age")
}
```

Here:

```text
name → key
age  → value
```

---

## 6. Destructuring with `withIndex()`

You can get both the index and value directly.

```kotlin
val names = listOf("Tom", "Sam", "John")

for ((index, name) in names.withIndex()) {
    println("$index -> $name")
}
```

Output:

```text
0 -> Tom
1 -> Sam
2 -> John
```

---

## 7. Destructuring Function Results

A function can return a `Pair` or `Triple`, which can then be destructured.

```kotlin
fun getCoordinates(): Pair<Int, Int> {
    return Pair(10, 20)
}

val (x, y) = getCoordinates()

println("x = $x")
println("y = $y")
```

---

## 8. Destructuring with `componentN()`

Destructuring works through special `componentN()` functions.

For a `Pair`:

```kotlin
val pair = Pair(10, 20)

println(pair.component1()) // 10
println(pair.component2()) // 20
```

This:

```kotlin
val (first, second) = pair
```

is conceptually based on:

```kotlin
val first = pair.component1()
val second = pair.component2()
```

---

## 9. Custom Destructuring

A class can provide its own `componentN()` functions.

```kotlin
class Point(
    val x: Int,
    val y: Int
) {
    operator fun component1() = x
    operator fun component2() = y
}

val point = Point(10, 20)

val (x, y) = point

println(x)
println(y)
```

---

## 10. Destructuring vs Normal Access

Without destructuring:

```kotlin
val user = User("Tom", 25)

println(user.name)
println(user.age)
```

With destructuring:

```kotlin
val (name, age) = user

println(name)
println(age)
```

Destructuring is especially useful when you need several values from an object at the same time.

> **Key Point:** Destructuring lets you conveniently unpack multiple values from objects such as data classes, `Pair`, `Triple`, and map entries.