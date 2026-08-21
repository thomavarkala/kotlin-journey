# Bitwise Operators

Bitwise operators work directly on the individual bits of an integer.

They are used to:

- Set bits
- Clear bits
- Toggle bits
- Check bits
- Shift bits
- Build bit masks
- Manipulate binary representations
- Represent multiple boolean states
- Solve bit-based algorithmic problems

Kotlin uses named operators for bitwise operations rather than the traditional symbols used by some other languages.

---

## 1. Kotlin Bitwise Operators

The main bitwise operations in Kotlin are:

| Operation | Kotlin operator |
|---|---|
| AND | `and` |
| OR | `or` |
| XOR | `xor` |
| Invert | `inv()` |
| Left shift | `shl` |
| Signed right shift | `shr` |
| Unsigned right shift | `ushr` |

Example:

```kotlin
val a = 12
val b = 10

println(a and b)
println(a or b)
println(a xor b)
println(a.inv())
println(a shl 1)
println(a shr 1)
println(a ushr 1)
```

---

# 2. AND

The AND operation compares corresponding bits.

The result is `1` only when **both bits are `1`**.

Truth table:

```text
A B | A AND B
----+--------
0 0 |    0
0 1 |    0
1 0 |    0
1 1 |    1
```

Example:

```text
  1100
& 1010
------
  1000
```

Therefore:

```text
12 and 10 = 8
```

Kotlin:

```kotlin
val a = 12
val b = 10

val result = a and b

println(result)
```

Output:

```text
8
```

---

# 3. AND for Checking a Bit

AND is commonly used to determine whether a particular bit is set.

Suppose:

```text
n = 13
```

Binary:

```text
1101
```

To check bit `2`:

```text
1101
0100
----
0100
```

The result is non-zero, so bit `2` is set.

In Kotlin:

```kotlin
val n = 13
val mask = 1 shl 2

val isSet = (n and mask) != 0

println(isSet)
```

Output:

```text
true
```

The important idea is:

```text
n AND mask
```

selects the bit represented by the mask.

---

# 4. OR

The OR operation produces `1` when **at least one of the two bits is `1`**.

Truth table:

```text
A B | A OR B
----+-------
0 0 |   0
0 1 |   1
1 0 |   1
1 1 |   1
```

Example:

```text
  1100
| 1010
------
  1110
```

Therefore:

```text
12 or 10 = 14
```

Kotlin:

```kotlin
val a = 12
val b = 10

val result = a or b

println(result)
```

Output:

```text
14
```

---

# 5. OR for Setting a Bit

OR is commonly used to set a bit to `1`.

Suppose:

```text
n = 8

1000
```

Set bit `1`.

Create a mask:

```text
0010
```

OR:

```text
  1000
| 0010
------
  1010
```

The result is `10`.

Kotlin:

```kotlin
val n = 8
val mask = 1 shl 1

val result = n or mask

println(result)
```

Output:

```text
10
```

The bit is now set.

---

# 6. XOR

XOR means **exclusive OR**.

The result is `1` when the two bits are different.

Truth table:

```text
A B | A XOR B
----+---------
0 0 |    0
0 1 |    1
1 0 |    1
1 1 |    0
```

Example:

```text
  1100
^ 1010
------
  0110
```

Therefore:

```text
12 xor 10 = 6
```

Kotlin:

```kotlin
val a = 12
val b = 10

val result = a xor b

println(result)
```

Output:

```text
6
```

---

# 7. XOR for Toggling a Bit

XOR can toggle a specific bit.

A toggle means:

```text
0 → 1
1 → 0
```

Suppose:

```text
n = 8

1000
```

Toggle bit `1`.

Mask:

```text
0010
```

XOR:

```text
  1000
^ 0010
------
  1010
```

The bit changed from `0` to `1`.

Kotlin:

```kotlin
val n = 8
val mask = 1 shl 1

val result = n xor mask

println(result)
```

Output:

```text
10
```

If the bit was already `1`, XOR would change it to `0`.

---

# 8. XOR Properties

XOR has several important properties.

### XOR with zero

```text
x xor 0 = x
```

Example:

```text
1010
xor 0000
--------
1010
```

### XOR with itself

```text
x xor x = 0
```

Example:

```text
1010
xor 1010
--------
0000
```

### Commutative

```text
a xor b = b xor a
```

### Associative

```text
(a xor b) xor c = a xor (b xor c)
```

These properties are heavily used in algorithms.

---

# 9. XOR and Finding a Unique Value

