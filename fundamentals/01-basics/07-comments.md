# Comments

Comments are notes written in the code for developers. They are ignored by the Kotlin compiler and do not affect program execution.

---

## 1. Single-Line Comments

Use `//` for a single-line comment.

```kotlin
// This is a comment

val age = 25 // User's age
```

Everything after `//` on that line is ignored.

**Shortcut:**

- **Windows/Linux:** `Ctrl + /`
- **macOS:** `Cmd + /`

Select multiple lines and use the same shortcut to comment/uncomment them.

---

## 2. Multi-Line Comments

Use `/* */` for comments spanning multiple lines.

```kotlin
/*
    This is a
    multi-line comment.
*/

val age = 25
```

**Shortcut in Android Studio / IntelliJ IDEA:**

- **Windows/Linux:** `Ctrl + Shift + /`
- **macOS:** `Cmd + Shift + /`

Use the same shortcut again to remove the block comment.

---

## 3. Documentation Comments

Use `/** */` to document classes, functions, and properties.

```kotlin
/**
 * Calculates the sum of two numbers.
 */
fun add(a: Int, b: Int): Int {
    return a + b
}
```

Documentation comments can be used by tools such as **KDoc** to generate documentation.

---

## 4. Nested Comments

Kotlin supports nested block comments.

```kotlin
/*
    Outer comment

    /*
        Inner comment
    */
*/
```

---

## 5. Comment Shortcuts

| Action | Windows / Linux | macOS |
|---|---|---|
| Line comment | `Ctrl + /` | `Cmd + /` |
| Block comment | `Ctrl + Shift + /` | `Cmd + Shift + /` |

> **Tip:** Select multiple lines and press the line-comment shortcut to comment or uncomment all selected lines at once.

