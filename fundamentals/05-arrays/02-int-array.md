# IntArray

`IntArray` is a specialized array for storing primitive `Int` values.

---

## 1. Creating an `IntArray`

```kotlin
val numbers = intArrayOf(10, 20, 30, 40)
```

You can also specify the size:

```kotlin
val numbers = IntArray(5)
```

This creates:

```text
[0, 0, 0, 0, 0]
```

---

## 2. Initialize Using Index

The constructor can generate values using the index.

```kotlin
val numbers = IntArray(5) { it }

println(numbers.contentToString())
```

Output:

```text
[0, 1, 2, 3, 4]
```

Another example:

```kotlin
val numbers = IntArray(5) { it * 2 }

println(numbers.contentToString())
```

Output:

```text
[0, 2, 4, 6, 8]
```

---

## 3. Accessing Elements

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers[0]) // 10
println(numbers[2]) // 30
```

---

## 4. Updating Elements

```kotlin
val numbers = intArrayOf(10, 20, 30)

numbers[1] = 100

println(numbers.contentToString())
```

Output:

```text
[10, 100, 30]
```

---

## 5. Size

```kotlin
val numbers = intArrayOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 6. Other Primitive Arrays

Kotlin provides specialized arrays for primitive types:

```kotlin
ByteArray
ShortArray
IntArray
LongArray
FloatArray
DoubleArray
CharArray
BooleanArray
```

Example:

```kotlin
val chars = charArrayOf('A', 'B', 'C')
val flags = booleanArrayOf(true, false, true)
```

---

## 7. `IntArray` vs `Array<Int>`

Both can store integers:

```kotlin
val a = arrayOf(1, 2, 3)
val b = intArrayOf(1, 2, 3)
```

Their types are different:

```text
a → Array<Int>
b → IntArray
```

`IntArray` is Kotlin's specialized representation for primitive `Int` values.

> **Note:** `IntArray` is commonly used when working with integer arrays, especially when performance and memory efficiency matter.