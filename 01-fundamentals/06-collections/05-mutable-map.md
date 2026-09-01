# MutableMap

A `MutableMap` stores **key-value pairs** and allows elements to be **added, removed, and updated**.

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30
)
```

> **Key Point:** `MutableMap` is useful when you need to store data as `key -> value` and modify it.

---

## 1. Creating a MutableMap

### Empty Map

```kotlin
val map = mutableMapOf<String, Int>()
```

### With Elements

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30,
    "John" to 28
)
```

---

# 2. Adding Elements

Use `[]` or `put()`.

```kotlin
ages["Alex"] = 35
```

Equivalent:

```kotlin
ages.put("Alex", 35)
```

If the key already exists, the value is **updated**.

```kotlin
ages["Tom"] = 26
```

---

# 3. Updating a Value

```kotlin
ages["Tom"] = 26
```

```kotlin
println(ages["Tom"])
```

Output:

```text
26
```

> Assigning a value to an existing key replaces the old value.

---

# 4. Getting a Value

Use `[]`:

```kotlin
val age = ages["Tom"]
```

The result is nullable because the key might not exist.

```kotlin
val age: Int? = ages["Tom"]
```

You can also use:

```kotlin
ages.get("Tom")
```

Both are equivalent:

```kotlin
ages["Tom"]
ages.get("Tom")
```

---

# 5. `getOrDefault()`

Returns the value if the key exists, otherwise returns the specified default.

```kotlin
val age = ages.getOrDefault("Unknown", 0)

println(age)
```

Output:

```text
0
```

Useful when you don't want to deal with `null`.

---

# 6. `getOrPut()`

Returns the existing value or inserts a default value if the key doesn't exist.

```kotlin
val counts = mutableMapOf<String, Int>()

val count = counts.getOrPut("Kotlin") { 0 }

println(count)
```

The map becomes:

```text
{Kotlin=0}
```

### Very useful for frequency counting

```kotlin
val counts = mutableMapOf<Char, Int>()

for (ch in "aabccc") {
    counts[ch] = counts.getOrDefault(ch, 0) + 1
}
```

Result:

```text
{a=2, b=1, c=3}
```

Or:

```kotlin
val counts = mutableMapOf<Char, Int>()

for (ch in "aabccc") {
    counts[ch] = counts.getOrPut(ch) { 0 } + 1
}
```

---

# 7. Removing Elements

Remove by key:

```kotlin
ages.remove("Sam")
```

Remove only if the key has a specific value:

```kotlin
ages.remove("Tom", 26)
```

Clear the entire map:

```kotlin
ages.clear()
```

---

# 8. Checking the Map

### Size

```kotlin
ages.size
```

### Empty

```kotlin
ages.isEmpty()
```

### Not Empty

```kotlin
ages.isNotEmpty()
```

### Check Key

```kotlin
ages.containsKey("Tom")
```

or:

```kotlin
"Tom" in ages
```

### Check Value

```kotlin
ages.containsValue(26)
```

or:

```kotlin
26 in ages.values
```

---

# 9. Keys, Values and Entries

A map has three important views:

```kotlin
ages.keys
ages.values
ages.entries
```

Example:

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30
)
```

### Keys

```kotlin
println(ages.keys)
```

```text
[Tom, Sam]
```

### Values

```kotlin
println(ages.values)
```

```text
[25, 30]
```

### Entries

```kotlin
println(ages.entries)
```

```text
[Tom=25, Sam=30]
```

Each entry contains:

```kotlin
entry.key
entry.value
```

---

# 10. Iterating Over a Map

### Key and Value

```kotlin
for ((name, age) in ages) {
    println("$name -> $age")
}
```

### Using Entries

```kotlin
for (entry in ages.entries) {
    println("${entry.key} -> ${entry.value}")
}
```

### Keys Only

```kotlin
for (key in ages.keys) {
    println(key)
}
```

### Values Only

```kotlin
for (value in ages.values) {
    println(value)
}
```

---

# 11. Convert Map to List

This is especially useful for **sorting**.

## List of Map Entries

```kotlin
val list = ages.entries.toList()
```

Example:

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30,
    "John" to 28
)

val list = ages.entries.toList()
```

The list contains:

```text
[Tom=25, Sam=30, John=28]
```

Each element is a:

```kotlin
Map.Entry<String, Int>
```

Access them using:

```kotlin
list[0].key
list[0].value
```

---

# 12. Convert Map to List of Pairs

You can also convert the entries into `Pair`s:

