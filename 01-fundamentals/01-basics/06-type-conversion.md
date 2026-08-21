# Basic Type Conversions in Kotlin

Kotlin does **not** automatically convert numeric types (there is no implicit primitive widening). You must explicitly convert a value from one type to another using conversion functions or properties.

---

## 1. Int Conversions

An `Int` can be converted to other numeric types, character code points, or strings.

| To Type | Example |
|---|---|
| `Byte` | `100.toByte()` |
| `Short` | `100.toShort()` |
| `Long` | `100.toLong()` |
| `Float` | `100.toFloat()` |
| `Double` | `100.toDouble()` |
| `Char` | `65.toChar()` |
| `String` | `100.toString()` |

Example:

```kotlin
val intValue: Int = 100

val longValue: Long = intValue.toLong()
val doubleValue: Double = intValue.toDouble()
val charValue: Char = 65.toChar() // 'A'
```

---

## 2. Long Conversions

Converting a `Long` to smaller integer types (`Int`, `Short`, `Byte`) may truncate bits if the value is out of bounds.

| To Type | Example |
|---|---|
| `Int` | `100L.toInt()` |
| `Byte` | `100L.toByte()` |
| `Short` | `100L.toShort()` |
| `Float` | `100L.toFloat()` |
| `Double` | `100L.toDouble()` |
| `Char` | `66L.toChar()` |
| `String` | `100L.toString()` |

Example:

```kotlin
val longValue: Long = 2147483648L

val intValue: Int = longValue.toInt() 
println(intValue) // -2147483648 (Overflow occurs)
```

---

## 3. Double Conversions

Converting a decimal to an integer type truncates the fractional part (it does **not** round).

| To Type | Example |
|---|---|
| `Int` | `10.99.toInt()` |
| `Long` | `10.75.toLong()` |
| `Float` | `10.55.toFloat()` |
| `Byte` | `10.5.toByte()` |
| `Short` | `10.5.toShort()` |
| `String` | `10.5.toString()` |

Example:

```kotlin
val decimalValue: Double = 10.99

val intValue: Int = decimalValue.toInt()
println(intValue) // 10 (Fractional part removed, not rounded)
```

---

## 4. Float Conversions

Converting a `Float` to integer types truncates the decimal portion.

| To Type | Example |
|---|---|
| `Int` | `5.85f.toInt()` |
| `Long` | `5.85f.toLong()` |
| `Double` | `5.85f.toDouble()` |
| `Byte` | `5.85f.toByte()` |
| `Short` | `5.85f.toShort()` |
| `String` | `3.14f.toString()` |

---

## 5. Byte Conversions

A `Byte` can be converted to larger numeric types safely, or converted to a character/string.

| To Type | Example |
|---|---|
| `Int` | `(100).toByte().toInt()` |
| `Short` | `(100).toByte().toShort()` |
| `Long` | `(100).toByte().toLong()` |
| `Float` | `(10).toByte().toFloat()` |
| `Double` | `(10).toByte().toDouble()` |
| `Char` | `(65).toByte().toChar()` |
| `String` | `(12).toByte().toString()` |

---

## 6. Short Conversions

A `Short` can be converted to other numeric types or UTF-16 characters.

| To Type | Example |
|---|---|
| `Int` | `(500).toShort().toInt()` |
| `Byte` | `(200).toShort().toByte()` |
| `Long` | `(500).toShort().toLong()` |
| `Float` | `(500).toShort().toFloat()` |
| `Double` | `(500).toShort().toDouble()` |
| `Char` | `(67).toShort().toChar()` |
| `String` | `(500).toShort().toString()` |

---

## 7. Char Conversions

In modern Kotlin, convert a `Char` to its UTF-16 code point using `.code`, or extract numeric values using digit conversion functions.

| To Type | Example |
|---|---|
| `Int` (Code Point) | `'A'.code` |
| `Int` (Digit) | `'7'.digitToInt()` |
| `Int` (Radix / Base) | `'F'.digitToInt(16)` |
| `Int?` (Safe Digit) | `'x'.digitToIntOrNull()` |
| `Byte` | `'A'.code.toByte()` |
| `Long` | `'A'.code.toLong()` |
| `String` | `'A'.toString()` |

Example:

```kotlin
val ch = 'A'
println(ch.code) // 65

val digitChar = '9'
println(digitChar.digitToInt()) // 9

val invalidDigit = 'x'.digitToIntOrNull()
println(invalidDigit) // null
```

---

## 8. String Conversions

Strings can be parsed into numbers, booleans, or characters.

> **Note:** Among basic primitive data types, `String` is unique because it represents a sequence of characters, allowing direct conversion into collections (`List`, `Set`, `CharArray`, etc.), which we will explore in `07-collection-conversions.md`.

| To Type | Example |
|---|---|
| `Int` | `"25".toInt()` |
| `Int?` (Safe) | `"abc".toIntOrNull()` |
| `Int` (Radix) | `"1010".toInt(2)` |
| `Long` | `"100000".toLong()` |
| `Long?` (Safe) | `"abc".toLongOrNull()` |
| `Double` | `"10.5".toDouble()` |
| `Double?` (Safe) | `"10.5x".toDoubleOrNull()` |
| `Float` | `"3.14".toFloat()` |
| `Float?` (Safe) | `"abc".toFloatOrNull()` |
| `Boolean` | `"true".toBoolean()` |
| `Boolean?` (Strict) | `"TRUE".toBooleanStrictOrNull()` |
| `Char` | `"A".single()` |
| `CharArray` | `"Hello".toCharArray()` |

Example:

```kotlin
val age = "25".toInt()

// Avoid exceptions with *OrNull
val safeAge = "abc".toIntOrNull() // null

// Strict boolean parsing
val isTrue = "true".toBooleanStrictOrNull() // true
```

---

## 9. Boolean Conversions

Kotlin does not have direct primitive `.toInt()` conversion for `Boolean` values. Use explicit expressions or convert to `String`.

| To Type | Example |
|---|---|
| `String` | `true.toString()` |
| `Int` | `if (true) 1 else 0` |

Example:

```kotlin
val flag = true

val str = flag.toString() // "true"
val intVal = if (flag) 1 else 0 // 1
```
