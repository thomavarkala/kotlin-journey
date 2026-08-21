# Bit Basics

Bit manipulation works directly with the binary representation of integers.

A **bit** is the smallest unit of data and can have only two values:

```text
0 or 1
```

Bit manipulation is useful for understanding how integers are represented, storing multiple boolean states efficiently, checking properties of numbers, and solving algorithmic problems efficiently.

---

## 1. What Is a Bit?

A bit represents one binary digit.

```text
0
1
```

Eight bits make one byte:

```text
10110101
```

The above value contains 8 bits.

---

## 2. Binary Number System

Computers represent integers using the **binary number system**, which has base `2`.

Decimal uses powers of `10`:

```text
10⁰  10¹  10²  10³
 1   10  100  1000
```

Binary uses powers of `2`:

```text
2⁰  2¹  2²  2³  2⁴
 1   2   4   8   16
```

For example:

```text
1011₂
```

means:

```text
1 × 2³
+ 0 × 2²
+ 1 × 2¹
+ 1 × 2⁰

= 8 + 0 + 2 + 1
= 11
```

Therefore:

```text
1011₂ = 11₁₀
```

---

## 3. Binary Place Values

Each position represents a power of `2`.

For an 8-bit value:

```text
Position:  7   6   5   4   3   2   1   0
           ↓   ↓   ↓   ↓   ↓   ↓   ↓   ↓
Value:    128  64  32  16   8   4   2   1
```

The rightmost position is called **bit 0**.

For example:

```text
00001011
```

has:

```text
bit 3 = 1
bit 1 = 1
bit 0 = 1
```

So:

```text
8 + 2 + 1 = 11
```

---

## 4. Bit Position

Bit positions start from `0` on the right.

For:

```text
101101
```

the positions are:

```text
Position:  5  4  3  2  1  0
Bit:       1  0  1  1  0  1
```

Therefore:

```text
bit 0 = 1
bit 1 = 0
bit 2 = 1
bit 3 = 1
bit 4 = 0
bit 5 = 1
```

Bit positions are extremely important when working with individual bits.

---

## 5. Most Significant Bit

The **Most Significant Bit (MSB)** is the leftmost bit of a binary representation.

Example:

```text
101101
↑
MSB
```

For an unsigned value, the MSB has the highest place value.

For a 6-bit value:

```text
32 16 8 4 2 1
 ↑
MSB
```

---

## 6. Least Significant Bit

The **Least Significant Bit (LSB)** is the rightmost bit.

Example:

```text
101101
     ↑
    LSB
```

The LSB represents `2⁰`, which is `1`.

The LSB is commonly used when checking whether an integer is even or odd.

---

## 7. Powers of Two

Powers of two are fundamental to bit manipulation.

```text
2⁰  = 1
2¹  = 2
2²  = 4
2³  = 8
2⁴  = 16
2⁵  = 32
2⁶  = 64
2⁷  = 128
2⁸  = 256
2⁹  = 512
2¹⁰ = 1024
```

A number that contains exactly one `1` bit is a power of two.

Examples:

```text
1     = 0001
2     = 0010
4     = 0100
8     = 1000
16    = 10000
32    = 100000
```

This concept becomes important when working with bit masks and bitwise operations.

---

## 8. Binary to Decimal

To convert binary to decimal, multiply each bit by its corresponding power of `2`.

Example:

```text
110101
```

Write the place values:

```text
32  16  8  4  2  1
 1   1  0  1  0  1
```

Calculate:

```text
32 + 16 + 4 + 1 = 53
```

Therefore:

```text
110101₂ = 53₁₀
```

---

## 9. Decimal to Binary

Repeatedly divide the number by `2` and record the remainders.

Example:

```text
13 / 2 = 6 remainder 1
 6 / 2 = 3 remainder 0
 3 / 2 = 1 remainder 1
 1 / 2 = 0 remainder 1
```

Read the remainders from bottom to top:

```text
1101
```

Therefore:

```text
13₁₀ = 1101₂
```

---

## 10. Binary Representation in Kotlin

Kotlin provides useful functions for converting integers to binary strings.

```kotlin
val n = 13

println(n.toString(2))
```

Output:

```text
1101
```

You can also convert a binary string back to an integer:

```kotlin
val binary = "1101"

val n = binary.toInt(2)

println(n)
```

Output:

```text
13
```

---

## 11. Fixed-Width Binary Representation

An integer does not need to be displayed with leading zeroes.

