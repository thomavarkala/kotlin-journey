# Default Arguments

Default arguments allow a function parameter to have a default value. The caller can omit that argument when calling the function.

---

## 1. Basic Default Argument

```kotlin
fun greet(name: String = "Kotlin") {
    println("Hello, $name!")
}

greet()
greet("Tom")
```

Output:

```text
Hello, Kotlin!
Hello, Tom!
```

---

## 2. Multiple Default Arguments

```kotlin
fun createUser(
    name: String = "Guest",
    age: Int = 18
) {
    println("$name $age")
}

createUser()
createUser("Tom")
createUser("Tom", 25)
```

---

## 3. Named Arguments with Defaults

Named arguments allow you to provide only the parameter you want to change.

```kotlin
fun createUser(
    name: String = "Guest",
    age: Int = 18,
    active: Boolean = true
) {
    println("$name $age $active")
}

createUser(age = 25)
```

Here, `name` and `active` use their default values.

---

## 4. Default and Required Parameters

A function can have both required and default parameters.

```kotlin
fun greet(
    name: String,
    message: String = "Hello"
) {
    println("$message, $name")
}

greet("Tom")
greet("Tom", "Welcome")
```

The required parameter must be provided.

---

## 5. Default Arguments with Expressions

Default values can be expressions.

```kotlin
fun calculate(
    value: Int,
    multiplier: Int = 10 * 2
) {
    println(value * multiplier)
}
```

---

## 6. Default Arguments vs Overloading

Default arguments can often reduce the need for multiple overloaded functions.

Instead of:

```kotlin
fun greet() {
    greet("Kotlin")
}

fun greet(name: String) {
    println("Hello, $name")
}
```

You can write:

```kotlin
fun greet(name: String = "Kotlin") {
    println("Hello, $name")
}
```

> **Key Point:** Default arguments provide fallback values when the caller does not supply an argument.