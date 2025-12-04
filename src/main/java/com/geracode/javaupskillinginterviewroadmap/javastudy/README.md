# Java Upskilling Roadmap 🛤️
This repository is designed to help you prepare for Java technical interviews by covering core Java concepts,
advanced topics, algorithms, data structures, and practical coding exercises with LeetCode problems.

---

## 1. Object-Oriented Programming (OOP) Fundamentals
- Encapsulation, Inheritance, Polymorphism, Abstraction
- Classes, Objects, Interfaces, Abstract Classes
- SOLID Principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion)
- Access Modifiers and Clean Code Design
- Package Structure and Visibility

---

## 2. Java Collections and Data Handling
- Collections Framework: List, Set, Map, Queue and their implementations (ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue)
- Differences and use cases
- Iterators and advanced looping
- Comparable vs Comparator
- Thread-safe and concurrent collections (ConcurrentHashMap, CopyOnWriteArrayList)
- Streams API (filtering, mapping, reduction)

---

## 3. Exception Handling in Java
- Exception hierarchy: checked vs unchecked exceptions
- Try-catch-finally and try-with-resources
- Custom exceptions
- Best practices in error handling

---

## 4. Generics in Java
- Basic usage and syntax
- Wildcards (`?`, `extends`, `super`)
- Benefits and limitations
- Practical examples with Collections

---

## 5. Recent Java Features and Enhancements
- Optional for null safety
- Stream API and lambdas (functional programming)
- Date and Time API (`java.time`)
- Records (Java 14+)
- Local variable type inference (`var`)

---

## 6. Concurrency and Multithreading
- Basics: Threads, Runnable, Callable, Future
- Synchronization: `synchronized`, locks, atomic variables
- Executors and Thread Pools
- Common issues: deadlocks, starvation, race conditions
- Concurrent collections

---

## 7. Design Patterns
- Creational: Singleton, Factory, Builder, Prototype
- Structural: Adapter, Decorator, Proxy, Composite, Facade
- Behavioral: Observer, Strategy, Command, Template Method, Iterator

---

## 8. Advanced Java Concepts
- JVM Internals and Garbage Collection (GC types and basic tuning)
- Inner classes, anonymous classes, and lambdas
- Reflection API
- Annotations and processors
- Modularization (Java Modules)

---

## 9. Algorithm Fundamentals and Complexity Analysis
- Time and space complexity concepts
- Big O, Omega, and Theta notation
- Analyzing loops, recursion, and data structures
- Common complexities: O(1), O(log n), O(n), O(n log n), O(n²), O(2^n), O(n!)

---

## 10. Key Data Structures for Algorithms
- Arrays and Strings manipulation
- Linked Lists (single, double, circular)
- Stacks and Queues (array and list implementations)
- Trees: Binary, BST, AVL, Trie
- Graphs: adjacency matrix and adjacency list representations
- Hash Tables / HashMaps

---

## 11. Fundamental Algorithms with Java + LeetCode Practice
- Searching: linear and binary search
- Sorting: bubble sort, insertion sort, merge sort, quicksort, heapsort
- Recursion and backtracking (combinations, permutations, Sudoku)
- Dynamic programming (subproblem solving, memoization, bottom-up)
- Graph algorithms (DFS, BFS, Dijkstra, Floyd-Warshall)
- String algorithms (KMP, Rabin-Karp, suffix arrays)
- Using and optimizing data structures to solve problems

---

## 12. Additional Recommended Topics
- Testing with JUnit and Mockito
- Clean Code and SOLID principles applied in Java
- Build tools: Maven, Gradle
- Version control with Git
- Basic Microservices and popular frameworks: Spring Boot (for backend interest)
- Architectural patterns (MVC, REST API design)
- Basic security concepts in Java (authentication, sensitive data handling)

---

## Getting Started

