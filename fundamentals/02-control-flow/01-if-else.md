# If-Else

`if` and `else` are used to execute different blocks of code based on a condition.

---

## 1. `if`

The code inside `if` executes when the condition is `true`.

```kotlin
val age = 20

if (age >= 18) {
    println("Adult")
}
```

---

## 2. `if-else`

Use `else` when you want to execute another block when the condition is `false`.

```kotlin
val age = 16

if (age >= 18) {
    println("Adult")
} else {
    println("Minor")
}
```

---

## 3. `if-else if-else`

Use `else if` to check multiple conditions.

```kotlin
val marks = 75

if (marks >= 90) {
    println("A")
} else if (marks >= 75) {
    println("B")
} else if (marks >= 50) {
    println("C")
} else {
    println("Fail")
}
```

Conditions are checked from **top to bottom**. The first `true` condition is executed.

---

## 4. Nested `if`

An `if` can be placed inside another `if`.

```kotlin
val age = 20
val hasId = true

if (age >= 18) {
    if (hasId) {
        println("Allowed")
    }
}
```

---

## 5. `if` as an Expression

In Kotlin, `if` can return a value.

```kotlin
val age = 20

val result = if (age >= 18) {
    "Adult"
} else {
    "Minor"
}

println(result)
```

The value returned by the selected branch is assigned to `result`.

---

## 6. Single-Line `if`

For simple expressions, braces can be omitted.

```kotlin
val age = 20

if (age >= 18)
    println("Adult")
```

For an expression:

```kotlin
val result = if (age >= 18) "Adult" else "Minor"
```

> Use braces for multiple statements or when they make the code easier to read.

---

## 7. Multiple Conditions

Use logical operators to combine conditions.

```kotlin
val age = 25
val hasId = true

if (age >= 18 && hasId) {
    println("Allowed")
}
```

```kotlin
if (age < 18 || !hasId) {
    println("Not allowed")
}
```

