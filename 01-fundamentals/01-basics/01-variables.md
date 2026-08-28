# Variables

A quick reference for declaring and using variables in Kotlin.

---

## 1. `val` vs `var`

- **`val`** - Read-only reference. It can be assigned only once.
- **`var`** - Mutable variable. It can be reassigned.

```kotlin
val birthYear = 1998
var currentAge = 26

currentAge = 27
// birthYear = 1999 // Compilation Error
```

> **Best Practice:** Prefer `val` unless the variable needs to be reassigned.

> **Note:** `val` means the reference cannot be reassigned. If it refers to a mutable object, the object's contents can still change.

```kotlin
val numbers = mutableListOf(1, 2, 3)

numbers.add(4)       // Valid
// numbers = mutableListOf(5, 6) // Compilation Error
```

---

## 2. Type Inference

Kotlin automatically infers the type when it can determine it from the assigned value.

```kotlin
val name = "Thoma"       // String
val age = 26             // Int
val height = 5.9         // Double
val isDeveloper = true   // Boolean
```

---

## 3. Explicit Type

You can specify the type explicitly using `:`.

```kotlin
val name: String = "Thoma"
var age: Int = 26
```

Explicit types are especially useful when declaring a variable without immediately initializing it.

---

## 4. Declaration Without Initialization

A local variable can be declared first and initialized later, as long as Kotlin can guarantee that it is initialized before use.

```kotlin
val name: String

name = "Thoma"

println(name)
```

This does not work:

```kotlin
val name: String

// println(name) // Compilation Error

name = "Thoma"
```

---

## 5. Nullable Variable

Use `?` when a variable is allowed to contain `null`.

```kotlin
var name: String? = null

name = "Thoma"
```

A nullable variable cannot be used as a non-null value without handling the possibility of `null`.

```kotlin
val length = name?.length
```

---

## 6. `const val`

`const val` is used for compile-time constants.

```kotlin
const val MAX_USERS = 100
const val APP_NAME = "Compose Journey"
```

A `const val` must:

- Be declared at top level, inside an `object`, or inside a `companion object`.
- Have a primitive type or `String`.
- Be initialized with a compile-time constant expression.
- Not be a `var`.

Valid:

```kotlin
const val MAX_USERS = 100
const val APP_NAME = "Compose Journey"
const val ENABLED = true
```

Invalid:

```kotlin
// const val USERS = mutableListOf(1, 2, 3)
// const val TIME = System.currentTimeMillis()
```

> **Naming convention:** Constants are commonly written in `UPPER_SNAKE_CASE`.

---

## 7. `lateinit var`

`lateinit` is used when a non-null variable needs to be initialized later.

```kotlin
lateinit var name: String

name = "Thoma"

println(name)
```

Rules:

- Can only be used with `var`.
- The type must be non-null.
- The variable must be initialized before it is accessed.
- Commonly used for properties that cannot be initialized in the constructor or at declaration time.

```kotlin
lateinit var username: String

// println(username) // Throws UninitializedPropertyAccessException

username = "Thoma"
println(username)
```

> `lateinit` is mainly used with properties, rather than ordinary local variables.

---

## 8. Escaped Identifiers with Backticks

Kotlin uses backticks `` ` `` to allow keywords or unusual names to be used as identifiers.

This is particularly useful when working with Java APIs or classes such as LeetCode's `ListNode`.

```kotlin
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

val node = ListNode(5)

println(node.`val`)
```

Here, `val` is normally a Kotlin keyword, so it is enclosed in backticks to use it as a property name.

Backticks can also be used with other Kotlin keywords:

```kotlin
val `class` = "Civil"
val `object` = "Notes"
val `when` = 10
```

> **Note:** Backticks are called **escaped identifiers**. They do not change the actual identifier name; they allow a name that would otherwise conflict with Kotlin syntax.

---

## 9. Multiple Variables

Kotlin allows multiple variables to be declared separately.

```kotlin
val firstName = "Thoma"
val lastName = "Nani"
val age = 26
```

You can also declare multiple variables on one line using semicolons, although this is generally discouraged for readability.

```kotlin
val firstName = "Thoma"; val age = 26
```

> **Best Practice:** Prefer one declaration per line.

---