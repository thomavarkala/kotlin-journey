# Bit Tricks

Bit tricks are reusable techniques that use bitwise operations to solve common problems efficiently.

This file focuses on **patterns and tricks** that can be applied directly in algorithms and competitive programming.

For the fundamentals of binary representation, see:

```text
01-bit-basics.md
```

For the individual Kotlin bitwise operators, see:

```text
02-bitwise-operators.md
```

---

## 1. Check if a Number Is Odd

The least significant bit determines whether a number is odd or even.

```text
Even → LSB = 0
Odd  → LSB = 1
```

Use:

```kotlin
fun isOdd(n: Int): Boolean {
    return (n and 1) != 0
}
```

Example:

```text
7 = 0111

0111
0001
----
0001
```

The result is non-zero, so `7` is odd.

---

## 2. Check if a Number Is Even

```kotlin
fun isEven(n: Int): Boolean {
    return (n and 1) == 0
}
```

Example:

```text
8 = 1000

1000
0001
----
0000
```

Therefore `8` is even.

---

## 3. Check if a Number Is a Power of Two

A positive power of two contains exactly one set bit.

```text
1  → 0001
2  → 0010
4  → 0100
8  → 1000
16 → 10000
```

Use:

```kotlin
fun isPowerOfTwo(n: Int): Boolean {
    return n > 0 && (n and (n - 1)) == 0
}
```

Why it works:

```text
n     = 1000
n - 1 = 0111

1000
0111
----
0000
```

For a number containing more than one set bit, the result is not zero.

---

## 4. Remove the Lowest Set Bit

The expression:

```text
n and (n - 1)
```

removes the lowest set bit.

Example:

```text
n = 12

1100
```

Then:

```text
n - 1 = 1011
```

AND:

```text
1100
1011
----
1000
```

The lowest `1` was removed.

Kotlin:

```kotlin
val result = n and (n - 1)
```

---

## 5. Check Whether a Bit Is Set

For bit position `k`:

```kotlin
fun isBitSet(n: Int, k: Int): Boolean {
    return (n and (1 shl k)) != 0
}
```

Example:

```text
n = 13

1101
```

Check bit `2`:

```text
1101
0100
----
0100
```

So bit `2` is set.

---

## 6. Set a Bit

To force bit `k` to `1`:

```kotlin
fun setBit(n: Int, k: Int): Int {
    return n or (1 shl k)
}
```

Example:

```text
1000
0010
----
1010
```

---

## 7. Clear a Bit

To force bit `k` to `0`:

```kotlin
fun clearBit(n: Int, k: Int): Int {
    return n and (1 shl k).inv()
}
```

Example:

```text
1111
1011
----
1011
```

Bit `2` is cleared.

---

## 8. Toggle a Bit

XOR toggles a bit.

```kotlin
fun toggleBit(n: Int, k: Int): Int {
    return n xor (1 shl k)
}
```

The behavior is:

```text
0 → 1
1 → 0
```

---

## 9. Get the Lowest Set Bit

The expression:

```text
n and -n
```

isolates the lowest set bit.

Example:

```text
n = 12

12  = 00001100
-12 = 11110100
```

AND:

```text
00001100
11110100
--------
00000100
```

Result:

```text
4
```

Kotlin:

```kotlin
val lowestSetBit = n and -n
```

For `12`, the lowest set bit has value `4`.

---

## 10. Find the Position of the Lowest Set Bit

For a positive number, the position can be obtained from the lowest set bit.

```kotlin
fun lowestSetBitPosition(n: Int): Int {
    return n.countTrailingZeroBits()
}
```

Example:

```text
12 = 1100
```

There are two trailing zeroes, so:

```text
lowest set bit position = 2
```

---

## 11. Count Set Bits

Kotlin provides:

```kotlin
countOneBits()
```

Example:

```kotlin
val n = 29

println(n.countOneBits())
```

Binary:

```text
11101
```

Number of set bits:

```text
4
```

---

## 12. Count Set Bits Using Brian Kernighan's Algorithm

Instead of checking every bit, repeatedly remove the lowest set bit.

```kotlin
fun countSetBits(n: Int): Int {
    var x = n
    var count = 0

    while (x != 0) {
        x = x and (x - 1)
        count++
    }

    return count
}
```

Each iteration removes exactly one set bit.

Therefore, if the number has `k` set bits, the loop runs `k` times.

---

## 13. Check if Two Numbers Have Opposite Signs

For signed integers, the sign information is represented in the most significant bit.

