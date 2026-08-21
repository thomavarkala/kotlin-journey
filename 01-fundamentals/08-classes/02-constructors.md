# Constructors

A constructor is used to initialize an object when a class is created.

---

## 1. Primary Constructor

The primary constructor is declared in the class header.

```kotlin
class Person(val name: String, val age: Int)

val person = Person("Tom", 25)

println(person.name)
println(person.age)
```

---

## 2. Constructor Parameters vs Properties

A parameter is not automatically a property.

```kotlin
class Person(name: String) {
    fun greet() {
        println("Hello, $name")
    }
}
```

Here, `name` can be used inside the class but is not accessible as `person.name`.

Use `val` or `var` to make it a property:

```kotlin
class Person(val name: String)

val person = Person("Tom")

println(person.name)
```

---

## 3. `val` and `var` in Constructors

```kotlin
class Person(
    val name: String,
    var age: Int
)

val person = Person("Tom", 25)

person.age = 26
// person.name = "John" // Error
```

`val` cannot be reassigned, while `var` can.

---

## 4. Default Constructor Arguments

Constructor parameters can have default values.

```kotlin
class Person(
    val name: String = "Unknown",
    val age: Int = 0
)

val person = Person()

println(person.name)
```

You can provide only the values you need using named arguments:

```kotlin
val person = Person(age = 25)
```

---

## 5. Secondary Constructor

A class can have additional constructors using `constructor`.

```kotlin
class Person {
    val name: String
    val age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
```

---

## 6. `init` Block

Use `init` to run initialization code when an object is created.

```kotlin
class Person(val name: String) {

    init {
        println("Created: $name")
    }
}

val person = Person("Tom")
```

The `init` block runs during object initialization.

---

## 7. Multiple `init` Blocks

A class can have multiple `init` blocks.

```kotlin
class Person(val name: String) {

    init {
        println("First")
    }

    init {
        println("Second")
    }
}
```

They execute in the order they appear.

> **Key Point:** Use the primary constructor for normal initialization and `init` when additional initialization logic is required.