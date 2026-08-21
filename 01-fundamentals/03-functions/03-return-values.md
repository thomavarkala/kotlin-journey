# Return Values

A function can return a value to the code that called it.

---

## 1. Returning a Value

Use `return` to return a value.

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

val result = add(10, 20)

println(result)
```

The return type is specified after the parameter list.

---

## 2. Different Return Types

Functions can return any appropriate type.

```kotlin
fun getName(): String {
    return "Kotlin"
}

fun getAge(): Int {
    return 25
}

fun isAdult(): Boolean {
    return true
}
```

---

## 3. Returning an Expression

```kotlin
fun square(n: Int): Int {
    return n * n
}
```

---

## 4. Early Return

`return` can be used to exit a function early.

```kotlin
fun checkAge(age: Int): String {
    if (age < 18) {
        return "Minor"
    }

    return "Adult"
}
```

---

## 5. Returning `Unit`

A function that does not return a meaningful value returns `Unit`.

```kotlin
fun printMessage(): Unit {
    println("Hello")
}
```

Usually, `Unit` is omitted:

```kotlin
fun printMessage() {
    println("Hello")
}
```

---

## 6. Returning Multiple Values

Kotlin does not have a special syntax for returning multiple independent values. Use a suitable type such as `Pair`, `Triple`, a data class, or a collection.

### `Pair`

```kotlin
fun getCoordinates(): Pair<Int, Int> {
    return Pair(10, 20)
}

val (x, y) = getCoordinates()
```

### `Triple`

```kotlin
fun getData(): Triple<Int, Int, Int> {
    return Triple(10, 20, 30)
}
```

---

## 7. Return Type Inference

For expression-bodied functions, Kotlin can infer the return type.

```kotlin
fun add(a: Int, b: Int) = a + b
```

The return type is inferred as `Int`.

> **Key Point:** The return type describes the value a function gives back to its caller.