A common technique is:

```kotlin
fun haveOppositeSigns(a: Int, b: Int): Boolean {
    return (a xor b) < 0
}
```

If the sign bits differ, XOR produces a value with the sign bit set.

Example:

```text
positive → sign bit 0
negative → sign bit 1
```

Therefore:

```text
0 xor 1 = 1
```

This technique is useful with signed integers.

---

## 14. Swap Two Integers Using XOR

Two values can be swapped using XOR without a temporary variable.

```kotlin
var a = 5
var b = 9

a = a xor b
b = a xor b
a = a xor b
```

Afterward:

```text
a = 9
b = 5
```

Why it works:

```text
a = a xor b
b = (a xor b) xor b
  = a

a = (a xor b) xor a
  = b
```

In normal Kotlin code, a temporary variable or destructuring is usually clearer:

```kotlin
a = b.also { b = a }
```

The XOR technique is mainly useful for understanding XOR properties and bit manipulation.

---

## 15. Find the Unique Number

If every number occurs exactly twice except one, XOR finds the unique number.

Example:

```text
2, 4, 7, 4, 2
```

XOR:

```text
2 xor 4 xor 7 xor 4 xor 2
```

Pairs cancel:

```text
2 xor 2 = 0
4 xor 4 = 0
```

Therefore:

```text
7
```

Kotlin:

```kotlin
fun findUnique(numbers: IntArray): Int {
    var result = 0

    for (n in numbers) {
        result = result xor n
    }

    return result
}
```

---

## 16. Why XOR Finds the Unique Number

The key property is:

```text
x xor x = 0
x xor 0 = x
```

Therefore:

```text
a xor b xor a
```

becomes:

```text
(a xor a) xor b
= 0 xor b
= b
```

This allows duplicate values to cancel each other.

---

## 17. Find Two Unique Numbers

Suppose every number occurs twice except two numbers.

Example:

```text
2, 4, 7, 4, 2, 9
```

The unique numbers are:

```text
7 and 9
```

First XOR every number:

```text
2 xor 4 xor 7 xor 4 xor 2 xor 9
```

Pairs cancel:

```text
7 xor 9
```

Now:

```text
7 xor 9
```

is non-zero, meaning the two numbers differ in at least one bit.

Find a bit where they differ:

```kotlin
val xor = 7 xor 9
val mask = xor and -xor
```

The mask isolates one differing bit.

Then divide the numbers into two groups based on that bit.

A complete implementation:

```kotlin
fun findTwoUnique(numbers: IntArray): IntArray {
    var xor = 0

    for (n in numbers) {
        xor = xor xor n
    }

    val mask = xor and -xor

    var first = 0
    var second = 0

    for (n in numbers) {
        if ((n and mask) != 0) {
            first = first xor n
        } else {
            second = second xor n
        }
    }

    return intArrayOf(first, second)
}
```

---

## 18. Extract the Lowest Set Bit

Use:

```kotlin
val lowest = n and -n
```

Example:

```text
n = 40

40 = 101000
```

The lowest set bit is:

```text
001000
```

which has value:

```text
8
```

---

## 19. Remove the Lowest Set Bit

Use:

```kotlin
val result = n and (n - 1)
```

Example:

```text
n     = 101100
n - 1 = 101011

101100
101011
------
101000
```

The lowest set bit has been removed.

---

## 20. Get All Set Bits

You can repeatedly extract and remove the lowest set bit.

```kotlin
fun getSetBits(n: Int): List<Int> {
    var x = n
    val result = mutableListOf<Int>()

    while (x != 0) {
        val lowest = x and -x
        result.add(lowest)
        x = x and (x - 1)
    }

    return result
}
```

For:

```text
n = 13
```

binary:

```text
1101
```

the extracted values are:

```text
1
4
8
```

---

## 21. Get Set Bit Positions

```kotlin
fun getSetBitPositions(n: Int): List<Int> {
    var x = n
    val result = mutableListOf<Int>()

    while (x != 0) {
        val position = x.countTrailingZeroBits()
        result.add(position)
        x = x and (x - 1)
    }

    return result
}
```

For:

```text
13 = 1101
```

the positions are:

```text
0, 2, 3
```

---

## 22. Generate a Mask for the First `k` Bits

A mask containing the lowest `k` bits as `1` can be created with:

```text
(1 shl k) - 1
```

Example for `k = 4`:

```text
1 shl 4 = 10000
```

Subtract one:

```text
01111
```

