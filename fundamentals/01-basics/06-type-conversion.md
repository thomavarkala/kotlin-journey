# Type Conversion

Kotlin does **not** automatically convert numeric types. You must explicitly convert a value from one type to another.

---

## 1. Numeric Conversion

Use functions such as `toInt()`, `toLong()`, `toDouble()`, etc.

```kotlin
val intValue = 10

val longValue = intValue.toLong()
val doubleValue = intValue.toDouble()
val floatValue = intValue.toFloat()
```

Common conversion functions:

```text
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
```

---

## 2. Integer to Integer

```kotlin
val value: Int = 100

val byteValue = value.toByte()
val shortValue = value.toShort()
val longValue = value.toLong()
```

Be careful when converting to a smaller type because the value may overflow.

```kotlin
val value = 130

val result = value.toByte()
println(result)
```

---

## 3. Decimal to Integer

Converting a decimal to an integer removes the fractional part.

```kotlin
val value = 10.75

println(value.toInt()) // 10
println(value.toLong()) // 10
```

It does not round the value.

```kotlin
10.99.toInt() // 10
```

---

## 4. String to Number

Use the appropriate conversion function.

```kotlin
val age = "25".toInt()
val number = "100000".toLong()
val price = "10.5".toDouble()
```

Invalid numeric strings cause an exception:

```kotlin
val age = "abc".toInt()
// NumberFormatException
```

Use `toIntOrNull()` when the input may not be a valid number:

```kotlin
val age = "abc".toIntOrNull()

println(age) // null
```

---

## 5. Number to String

Use `toString()`.

```kotlin
val age = 25

val text = age.toString()

println(text) // "25"
```

You can also use string templates:

```kotlin
val age = 25

val text = "$age"
```

---

## 6. Character Conversion

Convert a `Char` to an integer using `code`.

```kotlin
val ch = 'A'

println(ch.code) // 65
```

Convert an integer to a character:

```kotlin
val ch = 65.toChar()

println(ch) // A
```

---

## 7. Boolean Conversion

There is no general `toBoolean()` conversion for arbitrary values.

For strings:

```kotlin
val value = "true".toBoolean()

println(value) // true
```

Invalid strings result in `false`:

```kotlin
println("hello".toBoolean()) // false
```

---

## 8. No Automatic Numeric Conversion

Unlike some languages, Kotlin does not automatically convert numeric types.

```kotlin
val intValue: Int = 10
val longValue: Long = 20L

// val result = intValue + longValue // Error
```

Convert explicitly:

```kotlin
val result = intValue.toLong() + longValue

println(result) // 30
```

