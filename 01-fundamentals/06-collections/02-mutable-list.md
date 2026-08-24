# Mutable List

A `MutableList` is an ordered collection whose elements can be **added, removed, updated, and rearranged**.

```kotlin
val numbers = mutableListOf(10, 20, 30)
```

> **Important:** `MutableList` is an interface. `mutableListOf()` creates a mutable list implementation for you.

---

## 1. Creating a Mutable List

### `mutableListOf()`

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers)
```

Output:

```text
[10, 20, 30]
```

You can also create an empty mutable list:

```kotlin
val numbers = mutableListOf<Int>()
```

### Type inference

```kotlin
val numbers = mutableListOf(10, 20, 30)
```

Kotlin infers:

```text
MutableList<Int>
```

---

# 2. Accessing Elements

## `list[index]`

Access an element using its zero-based index.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers[0])
println(numbers[1])
println(numbers[2])
```

Output:

```text
10
20
30
```

```text
TC: O(1)
SC: O(1)
```

> Accessing an element by index is constant time for the usual array-backed mutable-list implementation.

---

## `get(index)`

Equivalent to using `[]`.

```kotlin
println(numbers.get(1))
```

```text
TC: O(1)
SC: O(1)
```

---

## `getOrNull(index)`

Returns `null` instead of throwing an exception when the index is invalid.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.getOrNull(1))
println(numbers.getOrNull(10))
```

Output:

```text
20
null
```

```text
TC: O(1)
SC: O(1)
```

---

# 3. Adding Elements

## `add(element)`

Adds an element to the end.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.add(40)

println(numbers)
```

Output:

```text
[10, 20, 30, 40]
```

```text
TC: O(1) amortized
SC: O(1) amortized
```

> Occasionally the internal array needs to grow, which can make one insertion O(n). Over many insertions, the amortized cost is O(1).

---

## `add(index, element)`

Adds an element at a specific position.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.add(1, 15)

println(numbers)
```

Output:

```text
[10, 15, 20, 30]
```

Elements after the index must be shifted.

```text
TC: O(n)
SC: O(1)
```

---

## `addAll(collection)`

Adds all elements from another collection to the end.

```kotlin
val numbers = mutableListOf(10, 20)

numbers.addAll(listOf(30, 40, 50))

println(numbers)
```

Output:

```text
[10, 20, 30, 40, 50]
```

If `k` elements are added:

```text
TC: O(k) amortized
SC: O(k) amortized
```

---

## `addAll(index, collection)`

Inserts multiple elements at a particular index.

```kotlin
val numbers = mutableListOf(10, 20, 50)

numbers.addAll(2, listOf(30, 40))

println(numbers)
```

Output:

```text
[10, 20, 30, 40, 50]
```

```text
TC: O(n + k)
SC: O(k)
```

---

# 4. Updating Elements

## `list[index] = value`

Replaces an existing element.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers[1] = 100

println(numbers)
```

Output:

```text
[10, 100, 30]
```

```text
TC: O(1)
SC: O(1)
```

---

## `set(index, value)`

Equivalent to `list[index] = value`.

```kotlin
numbers.set(1, 200)
```

```text
TC: O(1)
SC: O(1)
```

---

# 5. Removing Elements

## `remove(element)`

Removes the first matching element.

```kotlin
val numbers = mutableListOf(10, 20, 30, 20)

numbers.remove(20)

println(numbers)
```

Output:

```text
[10, 30, 20]
```

If the element is not present, nothing is removed.

```text
TC: O(n)
SC: O(1)
```

> The list may need to search for the element first.

---

## `removeAt(index)`

Removes the element at a specific index.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.removeAt(1)

println(numbers)
```

Output:

```text
[10, 30]
```

```text
TC: O(n)
SC: O(1)
```

> Removing from the middle or beginning requires shifting elements.

---

## `removeFirst()`

Removes the first element.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.removeFirst()

println(numbers)
```

Output:

```text
[20, 30]
```

```text
TC: O(n)
SC: O(1)
```

---

## `removeLast()`

Removes the last element.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.removeLast()

