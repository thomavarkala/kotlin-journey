# IntArray

`IntArray` is a specialized Kotlin array for storing primitive `Int` values. It is commonly used in LeetCode because many problems use `IntArray` as the input type.

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

Kotlin does **not** support negative indexing:

```kotlin
numbers[-1] // ❌ IndexOutOfBoundsException
```

For the last element:

```kotlin
numbers[numbers.lastIndex]
numbers.last()
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

## 5. Size and Index

```kotlin
val numbers = intArrayOf(10, 20, 30)

numbers.size       // 3
numbers.lastIndex  // 2
numbers.indices    // 0..2
```

Useful in loops:

```kotlin
for (i in numbers.indices) {
    println(numbers[i])
}
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

---

# Useful Functions for LeetCode

## 8. `sum()`

Returns the sum of all elements.

```kotlin
val nums = intArrayOf(1, 2, 3, 4)

val sum = nums.sum()

println(sum) // 10
```

Instead of manually looping:

```kotlin
var sum = 0

for (num in nums) {
    sum += num
}
```

You can write:

```kotlin
val sum = nums.sum()
```

Example:

```kotlin
fun minOperations(nums: IntArray, k: Int): Int {
    return nums.sum() % k
}
```

---

## 9. `max()` and `min()`

Find the largest and smallest elements.

```kotlin
val nums = intArrayOf(5, 2, 8, 1)

nums.max() // 8
nums.min() // 1
```

Nullable versions:

```kotlin
nums.maxOrNull()
nums.minOrNull()
```

`maxOrNull()` and `minOrNull()` return `null` for an empty array.

---

## 10. `average()`

Returns the average as a `Double`.

```kotlin
val nums = intArrayOf(10, 20, 30)

println(nums.average()) // 20.0
```

---

## 11. `count()`

Count elements satisfying a condition:

```kotlin
val nums = intArrayOf(1, 2, 3, 4, 5)

val even = nums.count { it % 2 == 0 }

println(even) // 2
```

Without a condition:

```kotlin
nums.count() // 5
```

---

## 12. `contains()`

Check whether an element exists.

```kotlin
val nums = intArrayOf(10, 20, 30)

nums.contains(20) // true
nums.contains(50) // false
```

You can also use:

```kotlin
20 in nums // true
```

---

## 13. `indexOf()`

Find the first index of an element.

```kotlin
val nums = intArrayOf(10, 20, 30, 20)

nums.indexOf(20) // 1
```

If the element does not exist:

```kotlin
nums.indexOf(50) // -1
```

---

## 14. `lastIndexOf()`

Find the last occurrence.

```kotlin
val nums = intArrayOf(10, 20, 30, 20)

nums.lastIndexOf(20) // 3
```

---

## 15. `any()`

Check whether **at least one** element satisfies a condition.

```kotlin
val nums = intArrayOf(1, 3, 5, 8)

nums.any { it % 2 == 0 } // true
```

---

## 16. `all()`

Check whether **every** element satisfies a condition.

```kotlin
val nums = intArrayOf(2, 4, 6, 8)

nums.all { it % 2 == 0 } // true
```

---

## 17. `none()`

Check whether **no** element satisfies a condition.

```kotlin
val nums = intArrayOf(1, 3, 5)

nums.none { it % 2 == 0 } // true
```

---

## 18. `find()`

Returns the first element satisfying a condition.

```kotlin
val nums = intArrayOf(1, 3, 4, 6)

nums.find { it % 2 == 0 } // 4
```

Returns `null` if nothing is found.

---

## 19. `first()` and `last()`

```kotlin
val nums = intArrayOf(10, 20, 30)

nums.first() // 10
nums.last()  // 30
```

With conditions:

```kotlin
nums.first { it > 15 } // 20
nums.last { it < 30 }  // 20
```

For empty arrays:

```kotlin
nums.firstOrNull()
nums.lastOrNull()
```

---

# Transforming an `IntArray`

## 20. `map()`

Transforms every element.

```kotlin
val nums = intArrayOf(1, 2, 3)

val result = nums.map { it * 2 }

println(result) // [2, 4, 6]
```

`map()` returns a `List<Int>`, not an `IntArray`.

If you need an `IntArray`:

```kotlin
val result = nums.map { it * 2 }.toIntArray()
```

---

## 21. `filter()`

Keep elements satisfying a condition.

```kotlin
val nums = intArrayOf(1, 2, 3, 4, 5)

val result = nums.filter { it % 2 == 0 }

println(result) // [2, 4]
```

Returns a `List<Int>`.

Convert back if needed:

```kotlin
val result = nums.filter { it % 2 == 0 }.toIntArray()
```

---

## 22. `filterNot()`

Remove elements satisfying a condition.

```kotlin
val nums = intArrayOf(1, 2, 3, 4)

val result = nums.filterNot { it % 2 == 0 }

println(result) // [1, 3]
```

---

## 23. `distinct()`

Remove duplicate values.

