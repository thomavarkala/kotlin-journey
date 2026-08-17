# Collection Conversions

Kotlin provides convenient functions for converting between `List`, `Set`, `Array`, `String`, and their mutable or primitive-array variants.

These conversions are especially useful when solving DSA and LeetCode problems.

---

## 1. Set Conversions

A `Set` can be converted to other collection types using functions such as `toList()`, `toMutableList()`, `toMutableSet()`, and `toTypedArray()`.

| To Type | Example |
|---|---|
| `List` | `setOf(1, 2, 3).toList()` |
| `MutableList` | `setOf(1, 2, 3).toMutableList()` |
| `MutableSet` | `setOf(1, 2, 3).toMutableSet()` |
| `Array` | `setOf(1, 2, 3).toTypedArray()` |
| `String` | `setOf('a', 'b', 'c').joinToString("")` |
| `CharArray` | `setOf('a', 'b', 'c').toCharArray()` |

Example:

```kotlin
val numbers = setOf(1, 2, 3)

val list = numbers.toList()
val mutableList = numbers.toMutableList()
val mutableSet = numbers.toMutableSet()
val array = numbers.toTypedArray()
```

---

## 2. MutableSet Conversions

A `MutableSet` can be converted to immutable or other collection types.

| To Type | Example |
|---|---|
| `Set` | `mutableSetOf(1, 2, 3).toSet()` |
| `List` | `mutableSetOf(1, 2, 3).toList()` |
| `MutableList` | `mutableSetOf(1, 2, 3).toMutableList()` |
| `MutableSet` | `mutableSetOf(1, 2, 3).toMutableSet()` |
| `Array` | `mutableSetOf(1, 2, 3).toTypedArray()` |
| `String` | `mutableSetOf('a', 'b', 'c').joinToString("")` |
| `CharArray` | `mutableSetOf('a', 'b', 'c').toCharArray()` |

---

## 3. List Conversions

A `List` can be converted into sets, mutable collections, arrays, and character-based types.

| To Type | Example |
|---|---|
| `Set` | `listOf(1, 2, 3).toSet()` |
| `MutableList` | `listOf(1, 2, 3).toMutableList()` |
| `MutableSet` | `listOf(1, 2, 3).toMutableSet()` |
| `Array` | `listOf(1, 2, 3).toTypedArray()` |
| `String` | `listOf('a', 'b', 'c').joinToString("")` |
| `CharArray` | `listOf('a', 'b', 'c').toCharArray()` |

Example:

```kotlin
val numbers = listOf(1, 2, 2, 3)

val uniqueNumbers = numbers.toSet()

println(uniqueNumbers)
// [1, 2, 3]
```

This is a common way to remove duplicates from a list.

---

## 4. MutableList Conversions

A `MutableList` can be converted to immutable collections, sets, and arrays.

| To Type | Example |
|---|---|
| `List` | `mutableListOf(1, 2, 3).toList()` |
| `Set` | `mutableListOf(1, 2, 3).toSet()` |
| `MutableSet` | `mutableListOf(1, 2, 3).toMutableSet()` |
| `Array` | `mutableListOf(1, 2, 3).toTypedArray()` |
| `String` | `mutableListOf('a', 'b', 'c').joinToString("")` |
| `CharArray` | `mutableListOf('a', 'b', 'c').toCharArray()` |

---

## 5. Array Conversions

For a generic Kotlin `Array`, use `toList()`, `toSet()`, `toMutableList()`, `toMutableSet()`, and `toTypedArray()`.

| To Type | Example |
|---|---|
| `List` | `arrayOf(1, 2, 3).toList()` |
| `MutableList` | `arrayOf(1, 2, 3).toMutableList()` |
| `Set` | `arrayOf(1, 2, 3).toSet()` |
| `MutableSet` | `arrayOf(1, 2, 3).toMutableSet()` |
| `Array` | `arrayOf(1, 2, 3).toTypedArray()` |
| `String` | `arrayOf('a', 'b', 'c').joinToString("")` |
| `CharArray` | `arrayOf('a', 'b', 'c').toCharArray()` |

