## Homework (Sorting Algorithms) <br>

In this project you'll find 2 implementations of sorting algorithms:
 - insertion sort (module insertion-sort)
 - merge sort (module merge-sort)
 
In both modules implemented tests to check if the sorting algorithm works properly. <br>
_sort()_ methods in both modules returns number of iterations were made during sorting.

### Comparison: <br>
**Complexity:**
- insertion sort - O(n^2)
- merge sort - O(n*log(n)) 

Merge sort complexity mathematically is better than complexity of insertion sort algorithm

**Memory usage:**
- insertion sort - while sorting works with the same array, so no additional memory allocation required
- merge sort - requires additional memory allocation on each step of dividing target array on left and right part

Memory usage of insertion sort algorithm is much better than merge sort

**Number of interations:**
- insertion sort - depends on state of the array that has to be sorted:
    - sorted array - algorithm has linear complexity
    - reverse sorted array (worse case) - algorithm has complexity of O(n^2)
- merge sort - has constant number of iteration depending only on size of the array with O(n*log(n)) complexity

So, on average merge sort algorithm is better than insertion sort algorithm.

**Supporting dynamic changes:**
- insertion sort - supports changes in array while sorting it (in case of adding element to the end of array or to index that wasn't processed yet)
- merge sort - doesn't support dynamic changes of the array

**Number of iteration provided by algorithms (acc. to test results):**
- Sorted array with 1000 elements:
    - insertion sort: 999
    - merge sort: 11975 (_1000*log2(1000) ~ 9966_)
- Reverse sorted array with 1000 elements:
    - insertion sort: 500499
    - merge sort: 11975
- Random elements array with 1000 elements:
    - insertion sort: 246879, 240165, 253529 ...
    - merge sort: 11975
    