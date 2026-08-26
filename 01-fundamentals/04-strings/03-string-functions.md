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

## 2. `count()`

Returns the number of characters, or the number of characters matching a condition.

```kotlin
val text = "Kotlin"

println(text.count()) // 6
println(text.count { it == 't' }) // 1
```

---

## 3. `uppercase()` and `lowercase()`

Convert a string to uppercase or lowercase.

```kotlin
val text = "Kotlin"

println(text.uppercase()) // KOTLIN
println(text.lowercase()) // kotlin
```

---

## 4. `trim()`

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

## 5. `contains()`

Checks whether a string contains a specific value.

```kotlin
val text = "Hello Kotlin"

println(text.contains("Kotlin")) // true
println(text.contains("Java"))   // false
```

---

## 6. `startsWith()` and `endsWith()`

Check the beginning or end of a string.

```kotlin
val text = "Hello Kotlin"

println(text.startsWith("Hello")) // true
println(text.endsWith("Kotlin"))   // true
```

---

## 7. `substring()`

Extracts part of a string.

```kotlin
val text = "Kotlin"

println(text.substring(0, 3)) // Kot
println(text.substring(2))    // tlin
```

The end index is exclusive.

---

## 8. `indexOf()`

Returns the index of the first occurrence.

```kotlin
val text = "Hello Kotlin"

println(text.indexOf("Kotlin")) // 6
println(text.indexOf("Java"))   // -1
```

---

## 9. `lastIndexOf()`

Returns the index of the last occurrence.

```kotlin
val text = "one two one"

println(text.lastIndexOf("one")) // 8
```

---

## 10. `replace()`

Replaces matching characters or strings.

```kotlin
val text = "Hello Java"

println(text.replace("Java", "Kotlin"))
// Hello Kotlin
```

---

## 11. `replaceFirst()`

Replaces only the first matching occurrence.

```kotlin
val text = "one one one"

println(text.replaceFirst("one", "two"))
// two one one
```

---

## 12. `replaceRange()`

Replaces a range of characters.

```kotlin
val text = "Hello Kotlin"

println(text.replaceRange(6, 12, "World"))
// Hello World
```

The end index is exclusive.

---

## 13. `split()`

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

## 14. `isEmpty()` and `isNotEmpty()`

Check whether a string contains no characters.

```kotlin
val text = ""

println(text.isEmpty())    // true
println(text.isNotEmpty()) // false
```

> **Note:** `isEmpty()` is deprecated in newer Kotlin versions in some contexts. Prefer `text.isEmpty()` only when working with APIs where it remains appropriate; for simple string checks, `text.length == 0` is also possible.

---

## 15. `isBlank()` and `isNotBlank()`

Check whether a string is empty or contains only whitespace.

```kotlin
val text = "   "

println(text.isBlank())    // true
println(text.isNotBlank()) // false
```

---

## 16. `repeat()`

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

## 17. `reversed()`

Returns the string in reverse order.

```kotlin
val text = "Kotlin"

println(text.reversed()) // niltoK
```

---

## 18. `compareTo()`

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

## 19. `get()`

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

## 20. `toCharArray()`

Converts a string into a `CharArray`.

```kotlin
val text = "Kotlin"

val chars = text.toCharArray()

println(chars.contentToString())
```

---

## 21. `first()` and `last()`

Returns the first or last character.

```kotlin
val text = "Kotlin"

println(text.first()) // K
println(text.last())  // n
```

---

## 22. `firstOrNull()` and `lastOrNull()`

Returns the first or last character, or `null` when no matching character exists.

```kotlin
val text = "Kotlin"

println(text.firstOrNull()) // K
println(text.lastOrNull())  // n
```

They are safer when the string may be empty.

---

## 23. `getOrNull()`

Returns the character at an index, or `null` if the index is invalid.

```kotlin
val text = "Kotlin"

println(text.getOrNull(2))  // t
println(text.getOrNull(10)) // null
```

---

## 24. `equals()`

Checks whether two strings are equal.

```kotlin
val a = "Kotlin"
val b = "Kotlin"

println(a.equals(b)) // true
```

For case-insensitive comparison:

```kotlin
println(a.equals("kotlin", ignoreCase = true)) // true
```

The `==` operator is usually preferred:

```kotlin
println(a == b) // true
```

---

## 25. `isNotEmpty()` and `isNotBlank()`

Useful for validating that a string contains meaningful content.

```kotlin
val text = "Kotlin"

println(text.isNotEmpty()) // true
println(text.isNotBlank()) // true
```

---

## 26. `padStart()` and `padEnd()`

Adds characters to the beginning or end until the string reaches the specified length.

```kotlin
val text = "42"

println(text.padStart(5, '0')) // 00042
println(text.padEnd(5, '0'))   // 42000
```

---

## 27. `removePrefix()` and `removeSuffix()`

Removes a prefix or suffix when present.

```kotlin
val text = "Hello Kotlin"

println(text.removePrefix("Hello ")) // Kotlin
```

```kotlin
val file = "notes.txt"

println(file.removeSuffix(".txt")) // notes
```

---

## 28. `drop()` and `dropLast()`

Removes a specified number of characters from the beginning or end.

```kotlin
val text = "Kotlin"

println(text.drop(2))     // tlin
println(text.dropLast(2)) // Kotl
```