For example:

```text
5 = 101
```

But when discussing bits, it is often useful to show a fixed width:

```text
5 = 00000101
```

For a 32-bit integer:

```text
00000000 00000000 00000000 00000101
```

Leading zeroes do not change the value.

```text
101
00000101
```

represent the same positive integer.

---

## 12. Integer Bit Width in Kotlin

Kotlin's `Int` is a 32-bit signed integer.

```text
Int = 32 bits
```

A `Long` is 64 bits:

```text
Long = 64 bits
```

Common integer types:

| Type | Size |
|---|---:|
| `Byte` | 8 bits |
| `Short` | 16 bits |
| `Int` | 32 bits |
| `Long` | 64 bits |

For most competitive programming problems, `Int` and `Long` are the commonly used integer types.

---

## 13. Signed Integers

Signed integers can represent both positive and negative numbers.

Kotlin's:

```kotlin
Int
Long
Short
Byte
```

are signed integer types.

For a signed 32-bit `Int`, the range is:

```text
-2³¹ to 2³¹ - 1
```

which is:

```text
-2,147,483,648 to 2,147,483,647
```

The representation of negative numbers uses **two's complement**.

---

## 14. Two's Complement

Two's complement is the standard representation used for negative signed integers.

To obtain the two's complement representation of a positive number:

1. Write the binary representation.
2. Invert every bit.
3. Add `1`.

Example using 8 bits:

```text
5 = 00000101
```

Invert the bits:

```text
11111010
```

Add `1`:

```text
11111011
```

Therefore:

```text
-5 = 11111011
```

in 8-bit two's complement representation.

---

## 15. Why Two's Complement Matters

Two's complement allows addition and subtraction to work naturally at the binary level.

For example:

```text
  00000101   (5)
+ 11111011   (-5)
-----------
1 00000000
```

The extra carry is discarded:

```text
00000000
```

which represents `0`.

You do not normally need to manually calculate two's complement in everyday Kotlin code, but understanding it is important for signed bit manipulation.

---

## 16. Bit Length

The **bit length** of a positive integer is the number of bits needed to represent it without leading zeroes.

Examples:

```text
1  = 1       → 1 bit
2  = 10      → 2 bits
3  = 11      → 2 bits
4  = 100     → 3 bits
8  = 1000    → 4 bits
15 = 1111    → 4 bits
16 = 10000   → 5 bits
```

In Kotlin, for positive `Int` values, you can determine the number of significant bits using:

```kotlin
val n = 13

println(Int.SIZE_BITS - n.countLeadingZeroBits())
```

Output:

```text
4
```

Because:

```text
13 = 1101
```

requires 4 significant bits.

For `Long`:

```kotlin
val n = 13L

println(Long.SIZE_BITS - n.countLeadingZeroBits())
```

---

## 17. Leading Zeroes

Leading zeroes are zero bits before the first `1` from the left.

Example:

```text
00000101
^^^^^
leading zeroes
```

For an 8-bit representation of `5`:

```text
00000101
```

there are five leading zeroes.

Kotlin provides:

```kotlin
val n = 5

println(n.countLeadingZeroBits())
```

For `Int`, this counts zero bits from the most significant side of the 32-bit representation.

---

## 18. Trailing Zeroes

Trailing zeroes are zero bits after the last `1` from the right.

Example:

```text
101000
   ^^^
trailing zeroes
```

Kotlin provides:

```kotlin
val n = 40

println(n.countTrailingZeroBits())
```

Because:

```text
40 = 101000
```

there are three trailing zeroes.

---

## 19. Number of Set Bits

A **set bit** is a bit whose value is `1`.

Example:

```text
101101
```

contains four set bits.

```text
1 0 1 1 0 1
↑   ↑ ↑   ↑
1   1 1   1
```

Kotlin provides:

```kotlin
val n = 45

println(n.countOneBits())
```

Because:

```text
45 = 101101
```

the result is:

```text
4
```

---

## 20. Set Bit

A bit is called **set** when its value is `1`.

Example:

```text
101101
```

Set bits are at:

```text
5, 3, 2, 0
```

because:

```text
Position:  5 4 3 2 1 0
Bit:       1 0 1 1 0 1
```

---

## 21. Unset Bit

A bit is **unset** when its value is `0`.

For:

```text
101101
```

the unset bits are:

```text
4, 1
```

because:

```text
Position:  5 4 3 2 1 0
Bit:       1 0 1 1 0 1
             ↑     ↑
```

