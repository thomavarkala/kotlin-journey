/*
For God so loved the world that he gave his one and only Son,
that whoever believes in him shall not perish but have eternal life.
JOHN 3:16
*/

// Imports
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.*
import java.util.PriorityQueue
import java.util.ArrayDeque
import java.util.Collections
import java.util.LinkedList

// Constants
const val MOD = 1_000_000_007L
const val MOD2 = 998244353L

// Fast Input
private val br = BufferedReader(InputStreamReader(System.`in`))
private var st: StringTokenizer? = null

fun next(): String {
    while (st == null || !st!!.hasMoreTokens()) {
        st = StringTokenizer(br.readLine())
    }
    return st!!.nextToken()
}

fun I(): Int = next().toInt()
fun L(): Long = next().toLong()
fun S(): String = next()
fun F(): Double = next().toDouble()

fun MI(): List<Int> {
    val n = I()
    return List(n) { I() }
}

fun LI(): List<Int> = generateSequence {
    st?.takeIf { it.hasMoreTokens() }?.nextToken()
}.map { it.toInt() }.toList()

// Output
fun O(value: Any) {
    print(value)
}

fun OL(values: Collection<Any>) {
    println(values.joinToString(" "))
}

// Fast Power
// a^b % n using binary exponentiation
fun fastPow(a: Long, b: Long, n: Long = MOD): Long {
    var base = a % n
    var exp = b
    var res = 1L

    while (exp > 0) {
        if (exp and 1L == 1L) {
            res = res * base % n
        }

        base = base * base % n
        exp = exp shr 1
    }

    return res
}

// Modular Arithmetic
fun add(a: Long, b: Long): Long {
    return (a % MOD + b % MOD) % MOD
}

fun sub(a: Long, b: Long): Long {
    return (a % MOD - b % MOD + MOD) % MOD
}

fun pro(a: Long, b: Long): Long {
    return (a % MOD * (b % MOD)) % MOD
}

// Division using inverse
fun div(a: Long, b: Long): Long {
    return pro(a, inv(b))
}

// Modular inverse
// Works when MOD is prime
fun inv(a: Long): Long {
    return fastPow(a, MOD - 2)
}

// Extended Euclidean Algorithm
// Works for any MOD when gcd(a, MOD) == 1
fun invCom(a: Long): Long? {

    fun egcd(a: Long, b: Long): Triple<Long, Long, Long> {
        if (b == 0L) {
            return Triple(a, 1L, 0L)
        }

        val (g, x1, y1) = egcd(b, a % b)

        return Triple(
            g,
            y1,
            x1 - (a / b) * y1
        )
    }

    val (g, x, _) = egcd(a, MOD)

    return if (g == 1L) {
        (x % MOD + MOD) % MOD
    } else {
        null
    }
}

// Grid
var n = 0
var m = 0

fun inbound(i: Int, j: Int): Boolean {
    return i in 0 until n && j in 0 until m
}

// 2D -> 1D
// DSU [2D - 1D]
fun idx(i: Int, j: Int): Int {
    return i * m + j
}

// 1D -> 2D
fun idxs(x: Int): Pair<Int, Int> {
    return Pair(x / m, x % m)
}

// Math
fun summ(n: Long): Long {
    return n * (n + 1) / 2
}

fun nc2(n: Long): Long {
    return summ(n - 1)
}

fun sod(n: Long): Int {
    return n.toString().sumOf { it.digitToInt() }
}

fun cdc(n: Long): Long {
    return (10 * n - sod(n)) / 9
}

fun ceilDiv(a: Long, b: Long): Long {
    return (a + b - 1) / b
}

// Directions
// L R U D
val dx = intArrayOf(0, 0, -1, 1)
val dy = intArrayOf(-1, 1, 0, 0)
val move = "LRUD"

val dir8 = arrayOf(
    intArrayOf(1, 0),
    intArrayOf(-1, 0),
    intArrayOf(0, 1),
    intArrayOf(0, -1),
    intArrayOf(1, 1),
    intArrayOf(-1, -1),
    intArrayOf(1, -1),
    intArrayOf(-1, 1)
)

val knight = arrayOf(
    intArrayOf(2, 1),
    intArrayOf(2, -1),
    intArrayOf(-2, 1),
    intArrayOf(-2, -1),
    intArrayOf(1, 2),
    intArrayOf(-1, 2),
    intArrayOf(1, -2),
    intArrayOf(-1, -2)
)

val direction = mapOf(
    Pair(-1, 0) to "U",
    Pair(1, 0) to "D",
    Pair(0, -1) to "L",
    Pair(0, 1) to "R"
)

val directionReverse = mapOf(
    "L" to Pair(0, 1),
    "R" to Pair(0, -1),
    "U" to Pair(1, 0),
    "D" to Pair(-1, 0)
)

// YES / NO
val YES = arrayOf("NO", "YES")
val Yes = arrayOf("No", "Yes")
val yes = arrayOf("no", "yes")

// Main
fun main() {

}