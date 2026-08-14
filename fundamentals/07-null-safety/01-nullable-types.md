# Nullable Types

Kotlin's type system distinguishes between **nullable** and **non-nullable** types.

By default, a variable cannot contain `null`.

---

## 1. Non-Nullable Types

```kotlin id="x2r8k3"
val name: String = "Kotlin"

// name = null // Error
```

A `String` cannot hold `null`.

---

## 2. Nullable Types

Add `?` to the type to allow `null`.

```kotlin id="q3z7a1"
val name: String? = null

val age: Int? = null
```

A nullable variable can later contain a value:

```kotlin id="0m4r8p"
var name: String? = null

name = "Kotlin"
```

---

## 3. Checking for `null`

Use `== null` or `!= null`.

```kotlin id="b5x9q2"
val name: String? = null

if (name != null) {
    println(name)
}
```

After the check, Kotlin can safely treat `name` as a non-null `String` inside the block.

---

## 4. Nullable Properties

Nullable types can be used with properties and function parameters.

```kotlin id="w7k3m1"
fun greet(name: String?) {
    if (name != null) {
        println("Hello, $name")
    }
}
```

---

## 5. Nullable Return Values

A function can return a nullable value.

```kotlin id="p4v8s6"
fun findName(): String? {
    return null
}
```

The caller must handle the possibility of `null`.

---

## 6. Nullable Type vs Non-Nullable Type

```kotlin id="a9c2k7"
val a: String = "Kotlin"
val b: String? = null
```

They are different types:

```text id="n6f4t2"
String
String?
```

A nullable value cannot be directly assigned to a non-nullable variable:

```kotlin id="d8r5v1"
val name: String? = "Kotlin"

// val text: String = name // Error
```

> **Key Point:** Use `Type?` when `null` is a valid state. Kotlin then requires you to handle that possibility safely.