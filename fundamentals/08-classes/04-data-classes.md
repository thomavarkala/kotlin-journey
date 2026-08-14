# Data Classes

A `data class` is designed to hold data. Kotlin automatically provides useful functions such as `toString()`, `equals()`, `hashCode()`, and `copy()`.

---

## 1. Creating a Data Class

```kotlin
data class User(
    val name: String,
    val age: Int
)

val user = User("Tom", 25)
```

---

## 2. `toString()`

Data classes provide a readable `toString()` implementation.

```kotlin
println(user)
```

Output:

```text
User(name=Tom, age=25)
```

---

## 3. Equality

Data classes compare objects based on their property values.

```kotlin
val user1 = User("Tom", 25)
val user2 = User("Tom", 25)

println(user1 == user2) // true
```

---

## 4. `copy()`

Create a new object while changing selected properties.

```kotlin
val user1 = User("Tom", 25)

val user2 = user1.copy(age = 26)

println(user2)
```

Output:

```text
User(name=Tom, age=26)
```

The original object remains unchanged.

---

## 5. Destructuring

Data classes support destructuring declarations.

```kotlin
val user = User("Tom", 25)

val (name, age) = user

println(name)
println(age)
```

---

## 6. Data Class Requirements

A data class must have at least one primary constructor parameter, and those parameters must be declared with `val` or `var`.

Valid:

```kotlin
data class User(
    val name: String,
    val age: Int
)
```

Invalid:

```kotlin
// data class User(name: String)
```

> **Key Point:** Use data classes when the main purpose of a class is to represent and carry data.