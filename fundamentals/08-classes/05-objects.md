# Objects

Kotlin uses the `object` keyword to create a single instance of a class-like declaration.

---

## 1. Object Declaration

An object declaration creates a singleton.

```kotlin
object Database {
    val name = "AppDatabase"

    fun connect() {
        println("Connected")
    }
}

println(Database.name)
Database.connect()
```

Only one instance of `Database` exists.

---

## 2. Object Expression

An object expression creates an anonymous object.

```kotlin
val person = object {
    val name = "Tom"

    fun greet() {
        println("Hello, $name")
    }
}

person.greet()
```

The object can be created directly without declaring a named class.

---

## 3. Companion Object

A `companion object` provides class-level members that can be accessed through the class name.

```kotlin
class MathUtils {
    companion object {
        fun square(n: Int) = n * n
    }
}

println(MathUtils.square(5))
```

You don't need to create a `MathUtils` object to call `square()`.

---

## 4. Companion Object with Properties

```kotlin
class User {
    companion object {
        const val MAX_AGE = 100
    }
}

println(User.MAX_AGE)
```

---

## 5. Object Implementing an Interface

An object can implement an interface.

```kotlin
interface Logger {
    fun log(message: String)
}

val logger = object : Logger {
    override fun log(message: String) {
        println(message)
    }
}

logger.log("Hello")
```

---

## 6. Singleton vs Normal Class

A normal class can create multiple objects:

```kotlin
class Database

val db1 = Database()
val db2 = Database()
```

An `object` declaration creates one shared instance:

```kotlin
object Database

val db1 = Database
val db2 = Database

println(db1 === db2) // true
```

> **Key Point:** Use `object` when you need a single shared instance, and `companion object` when you need members accessed through the class name.