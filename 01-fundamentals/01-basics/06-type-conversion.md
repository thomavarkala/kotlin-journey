# Basic Type Conversions in Kotlin

Kotlin does **not** automatically convert numeric types. There is no implicit primitive widening.

You must explicitly convert values using conversion functions such as:

```kotlin
toInt()
toLong()
toDouble()
toFloat()
toByte()
toShort()
toString()
```

For character digits and radix/base conversions, Kotlin also provides:

```kotlin
digitToInt()
digitToIntOrNull()
toInt(radix)
toIntOrNull(radix)
toString(radix)
```

---

## 1. Int Conversions

An `Int` can be converted to other numeric types, a `Char`, a normal decimal `String`, or a `String` representation in another radix.

| To Type / Format | Example | Result |
|---|---|---|
| `Byte` | `100.toByte()` | `100` |
| `Short` | `100.toShort()` | `100` |
| `Long` | `100.toLong()` | `100L` |
| `Float` | `100.toFloat()` | `100.0f` |
| `Double` | `100.toDouble()` | `100.0` |
| `Char` | `65.toChar()` | `'A'` |
| `String` | `100.toString()` | `"100"` |
| Binary `String` | `10.toString(2)` | `"1010"` |
| Octal `String` | `10.toString(8)` | `"12"` |
| Decimal `String` | `10.toString(10)` | `"10"` |
| Hexadecimal `String` | `10.toString(16)` | `"a"` |

---

## 2. Long Conversions

A `Long` can be converted to other numeric types or a `String`.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `100L.toInt()` | `100` |
| `Byte` | `100L.toByte()` | `100` |
| `Short` | `100L.toShort()` | `100` |
| `Float` | `100L.toFloat()` | `100.0f` |
| `Double` | `100L.toDouble()` | `100.0` |
| `String` | `100L.toString()` | `"100"` |
| Binary `String` | `10L.toString(2)` | `"1010"` |
| Octal `String` | `10L.toString(8)` | `"12"` |
| Decimal `String` | `10L.toString(10)` | `"10"` |
| Hexadecimal `String` | `10L.toString(16)` | `"a"` |

---

## 3. Double Conversions

A `Double` can be converted to integer and floating-point types or to a `String`.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `10.99.toInt()` | `10` |
| `Long` | `10.75.toLong()` | `10L` |
| `Float` | `10.5.toFloat()` | `10.5f` |
| `Byte` | `10.5.toByte()` | `10` |
| `Short` | `10.5.toShort()` | `10` |
| `String` | `10.5.toString()` | `"10.5"` |

---

## 4. Float Conversions

A `Float` can be converted to integer types, `Double`, or `String`.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `5.85f.toInt()` | `5` |
| `Long` | `5.85f.toLong()` | `5L` |
| `Double` | `5.85f.toDouble()` | approximately `5.85` |
| `Byte` | `5.85f.toByte()` | `5` |
| `Short` | `5.85f.toShort()` | `5` |
| `String` | `3.14f.toString()` | `"3.14"` |

---

## 5. Byte Conversions

A `Byte` can be converted to other numeric types or a `String`.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `100.toByte().toInt()` | `100` |
| `Short` | `100.toByte().toShort()` | `100` |
| `Long` | `100.toByte().toLong()` | `100L` |
| `Float` | `10.toByte().toFloat()` | `10.0f` |
| `Double` | `10.toByte().toDouble()` | `10.0` |
| `Char` | `65.toByte().toInt().toChar()` | `'A'` |
| `String` | `12.toByte().toString()` | `"12"` |

---

## 6. Short Conversions

A `Short` can be converted to other numeric types, a character code, or a `String`.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `500.toShort().toInt()` | `500` |
| `Byte` | `100.toShort().toByte()` | `100` |
| `Long` | `500.toShort().toLong()` | `500L` |
| `Float` | `500.toShort().toFloat()` | `500.0f` |
| `Double` | `500.toShort().toDouble()` | `500.0` |
| `Char` | `67.toShort().toInt().toChar()` | `'C'` |
| `String` | `500.toShort().toString()` | `"500"` |

---

## 7. Char Conversions

A `Char` represents a UTF-16 code unit. Use `.code` for its numeric code and `digitToInt()` when the character represents a numeric digit.

| To Type / Meaning | Example | Result |
|---|---|---|
| `Int` (Code) | `'A'.code` | `65` |
| `Int` (Digit) | `'7'.digitToInt()` | `7` |
| `Int` (Radix / Base) | `'F'.digitToInt(16)` | `15` |
| `Int?` (Safe Digit) | `'x'.digitToIntOrNull()` | `null` |
| `Int?` (Safe Radix) | `'F'.digitToIntOrNull(16)` | `15` |
| `Byte` | `'A'.code.toByte()` | `65` |
| `Long` | `'A'.code.toLong()` | `65L` |
| `String` | `'A'.toString()` | `"A"` |

---

## 8. String Conversions

Strings can be parsed into numbers, booleans, or individual characters.

| To Type / Format | Example | Result |
|---|---|---|
| `Int` | `"25".toInt()` | `25` |
| `Int?` (Safe) | `"abc".toIntOrNull()` | `null` |
| `Int` (Binary) | `"1010".toInt(2)` | `10` |
| `Int` (Hexadecimal) | `"FF".toInt(16)` | `255` |
| `Int?` (Safe Radix) | `"xyz".toIntOrNull(16)` | `null` |
| `Long` | `"100000".toLong()` | `100000L` |
| `Long?` (Safe) | `"abc".toLongOrNull()` | `null` |
| `Long` (Binary) | `"1010".toLong(2)` | `10L` |
| `Double` | `"10.5".toDouble()` | `10.5` |
| `Double?` (Safe) | `"10.5x".toDoubleOrNull()` | `null` |
| `Float` | `"3.14".toFloat()` | `3.14f` |
| `Float?` (Safe) | `"abc".toFloatOrNull()` | `null` |
| `Boolean` | `"true".toBoolean()` | `true` |
| `Boolean?` (Strict) | `"true".toBooleanStrictOrNull()` | `true` |
| `Char` | `"A".single()` | `'A'` |
| `Char?` (Safe) | `"A".singleOrNull()` | `'A'` |
| `CharArray` | `"Hello".toCharArray()` | `['H','e','l','l','o']` |

> **Key Point:** Use normal conversion functions when the input is guaranteed to be valid. Use `*OrNull` versions when invalid input is possible and you want to avoid an exception.