```kotlin
val list = ages.map { (key, value) ->
    key to value
}
```

Result:

```text
[(Tom, 25), (Sam, 30), (John, 28)]
```

Each element is:

```kotlin
Pair<String, Int>
```

Access:

```kotlin
list[0].first
list[0].second
```

---

# 13. Convert Only Keys to List

```kotlin
val keys = ages.keys.toList()
```

---

# 14. Convert Only Values to List

```kotlin
val values = ages.values.toList()
```

---

# 15. Sort Map by Key

Use `toSortedMap()`.

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Alex" to 35,
    "John" to 28
)

val sorted = ages.toSortedMap()
```

Result:

```text
{Alex=35, John=28, Tom=25}
```

Keys are sorted in ascending order.

---

# 16. Sort Map by Key in Descending Order

```kotlin
val sorted = ages.toSortedMap(compareByDescending { it })
```

Result:

```text
{Tom=25, John=28, Alex=35}
```

---

# 17. Sort Entries by Key

If you want a **List** rather than a sorted map:

```kotlin
val sorted = ages.entries.sortedBy { it.key }
```

Descending:

```kotlin
val sorted = ages.entries.sortedByDescending { it.key }
```

---

# 18. Sort Entries by Value

Ascending:

```kotlin
val sorted = ages.entries.sortedBy { it.value }
```

Example:

```text
[Tom=25, John=28, Alex=35]
```

Descending:

```kotlin
val sorted = ages.entries.sortedByDescending { it.value }
```

Result:

```text
[Alex=35, John=28, Tom=25]
```

---

# 19. Sort by Value, Then by Key

This is very useful in DSA problems.

```kotlin
val sorted = ages.entries.sortedWith(
    compareBy<Map.Entry<String, Int>> { it.value }
        .thenBy { it.key }
)
```

For descending value:

```kotlin
val sorted = ages.entries.sortedWith(
    compareByDescending<Map.Entry<String, Int>> { it.value }
        .thenBy { it.key }
)
```

---

# 20. Convert Sorted Entries Back to a Map

```kotlin
val sortedMap = ages.entries
    .sortedBy { it.value }
    .associate { it.key to it.value }
```

If you need a mutable map:

```kotlin
val sortedMap = ages.entries
    .sortedBy { it.value }
    .associate { it.key to it.value }
    .toMutableMap()
```

> Remember: sorting a map often means converting its entries into a list first.

---

# 21. Find Minimum Entry

Minimum by key:

```kotlin
val minKey = ages.minByOrNull { it.key }
```

Minimum by value:

```kotlin
val minValue = ages.minByOrNull { it.value }
```

Example:

```kotlin
val ages = mutableMapOf(
    "Tom" to 25,
    "Sam" to 30,
    "John" to 28
)

val result = ages.minByOrNull { it.value }

println(result)
```

Output:

```text
Tom=25
```

---

# 22. Find Maximum Entry

Maximum by key:

```kotlin
val maxKey = ages.maxByOrNull { it.key }
```

Maximum by value:

```kotlin
val maxValue = ages.maxByOrNull { it.value }
```

Example:

```kotlin
val result = ages.maxByOrNull { it.value }

println(result)
```

Output:

```text
Sam=30
```

---

# 23. Find Minimum / Maximum Value

If you only need the value:

```kotlin
val min = ages.values.minOrNull()
val max = ages.values.maxOrNull()
```

---

# 24. Find Minimum / Maximum Key

```kotlin
val min = ages.keys.minOrNull()
val max = ages.keys.maxOrNull()
```

---

# 25. Filter a Map

Filter by value:

```kotlin
val result = ages.filter { (_, age) ->
    age >= 28
}
```

Result:

```text
{Sam=30, John=28}
```

Filter by key:

```kotlin
val result = ages.filter { (name, _) ->
    name.startsWith("J")
}
```

---

# 26. Filter Keys

```kotlin
val result = ages.filterKeys { it.startsWith("J") }
```

---

# 27. Filter Values

```kotlin
val result = ages.filterValues { it >= 28 }
```

---

# 28. Map / Transform Values

Change every value:

```kotlin
val result = ages.mapValues { (_, age) ->
    age + 1
}
```

Example:

```text
{Tom=26, Sam=31, John=29}
```

---

# 29. Transform Keys

```kotlin
val result = ages.mapKeys { (name, _) ->
    name.uppercase()
}
```

Result:

```text
{TOM=25, SAM=30, JOHN=28}
```

---

# 30. Check Whether Any Entry Matches

```kotlin
val result = ages.any { (_, age) ->
    age > 30
}
```

---

# 31. Check Whether All Entries Match

```kotlin
val result = ages.all { (_, age) ->
    age >= 18
}
```

---

# 32. Find an Entry

Find the first entry matching a condition:

```kotlin
val result = ages.entries.find {
    it.value > 25
}
```

Or:

```kotlin
val result = ages.find {
    it.value > 25
}
```

---

# 33. Count Entries Matching a Condition

```kotlin
val count = ages.count {
    it.value >= 25
}
```

---

# 34. Count Frequencies

A very common DSA pattern:

```kotlin
val frequency = mutableMapOf<Int, Int>()

