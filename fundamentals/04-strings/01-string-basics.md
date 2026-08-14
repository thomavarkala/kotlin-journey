# String Basics

A `String` represents a sequence of characters in Kotlin.

---

## 1. Creating a String

Use double quotes to create a `String`.

```kotlin
val name = "Kotlin"
val message: String = "Hello, Kotlin!"
```

A single character uses `Char` and single quotes:

```kotlin
val letter: Char = 'A'
```

---

## 2. Empty String

A string can contain no characters.

```kotlin
val empty = ""
println(empty.isEmpty()) // true
```

---

## 3. String Length

Use `length` to get the number of characters.

```kotlin
val text = "Kotlin"

println(text.length) // 6
```

Spaces are also counted:

```kotlin
val text = "Hello World"

println(text.length) // 11
```

---

## 4. Accessing Characters

Use an index to access a character.

```kotlin
val text = "Kotlin"

println(text[0]) // K
println(text[3]) // l
println(text[5]) // n
```

Indexes start from `0`.

```text
K o t l i n
0 1 2 3 4 5
```

---

## 5. First and Last Character

```kotlin
val text = "Kotlin"

println(text.first()) // K
println(text.last())  // n
```

---

## 6. String Concatenation

Use `+` to join strings.

```kotlin
val firstName = "John"
val lastName = "Doe"

val fullName = firstName + " " + lastName

println(fullName)
```

Output:

```text
John Doe
```

---

## 7. String Templates

Insert variables directly into a string using `$`.

```kotlin
val name = "Kotlin"
val version = 2

println("Language: $name")
println("Version: $version")
```

For expressions, use `${}`:

```kotlin
val a = 10
val b = 20

println("Sum = ${a + b}")
```

---

## 8. Comparing Strings

Use `==` to compare string contents.

```kotlin
val a = "Kotlin"
val b = "Kotlin"

println(a == b) // true
```

Use `!=` for inequality:

```kotlin
println(a != b) // false
```

> Kotlin's `==` checks structural equality, so it compares the contents of strings.

---

## 9. Multiline Strings

Use triple quotes `"""` for multiline strings.

```kotlin
val text = """
    Kotlin
    is
    fun
""".trimIndent()

println(text)
```

Output:

```text
Kotlin
is
fun
```

---

## 10. Strings Are Immutable

A `String` cannot be modified directly.

```kotlin
val text = "Kotlin"

// text[0] = 'J' // Error
```

Create a new string instead:

```kotlin
val text = "Kotlin"
val newText = "J" + text.substring(1)

println(newText) // Jotlin
```

---

## 11. Iterating Through a String

A string can be iterated character by character.

```kotlin
val text = "Kotlin"

for (ch in text) {
    println(ch)
}
```

Output:

```text
K
o
t
l
i
n
```

> **Note:** String functions and common string operations are covered in `03-string-functions.md`.