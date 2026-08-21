# Scope Functions

Kotlin provides five scope functions for executing a block of code within the context of an object:

- `let`
- `run`
- `with`
- `apply`
- `also`

The main differences are **how the object is referenced** and **what the function returns**.

---

## 1. `let`

`let` uses `it` to refer to the object and returns the result of the lambda.

```kotlin
val name = "Kotlin"

val length = name.let {
    println(it)
    it.length
}

println(length) // 6
```

A common use is handling nullable values:

```kotlin
val name: String? = "Kotlin"

name?.let {
    println("Length: ${it.length}")
}
```

---

## 2. `run`

`run` uses `this` to refer to the object and returns the result of the lambda.

```kotlin
val name = "Kotlin"

val length = name.run {
    println(this)
    length
}

println(length) // 6
```

Inside the block, properties and functions can usually be accessed directly:

```kotlin
val text = "Kotlin"

text.run {
    println(length)
    println(uppercase())
}
```

---

## 3. `with`

`with` is used to perform multiple operations on an object.

```kotlin
val numbers = mutableListOf<Int>()

with(numbers) {
    add(10)
    add(20)
    add(30)
}

println(numbers)
```

Inside the block, the object is referenced using `this`.

`with` returns the result of the lambda.

```kotlin
val result = with(numbers) {
    add(40)
    size
}

println(result)
```

---

## 4. `apply`

`apply` uses `this` and returns the **original object**.

It is commonly used to configure or initialize an object.

```kotlin
val numbers = mutableListOf<Int>().apply {
    add(10)
    add(20)
    add(30)
}

println(numbers)
```

Another example:

```kotlin
data class User(
    var name: String = "",
    var age: Int = 0
)

val user = User().apply {
    name = "Tom"
    age = 25
}

println(user)
```

---

## 5. `also`

`also` uses `it` and returns the **original object**.

It is commonly used for additional actions such as logging or debugging.

```kotlin
val numbers = mutableListOf(10, 20).also {
    println("Initial values: $it")
}

numbers.add(30)

println(numbers)
```

The original list is returned from `also`.

---

## 6. `let` vs `also`

Both use `it`, but they usually have different purposes.

### `let` - transform or calculate

```kotlin
val name = "Kotlin"

val length = name.let {
    it.length
}
```

Returns the lambda result.

### `also` - perform an additional action

```kotlin
val name = "Kotlin"

val result = name.also {
    println("Name: $it")
}
```

Returns the original object.

---

## 7. `run` vs `apply`

Both use `this`.

### `run` - calculate a result

```kotlin
val result = "Kotlin".run {
    length
}

println(result)
```

### `apply` — configure an object

```kotlin
val numbers = mutableListOf<Int>().apply {
    add(10)
    add(20)
}

println(numbers)
```

---

## 8. `this` vs `it`

The scope functions are divided based on how the object is referenced.

### `it`

Used by:

```kotlin
let
also
```

Example:

```kotlin
val name = "Kotlin"

name.let {
    println(it)
}
```

### `this`

Used by:

```kotlin
run
with
apply
```

Example:

```kotlin
val name = "Kotlin"

name.run {
    println(this)
}
```

---

## 9. Return Value

| Function | Object Reference | Returns |
|---|---|---|
| `let` | `it` | Lambda result |
| `run` | `this` | Lambda result |
| `with` | `this` | Lambda result |
| `apply` | `this` | Original object |
| `also` | `it` | Original object |

---

## 10. Simple Selection Guide

Use `let` when you want to **transform a value**:

```kotlin
value.let { ... }
```

Use `run` when you want to **calculate something using the object**:

```kotlin
value.run { ... }
```

Use `with` when you want to **perform multiple operations on an object**:

```kotlin
with(value) { ... }
```

Use `apply` when you want to **configure an object**:

```kotlin
value.apply { ... }
```

Use `also` when you want to **perform an additional action**:

```kotlin
value.also { ... }
```

> **Key Point:** Choose a scope function based on two things: whether you want to reference the object as `it` or `this`, and whether you need the lambda's result or the original object.