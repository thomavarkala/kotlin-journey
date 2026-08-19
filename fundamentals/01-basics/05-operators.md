# Operators

Operators are symbols and keywords used to perform operations on values and variables.

---

## 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Remainder | `a % b` |

```kotlin
val a = 10
val b = 3

println(a + b) // 13
println(a - b) // 7
println(a * b) // 30
println(a / b) // 3
println(a % b) // 1
```

> Integer division returns an integer. `10 / 3` gives `3`.

---

## 2. Assignment Operators

Used to assign or update values.

| Operator | Example | Equivalent |
|---|---|---|
| `=` | `a = 5` | Assign |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

```kotlin
var x = 10

x += 5   // 15
x -= 3   // 12
x *= 2   // 24
x /= 4   // 6
x %= 4   // 2
```

---

## 3. Comparison Operators

Return a `Boolean`.

| Operator | Meaning |
|---|---|
| `==` | Equal |
| `!=` | Not equal |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal |
| `<=` | Less than or equal |

```kotlin
val a = 10
val b = 20

println(a == b)  // false
println(a != b)  // true
println(a < b)   // true
println(a >= b)  // false
```

---

## 4. Logical Operators

Used to combine Boolean expressions.

| Operator | Meaning |
|---|---|
| `&&` | AND |
| `||` | OR |
| `!` | NOT |

```kotlin
val age = 25
val hasId = true

println(age >= 18 && hasId) // true
println(age < 18 || hasId)  // true
println(!hasId)             // false
```

### Truth Table

| `A` | `B` | `A && B` | `A \|\| B` |
|---|---|---|---|
| `true` | `true` | `true` | `true` |
| `true` | `false` | `false` | `true` |
| `false` | `true` | `false` | `true` |
| `false` | `false` | `false` | `false` |

---

## 5. Increment and Decrement

`++` increases a value by `1`.

`--` decreases a value by `1`.

```kotlin
var x = 5

x++
println(x) // 6

x--
println(x) // 5
```

### Prefix vs Postfix

```kotlin
var x = 5

println(++x) // 6
println(x++) // 6
println(x)   // 7
```

- `++x` → increment first, then use the value.
- `x++` → use the value first, then increment.

The same applies to `--`.

---

## 6. Range Operators

`..` creates a range including both boundaries.

```kotlin
val range = 1..5
```

Values:

```text
1 2 3 4 5
```

`until` excludes the upper bound:

```kotlin
val range = 1 until 5
```

Values:

```text
1 2 3 4
```

`downTo` creates a descending range:

```kotlin
val range = 5 downTo 1
```

Values:

```text
5 4 3 2 1
```

`step` controls the increment:

```kotlin
val range = 1..10 step 2
```

Values:

```text
1 3 5 7 9
```

---

## 7. Membership Operators

`in` checks whether a value belongs to a range or collection.

```kotlin
val numbers = 1..10

println(5 in numbers)   // true
println(15 in numbers)  // false
```

`!in` checks whether a value does not belong.

```kotlin
println(15 !in numbers) // true
```

---

## 8. Type Check Operator

`is` checks whether an object is of a particular type.

```kotlin
val value: Any = "Kotlin"

println(value is String) // true
println(value is Int)    // false
```

`!is` checks that it is not a type.

```kotlin
println(value !is Int) // true
```