```kotlin
val nums = intArrayOf(1, 2, 2, 3, 3, 3)

val result = nums.distinct()

println(result) // [1, 2, 3]
```

Returns a `List<Int>`.

---

# Sorting

## 24. `sort()`

Sorts the `IntArray` in ascending order.

```kotlin
val nums = intArrayOf(5, 2, 8, 1)

nums.sort()

println(nums.contentToString())
```

Output:

```text
[1, 2, 5, 8]
```

`sort()` modifies the original array.

---

## 25. `sortDescending()`

Returns a descending sorted list.

```kotlin
val nums = intArrayOf(5, 2, 8, 1)

val result = nums.sortedDescending()

println(result) // [8, 5, 2, 1]
```

---

## 26. `sorted()`

Returns a sorted `List<Int>` without modifying the original array.

```kotlin
val nums = intArrayOf(5, 2, 8, 1)

val result = nums.sorted()

println(result) // [1, 2, 5, 8]
```

---

# Reversing

## 27. `reverse()`

Reverses the original array.

```kotlin
val nums = intArrayOf(1, 2, 3, 4)

nums.reverse()

println(nums.contentToString())
```

Output:

```text
[4, 3, 2, 1]
```

---

## 28. `reversed()`

Returns a reversed `List<Int>` without modifying the original array.

```kotlin
val nums = intArrayOf(1, 2, 3)

val result = nums.reversed()

println(result) // [3, 2, 1]
```

---

# Iteration

## 29. `forEach`

```kotlin
val nums = intArrayOf(10, 20, 30)

nums.forEach {
    println(it)
}
```

---

## 30. `forEachIndexed`

Useful when both index and value are required.

```kotlin
val nums = intArrayOf(10, 20, 30)

nums.forEachIndexed { index, value ->
    println("$index -> $value")
}
```

---

## 31. `withIndex()`

Another way to access index and value:

```kotlin
for ((index, value) in nums.withIndex()) {
    println("$index -> $value")
}
```

---

# Useful Conversions

## 32. `toList()`

```kotlin
val nums = intArrayOf(1, 2, 3)

val list = nums.toList()
```

---

## 33. `toMutableList()`

```kotlin
val nums = intArrayOf(1, 2, 3)

val list = nums.toMutableList()

list.add(4)
```

---

## 34. `toIntArray()`

Convert a collection back to `IntArray`.

```kotlin
val list = listOf(1, 2, 3)

val nums = list.toIntArray()
```

Useful after `filter()` or `map()`:

```kotlin
val result = nums
    .filter { it > 0 }
    .toIntArray()
```

---

# Array Utilities

## 35. `contentToString()`

Use this to print the contents of an `IntArray`.

```kotlin
val nums = intArrayOf(1, 2, 3)

println(nums.contentToString())
```

Output:

```text
[1, 2, 3]
```

---

## 36. `contentEquals()`

Compare two arrays by their contents.

```kotlin
val a = intArrayOf(1, 2, 3)
val b = intArrayOf(1, 2, 3)

a.contentEquals(b) // true
```

---

## 37. `copyOf()`

Create a copy of an array.

```kotlin
val nums = intArrayOf(1, 2, 3)

val copy = nums.copyOf()
```

You can also change the size:

```kotlin
val copy = nums.copyOf(5)

println(copy.contentToString())
```

Output:

```text
[1, 2, 3, 0, 0]
```

---

## 38. `copyOfRange()`

Copy a specific range.

```kotlin
val nums = intArrayOf(10, 20, 30, 40, 50)

val result = nums.copyOfRange(1, 4)

println(result.contentToString())
```

Output:

```text
[20, 30, 40]
```

The end index is **exclusive**.

---

# Common LeetCode Patterns

## Sum

```kotlin
val sum = nums.sum()
```

## Maximum

```kotlin
val max = nums.max()
```

## Minimum

```kotlin
val min = nums.min()
```

## Count Matching Elements

```kotlin
val count = nums.count { it > 0 }
```

## Check Existence

```kotlin
if (target in nums) {
    // found
}
```

## Find Index

```kotlin
val index = nums.indexOf(target)
```

## Count a Specific Value

```kotlin
val count = nums.count { it == target }
```

## Count Even / Odd

```kotlin
val even = nums.count { it % 2 == 0 }
val odd = nums.count { it % 2 != 0 }
```

## Check All

```kotlin
nums.all { it > 0 }
```

## Check Any

```kotlin
nums.any { it < 0 }
```

## Transform

```kotlin
val result = nums.map { it * 2 }
```

## Filter

```kotlin
val result = nums.filter { it > 0 }
```

## Sort

```kotlin
nums.sort()
```

## Reverse

```kotlin
nums.reverse()
```

## Loop Through Indexes

```kotlin
for (i in nums.indices) {
    println(nums[i])
}
```

## Reverse Loop

```kotlin
for (i in nums.lastIndex downTo 0) {
    println(nums[i])
}
```