Kotlin:

```kotlin
val mask = (1 shl 4) - 1
```

Result:

```text
15
```

Binary:

```text
1111
```

---

## 23. Extract the Lowest `k` Bits

Use:

```kotlin
val mask = (1 shl k) - 1
val result = n and mask
```

Example:

```text
n = 29

11101
```

Get the lowest 3 bits:

```text
00111
```

AND:

```text
11101
00111
-----
00101
```

Result:

```text
5
```

---

## 24. Extract a Range of Bits

Suppose you want `k` bits starting from position `start`.

First shift the desired bits down:

```kotlin
n shr start
```

Then mask the required number of bits:

```kotlin
((n shr start) and ((1 shl k) - 1))
```

Example:

```kotlin
fun extractBits(n: Int, start: Int, count: Int): Int {
    val mask = (1 shl count) - 1
    return (n shr start) and mask
}
```

---

## 25. Set the Lowest `k` Bits

A mask for the lowest `k` bits is:

```text
(1 shl k) - 1
```

For `k = 5`:

```text
011111
```

Then:

```kotlin
val mask = (1 shl k) - 1
val result = n or mask
```

This sets the lowest `k` bits to `1`.

---

## 26. Clear the Lowest `k` Bits

Create a mask whose lower `k` bits are zero.

```kotlin
val mask = -1 shl k
val result = n and mask
```

Example with `k = 3`:

```text
11111111
11111000
```

The lowest three bits are cleared.

---

## 27. Toggle the Lowest `k` Bits

Use the mask:

```kotlin
val mask = (1 shl k) - 1
val result = n xor mask
```

For `k = 4`:

```text
mask = 1111
```

All four lowest bits are toggled.

---

## 28. Check Whether All Bits Are Zero

The simplest check is:

```kotlin
if (n == 0) {
    // all bits are zero
}
```

Binary:

```text
0 = 00000000
```

---

## 29. Check Whether Exactly One Bit Is Set

This is equivalent to checking whether a positive number is a power of two.

```kotlin
fun hasExactlyOneSetBit(n: Int): Boolean {
    return n > 0 && (n and (n - 1)) == 0
}
```

---

## 30. Check Whether More Than One Bit Is Set

You can use the opposite condition:

```kotlin
fun hasMultipleSetBits(n: Int): Boolean {
    return n > 0 && (n and (n - 1)) != 0
}
```

---

## 31. Check Whether a Number Has Exactly `k` Set Bits

Kotlin provides a direct function:

```kotlin
fun hasKSetBits(n: Int, k: Int): Boolean {
    return n.countOneBits() == k
}
```

Example:

```kotlin
hasKSetBits(13, 3)
```

Because:

```text
13 = 1101
```

has three set bits.

---

## 32. Check Whether Two Numbers Differ in Exactly One Bit

XOR identifies the positions where two numbers differ.

If:

```text
a xor b
```

has exactly one set bit, then the numbers differ in exactly one bit.

```kotlin
fun differByOneBit(a: Int, b: Int): Boolean {
    val x = a xor b
    return x != 0 && (x and (x - 1)) == 0
}
```

---

## 33. Hamming Distance

The Hamming distance between two integers is the number of bit positions where they differ.

XOR first:

```text
a xor b
```

Then count the set bits.

```kotlin
fun hammingDistance(a: Int, b: Int): Int {
    return (a xor b).countOneBits()
}
```

Example:

```text
a = 10 → 1010
b = 7  → 0111

1010
0111
----
1101
```

There are three set bits.

Therefore:

```text
Hamming distance = 3
```

---

## 34. Enumerate All Subsets Using Bit Masks

Bit masks can represent subsets.

Suppose:

```text
items = [A, B, C]
```

There are:

```text
2³ = 8
```

possible subsets.

Each mask represents one subset:

```text
000 → {}
001 → {A}
010 → {B}
011 → {A, B}
100 → {C}
101 → {A, C}
110 → {B, C}
111 → {A, B, C}
```

Kotlin:

```kotlin
val items = listOf("A", "B", "C")

for (mask in 0 until (1 shl items.size)) {
    val subset = mutableListOf<String>()

    for (i in items.indices) {
        if ((mask and (1 shl i)) != 0) {
            subset.add(items[i])
        }
    }

    println(subset)
}
```

This technique is fundamental to **bitmasking and subset enumeration**.

---

## 35. Bitmask Representation of Boolean States

Suppose four independent states exist:

```text
A
B
C
D
```

