# Type Inference

Kotlin can automatically determine a variable's type from its assigned value. This is called **type inference**.

---

## 1. Basic Type Inference

```kotlin
val name = "Kotlin"    // String
val age = 25           // Int
val price = 10.5       // Double
val active = true      // Boolean
val grade = 'A'        // Char
```

The compiler determines the type at compile time.

---

## 2. `val` with Type Inference

```kotlin
val age = 25

// age = 30  // Error: Val cannot be reassigned
```

`val` cannot be reassigned, but its type is still inferred as `Int`.

---

## 3. `var` with Type Inference

```kotlin
var age = 25

age = 30       // Valid
// age = "30"  // Error: Type mismatch
```

Once inferred, the variable's type does not change.

---

## 4. Declaration Without Initialization

When there is no value to infer from, specify the type.

```kotlin
val age: Int

age = 25
println(age)   // 25
```

The variable must be initialized before it is used.

```kotlin
val age: Int

println(age - 10)
// Error: Variable 'age' must be initialized
```

---

## 5. Type Inference from Expressions

Kotlin can infer the type from an expression.

```kotlin
val sum = 10 + 20          // Int
val result = 10.0 / 2      // Double
val message = "Hello " + "Kotlin"  // String
```

---

## 6. Function Return Type Inference

Kotlin can infer a function's return type.

```kotlin
fun add(a: Int, b: Int) = a + b
```

The return type is inferred as `Int`.

Equivalent to:

```kotlin
fun add(a: Int, b: Int): Int = a + b
```

---

## 7. When Explicit Type Is Needed

Specify the type when there is no initial value or when it improves clarity.

```kotlin
val userId: Long = 100L

val name: String
name = "Kotlin"
```