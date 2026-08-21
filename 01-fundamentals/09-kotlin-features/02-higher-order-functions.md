# Higher-Order Functions

A **higher-order function** is a function that takes another function as a parameter, returns a function, or both.

---

## 1. Function as a Parameter

A function can receive another function as an argument.

```kotlin
fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

val result = calculate(10, 20) { x, y ->
    x + y
}

println(result) // 30
```

Here, `operation` is a function parameter.

---

## 2. Passing Different Lambdas

The same higher-order function can perform different operations.

```kotlin
fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

println(calculate(10, 5) { a, b -> a + b })
println(calculate(10, 5) { a, b -> a - b })
println(calculate(10, 5) { a, b -> a * b })
```

Output:

```text
15
5
50
```

---

## 3. Passing a Named Function

Use `::` to pass a normal function as a value.

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

println(calculate(10, 20, ::add))
```

`::add` refers to the function itself.

---

## 4. Function Returning a Function

A higher-order function can return another function.

```kotlin
fun multiplier(factor: Int): (Int) -> Int {
    return { number ->
        number * factor
    }
}

val double = multiplier(2)

println(double(10)) // 20
```

Here, `multiplier()` returns a function of type:

```text
(Int) -> Int
```

---

## 5. Function Type

Function parameters and return values use function types.

```kotlin
val add: (Int, Int) -> Int = { a, b ->
    a + b
}
```

Examples:

```text
() -> Unit
(Int) -> Int
(String) -> Boolean
(Int, Int) -> Int
```

---

## 6. Higher-Order Function with `Unit`

A function can accept a function that performs an action without returning a value.

```kotlin
fun repeatAction(
    times: Int,
    action: () -> Unit
) {
    repeat(times) {
        action()
    }
}

repeatAction(3) {
    println("Hello")
}
```

Output:

```text
Hello
Hello
Hello
```

---

## 7. Higher-Order Functions with Collections

Many Kotlin collection functions are higher-order functions.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val even = numbers.filter {
    it % 2 == 0
}

val doubled = numbers.map {
    it * 2
}
```

`filter()` and `map()` receive lambdas as parameters.

---

## 8. Multiple Function Parameters

A function can accept multiple functions.

```kotlin
fun process(
    value: Int,
    transform: (Int) -> Int,
    check: (Int) -> Boolean
) {
    val result = transform(value)

    if (check(result)) {
        println(result)
    }
}

process(
    5,
    { it * 2 },
    { it > 5 }
)
```

Output:

```text
10
```

---

## 9. Why Use Higher-Order Functions?

They allow you to separate **what to do** from **how to do it**.

```kotlin
fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
) = operation(a, b)
```

The `calculate()` function doesn't need to know whether the operation is addition, subtraction, or multiplication.

```kotlin
calculate(10, 5) { a, b -> a + b }
calculate(10, 5) { a, b -> a - b }
calculate(10, 5) { a, b -> a * b }
```

> **Key Point:** Higher-order functions treat functions as values, allowing them to be passed as arguments, returned from functions, and stored in variables.