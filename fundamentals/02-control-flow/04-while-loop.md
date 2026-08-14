# While Loop

Kotlin provides `while` and `do-while` loops for repeating code while a condition is satisfied.

---

## 1. `while`

The condition is checked **before** each iteration.

```kotlin
var i = 1

while (i <= 5) {
    println(i)
    i++
}
```

Output:

```text
1
2
3
4
5
```

If the condition is initially `false`, the loop does not execute.

```kotlin
var i = 10

while (i < 5) {
    println(i)
}
```

---

## 2. `do-while`

The code executes **at least once** because the condition is checked after the loop body.

```kotlin
var i = 1

do {
    println(i)
    i++
} while (i <= 5)
```

Even when the condition is initially false:

```kotlin
var i = 10

do {
    println(i)
} while (i < 5)
```

Output:

```text
10
```

---

## 3. `while` with Conditions

```kotlin
var number = 1

while (number <= 10) {
    if (number % 2 == 0) {
        println(number)
    }

    number++
}
```

---

## 4. Nested `while` Loops

```kotlin
var i = 1

while (i <= 3) {
    var j = 1

    while (j <= 3) {
        println("$i $j")
        j++
    }

    i++
}
```

> **Key Point:** Use `while` when the number of iterations depends on a condition rather than a known range.