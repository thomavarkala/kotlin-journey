# Break & Continue

`break` and `continue` are used to control the execution of loops.

---

## 1. `break`

`break` immediately terminates the nearest loop.

```kotlin
for (i in 1..10) {
    if (i == 5) {
        break
    }

    println(i)
}
```

Output:

```text
1
2
3
4
```

---

## 2. `continue`

`continue` skips the current iteration and moves to the next iteration.

```kotlin
for (i in 1..5) {
    if (i == 3) {
        continue
    }

    println(i)
}
```

Output:

```text
1
2
4
5
```

---

## 3. `break` with `while`

```kotlin
var i = 1

while (i <= 10) {
    if (i == 5) {
        break
    }

    println(i)
    i++
}
```

---

## 4. `continue` with `while`

```kotlin
var i = 0

while (i < 5) {
    i++

    if (i == 3) {
        continue
    }

    println(i)
}
```

Output:

```text
1
2
4
5
```

---

## 5. `break` in Nested Loops

An unlabeled `break` terminates only the **nearest enclosing loop**.

```kotlin
for (i in 1..3) {
    for (j in 1..3) {
        if (j == 2) {
            break
        }

        println("$i $j")
    }
}
```

The inner loop stops when `j == 2`, but the outer loop continues.

---

## 6. Labeled `break`

Use a label when you want to break out of an outer loop.

```kotlin
outer@ for (i in 1..3) {
    for (j in 1..3) {
        if (i == 2 && j == 2) {
            break@outer
        }

        println("$i $j")
    }
}
```

`break@outer` terminates the loop marked with `outer@`.

---

## 7. `continue` in Nested Loops

An unlabeled `continue` affects the nearest enclosing loop.

```kotlin
for (i in 1..2) {
    for (j in 1..3) {
        if (j == 2) {
            continue
        }

        println("$i $j")
    }
}
```

---

## 8. Labeled `continue`

Use a label when you want to continue an outer loop.

```kotlin
outer@ for (i in 1..3) {
    for (j in 1..3) {
        if (j == 2) {
            continue@outer
        }

        println("$i $j")
    }
}
```

When `j == 2`, the current outer-loop iteration is skipped and the next value of `i` begins.

---

## 9. `break` vs `continue`

```text
break     → exits the loop completely
continue  → skips the current iteration
```

Example:

```kotlin
for (i in 1..5) {
    if (i == 3) break
    println(i)
}
```

```text
1
2
```

```kotlin
for (i in 1..5) {
    if (i == 3) continue
    println(i)
}
```

```text
1
2
4
5
```

> **Key Point:** Use `break` when you are done with the loop and `continue` when you only want to skip the current iteration.