Example:

```kotlin
val numbers = arrayOf(1, 2, 2, 3)

val uniqueNumbers = numbers.toSet()

println(uniqueNumbers)
// [1, 2, 3]
```

---

## 6. IntArray Conversions

`IntArray` is a primitive array and is commonly encountered in LeetCode problems.

| To Type | Example |
|---|---|
| `List<Int>` | `intArrayOf(1, 2, 3).toList()` |
| `MutableList<Int>` | `intArrayOf(1, 2, 3).toMutableList()` |
| `Set<Int>` | `intArrayOf(1, 2, 3).toSet()` |
| `MutableSet<Int>` | `intArrayOf(1, 2, 3).toMutableSet()` |
| `Array<Int>` | `intArrayOf(1, 2, 3).toTypedArray()` |

Example:

```kotlin
val numbers = intArrayOf(1, 2, 2, 3)

val uniqueNumbers = numbers.toSet()

println(uniqueNumbers)
// [1, 2, 3]
```

---

## 7. CharArray Conversions

A `CharArray` can be converted into collections, a generic `Array<Char>`, or a `String`.

| To Type | Example |
|---|---|
| `List<Char>` | `charArrayOf('a', 'b', 'c').toList()` |
| `MutableList<Char>` | `charArrayOf('a', 'b', 'c').toMutableList()` |
| `Set<Char>` | `charArrayOf('a', 'b', 'c').toSet()` |
| `MutableSet<Char>` | `charArrayOf('a', 'b', 'c').toMutableSet()` |
| `Array<Char>` | `charArrayOf('a', 'b', 'c').toTypedArray()` |
| `String` | `charArrayOf('a', 'b', 'c').concatToString()` |

Example:

```kotlin
val chars = charArrayOf('h', 'e', 'l', 'l', 'o')

val uniqueChars = chars.toSet()

println(uniqueChars)
// [h, e, l, o]
```

---

## 8. String Conversions

A `String` can be treated as a sequence of characters and converted into lists, sets, and arrays.

| To Type | Example |
|---|---|
| `List<Char>` | `"hello".toList()` |
| `MutableList<Char>` | `"hello".toMutableList()` |
| `Set<Char>` | `"hello".toSet()` |
| `MutableSet<Char>` | `"hello".toMutableSet()` |
| `CharArray` | `"hello".toCharArray()` |

Example:

```kotlin
val s = "hello"

println(s.toList())
// [h, e, l, l, o]

println(s.toSet())
// [h, e, l, o]

println(s.toCharArray())
// [h, e, l, l, o]
```

### Common LeetCode Usage

Check whether a string contains duplicate characters:

```kotlin
val s = "hello"

val hasDuplicates = s.length != s.toSet().size

println(hasDuplicates)
// true
```

---

## 9. Range Conversions

Ranges can be converted into lists or sets.

| To Type | Example |
|---|---|
| `List<Int>` | `(1..5).toList()` |
| `MutableList<Int>` | `(1..5).toMutableList()` |
| `Set<Int>` | `(1..5).toSet()` |
| `MutableSet<Int>` | `(1..5).toMutableSet()` |

Example:

```kotlin
val numbers = (1..5).toSet()

println(numbers)
// [1, 2, 3, 4, 5]
```

---

## 10. Set/List to String

Converting a collection to a `String` is slightly different from normal collection conversions.

Use `joinToString()` when you want to combine elements into a string.

```kotlin
val numbers = listOf(1, 2, 3)

val result = numbers.joinToString("")

println(result)
// 123
```

With a separator:

```kotlin
val numbers = listOf(1, 2, 3)

println(numbers.joinToString(", "))
// 1, 2, 3
```

With prefix and suffix:

```kotlin
println(numbers.joinToString(", ", "[", "]"))
// [1, 2, 3]
```

For characters:

