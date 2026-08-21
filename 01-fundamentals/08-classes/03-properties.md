# Properties

Properties represent the state of a class. Kotlin properties combine a field with getter and setter behavior.

---

## 1. Declaring Properties

```kotlin
class Person {
    val name = "Tom"
    var age = 25
}
```

```kotlin
val person = Person()

println(person.name)
println(person.age)
```

---

## 2. `val` Properties

A `val` property cannot be reassigned after initialization.

```kotlin
class Person {
    val name = "Tom"
}

val person = Person()

// person.name = "John" // Error
```

---

## 3. `var` Properties

A `var` property can be reassigned.

```kotlin
class Person {
    var age = 25
}

val person = Person()

person.age = 26

println(person.age)
```

---

## 4. Custom Getter

You can define custom behavior when a property is read.

```kotlin
class Rectangle(
    val width: Int,
    val height: Int
) {
    val area: Int
        get() = width * height
}

val rectangle = Rectangle(10, 5)

println(rectangle.area) // 50
```

---

## 5. Custom Setter

A `var` property can have a custom setter.

```kotlin
class Person {
    var age: Int = 0
        set(value) {
            field = value.coerceAtLeast(0)
        }
}
```

`field` refers to the property's backing field.

---

## 6. Private Setter

A property can be publicly readable but only internally writable.

```kotlin
class Person {
    var age: Int = 0
        private set

    fun increaseAge() {
        age++
    }
}
```

Outside the class:

```kotlin
val person = Person()

println(person.age)

// person.age = 25 // Error
person.increaseAge()
```

---

## 7. Properties in Constructors

Properties are commonly declared directly in the primary constructor.

```kotlin
class Person(
    val name: String,
    var age: Int
)
```

This is concise and commonly used in Kotlin.

> **Key Point:** Use `val` for read-only properties and `var` when the property's value needs to change.