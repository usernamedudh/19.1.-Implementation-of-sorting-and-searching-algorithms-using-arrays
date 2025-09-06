# Implementation of Sorting and Searching Algorithms in Java



## Overview

This repository provides a straightforward Java implementation of the Merge Sort and Binary Search algorithms. The project is designed to demonstrate how these fundamental algorithms work with integer arrays. The `Main` class initializes a random array, sorts it using Merge Sort, and then performs a Binary Search to find a specific element.

## Implemented Algorithms

-   **Merge Sort:** A highly efficient, stable, comparison-based sorting algorithm. It follows the divide-and-conquer paradigm by recursively dividing the array into halves, sorting them, and then merging them back together.
-   **Binary Search:** An efficient algorithm for finding an item from a sorted array. It works by repeatedly dividing the search interval in half.

## How to Run

To compile and run this project from the command line, follow these steps:

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/usernamedudh/19.1.-implementation-of-sorting-and-searching-algorithms-using-arrays.git
    cd 19.1.-implementation-of-sorting-and-searching-algorithms-using-arrays
    ```

2.  **Navigate to the `src` directory:**
    ```sh
    cd src
    ```

3.  **Compile the Java source files:**
    ```sh
    javac app/Main.java app/ArrayUtils.java
    ```

4.  **Execute the main program:**
    ```sh
    java app.Main
    ```

## Example Output

The program generates a random array of 10 integers, sorts it, and then searches for one of its elements. The output will look similar to this (the actual numbers will vary on each run):

```
Початковий масив: [83, 12, 9, 45, 77, 62, 34, 58, 21, 99]
Відсортований масив: [9, 12, 21, 34, 45, 58, 62, 77, 83, 99]
Елемент 58 знайдено на позиції 5
```

## Code Structure

-   `src/app/ArrayUtils.java`: A utility class containing the static methods `mergeSort()` and `binarySearch()`. This class encapsulates the core algorithm logic.
-   `src/app/Main.java`: The main driver class. It initializes data, calls the sorting and searching methods from `ArrayUtils`, and prints the results to the console to demonstrate their functionality.