Represent them as:

```text
0001 → A
0010 → B
0100 → C
1000 → D
```

A combination:

```text
0101
```

represents:

```text
A + C
```

This allows multiple boolean states to be stored inside one integer.

---

## 36. Bitmask for a Set

For `n` elements, an integer can represent a subset of those elements.

For example:

```text
items = [0, 1, 2, 3]
```

Mask:

```text
1010
```

means:

```text
1 and 3 are selected
```

because:

```text
bit 1 = 1
bit 3 = 1
```

This is commonly used in:

- Subset enumeration
- Subset DP
- Traveling Salesman Problem
- State compression
- Combinatorial problems

---

## 37. Iterate Through All Submasks

Given a mask, all of its submasks can be enumerated with:

```kotlin
var sub = mask

while (sub > 0) {
    // use sub

    sub = (sub - 1) and mask
}
```

This is a very important competitive programming technique.

For example, if:

```text
mask = 1011
```

the loop visits every non-empty submask of `1011`.

The sequence is generated in descending numeric order.

---

## 38. Include the Empty Submask

The previous loop excludes `0`.

To include it:

```kotlin
var sub = mask

while (true) {
    // use sub

    if (sub == 0) break

    sub = (sub - 1) and mask
}
```

This visits every submask including the empty set.

---

## 39. Gray Code

Gray code is a sequence where consecutive values differ by exactly one bit.

For `n` bits, a Gray code value can be generated using:

```text
i xor (i shr 1)
```

Kotlin:

```kotlin
fun grayCode(i: Int): Int {
    return i xor (i shr 1)
}
```

For example:

```text
0 → 000
1 → 001
2 → 011
3 → 010
4 → 110
5 → 111
6 → 101
7 → 100
```

Each consecutive value differs by one bit.

---

## 40. Reverse Bits Concept

Sometimes the bit order needs to be reversed.

For example:

```text
1101
```

becomes:

```text
1011
```

A simple approach is to process one bit at a time:

```kotlin
fun reverseBits(n: Int, bitCount: Int): Int {
    var x = n
    var result = 0

    repeat(bitCount) {
        result = result shl 1
        result = result or (x and 1)
        x = x shr 1
    }

    return result
}
```

The important pattern is:

```text
read lowest bit
shift result
append bit
shift input
```

---

## 41. Rotate Bits

A rotation moves bits that leave one side back into the other side.

For an `Int`, a left rotation can conceptually be implemented as:

```kotlin
fun rotateLeft(n: Int, distance: Int): Int {
    val d = distance and 31
    return (n shl d) or (n ushr (32 - d))
}
```

Kotlin also provides built-in rotation functions:

```kotlin
n.rotateLeft(distance)
n.rotateRight(distance)
```

These are preferable when the intention is specifically to rotate bits.

---

## 42. Use `countLeadingZeroBits`

For determining the most significant set bit position, leading-zero information can be useful.

```kotlin
val n = 40

val position = Int.SIZE_BITS - 1 - n.countLeadingZeroBits()
```

For:

```text
40 = 101000
```

the highest set bit is position:

```text
5
```

This assumes `n > 0`.

---

## 43. Highest Power of Two Not Greater Than `n`

For a positive integer, the highest set bit corresponds to the largest power of two not greater than the number.

Example:

```text
n = 13

1101
```

Highest set bit:

```text
1000
```

Value:

```text
8
```

One way to obtain it:

```kotlin
fun highestPowerOfTwo(n: Int): Int {
    require(n > 0)

    return 1 shl (Int.SIZE_BITS - 1 - n.countLeadingZeroBits())
}
```

---

## 44. Lowest Power of Two Greater Than or Equal to `n`

A common technique is to round a positive integer upward to the next power of two.

For values within the valid `Int` range:

```kotlin
fun nextPowerOfTwo(n: Int): Int {
    if (n <= 1) return 1

    var x = n - 1

    x = x or (x shr 1)
    x = x or (x shr 2)
    x = x or (x shr 4)
    x = x or (x shr 8)
    x = x or (x shr 16)

    return x + 1
}
```

Example:

```text
n = 13

next power of two = 16
```

This technique should be used carefully near integer overflow boundaries.

---

## 45. Masking a Value

Masking means keeping selected bits while discarding others.

Example:

```text
value = 110101
mask  = 001111
```

AND:

```text
110101
001111
------
000101
```

Kotlin:

```kotlin
val result = value and mask
```

Masking is one of the most common operations in bit manipulation.