for (num in numbers) {
    frequency[num] = frequency.getOrDefault(num, 0) + 1
}
```

Example:

```kotlin
val numbers = listOf(1, 2, 2, 3, 3, 3)

val frequency = mutableMapOf<Int, Int>()

for (num in numbers) {
    frequency[num] = frequency.getOrDefault(num, 0) + 1
}

println(frequency)
```

Output:

```text
{1=1, 2=2, 3=3}
```

### Kotlin shortcut

You can also use:

```kotlin
val frequency = numbers.groupingBy { it }.eachCount()
```

This returns a `Map<Int, Int>`.

---

# 35. Add or Update Using `merge()`

`merge()` is useful when updating a value based on its existing value.

```kotlin
val counts = mutableMapOf<String, Int>()

counts.merge("Kotlin", 1) { old, new ->
    old + new
}
```

If `"Kotlin"` doesn't exist, `1` is inserted.

If it already exists, the lambda combines the old and new values.

For example:

```kotlin
counts.merge("Kotlin", 1) { old, new ->
    old + new
}
```

can be used for frequency counting.

---

# 36. Add All Entries from Another Map

```kotlin
val map1 = mutableMapOf(
    "A" to 1,
    "B" to 2
)

val map2 = mapOf(
    "C" to 3,
    "D" to 4
)

map1.putAll(map2)
```

Result:

```text
{A=1, B=2, C=3, D=4}
```

If a key already exists, its value is replaced.

---

# 37. Copy a MutableMap

```kotlin
val copy = ages.toMutableMap()
```

This creates a separate mutable map.

---

# 38. Convert to Read-Only Map

```kotlin
val readOnly: Map<String, Int> = ages
```

The underlying map is still mutable, but the `readOnly` reference exposes only the `Map` interface.

To create a separate map:

```kotlin
val copy: Map<String, Int> = ages.toMap()
```

---

# 39. `put()` Return Value

`put()` returns the previous value associated with the key.

```kotlin
val oldValue = ages.put("Tom", 26)
```

If `"Tom"` previously had `25`:

```text
oldValue = 25
```

If the key didn't exist:

```text
oldValue = null
```

---

# 40. `remove()` Return Value

`remove()` returns the removed value.

```kotlin
val removed = ages.remove("Tom")

println(removed)
```

If Tom's age was `26`:

```text
26
```

---

# 41. Replace a Value

Replace only if the key exists:

```kotlin
ages.replace("Tom", 30)
```

Unlike:

```kotlin
ages["Tom"] = 30
```

`replace()` does nothing if the key doesn't exist.

---

# 42. Replace All Values

```kotlin
ages.replaceAll { _, age ->
    age + 1
}
```

Every value is increased by `1`.

---

# 43. Replace Only When the Old Value Matches

```kotlin
ages.replace("Tom", 25, 26)
```

This changes:

```text
Tom -> 25
```

to:

```text
Tom -> 26
```

only if Tom's current value is `25`.

---

# 44. `forEach`

Instead of a `for` loop:

```kotlin
ages.forEach { (name, age) ->
    println("$name -> $age")
}
```

---

# 45. `onEach`

Useful when you want to perform an action while keeping the collection in a chain:

```kotlin
ages.entries
    .sortedBy { it.value }
    .onEach {
        println("${it.key} -> ${it.value}")
    }
```

---

# 46. Get Keys as a Set

```kotlin
val keys = ages.keys
```

`keys` is a `MutableSet<K>` for a `MutableMap`.

---

# 47. Get Values

```kotlin
val values = ages.values
```

`values` is a mutable collection backed by the map.

---

# 48. Get Entries

```kotlin
val entries = ages.entries
```

Each entry provides:

```kotlin
entry.key
entry.value
```

---

