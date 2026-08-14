# Ranges

A range represents a sequence of values between a starting and ending value.

Kotlin provides several ways to create and work with ranges.

---

## 1. Inclusive Range `..`

`..` creates a range that includes both the start and end values.

```kotlin
val range = 1..5
```

Values:

```text
1 2 3 4 5
```

```kotlin
for (i in 1..5) {
    println(i)
}
```

---

## 2. `until`

`until` includes the start value but excludes the end value.

```kotlin
val range = 1 until 5
```

Values:

```text
1 2 3 4
```

This is commonly useful for array indexes.

```kotlin
val numbers = intArrayOf(10, 20, 30)

for (i in 0 until numbers.size) {
    println(numbers[i])
}
```

---

## 3. `downTo`

`downTo` creates a descending range.

```kotlin
val range = 5 downTo 1
```

Values:

```text
5 4 3 2 1
```

```kotlin
for (i in 5 downTo 1) {
    println(i)
}
```

---

## 4. `step`

`step` changes the distance between consecutive values.

```kotlin
val range = 1..10 step 2
```

Values:

```text
1 3 5 7 9
```

Descending ranges can also use `step`:

```kotlin
val range = 10 downTo 1 step 2
```

Values:

```text
10 8 6 4 2
```

---

## 5. Combining Range Operators

The common combinations are:

```kotlin
1..10
1..10 step 2

10 downTo 1
10 downTo 1 step 2

1 until 10
1 until 10 step 2
```

For example:

```kotlin
for (i in 1 until 10 step 2) {
    println(i)
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

## 6. Character Ranges

Ranges can be created using `Char`.

```kotlin
for (ch in 'a'..'e') {
    println(ch)
}
```

Output:

```text
a
b
c
d
e
```

Descending:

```kotlin
for (ch in 'e' downTo 'a') {
    println(ch)
}
```

Output:

```text
e
d
c
b
a
```

With `step`:

```kotlin
for (ch in 'a'..'z' step 2) {
    println(ch)
}
```

---

## 7. Checking a Value with `in`

`in` checks whether a value exists within a range.

```kotlin
println(5 in 1..10)   // true
println(15 in 1..10)  // false
```

`!in` checks whether a value is outside the range.

```kotlin
println(15 !in 1..10) // true
```

---

## 8. Ranges with `if`

```kotlin
val age = 25

if (age in 18..60) {
    println("Adult")
}
```

---

## 9. Ranges with `when`

```kotlin
val marks = 85

when (marks) {
    in 90..100 -> println("A")
    in 75..89 -> println("B")
    in 50..74 -> println("C")
    else -> println("Fail")
}
```

---

## 10. Empty Ranges

A range can contain no values.

```kotlin
val range = 5..1

println(range.isEmpty()) // true
```

For descending values, use `downTo`:

```kotlin
val range = 5 downTo 1

println(range.isEmpty()) // false
```

---

## 11. Range Properties

You can access the first and last values of a range.

```kotlin
val range = 1..10

println(range.first) // 1
println(range.last)  // 10
```

You can also check whether it is empty:

```kotlin
println(range.isEmpty()) // false
```

---

## 12. Common Range Patterns

### `1` to `n`

```kotlin
1..n
```

Includes `n`.

### `0` to `n - 1`

```kotlin
0 until n
```

Excludes `n`.

### `n` to `1`

```kotlin
n downTo 1
```

### Every second number

```kotlin
1..n step 2
```

### Every second number in reverse

```kotlin
n downTo 1 step 2
```

### Lowercase alphabet

```kotlin
'a'..'z'
```

### Uppercase alphabet

```kotlin
'A'..'Z'
```

> **Key Point:** `..` is inclusive, `until` excludes the upper bound, `downTo` creates descending ranges, and `step` controls the interval.