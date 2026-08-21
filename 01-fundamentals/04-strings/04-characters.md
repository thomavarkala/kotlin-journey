# Characters

`Char` represents a single character in Kotlin. Character literals use **single quotes**.

---

## 1. Creating a `Char`

```kotlin
val letter: Char = 'A'
val digit: Char = '5'
val symbol: Char = '#'
```

A `Char` is different from a `String`:

```kotlin
val character: Char = 'A'
val text: String = "A"
```

---

## 2. Accessing Characters in a String

Use an index to access a character.

```kotlin
val text = "Kotlin"

println(text[0]) // K
println(text[3]) // l
println(text.last()) // n
```

Indexes start from `0`.

---

## 3. Character Properties

Kotlin provides useful properties for checking characters.

```kotlin
val ch = 'A'

println(ch.isLetter()) // true
println(ch.isDigit())  // false
println(ch.isUpperCase()) // true
println(ch.isLowerCase()) // false
```

Other useful checks:

```kotlin
ch.isWhitespace()
ch.isLetterOrDigit()
```

---

## 4. Converting Case

```kotlin
val ch = 'a'

println(ch.uppercaseChar()) // A
```

```kotlin
val ch = 'A'

println(ch.lowercaseChar()) // a
```

---

## 5. Character Code

Use `code` to get the Unicode value of a character.

```kotlin
val ch = 'A'

println(ch.code) // 65
```

For example:

```kotlin
println('A'.code) // 65
println('a'.code) // 97
println('0'.code) // 48
```

---

## 6. Converting `Int` to `Char`

Use `toChar()`.

```kotlin
val code = 65

val ch = code.toChar()

println(ch) // A
```

---

## 7. Character Arithmetic

Characters can be moved using `inc()` and `dec()`.

```kotlin
val ch = 'A'

println(ch.inc()) // B
println(ch.dec()) // @
```

You can also use ranges:

```kotlin
for (ch in 'a'..'z') {
    print(ch)
}
```

Output:

```text
abcdefghijklmnopqrstuvwxyz
```

---

## 8. Comparing Characters

Characters can be compared using comparison operators.

```kotlin
println('A' == 'A') // true
println('A' != 'B') // true
println('A' < 'B')  // true
```

Comparison is based on their Unicode values.

---

## 9. Reading a Character

Read a string and access its character.

```kotlin
val ch = readLine()!![0]

println(ch)
```

For input:

```text
A
```

`ch` will contain:

```text
A
```

---

## 10. Iterating Through Characters

Strings can be iterated character by character.

```kotlin
val text = "Kotlin"

for (ch in text) {
    println(ch)
}
```

You can combine this with character checks:

```kotlin
val text = "Kotlin123"

for (ch in text) {
    if (ch.isDigit()) {
        println(ch)
    }
}
```

> **Key Point:** `Char` represents one character, while `String` represents a sequence of characters.