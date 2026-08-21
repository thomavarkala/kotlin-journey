# Functions

A function is a reusable block of code that performs a specific task.

---

## 1. Basic Function

```kotlin
fun greet() {
    println("Hello, Kotlin!")
}

greet()
```

A function is declared using the `fun` keyword.

---

## 2. Function with Parameters

```kotlin
fun greet(name: String) {
    println("Hello, $name!")
}

greet("Kotlin")
```

Parameters are written inside `()`.

---

## 3. Function with a Return Value

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

val result = add(10, 20)
println(result)
```

The return type is written after `:`.

---

## 4. Multiple Statements

A function can contain multiple statements.

```kotlin
fun calculate() {
    val a = 10
    val b = 20
    val sum = a + b

    println(sum)
}
```

---

## 5. Calling a Function

Call a function using its name followed by `()`.

```kotlin
fun sayHello() {
    println("Hello")
}

sayHello()
sayHello()
```

---

## 6. Function with No Return Value

A function that does not return a meaningful value has a return type of `Unit`.

```kotlin
fun printMessage(): Unit {
    println("Hello")
}
```

`Unit` is normally omitted:

```kotlin
fun printMessage() {
    println("Hello")
}
```

> **Key Point:** Use functions to organize code into small, reusable pieces of functionality.