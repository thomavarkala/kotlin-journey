# Not-Null Assertion

The not-null assertion operator `!!` tells Kotlin that you are certain a nullable value is not `null`.

---

## 1. Basic Usage

```kotlin id="q2m8v5"
val name: String? = "Kotlin"

println(name!!.length)
```

Because `name` contains a value, this works normally.

---

## 2. When the Value Is `null`

If the value is `null`, using `!!` throws a `NullPointerException`.

```kotlin id="r7k3x1"
val name: String? = null

println(name!!.length)
```

This results in:

```text id="m5p9q2"
NullPointerException
```

---

## 3. Common Input Example

`readLine()` returns a nullable `String?`.

```kotlin id="v8n2c6"
val name = readLine()!!

println(name)
```

Here, `!!` tells Kotlin that the input is expected to exist.

---

## 4. Converting Nullable Values

```kotlin id="h4q7m1"
val input: String? = "25"

val age = input!!.toInt()

println(age)
```

If `input` is `null`, the program throws `NullPointerException`.

---

## 5. Avoid Unnecessary `!!`

Prefer safe calls when `null` is possible.

Instead of:

```kotlin id="k9x3p5"
val name: String? = null

println(name!!.length)
```

Prefer:

```kotlin id="s6v2n8"
println(name?.length)
```

Or provide a default:

```kotlin id="w1q5r7"
println(name?.length ?: 0)
```

---

## 6. When `!!` Can Be Reasonable

`!!` can be acceptable when you genuinely know the value cannot be `null`.

```kotlin id="c8m4z2"
val input = readLine()!!

val number = input.toInt()
```

However, it should not be used simply to silence a compiler error.

> **Key Point:** `!!` converts a nullable type into a non-nullable type, but if the value is actually `null`, it throws a `NullPointerException`. Prefer `?.`, `?:`, or explicit null checks when possible.