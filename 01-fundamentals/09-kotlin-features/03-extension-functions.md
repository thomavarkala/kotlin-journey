# Extension Functions

Extension functions allow you to add a new function to an existing class without modifying the class or inheriting from it.

---

## 1. Basic Extension Function

Define an extension function using the type followed by `.` before the function name.

```kotlin
fun String.greet() {
    println("Hello, $this!")
}

"Kotlin".greet()
```

Output:

```text
Hello, Kotlin!
```

Here, `String` is the **receiver type**, and `this` refers to the current `String`.

---

## 2. Extension Function with Return Value

An extension function can return a value.

```kotlin
fun String.firstChar(): Char {
    return this[0]
}

val text = "Kotlin"

println(text.firstChar()) // K
```

---

## 3. Extension Function with Parameters

Extension functions can also accept parameters.

```kotlin
fun Int.isGreaterThan(value: Int): Boolean {
    return this > value
}

println(10.isGreaterThan(5)) // true
```

Here:

```text
10 → receiver
5  → parameter
```

---

## 4. Using `this`

Inside an extension function, `this` refers to the object on which the function is called.

```kotlin
fun String.printLength() {
    println(this.length)
}

"Kotlin".printLength() // 6
```

You can usually omit `this` when there is no ambiguity:

```kotlin
fun String.printLength() {
    println(length)
}
```

---

## 5. Extension Functions on Collections

Extension functions can be added to collections.

```kotlin
fun List<Int>.sumOfSquares(): Int {
    return sumOf { it * it }
}

val numbers = listOf(1, 2, 3)

println(numbers.sumOfSquares()) // 14
```

---

## 6. Extension Functions on `Int`

```kotlin
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

println(10.isEven()) // true
println(7.isEven())  // false
```

---

## 7. Extension Functions on Nullable Types

An extension function can have a nullable receiver.

```kotlin
fun String?.printLength() {
    println(this?.length ?: 0)
}

val text: String? = null

text.printLength() // 0
```

This allows the function itself to handle `null`.

---

## 8. Extension Properties

Kotlin also supports extension properties.

```kotlin
val String.firstChar: Char
    get() = this[0]

println("Kotlin".firstChar) // K
```

An extension property cannot store its own backing field.

---

## 9. Extension Function vs Member Function

If a class already has a member function with the same signature, the **member function takes precedence**.

```kotlin
class Person {
    fun greet() {
        println("Member")
    }
}

fun Person.greet() {
    println("Extension")
}

Person().greet()
```

Output:

```text
Member
```

---

## 10. Extension Functions Do Not Modify the Class

The original class is not actually changed.

```kotlin
fun String.shout() = uppercase()

val text = "hello"

println(text.shout()) // HELLO
```

`String` itself has not been modified or inherited.

---

## 11. Useful Example

Extension functions are useful for creating reusable helper functions.

```kotlin
fun String.isValidEmail(): Boolean {
    return contains("@") && contains(".")
}

println("test@gmail.com".isValidEmail()) // true
```

Instead of:

```kotlin
isValidEmail("test@gmail.com")
```

you can write:

```kotlin
"test@gmail.com".isValidEmail()
```

> **Key Point:** Extension functions add convenient functionality to existing types without changing their source code.