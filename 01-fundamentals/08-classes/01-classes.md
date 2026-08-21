# Classes

A class is a blueprint for creating objects. It can contain properties and functions that describe the state and behavior of an object.

---

## 1. Creating a Class

```kotlin
class Person
```

Create an object using the class:

```kotlin
val person = Person()
```

---

## 2. Properties and Functions

```kotlin
class Person {
    val name = "Tom"

    fun greet() {
        println("Hello, $name")
    }
}

val person = Person()

println(person.name)
person.greet()
```

---

## 3. Multiple Objects

Each object is a separate instance of the class.

```kotlin
class Person {
    var age = 0
}

val person1 = Person()
val person2 = Person()

person1.age = 20
person2.age = 30

println(person1.age) // 20
println(person2.age) // 30
```

---

## 4. Class with Parameters

Parameters can be passed through the constructor.

```kotlin
class Person(val name: String)

val person = Person("Tom")

println(person.name)
```

Constructors are covered in `02-constructors.md`.

---

## 5. Member Functions

Functions declared inside a class are called member functions.

```kotlin
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

val calculator = Calculator()

println(calculator.add(10, 20))
```

> **Key Point:** A class defines the structure and behavior of objects, while an object is an instance of a class.