If every number occurs twice except one number, XOR can identify the unique number.

Example:

```text
2, 3, 5, 3, 2
```

XOR all values:

```text
2 xor 3 xor 5 xor 3 xor 2
```

Because:

```text
2 xor 2 = 0
3 xor 3 = 0
```

we get:

```text
0 xor 0 xor 5 = 5
```

Kotlin:

```kotlin
val numbers = intArrayOf(2, 3, 5, 3, 2)

var result = 0

for (n in numbers) {
    result = result xor n
}

println(result)
```

Output:

```text
5
```

---

# 10. INV

`inv()` inverts every bit.

Each:

```text
0 → 1
1 → 0
```

Example using 8 bits:

```text
  00001100
```

After inversion:

```text
  11110011
```

Kotlin:

```kotlin
val n = 12

val result = n.inv()

println(result)
```

For signed integers, the result can be negative because Kotlin `Int` uses 32-bit signed two's complement representation.

---

# 11. NOT and Two's Complement

Bit inversion is closely related to two's complement.

For an integer:

```text
x.inv()
```

is equivalent to:

```text
-x - 1
```

For example:

```text
12.inv() = -13
```

because:

```text
-12 - 1 = -13
```

This is a consequence of two's complement representation.

---

# 12. Left Shift

`shl` shifts bits to the left.

Example:

```text
00000101
```

Shift left by one:

```text
00001010
```

Therefore:

```text
5 shl 1 = 10
```

Kotlin:

```kotlin
val n = 5

println(n shl 1)
```

Output:

```text
10
```

---

# 13. Left Shift and Multiplication

For values where overflow does not occur:

```text
x shl 1 = x × 2
x shl 2 = x × 4
x shl 3 = x × 8
```

In general:

```text
x shl k = x × 2ᵏ
```

Example:

```kotlin
val n = 3

println(n shl 1)
println(n shl 2)
println(n shl 3)
```

Output:

```text
6
12
24
```

However, do not blindly replace multiplication with shifts. Integer overflow and readability still matter.

---

# 14. Right Shift

Kotlin provides two right-shift operators:

```text
shr
ushr
```

They behave differently for negative numbers.

---

# 15. Signed Right Shift

`shr` performs a signed right shift.

The sign bit is preserved.

Example:

```text
00101000
```

Shift right by one:

```text
00010100
```

Therefore:

```text
40 shr 1 = 20
```

Kotlin:

```kotlin
val n = 40

println(n shr 1)
```

Output:

```text
20
```

For positive integers, `shr` behaves like integer division by powers of two when no relevant information is lost.

```text
x shr k ≈ x / 2ᵏ
```

---

# 16. Unsigned Right Shift

`ushr` shifts bits to the right and fills the left side with zeroes.

Example:

```kotlin
val n = 40

println(n ushr 1)
```

For positive values, `shr` and `ushr` produce the same result.

The difference becomes important for negative integers.

---

# 17. `shr` vs `ushr`

For positive numbers:

```text
shr  → zeroes enter from the left
ushr → zeroes enter from the left
```

So they normally produce the same result.

For negative numbers:

```text
shr
→ preserves the sign bit

ushr
→ fills with zeroes
```

Example:

```kotlin
val n = -8

println(n shr 1)
println(n ushr 1)
```

The results differ significantly.

---

# 18. Creating a Single-Bit Mask

A common operation is creating a mask for bit `k`.

Conceptually:

```text
1 at position k
```

In Kotlin:

```kotlin
val mask = 1 shl k
```

For example:

```kotlin
val k = 3

val mask = 1 shl k

println(mask)
```

Output:

```text
8
```

Because:

```text
1 shl 3
```

produces:

```text
00001000
```

---

# 19. Checking Whether a Bit Is Set

Use AND with a single-bit mask.

```kotlin
val n = 13
val k = 2

val isSet = (n and (1 shl k)) != 0

println(isSet)
```

Binary:

```text
n       = 1101
mask    = 0100
          ----
AND     = 0100
```

The result is non-zero, so bit `2` is set.

---

# 20. Setting a Bit

To set bit `k` to `1`, use OR.

```kotlin
val n = 8
val k = 1

val result = n or (1 shl k)

println(result)
```

Binary:

```text
1000
0010
----
1010
```

Result:

```text
10
```

---

# 21. Clearing a Bit

To clear a bit, the usual approach is to create a mask with the target bit set and invert the mask, then use AND.

Conceptually:

```text
n AND NOT(mask)
```

