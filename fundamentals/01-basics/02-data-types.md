# Data Types

Kotlin is a statically typed language. Every variable and expression has a type.

## 1. Number Types

| Type | Size | Example |
|---|---:|---|
| `Byte` | 8-bit | `val x: Byte = 10` |
| `Short` | 16-bit | `val x: Short = 100` |
| `Int` | 32-bit | `val x: Int = 1000` |
| `Long` | 64-bit | `val x: Long = 1000L` |
| `Float` | 32-bit | `val x: Float = 10.5f` |
| `Double` | 64-bit | `val x: Double = 10.5` |

```kotlin
val byte: Byte = 10
val short: Short = 100
val int: Int = 1000
val long: Long = 1000L

val float: Float = 10.5f
val double: Double = 10.5
```

> `Int` is the default type for integer literals, and `Double` is the default type for decimal literals.

---

## 2. Character

`Char` represents a single character.

```kotlin
val grade: Char = 'A'
val symbol: Char = '#'
```

Use single quotes for `Char`.

```kotlin
'A'      // Char
"A"      // String
```

---

## 3. Boolean

`Boolean` represents either `true` or `false`.

```kotlin
val isLoggedIn: Boolean = true
val isAdmin: Boolean = false
```

Commonly used in conditions:

```kotlin
if (isLoggedIn) {
    println("Welcome")
}
```

---

## 4. String

`String` represents a sequence of characters.

```kotlin
val name: String = "Kotlin"
```

> Strings are covered in detail in [`04-strings`](../04-strings/).

---

## 5. Unsigned Types

Kotlin provides unsigned integer types for values that cannot be negative.

| Type | Size |
|---|---:|
| `UByte` | 8-bit |
| `UShort` | 16-bit |
| `UInt` | 32-bit |
| `ULong` | 64-bit |

```kotlin
val age: UInt = 26u
val distance: ULong = 1000uL
```

---

## 6. Special Types

### `Any`

The root type for all non-nullable types.

```kotlin
val value: Any = "Kotlin"
```

### `Unit`

Represents the absence of a meaningful return value.

```kotlin
fun printMessage(): Unit {
    println("Hello")
}
```

`Unit` is usually omitted:

```kotlin
fun printMessage() {
    println("Hello")
}
```

### `Nothing`

Represents a value that never exists because the function never completes normally.

```kotlin
fun fail(): Nothing {
    throw Exception("Error")
}
```

---

