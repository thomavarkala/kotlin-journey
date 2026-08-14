# Parameters

Parameters allow a function to receive values from the caller.

---

## 1. Basic Parameters

```kotlin
fun greet(name: String) {
    println("Hello, $name!")
}

greet("Kotlin")
```

Here, `name` is a parameter and `"Kotlin"` is an argument.

---

## 2. Multiple Parameters

```kotlin
fun add(a: Int, b: Int) {
    println(a + b)
}

add(10, 20)
```

Parameters are separated by commas.

---

## 3. Different Parameter Types

```kotlin
fun display(name: String, age: Int, active: Boolean) {
    println("$name $age $active")
}

display("Tom", 25, true)
```

Each parameter must have a type.

---

## 4. Parameter Names

Kotlin allows arguments to be passed using parameter names.

```kotlin
fun introduce(name: String, age: Int) {
    println("$name is $age years old")
}

introduce(
    name = "Tom",
    age = 25
)
```

The order does not matter when using named arguments:

```kotlin
introduce(
    age = 25,
    name = "Tom"
)
```

---

## 5. Passing Expressions

Arguments can be expressions or variables.

```kotlin
fun square(n: Int) {
    println(n * n)
}

val x = 5

square(x)
square(10 + 5)
```

---

## 6. `vararg` Parameters

`vararg` allows a function to receive a variable number of arguments.

```kotlin
fun sum(vararg numbers: Int): Int {
    var result = 0

    for (number in numbers) {
        result += number
    }

    return result
}

println(sum(1, 2, 3))
println(sum(10, 20, 30, 40))
```

Inside the function, `numbers` can be treated like an array.

---

## 7. Spread Operator `*`

Use `*` to pass an existing array to a `vararg` parameter.

```kotlin
fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

val numbers = intArrayOf(1, 2, 3)

println(sum(*numbers))
```

> **Key Point:** Parameters define what a function receives; arguments are the actual values passed when calling it.