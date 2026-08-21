# Lambdas

A lambda is an **anonymous function** that can be stored in a variable, passed as an argument, or returned from another function.

---

## 1. Basic Lambda

```kotlin
val greet = {
    println("Hello, Kotlin!")
}

greet()
```

A lambda does not have a name and does not use the `fun` keyword.

---

## 2. Lambda with Parameters

Parameters are written before `->`.

```kotlin
val add = { a: Int, b: Int ->
    a + b
}

println(add(10, 20))
```

Output:

```text
30
```

---

## 3. Lambda Return Value

The **last expression** in a lambda is its return value.

```kotlin
val square = { number: Int ->
    number * number
}

println(square(5)) // 25
```

There is normally no need to write `return`.

---

## 4. Lambda Type

A lambda can have an explicit function type.

```kotlin
val add: (Int, Int) -> Int = { a, b ->
    a + b
}
```

General syntax:

```text
(parameters) -> returnType
```

Examples:

```kotlin
() -> Unit
(Int) -> Int
(String) -> Boolean
(Int, Int) -> Int
```

---

## 5. `it` Parameter

When a lambda has **one parameter**, Kotlin provides the implicit name `it`.

```kotlin
val square: (Int) -> Int = {
    it * it
}

println(square(5))
```

Instead of:

```kotlin
val square = { number: Int ->
    number * number
}
```

---

## 6. Lambda with Multiple Statements

A lambda can contain multiple statements.

```kotlin
val calculate = { a: Int, b: Int ->
    val sum = a + b
    val result = sum * 2

    result
}

println(calculate(10, 20))
```

The last expression, `result`, is returned.

---

## 7. Lambda with No Return Value

Use `Unit` when the lambda only performs an action.

```kotlin
val printName: (String) -> Unit = {
    println(it)
}

printName("Tom")
```

The return type can usually be inferred:

```kotlin
val printName = { name: String ->
    println(name)
}
```

---

## 8. Passing a Lambda to a Function

A lambda can be passed as an argument.

```kotlin
fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
) {
    println(operation(a, b))
}

calculate(10, 20) { x, y ->
    x + y
}
```

---

## 9. Trailing Lambda Syntax

When the lambda is the **last parameter**, it can be placed outside the parentheses.

```kotlin
val numbers = listOf(1, 2, 3)

numbers.forEach {
    println(it)
}
```

This is equivalent to:

```kotlin
numbers.forEach({
    println(it)
})
```

---

## 10. Lambda with Collections

Lambdas are commonly used with collection functions.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val even = numbers.filter {
    it % 2 == 0
}

println(even)
```

Output:

```text
[2, 4]
```

Another example:

```kotlin
val doubled = numbers.map {
    it * 2
}

println(doubled)
```

---

## 11. Lambda vs Normal Function

Normal function:

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

Lambda:

```kotlin
val add = { a: Int, b: Int ->
    a + b
}
```

A lambda is useful when a small piece of behavior needs to be passed around or used temporarily.

> **Key Point:** A lambda is an anonymous function that can be treated like a value in Kotlin.