In Kotlin:

```kotlin
val n = 15
val k = 2

val result = n and (1 shl k).inv()

println(result)
```

Before:

```text
1111
```

Mask:

```text
0100
```

Inverted mask:

```text
1011
```

AND:

```text
1111
1011
----
1011
```

Result:

```text
11
```

---

# 22. Toggling a Bit

Use XOR.

```kotlin
val n = 10
val k = 1

val result = n xor (1 shl k)

println(result)
```

Before:

```text
1010
```

Mask:

```text
0010
```

After:

```text
1000
```

The target bit changed from `1` to `0`.

---

# 23. Common Bit Operations

For a bit position `k`:

```text
Check bit
→ n and (1 shl k)

Set bit
→ n or (1 shl k)

Toggle bit
→ n xor (1 shl k)

Clear bit
→ n and (1 shl k).inv()
```

These are among the most important basic bit manipulation operations.

---

# 24. Checking Even and Odd Numbers

The least significant bit determines whether a non-negative integer is even or odd.

Even numbers end in:

```text
0
```

Odd numbers end in:

```text
1
```

Examples:

```text
4 = 100  → even
5 = 101  → odd
6 = 110  → even
7 = 111  → odd
```

The LSB can therefore be checked with:

```kotlin
val n = 7

val isOdd = (n and 1) != 0

println(isOdd)
```

Output:

```text
true
```

---

# 25. Checking a Power of Two

A positive power of two contains exactly one set bit.

Examples:

```text
1  → 0001
2  → 0010
4  → 0100
8  → 1000
16 → 10000
```

A common bitwise property is:

```text
n & (n - 1)
```

For a positive power of two, this becomes zero.

In Kotlin:

```kotlin
fun isPowerOfTwo(n: Int): Boolean {
    return n > 0 && (n and (n - 1)) == 0
}
```

Examples:

```text
8:

1000
0111
----
0000
```

Therefore `8` is a power of two.

This property is a bit manipulation technique and will be explored further in `03-bit-tricks.md`.

---

# 26. Removing the Lowest Set Bit

Another important property is:

```text
n and (n - 1)
```

It removes the lowest set bit.

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

The lowest set bit was removed.

This property is commonly used when counting set bits.

---

# 27. Counting Set Bits

Kotlin provides:

```kotlin
countOneBits()
```

Example:

```kotlin
val n = 13

println(n.countOneBits())
```

Binary:

```text
1101
```

Number of set bits:

```text
3
```

Output:

```text
3
```

A traditional algorithm can also repeatedly remove the lowest set bit:

```kotlin
var n = 13
var count = 0

while (n != 0) {
    n = n and (n - 1)
    count++
}

println(count)
```

This repeatedly removes one set bit.

---

# 28. Kotlin Operator Summary

```text
AND
a and b

OR
a or b

XOR
a xor b

INVERT
a.inv()

LEFT SHIFT
a shl k

SIGNED RIGHT SHIFT
a shr k

UNSIGNED RIGHT SHIFT
a ushr k
```

---

# 29. Important Distinction

Kotlin's bitwise operators are **named operations**, not the traditional C/C++ operator syntax.

For example:

```text
Kotlin:
a and b
a or b
a xor b
```

Instead of:

```text
a & b
a | b
a ^ b
```

For shifts:

```text
Kotlin:
a shl k
a shr k
a ushr k
```

This is important when translating bit manipulation algorithms from other languages into Kotlin.

---

# Quick Reference

```text
AND
a and b
→ 1 only when both bits are 1

OR
a or b
→ 1 when at least one bit is 1

XOR
a xor b
→ 1 when bits are different

INVERT
a.inv()
→ flips every bit

LEFT SHIFT
a shl k
→ shifts bits left by k positions

SIGNED RIGHT SHIFT
a shr k
→ shifts right while preserving the sign

UNSIGNED RIGHT SHIFT
a ushr k
→ shifts right and fills with zeroes
```

### Bit manipulation operations

```text
Check bit
(n and (1 shl k)) != 0

Set bit
n or (1 shl k)

Clear bit
n and (1 shl k).inv()

Toggle bit
n xor (1 shl k)

Check odd
(n and 1) != 0

Check power of two
n > 0 && (n and (n - 1)) == 0

Remove lowest set bit
n and (n - 1)

Count set bits
n.countOneBits()
```

---

## What's Next?

The next file, `03-bit-tricks.md`, should focus on reusable bit manipulation techniques and patterns rather than repeating the operator explanations from this file.
