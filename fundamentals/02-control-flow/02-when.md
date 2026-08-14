# When

`when` is Kotlin's expression for handling multiple conditions. It is similar to `switch` in languages such as Java, but more powerful.

---

## 1. Basic `when`

```kotlin
val day = 2

when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    else -> println("Invalid day")
}
```

The first matching branch is executed.

---

## 2. `when` as an Expression

`when` can return a value.

```kotlin
val day = 2

val result = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    else -> "Invalid"
}

println(result)
```

---

## 3. Multiple Values in One Branch

Use commas to match multiple values.

```kotlin
val day = 6

when (day) {
    1, 2, 3, 4, 5 -> println("Weekday")
    6, 7 -> println("Weekend")
}
```

---

## 4. Ranges in `when`

```kotlin
val marks = 85

when (marks) {
    in 90..100 -> println("A")
    in 75..89 -> println("B")
    in 50..74 -> println("C")
    else -> println("Fail")
}
```

You can also use descending ranges:

```kotlin
when (number) {
    in 10 downTo 1 -> println("Between 1 and 10")
    else -> println("Outside range")
}
```

---

## 5. Conditions with `in` and `!in`

```kotlin
val age = 25

when {
    age in 18..60 -> println("Adult")
    age !in 0..17 -> println("Invalid")
    else -> println("Minor")
}
```

---

## 6. `when` Without an Argument

When does not always need a value to compare.

```kotlin
val age = 25

when {
    age < 13 -> println("Child")
    age < 18 -> println("Teenager")
    age < 60 -> println("Adult")
    else -> println("Senior")
}
```

Conditions are checked from top to bottom.

---

## 7. Type Checking with `is`

`when` can check the type of a value.

```kotlin
val value: Any = "Kotlin"

when (value) {
    is String -> println("String")
    is Int -> println("Int")
    is Boolean -> println("Boolean")
    else -> println("Unknown")
}
```

Kotlin automatically smart-casts the value inside the matching branch.

```kotlin
when (value) {
    is String -> println(value.length)
    is Int -> println(value + 10)
}
```

---

## 8. Combining Conditions

```kotlin
val age = 25
val hasId = true

when {
    age >= 18 && hasId -> println("Allowed")
    age >= 18 && !hasId -> println("ID required")
    else -> println("Not allowed")
}
```

---

## 9. Exhaustive `when`

When `when` is used as an expression, all possible cases must be covered.

```kotlin
val isActive = true

val message = when (isActive) {
    true -> "Active"
    false -> "Inactive"
}
```

For other types, `else` is commonly used:

```kotlin
val number = 5

val result = when (number) {
    1 -> "One"
    2 -> "Two"
    else -> "Other"
}
```

---

## 10. Multiple Statements in a Branch

A branch can contain multiple statements.

```kotlin
val age = 20

when {
    age >= 18 -> {
        println("Adult")
        println("Can vote")
    }

    else -> {
        println("Minor")
    }
}
```

> **Key Point:** `when` is an expression in Kotlin, so it can be used both for control flow and for returning a value.