```kotlin
val chars = listOf('h', 'e', 'l', 'l', 'o')

println(chars.joinToString(""))
// hello
```

---

## 11. String to Mutable Collections

Use `toMutableList()` or `toMutableSet()` when the resulting collection needs to be modified.

```kotlin
val s = "hello"

val characters = s.toMutableList()

characters.add('!')
characters.remove('h')

println(characters)
// [e, l, l, o, !]
```

For a mutable set:

```kotlin
val s = "hello"

val characters = s.toMutableSet()

characters.add('x')
characters.remove('h')

println(characters)
// [e, l, o, x]
```

---

## 12. `toTypedArray()`

Use `toTypedArray()` when converting a collection into a generic Kotlin `Array`.

```kotlin
val numbers = listOf(1, 2, 3)

val array = numbers.toTypedArray()

println(array.contentToString())
// [1, 2, 3]
```

The same applies to sets:

```kotlin
val numbers = setOf(1, 2, 3)

val array = numbers.toTypedArray()

println(array.contentToString())
// [1, 2, 3]
```

> `toTypedArray()` is different from `toList()` and `toSet()` because it produces an `Array<T>`.

---

## 13. Important `setOf()` vs `toSet()`

These two are easy to confuse.

### `setOf()`

`setOf()` creates a set from its arguments.

```kotlin
val numbers = setOf(1, 2, 3)
```

The arguments become the elements:

```text
Set
├── 1
├── 2
└── 3
```

### `toSet()`

`toSet()` takes the elements from an existing object and creates a set.

```kotlin
val numbers = listOf(1, 2, 3).toSet()
```

The list's elements become the set's elements:

```text
List
├── 1
├── 2
└── 3
     ↓
   toSet()
     ↓
Set
├── 1
├── 2
└── 3
```

### Important difference

```kotlin
val a = setOf(listOf(1, 2, 3))

println(a)
// [[1, 2, 3]]
```

Here, the entire list is **one element**.

Type:

```text
Set<List<Int>>
```

Whereas:

```kotlin
val b = listOf(1, 2, 3).toSet()

println(b)
// [1, 2, 3]
```

Type:

```text
Set<Int>
```

---

## 14. Quick Conversion Reference

| From | To | Function |
|---|---|---|
| `List` | `Set` | `.toSet()` |
| `List` | `MutableList` | `.toMutableList()` |
| `List` | `MutableSet` | `.toMutableSet()` |
| `List` | `Array` | `.toTypedArray()` |
| `Set` | `List` | `.toList()` |
| `Set` | `MutableList` | `.toMutableList()` |
| `Set` | `MutableSet` | `.toMutableSet()` |
| `Set` | `Array` | `.toTypedArray()` |
| `Array` | `List` | `.toList()` |
| `Array` | `MutableList` | `.toMutableList()` |
| `Array` | `Set` | `.toSet()` |
| `Array` | `MutableSet` | `.toMutableSet()` |
| `IntArray` | `List<Int>` | `.toList()` |
| `IntArray` | `Set<Int>` | `.toSet()` |
| `IntArray` | `Array<Int>` | `.toTypedArray()` |
| `String` | `List<Char>` | `.toList()` |
| `String` | `Set<Char>` | `.toSet()` |
| `String` | `CharArray` | `.toCharArray()` |
| `CharArray` | `List<Char>` | `.toList()` |
| `CharArray` | `Set<Char>` | `.toSet()` |
| `CharArray` | `String` | `.concatToString()` |
| `Range` | `List` | `.toList()` |
| `Range` | `Set` | `.toSet()` |
| `Collection` | `String` | `.joinToString()` |

---

> **Key Point:** Use `toSet()` when you want the elements of an existing collection, array, string, or range converted into a set. Use `toList()` for a list, `toMutableList()`/`toMutableSet()` when modification is required, and `toTypedArray()` when an `Array<T>` is needed. For characters and strings, `toCharArray()`, `toList()`, `toSet()`, and `concatToString()` are especially useful in DSA problems.