# Safe Call Operator

The safe call operator `?.` allows you to access a property or call a function only when the value is not `null`.

---

## 1. Basic Safe Call

```kotlin id="r3v7m2"
val name: String? = "Kotlin"

println(name?.length)
```

Output:

```text id="c8n4w1"
6
```

If the value is `null`:

```kotlin id="k5p2x9"
val name: String? = null

println(name?.length)
```

Output:

```text id="y7q1d6"
null
```

Instead of throwing a `NullPointerException`, the expression evaluates to `null`.

---

## 2. Calling Functions Safely

```kotlin id="m2w8s4"
val name: String? = "kotlin"

println(name?.uppercase())
```

If `name` is `null`, `uppercase()` is not called.

---

## 3. Chaining Safe Calls

Safe calls can be chained.

```kotlin id="v6r3k8"
data class Address(val city: String?)
data class User(val address: Address?)

val user: User? = null

println(user?.address?.city)
```

The result is `null` if any value in the chain is `null`.

---

## 4. Safe Call with `let`

`let` can be used to execute code only when the value is not `null`.

```kotlin id="z4m7p1"
val name: String? = "Kotlin"

name?.let {
    println("Name: $it")
}
```

If `name` is `null`, the block is not executed.

---

## 5. Safe Call with Assignment

Safe calls can also be used when setting nullable properties.

```kotlin id="h8q2v5"
data class User(var name: String?)

val user: User? = User("Tom")

user?.name = "John"
```

If `user` is `null`, nothing happens.

---

## 6. Safe Call vs Direct Access

Nullable value:

```kotlin id="p7x3m9"
val name: String? = null

// println(name.length) // Error
println(name?.length)   // null
```

> **Key Point:** Use `?.` when an operation should happen only if the value is not `null`.