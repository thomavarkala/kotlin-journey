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

A `while` loop can contain conditions such as `if`, `else if`, and `else`.

```kotlin
var number = 1

while (number <= 10) {
    if (number % 2 == 0) {
        println(number)
    }

    number++
}
```

Output:

```text
2
4
6
8
10
```

---

## 4. Infinite `while` Loop

A `while` loop can intentionally run forever by using `true` as its condition.

```kotlin
while (true) {
    println("Running...")
}
```

An infinite loop is usually stopped using `break`.

---

## 5. `while (true)` with `break`

This is useful when you do not know in advance when the loop should stop.

```kotlin
var number = 1

while (true) {
    println(number)

    if (number == 5) {
        break
    }

    number++
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

> **Key Point:** `while (true)` keeps running until something inside the loop executes `break`.

---

## 6. `break` in a `while` Loop

`break` immediately terminates the nearest loop.

```kotlin
var i = 1

while (i <= 10) {
    if (i == 6) {
        break
    }

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

---

## 7. `continue` in a `while` Loop

`continue` skips the current iteration and moves to the next iteration.

```kotlin
var i = 1

while (i <= 5) {
    if (i == 3) {
        i++
        continue
    }

    println(i)
    i++
}
```

Output:

```text
1
2
4
5
```

> **Important:** When using `continue`, make sure the loop variable is updated before `continue`; otherwise, the loop can become infinite.

---

## 8. Nested `while` Loops

A `while` loop can be placed inside another `while` loop.

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

Output:

```text
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
```

---

## 9. `break` in Nested `while` Loops

An unlabeled `break` stops only the **nearest enclosing loop**.

```kotlin
var i = 1

while (i <= 3) {
    var j = 1

    while (j <= 3) {
        if (j == 2) {
            break
        }

        println("$i $j")
        j++
    }

    i++
}
```

Output:

```text
1 1
2 1
3 1
```

---

## 10. Labeled `break` in Nested `while` Loops

A labeled `break` can stop an outer loop.

```kotlin
outer@ while (true) {
    var i = 1

    while (i <= 3) {
        if (i == 2) {
            break@outer
        }

        println(i)
        i++
    }
}
```

Output:

```text
1
```

---

## 11. Labeled `continue` in Nested `while` Loops

A labeled `continue` can skip to the next iteration of an outer loop.

```kotlin
outer@ while (i <= 3) {
    var j = 1

    while (j <= 3) {
        if (j == 2) {
            i++
            continue@outer
        }

        println("$i $j")
        j++
    }

    i++
}
```

> **Note:** Labeled `break` and `continue` are useful when working with nested loops and you need to control a specific loop.

---

## 12. Reading Input with `while`

A `while` loop can repeatedly read input until a condition is met.

```kotlin
var input = ""

while (input != "exit") {
    print("Enter something: ")
    input = readln()
}
```

The loop stops when the user enters `exit`.

---

## 13. `while` with a Counter

A counter is commonly used when the loop needs to repeat a known number of times.

```kotlin
var count = 1

while (count <= 5) {
    println("Count: $count")
    count++
}
```

Output:

```text
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

> If the number of iterations is known and based on a range, a `for` loop is often simpler.

---

## 14. `while` with Multiple Conditions

A `while` condition can contain logical operators such as `&&` and `||`.

```kotlin
var number = 1

while (number <= 10 && number % 2 == 1) {
    println(number)
    number += 2
}
```

Output:

```text
1
3
5
7
9
```

---

## 15. `do-while` with `break`

`break` can also be used inside a `do-while` loop.

```kotlin
var i = 1

do {
    println(i)

    if (i == 3) {
        break
    }

    i++
} while (i <= 5)
```

Output:

```text
1
2
3
```

---

## 16. `do-while` with `continue`

`continue` can also be used inside a `do-while` loop.

```kotlin
var i = 0

do {
    i++

    if (i == 3) {
        continue
    }

    println(i)
} while (i < 5)
```

Output:

```text
1
2
4
5
```

---

## 17. `while` vs `do-while`

| Loop | Condition checked | Minimum executions |
|---|---|---:|
| `while` | Before the loop body | 0 |
| `do-while` | After the loop body | 1 |

Example:

```kotlin
var i = 10

while (i < 5) {
    println(i)
}
// Runs 0 times
```

```kotlin
var i = 10

do {
    println(i)
} while (i < 5)
// Runs 1 time
```

---

## 18. Important Points

- `while` checks the condition **before** executing the body.
- `do-while` checks the condition **after** executing the body.
- A `while` loop can execute **zero or more times**.
- A `do-while` loop executes **at least once**.
- `break` immediately exits the nearest loop.
- `continue` skips the current iteration.
- `while (true)` creates an infinite loop until `break` or another exit mechanism is used.
- Labeled `break` and `continue` can control an outer loop.
- In every condition-controlled loop, make sure the state used by the condition can eventually change when the loop is expected to finish.
- Nested `while` loops are useful when working with multiple levels of repetition.

> **Key Point:** Use `while` when repetition depends on a condition, especially when the number of iterations is not known beforehand. Use `do-while` when the loop body must execute at least once.
