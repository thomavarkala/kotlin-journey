# Elvis Operator

The Elvis operator `?:` provides a default value when an expression is `null`.

---

## 1. Basic Usage

```kotlin id="q6w2n8"
val name: String? = null

val result = name ?: "Unknown"

println(result)
```

Output:

```text id="j4p9s1"
Unknown
```

If `name` is not `null`, its value is used:

```kotlin id="f8k3v6"
val name: String? = "Kotlin"

val result = name ?: "Unknown"

println(result)
```

Output:

```text id="b2m7x4"
Kotlin
```

---

## 2. Safe Call with Elvis

The Elvis operator is often combined with `?.`.

```kotlin id="r9c5k2"
val name: String? = null

val length = name?.length ?: 0

println(length)
```

Output:

```text id="w3n8p6"
0
```

---

## 3. Elvis with Expressions

The right side can contain an expression.

```kotlin id="v5q1m9"
val age: Int? = null

val message = age?.let {
    "Age: $it"
} ?: "Age not available"

println(message)
```

---

## 4. Elvis with `return`

The Elvis operator is useful for returning early when a required value is missing.

```kotlin id="k8p4r2"
fun printName(name: String?) {
    val value = name ?: return

    println(value)
}
```

If `name` is `null`, the function returns immediately.

---

## 5. Elvis with `throw`

You can also throw an exception when a value is `null`.

```kotlin id="m3x7v1"
fun getName(name: String?): String {
    return name ?: throw IllegalArgumentException("Name is required")
}
```

---

## 6. Elvis vs `if`

These two approaches are equivalent:

```kotlin id="d9w2q5"
val name: String? = null

val result = if (name != null) name else "Unknown"
```

```kotlin id="t6k4p8"
val result = name ?: "Unknown"
```

The Elvis operator is shorter and expresses the intent clearly.

> **Key Point:** `a ?: b` means: use `a` if it is not `null`; otherwise use `b`.