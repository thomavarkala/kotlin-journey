# Kotlin Journey

A personal **Kotlin learning, practice, and reference repository**.

This repository documents my journey through **Kotlin fundamentals, data structures, algorithms, and competitive programming**, from basic syntax to advanced problem-solving techniques.

It contains my **notes, examples, experiments, implementations, and competitive programming templates** as I continue learning and improving my Kotlin skills.

The repository is designed to grow over time and serve as a **long-term Kotlin reference** that I can revisit whenever needed.

> Learning Kotlin one concept, one problem, and one project at a time.

---

## Repository Structure

```text
kotlin/
│
├── README.md
│
├── 01-fundamentals/
│   │
│   ├── 01-basics/
│   │   ├── 01-variables.md
│   │   ├── 02-data-types.md
│   │   ├── 03-type-inference.md
│   │   ├── 04-input-output.md
│   │   ├── 05-operators.md
│   │   ├── 06-type-conversion.md
│   │   └── 07-comments.md
│   │
│   ├── 02-control-flow/
│   │   ├── 01-if-else.md
│   │   ├── 02-when.md
│   │   ├── 03-for-loop.md
│   │   ├── 04-while-loop.md
│   │   ├── 05-break-continue.md
│   │   └── 06-ranges.md
│   │
│   ├── 03-functions/
│   │   ├── 01-functions.md
│   │   ├── 02-parameters.md
│   │   ├── 03-return-values.md
│   │   ├── 04-default-arguments.md
│   │   └── 05-single-expression-functions.md
│   │
│   ├── 04-strings/
│   │   ├── 01-string-basics.md
│   │   ├── 02-string-templates.md
│   │   ├── 03-string-functions.md
│   │   └── 04-characters.md
│   │
│   ├── 05-arrays/
│   │   ├── 01-array.md
│   │   ├── 02-int-array.md
│   │   ├── 03-array-functions.md
│   │   └── 04-array-iteration.md
│   │
│   ├── 06-collections/
│   │   ├── 01-list.md
│   │   ├── 02-mutable-list.md
│   │   ├── 03-set.md
│   │   ├── 04-map.md
│   │   ├── 05-mutable-map.md
│   │   └── 06-collection-functions.md
│   │
│   ├── 07-null-safety/
│   │   ├── 01-nullable-types.md
│   │   ├── 02-safe-call.md
│   │   ├── 03-elvis-operator.md
│   │   └── 04-not-null-assertion.md
│   │
│   ├── 08-classes-and-objects/
│   │   ├── 01-classes.md
│   │   ├── 02-constructors.md
│   │   ├── 03-properties.md
│   │   ├── 04-data-classes.md
│   │   └── 05-objects.md
│   │
│   └── 09-kotlin-features/
│       ├── 01-lambdas.md
│       ├── 02-higher-order-functions.md
│       ├── 03-extension-functions.md
│       ├── 04-destructuring.md
│       └── 05-scope-functions.md
│
├── 02-data-structures/
│   │
│   ├── 01-arrays/
│   │   ├── 01-array.md
│   │   ├── 02-int-array.md
│   │   └── 03-multi-dimensional-array.md
│   │
│   ├── 02-linked-list/
│   │   ├── 01-singly-linked-list.md
│   │   ├── 02-doubly-linked-list.md
│   │   └── 03-circular-linked-list.md
│   │
│   ├── 03-stack/
│   │   ├── 01-stack.md
│   │   └── 02-monotonic-stack.md
│   │
│   ├── 04-queue/
│   │   ├── 01-queue.md
│   │   ├── 02-deque.md
│   │   └── 03-priority-queue.md
│   │
│   ├── 05-hash-table/
│   │   ├── 01-hash-map.md
│   │   └── 02-hash-set.md
│   │
│   ├── 06-tree/
│   │   ├── 01-binary-tree.md
│   │   ├── 02-binary-search-tree.md
│   │   ├── 03-heap.md
│   │   └── 04-tree-traversal.md
│   │
│   ├── 07-graph/
│   │   ├── 01-graph-basics.md
│   │   ├── 02-adjacency-list.md
│   │   ├── 03-adjacency-matrix.md
│   │   └── 04-disjoint-set-union.md
│   │
│   └── 08-trie/
│       └── 01-trie.md
│
├── 03-algorithms/
│   │
│   ├── 01-searching/
│   │   ├── 01-linear-search.md
│   │   ├── 02-binary-search.md
│   │   └── 03-search-on-answer.md
│   │
│   ├── 02-sorting/
│   │   ├── 01-bubble-sort.md
│   │   ├── 02-selection-sort.md
│   │   ├── 03-insertion-sort.md
│   │   ├── 04-merge-sort.md
│   │   ├── 05-quick-sort.md
│   │   └── 06-counting-sort.md
│   │
│   ├── 03-recursion/
│   │   ├── 01-recursion.md
│   │   ├── 02-backtracking.md
│   │   └── 03-divide-and-conquer.md
│   │
│   ├── 04-two-pointers/
│   │   └── 01-two-pointers.md
│   │
│   ├── 05-sliding-window/
│   │   └── 01-sliding-window.md
│   │
│   ├── 06-prefix-sum/
│   │   ├── 01-prefix-sum.md
│   │   └── 02-difference-array.md
│   │
│   ├── 07-greedy/
│   │   └── 01-greedy.md
│   │
│   ├── 08-dynamic-programming/
│   │   ├── 01-dp-basics.md
│   │   ├── 02-one-dimensional-dp.md
│   │   ├── 03-two-dimensional-dp.md
│   │   └── 04-knapsack.md
│   │
│   ├── 09-graph-algorithms/
│   │   ├── 01-bfs.md
│   │   ├── 02-dfs.md
│   │   ├── 03-topological-sort.md
│   │   ├── 04-dijkstra.md
│   │   ├── 05-bellman-ford.md
│   │   └── 06-floyd-warshall.md
│   │
│   ├── 10-tree-algorithms/
│   │   ├── 01-tree-traversals.md
│   │   └── 02-lowest-common-ancestor.md
│   │
│   ├── 11-bit-manipulation/
│   │   ├── 01-bit-basics.md
│   │   ├── 02-bitwise-operators.md
│   │   └── 03-bit-tricks.md
│   │
│   └── 12-mathematical-algorithms/
│       ├── 01-gcd-lcm.md
│       ├── 02-prime-numbers.md
│       ├── 03-sieve-of-eratosthenes.md
│       └── 04-fast-exponentiation.md
│
└── 04-competitive-programming/
    │
    ├── README.md
    ├── template.kt
    │
    ├── 01-input-output/
    │   ├── 01-fast-input.md
    │   └── 02-fast-output.md
    │
    ├── 02-complexity/
    │   ├── 01-time-complexity.md
    │   └── 02-space-complexity.md
    │
    ├── 03-common-techniques/
    │   ├── 01-coordinate-compression.md
    │   ├── 02-sweep-line.md
    │   ├── 03-meet-in-the-middle.md
    │   └── 04-implementation-techniques.md
    │
    ├── 04-number-theory/
    │   ├── 01-modular-arithmetic.md
    │   ├── 02-modular-inverse.md
    │   └── 03-euclidean-algorithm.md
    │
    ├── 05-combinatorics/
    │   ├── 01-permutations.md
    │   ├── 02-combinations.md
    │   └── 03-binomial-coefficients.md
    │
    ├── 06-advanced-data-structures/
    │   ├── 01-segment-tree.md
    │   ├── 02-fenwick-tree.md
    │   └── 03-sparse-table.md
    │
    └── 07-advanced-algorithms/
        ├── 01-mst.md
        ├── 02-network-flow.md
        └── 03-string-algorithms.md
```