- Start with core OOP and Java fundamentals
- Gradually move to Collections and Exception Handling
- Practice concurrency and design patterns
- Dive into algorithms and data structures with Java examples
- Solve related problems on [LeetCode](https://leetcode.com) to build coding skills
- Explore advanced concepts and best practices as you progress

---

## Contributions & Feedback

Feel free to open issues or submit pull requests to improve this roadmap or add resources!

---

### Java Upskilling Interview Roadmap Project Structure
    ```
        java-upskilling-interview-roadmap/
        │
        ├── README.md
        ├── documentation/docs
        │   ├── Algorithms/
        │   │   ├── Complexity.md
        │   │   ├── DataStructures.md
        │   │   ├── Searching.md
        │   │   ├── Sorting.md
        │   │   ├── Recursion_Backtracking.md
        │   │   ├── DynamicProgramming.md
        │   │   ├── GraphAlgorithms.md
        │   │   └── StringAlgorithms.md
        │   ├── OOP.md
        │   ├── Collections.md
        │   ├── Exceptions.md
        │   ├── Generics.md
        │   ├── JavaFeatures.md
        │   ├── Concurrency.md
        │   ├── DesignPatterns.md
        │   ├── JVM.md
        │   ├── Testing.md
        │   ├── Tools.md           # Maven, Git, etc.
        │   └── Misc.md
        │   └── README.md
        │
        ├── src/
        │   ├── oop/
        │   │   ├── EncapsulationExample.java
        │   │   ├── InheritanceExample.java
        │   │   └── ...
        │   ├── collections/
        │   │   ├── ListExamples.java
        │   │   ├── MapExamples.java
        │   │   └── ...
        │   ├── exceptions/
        │   │   ├── CustomException.java
        │   │   └── ExceptionHandlingExample.java
        │   ├── generics/
        │   │   └── GenericsExample.java
        │   ├── features/
        │   │   ├── OptionalExample.java
        │   │   ├── StreamExample.java
        │   │   └── ...
        │   ├── concurrency/
        │   │   ├── ThreadExample.java
        │   │   ├── ExecutorExample.java
        │   │   └── ...
        │   ├── designpatterns/
        │   │   ├── Singleton.java
        │   │   ├── Factory.java
        │   │   └── ...
        │   ├── jvm/
        │   │   └── GCExample.java
        │   ├── algorithms/
        │   │   ├── complexity/
        │   │   │   └── BigONotation.java
        │   │   ├── datastructures/
        │   │   │   ├── LinkedList.java
        │   │   │   ├── BinaryTree.java
        │   │   │   └── ...
        │   │   ├── searching/
        │   │   │   └── BinarySearch.java
        │   │   ├── sorting/
        │   │   │   ├── MergeSort.java
        │   │   │   └── QuickSort.java
        │   │   ├── recursion/
        │   │   │   └── BacktrackingExample.java
        │   │   ├── dynamicprogramming/
        │   │   │   └── FibonacciDP.java
        │   │   ├── graphs/
        │   │   │   └── DFS.java
        │   │   └── strings/
        │   │       └── KMPAlgorithm.java
        │   └── testing/
        │       └── JUnitTests.java
        │
        └── leetcode/
        ├── arrays/
        │   ├── TwoSum.java
        │   └── ...
        ├── strings/
        │   └── ValidPalindrome.java
        ├── dynamicprogramming/
        │   └── CoinChange.java
        ├── graphs/
        │   └── NumberOfIslands.java
        └── README.md
    ```

## How can I create this structure 
```
mkdir -p documentation/docs/Algorithms \
documentation/src/main/java/com/geracode/javaupskillinginterviewroadmap \
documentation/leetcode/{arrays,strings,dynamicprogramming,graphs}
```

```
touch documentation/README.md \
documentation/docs/OOP.md \
documentation/docs/Collections.md \
documentation/docs/Exceptions.md \
documentation/docs/Generics.md \
documentation/docs/JavaFeatures.md \
documentation/docs/Concurrency.md \
documentation/docs/DesignPatterns.md \
documentation/docs/JVM.md \
documentation/docs/Testing.md \
documentation/docs/Tools.md \
documentation/docs/Misc.md
```

```
touch documentation/docs/Algorithms/Complexity.md \
documentation/docs/Algorithms/DataStructures.md \
documentation/docs/Algorithms/Searching.md \
documentation/docs/Algorithms/Sorting.md \
documentation/docs/Algorithms/Recursion_Backtracking.md \
documentation/docs/Algorithms/DynamicProgramming.md \
documentation/docs/Algorithms/GraphAlgorithms.md \
documentation/docs/Algorithms/StringAlgorithms.md
```



## project structure 
```
# Ir a la carpeta raíz del proyecto
mkdir -p src/com/geracode/javaupskillinginterviewroadmap
cd src/com/geracode/javaupskillinginterviewroadmap

# 01-oop
mkdir -p 01-oop
touch 01-oop/{EncapsulationExample.java,InheritanceExample.java,PolymorphismExample.java,AbstractionExample.java,InterfaceExample.java,AbstractClassExample.java,SOLIDPrinciplesExample.java}

# 02-collections
mkdir -p 02-collections
touch 02-collections/{ListExamples.java,SetExamples.java,MapExamples.java,QueueExamples.java,DequeExamples.java,ComparableExample.java,ComparatorExample.java,CollectionsUtilityMethods.java}

# 03-exceptions
mkdir -p 03-exceptions
touch 03-exceptions/{CustomException.java,ExceptionHandlingExample.java,CheckedVsUnchecked.java,TryWithResourcesExample.java}

# 04-generics
mkdir -p 04-generics
touch 04-generics/{GenericsExample.java,GenericClassExample.java,GenericMethodExample.java,BoundedGenericsExample.java}

# 05-features
mkdir -p 05-features
touch 05-features/{OptionalExample.java,StreamExample.java,LambdaExample.java,MethodReferencesExample.java,RecordExample.java,SwitchExpressionExample.java,SealedClassesExample.java}

# 06-features_by_version
mkdir -p 06-features_by_version/{java8,java9,java10,java11,java12,java13,java14,java15,java16,java17,java21}
touch 06-features_by_version/java8/{LambdaExample.java,StreamExample.java,DefaultMethodsExample.java,OptionalExample.java,DateTimeAPIExample.java}
touch 06-features_by_version/java9/{ModuleExample.java,PrivateMethodsInInterfacesExample.java,JShellExample.java,CollectionFactoryMethodsExample.java}
touch 06-features_by_version/java10/{VarKeywordExample.java,OptionalOrElseThrowExample.java}
touch 06-features_by_version/java11/{StringMethodsExample.java,HttpClientExample.java,LambdaLocalVariablesExample.java}
touch 06-features_by_version/java12/SwitchExpressionsExample.java
touch 06-features_by_version/java13/TextBlocksExample.java
touch 06-features_by_version/java14/{RecordExample.java,PatternMatchingInstanceofExample.java}
touch 06-features_by_version/java15/SealedClassesExample.java
touch 06-features_by_version/java16/{RecordsEnhancementExample.java,PatternMatchingInstanceofEnhancedExample.java}
touch 06-features_by_version/java17/{SealedClassesExample.java,SwitchPatternMatchingExample.java}
touch 06-features_by_version/java21/{VirtualThreadsExample.java,RecordPatternsExample.java,SequencedCollectionsExample.java}

# 07-concurrency
mkdir -p 07-concurrency
touch 07-concurrency/{ThreadExample.java,ExecutorExample.java,CallableFutureExample.java,SynchronizationExample.java,LocksExample.java,ConcurrentCollectionsExample.java,CompletableFutureExample.java}

# 08-designpatterns
mkdir -p 08-designpatterns
touch 08-designpatterns/{Singleton.java,Factory.java,AbstractFactory.java,Builder.java,Prototype.java,Adapter.java,Observer.java,Strategy.java,Decorator.java,Command.java}

# 09-jvm
mkdir -p 09-jvm
touch 09-jvm/{GCExample.java,ClassLoadingExample.java,MemoryModelExample.java,JITCompilerExample.java}

# 10-algorithms
mkdir -p 10-algorithms/{complexity,datastructures,searching,sorting,recursion,dynamicprogramming,graphs,strings}
touch 10-algorithms/complexity/BigONotation.java
touch 10-algorithms/datastructures/{LinkedList.java,DoublyLinkedList.java,Stack.java,Queue.java,BinaryTree.java,BinarySearchTree.java,Heap.java,Trie.java,DisjointSetUnion.java}
touch 10-algorithms/searching/{BinarySearch.java,LinearSearch.java,TernarySearch.java}
touch 10-algorithms/sorting/{MergeSort.java,QuickSort.java,BubbleSort.java,SelectionSort.java,InsertionSort.java,HeapSort.java}
touch 10-algorithms/recursion/{BacktrackingExample.java,NQueens.java,MazeSolver.java}
touch 10-algorithms/dynamicprogramming/{FibonacciDP.java,LongestCommonSubsequence.java,LongestIncreasingSubsequence.java,KnapsackProblem.java,CoinChange.java}
touch 10-algorithms/graphs/{DFS.java,BFS.java,Dijkstra.java,BellmanFord.java,FloydWarshall.java,KruskalMST.java,PrimMST.java,TopologicalSort.java}
touch 10-algorithms/strings/{KMPAlgorithm.java,RabinKarp.java,ZAlgorithm.java,AnagramChecker.java,PalindromeChecker.java}

# 11-testing
mkdir -p 11-testing
touch 11-testing/{JUnitTests.java,MockitoExample.java,ParameterizedTests.java}

```

<table>
  <tr>
    <th>Class</th>
    <th>Problem Generator</th>
    <th>Concepts</th>
  </tr>
  <tr>
    <td>#1</td>
    <td>Practical complexity analysis: lists, queues, stacks, and hashmap.</td>
    <td>
      <ul>
        <li>Lists</li>
        <li>Queues</li>
        <li>Stacks</li>
        <li>Hashmap</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#2</td>
    <td>Heaps</td>
    <td>
      <ul>
        <li>Heap concepts</li>
        <li>Binary heaps</li>
        <li>Basic heap operations</li>
        <li>Complexity analysis of heap operations</li>
        <li>Heap sort</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#3</td>
    <td>Backtracking</td>
    <td>
      <ul>
        <li>Concepts and applications</li>
        <li>Classic algorithms
          <ul>
            <li>Subsets</li>
            <li>Permutations</li>
            <li>Combinations</li>
          </ul>
        </li>
        <li>Complexity analysis</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#4</td>
    <td>Trees</td>
    <td>
      <ul>
        <li>Tree concepts</li>
        <li>Binary search trees</li>
        <li>Balancing</li>
        <li>Tries (prefix trees)
          <ul>
            <li>Insertion</li>
            <li>Search</li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#5</td>
    <td>Exercises</td>
    <td>Class focused on solving exercises to reinforce the module's content</td>
  </tr>
  <tr>
    <td>#6</td>
    <td>Graphs I</td>
    <td>
      <ul>
        <li>Basic graph concepts: vertices, edges, degree (in-degree and out-degree), directed vs. undirected, weighted vs. unweighted</li>
        <li>Graph representation: adjacency matrix and adjacency list</li>
        <li>Breadth-first search (BFS): principle, implementation, and applications</li>
        <li>Shortest path in unweighted graphs</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#7</td>
    <td>Graphs II</td>
    <td>
      <ul>
        <li>Depth-first search (DFS): principle, implementation, and applications</li>
        <li>Graph connectivity</li>
        <li>Cycle detection</li>
        <li>Topological sorting</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#8</td>
    <td>Graphs III</td>
    <td>
      <ul>
        <li>Weighted graphs</li>
        <li>Shortest path algorithms
          <ul>
            <li>Dijkstra</li>
            <li>A*</li>
            <li>Floyd–Warshall</li>
            <li>Bellman–Ford</li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#9</td>
    <td>Graphs IV</td>
    <td>
      <ul>
        <li>Minimum spanning tree</li>
        <li>Prim's algorithm</li>
        <li>Kruskal's algorithm</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#10</td>
    <td>Exercises</td>
    <td>Class focused on solving exercises to reinforce the module's content</td>
  </tr>
  <tr>
    <td>#11</td>
    <td>Dynamic Programming</td>
    <td>
      <ul>
        <li>Concept of dynamic programming and optimal substructure</li>
        <li>Optimization problems and overlapping subproblems</li>
        <li>Approaching recursive problems with DP</li>
        <li>Bottom-up vs. top-down approach</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>#12</td>
    <td>Dynamic Programming</td>
    <td>
      <ul>
        <li>Classic algorithms
          <ul>
            <li>Longest Common Subsequence (LCS)</li>
            <li>Longest Increasing Subsequence (LIS)</li>
            <li>Coin change</li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

*Happy coding and good luck with your interviews! 🚀*


