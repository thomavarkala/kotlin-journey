# Variables

A quick reference for declaring and using variables in Kotlin.

---

## 1. `val` vs `var`

- **`val`** - Read-only. Can be assigned only once.
- **`var`** - Mutable. Can be reassigned.

```kotlin
val birthYear = 1998
var currentAge = 26

currentAge = 27
// birthYear = 1999 // Compilation Error
```

> **Best Practice:** Prefer `val` unless the value needs to change.

---

## 2. Type Inference

Kotlin automatically infers the type.

```kotlin
val name = "Thoma"       // String
val age = 26             // Int
val height = 5.9         // Double
val isDeveloper = true   // Boolean
```

---

## 3. Explicit Type

You can specify the type explicitly.

```kotlin
val name: String = "Thoma"
var age: Int = 26
```

---

## 4. Declaration Without Initialization

A variable can be declared first and initialized later.

```kotlin
val name: String

name = "Thoma"
```

---

## 5. Nullable Variable

Use `?` when a variable can contain `null`.

```kotlin
var name: String? = null

name = "Thoma"
```

---

## 6. `const val`

Used for compile-time constants.

```kotlin
const val MAX_USERS = 100
const val APP_NAME = "Compose Journey"
```

---

## 7. `lateinit var`

Used when a non-null `var` needs to be initialized later.

```kotlin
lateinit var name: String

name = "Thoma"
```

> `lateinit` can only be used with `var`.