println(numbers)
```

Output:

```text
[10, 20]
```

```text
TC: O(1)
SC: O(1)
```

This is the Kotlin equivalent of a common **pop from the end** operation.

---

## Removing the last element only if it exists

For a potentially empty list:

```kotlin
val numbers = mutableListOf<Int>()

numbers.removeLastOrNull()
```

If the list is empty, it returns `null`.

```text
TC: O(1)
SC: O(1)
```

---

## `removeAll { }`

Removes every element satisfying a condition.

```kotlin
val numbers = mutableListOf(10, 15, 20, 25, 30)

numbers.removeAll { it % 2 == 0 }

println(numbers)
```

Output:

```text
[15, 25]
```

```text
TC: O(n)
SC: O(1)
```

---

## `retainAll()`

Keeps only the elements that are present in another collection.

```kotlin
val numbers = mutableListOf(10, 20, 30, 40)

numbers.retainAll(listOf(20, 40))

println(numbers)
```

Output:

```text
[20, 40]
```

```text
TC: O(n * k)
SC: O(1)
```

> For a `Set` as the argument, membership checking can be much faster.

---

## `clear()`

Removes every element.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.clear()

println(numbers)
```

Output:

```text
[]
```

```text
TC: O(n)
SC: O(1)
```

---

# 6. Checking the List

## `size`

Returns the number of elements.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.size)
```

Output:

```text
3
```

```text
TC: O(1)
SC: O(1)
```

---

## `isEmpty()`

Checks whether the list contains no elements.

```kotlin
println(numbers.isEmpty())
```

```text
TC: O(1)
SC: O(1)
```

---

## `isNotEmpty()`

Checks whether the list contains at least one element.

```kotlin
println(numbers.isNotEmpty())
```

```text
TC: O(1)
SC: O(1)
```

---

## `contains(element)`

Checks whether an element exists.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.contains(20))
```

Output:

```text
true
```

```text
TC: O(n)
SC: O(1)
```

---

## `in`

Kotlin provides a convenient syntax for `contains()`.

```kotlin
if (20 in numbers) {
    println("Found")
}
```

```text
TC: O(n)
SC: O(1)
```

---

## `containsAll()`

Checks whether all specified elements exist.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.containsAll(listOf(10, 30)))
```

```text
TC: O(n * k)
SC: O(1)
```

> Here `n` is the list size and `k` is the number of elements being searched for.

---

# 7. Finding Elements

## `indexOf(element)`

Returns the first index of an element.

```kotlin
val numbers = mutableListOf(10, 20, 30, 20)

println(numbers.indexOf(20))
```

Output:

```text
1
```

If not found:

```text
-1
```

```text
TC: O(n)
SC: O(1)
```

---

## `lastIndexOf(element)`

Returns the last index of an element.

```kotlin
val numbers = mutableListOf(10, 20, 30, 20)

println(numbers.lastIndexOf(20))
```

Output:

```text
3
```

```text
TC: O(n)
SC: O(1)
```

---

## `firstOrNull()`

Returns the first element or `null` if the list is empty.

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers.firstOrNull())
```

```text
TC: O(1)
SC: O(1)
```

---

## `lastOrNull()`

Returns the last element or `null`.

```kotlin
println(numbers.lastOrNull())
```

```text
TC: O(1)
SC: O(1)
```

---

## `first { }`

Returns the first element satisfying a condition.

```kotlin
val numbers = mutableListOf(10, 15, 20, 25)

val result = numbers.first { it > 18 }

println(result)
```

Output:

```text
20
```

```text
TC: O(n)
SC: O(1)
```

---

## `firstOrNull { }`

Same idea, but returns `null` if nothing matches.

```kotlin
val result = numbers.firstOrNull { it > 100 }
```

```text
TC: O(n)
SC: O(1)
```

---

# 8. Iterating

## Basic `for` loop

```kotlin
for (number in numbers) {
    println(number)
}
```

```text
TC: O(n)
SC: O(1)
```

---

## Using indices

```kotlin
for (i in numbers.indices) {
    println(numbers[i])
}
```

```text
TC: O(n)
SC: O(1)
```

---