---

## 46. Extract a Bit Field

Suppose a value contains several fields:

```text
AAA BBBB CC
```

You can isolate one field using:

1. Shift it toward the right.
2. Apply a mask.

General form:

```kotlin
val field = (value shr start) and ((1 shl width) - 1)
```

This technique is useful when several values are packed into one integer.

---

## 47. Pack Multiple Small Values

Several small values can be stored inside one integer if each value fits within a known number of bits.

For example, suppose:

```text
A → 4 bits
B → 4 bits
```

A 32-bit integer can store both values.

Conceptually:

```text
AAAA BBBB
```

Pack:

```kotlin
val packed = (a shl 4) or b
```

Extract `a`:

```kotlin
val a = packed shr 4
```

Extract `b`:

```kotlin
val b = packed and 15
```

This is called **bit packing**.

---

## 48. Bitmask Dynamic Programming

A bitmask can represent the state of a collection of items.

For example:

```text
mask bit i = 1
```

can mean:

```text
item i has been selected
```

A DP state might therefore look like:

```text
dp[mask]
```

where each `mask` represents one subset.

This is commonly used in:

- Assignment problems
- Subset problems
- Traveling Salesman Problem
- Small-`n` optimization problems

Bitmask DP is an advanced application of the techniques covered here.

---

## 49. Complexity of Bit Tricks

Most individual bitwise operations operate on a fixed-width integer and are effectively:

```text
Time: O(1)
Space: O(1)
```

Examples:

```kotlin
n and mask
n or mask
n xor mask
n.inv()
n shl k
n shr k
n.countOneBits()
```

For algorithms that iterate through set bits:

```text
Time: O(number of set bits)
```

For subset enumeration:

```text
Time: O(2ⁿ)
```

when all subsets are processed.

For submask enumeration across all masks, the total number of mask-submask pairs can reach:

```text
O(3ⁿ)
```

---

## 50. Common Mistakes

### Mistake 1: Forgetting bit positions start at zero

```text
Binary:    10101
Position:  43210
```

The rightmost bit is position `0`.

---

### Mistake 2: Using `1 shl k` with an invalid shift distance

For `Int`, shift distances are effectively limited to the low five bits of the distance.

Be careful with large or negative shift counts.

---

### Mistake 3: Ignoring signed integers

`Int` is signed.

Operations involving negative values can behave differently from what an unsigned binary representation might suggest.

---

### Mistake 4: Using `shr` when unsigned behavior is required

For negative integers:

```text
shr
```

preserves the sign bit, while:

```text
ushr
```

fills with zeroes.

---

### Mistake 5: Overflow

Expressions such as:

```kotlin
1 shl 31
```

produce an `Int` whose highest bit is set, making the value negative.

For larger bit ranges, use `Long` where appropriate.

---

### Mistake 6: Forgetting the positive-number condition for power-of-two checks

Do not use only:

```kotlin
(n and (n - 1)) == 0
```

because `0` also satisfies it.

Use:

```kotlin
n > 0 && (n and (n - 1)) == 0
```

---

## 51. Bit Tricks Quick Reference

```text
Check odd
(n and 1) != 0

Check even
(n and 1) == 0

Check bit k
(n and (1 shl k)) != 0

Set bit k
n or (1 shl k)

Clear bit k
n and (1 shl k).inv()

Toggle bit k
n xor (1 shl k)

Remove lowest set bit
n and (n - 1)

Extract lowest set bit
n and -n

Count set bits
n.countOneBits()

Lowest set bit position
n.countTrailingZeroBits()

Highest set bit position
Int.SIZE_BITS - 1 - n.countLeadingZeroBits()

Power of two
n > 0 && (n and (n - 1)) == 0

Mask for lowest k bits
(1 shl k) - 1

Extract lowest k bits
n and ((1 shl k) - 1)

Extract k bits from position start
(n shr start) and ((1 shl k) - 1)

Gray code
n xor (n shr 1)

Enumerate submasks
sub = (sub - 1) and mask
```

---

## 52. What to Learn After Bit Tricks

After understanding these techniques, the next step is applying them to algorithmic problems involving:

```text
Bitmasking
Subset enumeration
Subset DP
XOR problems
State compression
Bitwise greedy techniques
Range bit operations
Advanced bit manipulation
```

The important goal is not memorizing isolated tricks.

Understand **why the binary representation changes** after each operation. Once that becomes intuitive, most bit manipulation techniques become much easier to derive.
