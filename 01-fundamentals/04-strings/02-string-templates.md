# String Templates

String templates allow you to insert variables and expressions directly into a string using `$`.

---

## 1. Variable Template

Use `$variable` to insert a variable.

```kotlin
val name = "Kotlin"
val version = 2

println("Language: $name")
println("Version: $version")
```

Output:

```text
Language: Kotlin
Version: 2
```

---

## 2. Expression Template

Use `${}` when you need to evaluate an expression.

```kotlin
val a = 10
val b = 20

println("Sum = ${a + b}")
println("Product = ${a * b}")
```

Output:

```text
Sum = 30
Product = 200
```

---

## 3. Properties in Templates

You can access properties directly.

```kotlin
val name = "Kotlin"

println("Length: ${name.length}")
println("First character: ${name.first()}")
```

---

## 4. Function Calls in Templates

Functions can be called inside `${}`.

```kotlin
fun greet() = "Hello"

println("${greet()}, Kotlin!")
```

Output:

```text
Hello, Kotlin!
```

---

## 5. Multiple Templates

Multiple variables and expressions can be used in the same string.

```kotlin
val name = "Tom"
val age = 25

println("$name is $age years old.")
println("Next year: ${age + 1}")
```

---

## 6. `$` Without a Template

If `$` is followed by a character that doesn't form a valid template, it can be used normally.

```kotlin
println("Price: $10")
```

For clarity, especially when `$` is followed by a variable-like name, use an escaped dollar sign:

```kotlin
println("Price: \$10")
```

Output:

```text
Price: $10
```

---

## 7. Templates with Conditional Expressions

Expressions can contain `if`.

```kotlin
val age = 20

println("Status: ${if (age >= 18) "Adult" else "Minor"}")
```

---

## 8. Templates with `when`

Expressions can also contain `when`.

```kotlin
val day = 2

println(
    "Day: ${
        when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            else -> "Unknown"
        }
    }"
)
```

---

## 9. Templates in Multiline Strings

String templates also work inside triple-quoted strings.

```kotlin
val name = "Kotlin"
val version = 2

val message = """
    Language: $name
    Version: $version
""".trimIndent()

println(message)
```

Output:

```text
Language: Kotlin
Version: 2
```

---

## 10. `$variable` vs `${expression}`

Use `$variable` for a simple variable:

```kotlin
println("Hello, $name")
```

Use `${}` for expressions:

```kotlin
println("Hello, ${name.uppercase()}")
println("Total: ${price * quantity}")
println("Next year: ${age + 1}")
```

> **Rule:** `$name` is shorthand for a variable, while `${...}` allows any Kotlin expression.