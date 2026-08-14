# Single-Expression Functions

A function whose body consists of a single expression can be written using `=` instead of braces and `return`.

---

## 1. Basic Syntax

Normal function:

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

Single-expression function:

```kotlin
fun add(a: Int, b: Int) = a + b
```

Kotlin automatically infers the return type.

---

## 2. Explicit Return Type

You can still specify the return type.

```kotlin
fun add(a: Int, b: Int): Int = a + b
```

---

## 3. Different Return Types

```kotlin
fun square(n: Int) = n * n

fun isEven(n: Int) = n % 2 == 0

fun greet(name: String) = "Hello, $name"
```

The compiler infers:

```text
square() → Int
isEven() → Boolean
greet() → String
```

---

## 4. Function Calls as Expressions

```kotlin
fun getName() = "Kotlin"

fun message() = "Hello, ${getName()}"
```

---

## 5. Conditional Expression

A single-expression function can use `if`.

```kotlin
fun max(a: Int, b: Int) = if (a > b) a else b
```

---

## 6. `when` Expression

A `when` expression can also be used.

```kotlin
fun dayName(day: Int) = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    else -> "Unknown"
}
```

---

## 7. When Not to Use It

For multiple statements, use a normal function body.

```kotlin
fun calculate(a: Int, b: Int): Int {
    val sum = a + b
    println(sum)
    return sum
}
```

Do not try to force complex logic into a single expression.

> **Key Point:** Use single-expression functions when the function's logic is simple and can be clearly expressed as one expression.