## `withIndex()`

Use this when you need both index and value.

```kotlin
for ((index, value) in numbers.withIndex()) {
    println("$index -> $value")
}
```

```text
TC: O(n)
SC: O(1)
```

---

## `forEach`

```kotlin
numbers.forEach {
    println(it)
}
```

```text
TC: O(n)
SC: O(1)
```

---

# 9. Sorting a Mutable List

## `sort()`

Sorts the list in ascending order.

```kotlin
val numbers = mutableListOf(30, 10, 20)

numbers.sort()

println(numbers)
```

Output:

```text
[10, 20, 30]
```

```text
TC: O(n log n)
```

---

## `sortDescending()`

Sorts in descending order.

```kotlin
numbers.sortDescending()
```

```text
TC: O(n log n)
```

---

## `reverse()`

Reverses the existing list.

```kotlin
val numbers = mutableListOf(10, 20, 30)

numbers.reverse()

println(numbers)
```

Output:

```text
[30, 20, 10]
```

```text
TC: O(n)
SC: O(1)
```

---

## `shuffle()`

Randomly rearranges the elements.

```kotlin
numbers.shuffle()
```

```text
TC: O(n)
SC: O(1)
```

---

# 10. Useful Stack-Like Operations

A `MutableList` can be used as a simple stack.

## Push

Add to the end:

```kotlin
val stack = mutableListOf<Int>()

stack.add(10)
stack.add(20)
stack.add(30)
```

```text
TC: O(1) amortized
```

---

## Pop

Remove from the end:

```kotlin
val value = stack.removeLast()
```

```text
TC: O(1)
SC: O(1)
```

---

## Peek

Look at the last element without removing it:

```kotlin
val value = stack.last()
```

For a possibly empty list:

```kotlin
val value = stack.lastOrNull()
```

```text
TC: O(1)
SC: O(1)
```

### Stack pattern

```kotlin
val stack = mutableListOf<Int>()

// Push
stack.add(10)
stack.add(20)
stack.add(30)

// Peek
println(stack.last())

// Pop
println(stack.removeLast())
```

Output:

```text
30
30
```

---

# 11. Copying a Mutable List

## `toMutableList()`

Creates a new mutable list containing the same elements.

```kotlin
val original = mutableListOf(10, 20, 30)

val copy = original.toMutableList()

copy.add(40)

println(original)
println(copy)
```

Output:

```text
[10, 20, 30]
[10, 20, 30, 40]
```

The lists are separate.

```text
TC: O(n)
SC: O(n)
```

---

# 12. Read-Only Reference

A mutable list can be referenced through the `List` interface.

```kotlin
val mutable = mutableListOf(10, 20, 30)

val readOnly: List<Int> = mutable
```

You cannot modify it through `readOnly`:

```kotlin
// readOnly.add(40)   // Error
// readOnly.remove(20) // Error
```

But the original mutable list can still change:

```kotlin
mutable.add(40)

println(readOnly)
```

Output:

```text
[10, 20, 30, 40]
```

> **Important:** `List` is a read-only interface, not necessarily an immutable snapshot.

---

# 13. Useful Kotlin Properties and Functions

## `indices`

Returns the valid indices of the list.

```kotlin
val numbers = mutableListOf(10, 20, 30)

for (i in numbers.indices) {
    println(numbers[i])
}
```

For:

```text
[10, 20, 30]
```

the indices are:

```text
0, 1, 2
```

---

## `lastIndex`

Returns the last valid index.

```kotlin
println(numbers.lastIndex)
```

For a list of size `3`:

```text
2
```

```text
TC: O(1)
SC: O(1)
```

---

# 14. Important Edge Cases

## Removing from an empty list

This throws an exception:

```kotlin
val numbers = mutableListOf<Int>()

numbers.removeLast()
```

Use this when the list might be empty:

```kotlin
numbers.removeLastOrNull()
```

---

## Accessing an invalid index

This throws an exception:

```kotlin
val numbers = mutableListOf(10, 20, 30)

println(numbers[10])
```

Use:

```kotlin
println(numbers.getOrNull(10))
```

Output:

```text
null
```