---

## 29. `take()` and `takeLast()`

Returns a specified number of characters from the beginning or end.

```kotlin
val text = "Kotlin"

println(text.take(3))     // Kot
println(text.takeLast(3)) // lin
```

---

## 30. `dropWhile()` and `takeWhile()`

Work with characters while a condition is true.

```kotlin
val text = "123Kotlin"

println(text.dropWhile { it.isDigit() }) // Kotlin
```

```kotlin
val text = "123Kotlin"

println(text.takeWhile { it.isDigit() }) // 123
```

---

## 31. `filter()`

Returns only the characters that satisfy a condition.

```kotlin
val text = "Kotlin123"

println(text.filter { it.isLetter() }) // Kotlin
println(text.filter { it.isDigit() })  // 123
```

---

## 32. `filterNot()`

Returns characters that do not satisfy a condition.

```kotlin
val text = "Kotlin123"

println(text.filterNot { it.isDigit() }) // Kotlin
```

---

## 33. `map()`

Transforms each character and returns a list of the transformed values.

```kotlin
val text = "abc"

val result = text.map { it.uppercaseChar() }

println(result) // [A, B, C]
```

---

## 34. `any()`, `all()`, and `none()`

Check whether characters satisfy a condition.

```kotlin
val text = "Kotlin123"

println(text.any { it.isDigit() })   // true
println(text.all { it.isLetter() })  // false
println(text.none { it == 'x' })     // true
```

---

## 35. `find()` and `findLast()`

Find the first or last character matching a condition.

```kotlin
val text = "Kotlin123"

println(text.find { it.isDigit() })     // 1
println(text.findLast { it.isDigit() }) // 3
```

They return `null` when no matching character exists.

---

## 36. `associateWith()`, `associateBy()`, and Other Collection Functions

Strings implement `CharSequence` and support many useful collection-style operations.

For example:

```kotlin
val text = "Kotlin"

val indexed = text.mapIndexed { index, char ->
    "$index:$char"
}

println(indexed)
// [0:K, 1:o, 2:t, 3:l, 4:i, 5:n]
```

Common related functions include:

```kotlin
text.map { ... }
text.mapIndexed { index, char -> ... }
text.filter { ... }
text.filterNot { ... }
text.any { ... }
text.all { ... }
text.none { ... }
text.find { ... }
text.findLast { ... }
text.count { ... }
```

---

## 37. `lines()`

Splits a string into lines.

```kotlin
val text = "Hello\nKotlin\nWorld"

println(text.lines())
```

Output:

```text
[Hello, Kotlin, World]
```

---

## 38. `lineSequence()`

Returns the lines as a lazy `Sequence`.

```kotlin
val text = "Hello\nKotlin\nWorld"

val lines = text.lineSequence()

println(lines.toList())
```

---

## 39. `prependIndent()` and `prependIndent()`-related Indentation Functions

Useful when formatting multiline strings.

```kotlin
val text = """
Hello
Kotlin
""".trimIndent()

println(text.prependIndent("  "))
```

Common indentation functions include:

```kotlin
text.trimIndent()
text.trimMargin()
text.prependIndent()
```

---

## 40. `trimMargin()`

Removes leading whitespace and a margin prefix from multiline strings.

```kotlin
val text = """
    |Hello
    |Kotlin
""".trimMargin()

println(text)
```

Output:

```text
Hello
Kotlin
```

---

## 41. `trimIndent()`

Removes common indentation from a multiline string.

```kotlin
val text = """
    Hello
    Kotlin
""".trimIndent()

println(text)
```

---

## 42. `toInt()`, `toLong()`, `toFloat()`, and `toDouble()`

Converts a numeric string into a number.

```kotlin
val text = "42"

println(text.toInt())    // 42
println(text.toLong())   // 42
println(text.toFloat())  // 42.0
println(text.toDouble()) // 42.0
```

---

## 43. `toIntOrNull()`, `toLongOrNull()`, and Similar Functions

Safely converts a string to a number. Returns `null` when conversion fails.

```kotlin
val text = "42"

println(text.toIntOrNull()) // 42

val invalid = "abc"

println(invalid.toIntOrNull()) // null
```

Related functions:

```kotlin
text.toLongOrNull()
text.toFloatOrNull()
text.toDoubleOrNull()
```

---

## 44. `toBoolean()`

Converts a string to a Boolean.

```kotlin
println("true".toBoolean())  // true
println("false".toBoolean()) // false
println("hello".toBoolean()) // false
```

For safer parsing:

```kotlin
println("true".toBooleanStrictOrNull())  // true
println("hello".toBooleanStrictOrNull()) // null
```

---

## 45. `format()`

Formats a string using a format pattern.

```kotlin
val name = "Kotlin"
val version = 2

println("Language: %s, Version: %d".format(name, version))
// Language: Kotlin, Version: 2
```

---

## 46. `encodeToByteArray()` and `decodeToString()`

Convert between strings and byte arrays.

```kotlin
val text = "Kotlin"

val bytes = text.encodeToByteArray()
val result = bytes.decodeToString()

println(result) // Kotlin
```

> **Note:** Kotlin strings are immutable. These functions return a new string or value; they do not modify the original string.
