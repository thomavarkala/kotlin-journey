# Variables

A reference guide for declaring and using variables in Kotlin.

---

## 1. Read-Only (val) vs Mutable (var)

Kotlin enforces safety by distinguishing between read-only and reassignable variables.

* **val (Value):** Immutable (read-only). Assigned once and cannot be changed. Equivalent to final in Java.
* **var (Variable):** Mutable. Value can be updated later.

> **Best Practice:** Default to using val. Only switch to var if a variable truly needs to change.

```kotlin
val birthYear = 1998   // Read-only
var currentAge = 26    // Mutable

currentAge = 27        // Valid reassignment
// birthYear = 1999    // Compilation Error: Val cannot be reassigned