---

## 22. Bit Mask

A **bit mask** is an integer whose binary representation is used to select or represent specific bits.

For example:

```text
00001000
```

represents bit position `3`.

The value is:

```text
2³ = 8
```

A mask for bit `k` is commonly constructed using:

```text
1 shifted to position k
```

The specific Kotlin shift syntax and bitwise operators are covered in the **Bitwise Operators** section.

---

## 23. Single-Bit Mask

A mask containing only one set bit looks like:

```text
00000001
00000010
00000100
00001000
00010000
```

These correspond to:

```text
bit 0
bit 1
bit 2
bit 3
bit 4
```

Single-bit masks are useful for working with individual positions.

---

## 24. Multiple-Bit Mask

A mask can contain multiple set bits.

Example:

```text
00101100
```

The set positions are:

```text
5, 3, 2
```

This mask can represent a combination of selected options or states.

---

## 25. Bit Flags

Bit flags store multiple boolean values inside a single integer.

Suppose we have four independent states:

```text
READ
WRITE
EXECUTE
DELETE
```

Instead of storing four separate booleans, bits can represent them:

```text
0001 → READ
0010 → WRITE
0100 → EXECUTE
1000 → DELETE
```

A combination could be:

```text
0101
```

meaning:

```text
READ + EXECUTE
```

This technique is widely used in systems programming and is also useful in algorithmic problems.

---

## 26. Why Bit Manipulation Is Useful

Bit manipulation can provide:

- Compact representation
- Efficient state storage
- Fast bit checks
- Efficient subset representation
- Bit masks
- Power-of-two checks
- Counting set bits
- State compression
- Bitmask dynamic programming
- Binary tricks used in algorithms

It is especially common in competitive programming, systems programming, cryptography, networking, and low-level programming.

---

## 27. Important Concepts to Know

Before learning bitwise operators, understand these terms:

| Concept | Meaning |
|---|---|
| Bit | A binary digit, `0` or `1` |
| Binary | Base-2 number system |
| Bit position | Position of a bit starting from `0` on the right |
| MSB | Most Significant Bit |
| LSB | Least Significant Bit |
| Set bit | Bit containing `1` |
| Unset bit | Bit containing `0` |
| Bit mask | Integer used to select or represent bits |
| Bit flag | Individual state represented by a bit |
| Bit width | Number of bits used to represent a type |
| Two's complement | Representation of signed negative integers |

---

## 28. Kotlin Integer Bit Information

Useful Kotlin functions for learning about integer bits include:

```kotlin
val n = 40

println(n.countOneBits())
println(n.countLeadingZeroBits())
println(n.countTrailingZeroBits())
```

For binary representation:

```kotlin
println(n.toString(2))
```

These functions are useful for inspecting an integer before performing more advanced bit manipulation.

---

## 29. Example: Inspecting an Integer

```kotlin
fun main() {
    val n = 40

    println("Decimal: $n")
    println("Binary: ${n.toString(2)}")
    println("Set bits: ${n.countOneBits()}")
    println("Leading zeroes: ${n.countLeadingZeroBits()}")
    println("Trailing zeroes: ${n.countTrailingZeroBits()}")
}
```

Output:

```text
Decimal: 40
Binary: 101000
Set bits: 2
Leading zeroes: 26
Trailing zeroes: 3
```

The `26` leading zeroes are counted within the complete 32-bit `Int` representation:

```text
00000000 00000000 00000000 00101000
```

---

## 30. Bit Manipulation Terminology

You will frequently encounter these terms:

```text
bit
bit position
set bit
unset bit
MSB
LSB
binary representation
bit mask
bit flag
two's complement
bit width
leading zeroes
trailing zeroes
set-bit count
```

Understanding these terms makes the next topics much easier.

---

## Quick Reference

```text
Bit
→ 0 or 1

Binary
→ Base 2

LSB
→ Rightmost bit

MSB
→ Leftmost bit

Set bit
→ 1

Unset bit
→ 0

Bit position
→ Starts at 0 from the right

Int
→ 32 bits

Long
→ 64 bits

Power of two
→ Binary representation contains exactly one set bit

Bit mask
→ Integer used to represent/select specific bits

Two's complement
→ Standard representation of negative signed integers
```

---

## Next

The next file covers **bitwise operators and how to manipulate individual bits in Kotlin**:

```text
02-bitwise-operators.md
```
