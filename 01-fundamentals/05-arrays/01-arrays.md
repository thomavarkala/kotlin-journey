# Arrays

An `Array` stores a fixed-size sequence of elements of the same type.

---

## 1. Creating an Array

Use `arrayOf()` to create an array.

```kotlin
val numbers = arrayOf(10, 20, 30, 40)
val names = arrayOf("Tom", "Sam", "John")
```

The type can also be specified explicitly:

```kotlin
val numbers: Array<Int> = arrayOf(10, 20, 30)
```

---

## 2. Accessing Elements

Array indexes start from `0`.

```kotlin
val numbers = arrayOf(10, 20, 30)

println(numbers[0]) // 10
println(numbers[2]) // 30
```

You can also use `get()`:

```kotlin
println(numbers.get(1)) // 20
```

---

## 3. Updating Elements

Arrays are mutable, so their elements can be changed.

```kotlin
val numbers = arrayOf(10, 20, 30)

numbers[1] = 50

println(numbers[1]) // 50
```

`val` prevents reassignment of the array reference, not modification of its elements.

```kotlin
val numbers = arrayOf(10, 20, 30)

numbers[0] = 100 // Valid

// numbers = arrayOf(1, 2, 3) // Error
```

---

## 4. Array Size

Use `size` to get the number of elements.

```kotlin
val numbers = arrayOf(10, 20, 30)

println(numbers.size) // 3
```

---

## 5. Creating an Array with a Size

Use `Array(size) { }` when you want to generate elements.

```kotlin
val numbers = Array(5) { 0 }

println(numbers.contentToString())
```

Output:

```text
[0, 0, 0, 0, 0]
```

The lambda receives the index:

```kotlin
val numbers = Array(5) { it }

println(numbers.contentToString())
```

Output:

```text
[0, 1, 2, 3, 4]
```

---

## 6. Array of Different Types

An array normally stores elements of the same type.

```kotlin
val numbers = arrayOf(10, 20, 30)
val names = arrayOf("Tom", "Sam", "John")
```

You can use `Array<Any>` when different types are required:

```kotlin
val values: Array<Any> = arrayOf(10, "Kotlin", true)
```

---

## 7. Printing an Array

Printing an array directly does not display its elements as expected.

Use `contentToString()`:

```kotlin
val numbers = arrayOf(10, 20, 30)

println(numbers.contentToString())
```

Output:

```text
[10, 20, 30]
```

> `Array` has a fixed size. If you need a resizable collection, use `MutableList`.