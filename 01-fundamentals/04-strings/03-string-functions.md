# String Functions

Kotlin provides many built-in functions and properties for working with strings.

---

## 1. `length`

Returns the number of characters.

```kotlin
val text = "Kotlin"

println(text.length) // 6
```

---

## 2. `uppercase()` and `lowercase()`

Convert a string to uppercase or lowercase.

```kotlin
val text = "Kotlin"

println(text.uppercase()) // KOTLIN
println(text.lowercase()) // kotlin
```

---

## 3. `trim()`

Removes whitespace from the beginning and end.

```kotlin
val text = "  Kotlin  "

println(text.trim()) // Kotlin
```

Related functions:

```kotlin
text.trimStart()
text.trimEnd()
```

---

## 4. `contains()`

Checks whether a string contains a specific value.

```kotlin
val text = "Hello Kotlin"

println(text.contains("Kotlin")) // true
println(text.contains("Java"))   // false
```

---

## 5. `startsWith()` and `endsWith()`

Check the beginning or end of a string.

```kotlin
val text = "Hello Kotlin"

println(text.startsWith("Hello")) // true
println(text.endsWith("Kotlin"))   // true
```

---

## 6. `substring()`

Extracts part of a string.

```kotlin
val text = "Kotlin"

println(text.substring(0, 3)) // Kot
println(text.substring(2))    // tlin
```

The end index is exclusive.

---

## 7. `indexOf()`

Returns the index of the first occurrence.

```kotlin
val text = "Hello Kotlin"

println(text.indexOf("Kotlin")) // 6
println(text.indexOf("Java"))   // -1
```

---

## 8. `lastIndexOf()`

Returns the index of the last occurrence.

```kotlin
val text = "one two one"

println(text.lastIndexOf("one")) // 8
```

---

## 9. `replace()`

Replaces matching characters or strings.

```kotlin
val text = "Hello Java"

println(text.replace("Java", "Kotlin"))
// Hello Kotlin
```

---

## 10. `split()`

Splits a string into a list.

```kotlin
val text = "apple,banana,orange"

val fruits = text.split(",")

println(fruits)
```

Output:

```text
[apple, banana, orange]
```

---

## 11. `isEmpty()` and `isNotEmpty()`

Check whether a string contains no characters.

```kotlin
val text = ""

println(text.isEmpty())    // true
println(text.isNotEmpty()) // false
```

---

## 12. `isBlank()` and `isNotBlank()`

Check whether a string is empty or contains only whitespace.

```kotlin
val text = "   "

println(text.isBlank())    // true
println(text.isNotBlank()) // false
```

---

## 13. `repeat()`

Repeats a string a specified number of times.

```kotlin
val text = "Hi "

println(text.repeat(3))
```

Output:

```text
Hi Hi Hi
```

---

## 14. `reversed()`

Returns the string in reverse order.

```kotlin
val text = "Kotlin"

println(text.reversed()) // niltoK
```

---

## 15. `compareTo()`

Compares two strings lexicographically.

```kotlin
val a = "Apple"
val b = "Banana"

println(a.compareTo(b))
```

- `0` → equal
- Negative → first string comes before the second
- Positive → first string comes after the second

---

## 16. `get()`

Returns the character at the specified index.

```kotlin
val text = "Kotlin"

println(text.get(0)) // K
```

Indexing is usually simpler:

```kotlin
println(text[0]) // K
```

---

## 17. `toCharArray()`

Converts a string into a `CharArray`.

```kotlin
val text = "Kotlin"

val chars = text.toCharArray()

println(chars.contentToString())
```

---

## 18. Common Functions

```kotlin
val text = "  Hello Kotlin  "

text.length
text.uppercase()
text.lowercase()
text.trim()
text.contains("Kotlin")
text.startsWith("Hello")
text.endsWith("Kotlin")
text.substring(2, 7)
text.indexOf("Kotlin")
text.lastIndexOf("o")
text.replace("Hello", "Hi")
text.split(" ")
text.reversed()
text.repeat(2)
```

> **Note:** Kotlin strings are immutable. These functions return a new string or value; they do not modify the original string.