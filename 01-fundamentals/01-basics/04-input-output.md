# Input & Output

Kotlin provides simple ways to read input and display output.

---

## 1. Reading a Single Value

### Integer

```kotlin
val age = readLine()!!.toInt()
```

### Long

```kotlin
val number = readLine()!!.toLong()
```

### Double

```kotlin
val price = readLine()!!.toDouble()
```

### String

```kotlin
val name = readLine()!!
```

---

## 2. Reading Multiple Values

For input:

```text
10 20
```

```kotlin
val (a, b) = readLine()!!.split(" ").map { it.toInt() }
```

For three values:

```text
10 20 30
```

```kotlin
val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
```

---

## 3. Reading an Array

For input:

```text
10 20 30 40 50
```

```kotlin
val numbers = readLine()!!
    .split(" ")
    .map { it.toInt() }
```

As an `IntArray`:

```kotlin
val numbers = readLine()!!
    .split(" ")
    .map { it.toInt() }
    .toIntArray()
```

---

## 4. Reading Multiple Lines

```kotlin
val firstName = readLine()!!
val lastName = readLine()!!
```

Each `readLine()` reads one complete line.

---

## 5. Reading a Matrix

For:

```text
1 2 3
4 5 6
7 8 9
```

```kotlin
val matrix = Array(3) {
    readLine()!!
        .split(" ")
        .map { it.toInt() }
}
```

---

## 6. Printing Output

### Single Value

```kotlin
println(100)
```

### String

```kotlin
println("Hello, Kotlin!")
```

### Multiple Values

```kotlin
val a = 10
val b = 20

println("$a $b")
```

---

## 7. `print()` vs `println()`

`print()` does not add a new line.

```kotlin
print("Hello ")
print("Kotlin")
```

Output:

```text
Hello Kotlin
```

`println()` adds a new line.

```kotlin
println("Hello")
println("Kotlin")
```

Output:

```text
Hello
Kotlin
```

---

## 8. Printing Arrays

Use `joinToString()` to print array elements.

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.joinToString(" "))
```

Output:

```text
10 20 30
```

---

## 9. String Templates

Variables can be directly inserted into strings using `$`.

```kotlin
val name = "Kotlin"
val version = 2

println("Language: $name")
println("Version: $version")
```

For expressions, use `${}`:

```kotlin
val a = 10
val b = 20

println("Sum = ${a + b}")
```

---

## 10. Reading Input with `BufferedReader`

For reading lines using a buffered reader:

```kotlin
val br = System.`in`.bufferedReader()

val name = br.readLine()
val age = br.readLine().toInt()
```

This is another way to read input instead of using `readLine()`.

