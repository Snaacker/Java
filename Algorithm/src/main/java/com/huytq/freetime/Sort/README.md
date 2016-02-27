#Bubble Sort     
The bubble sort makes multiple passes through a list. It compares adjacent items and exchanges those that are out of order. Each pass through the list places the next largest value in its proper place. In essence, each item “bubbles” up to the location where it belongs.    
   
*(http://interactivepython.org/)*   
#Quick Sort   
Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.   

The steps are:   
   
- Pick an element, called a pivot, from the array.   
- Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.   
- Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.   
The base case of the recursion is arrays of size zero or one, which never need to be sorted.   
The pivot selection and partitioning steps can be done in several different ways; the choice of specific implementation schemes greatly affects the algorithm's performance.  
   
*(Wikipedia)*    
#Selection Sort   
The selection sort improves on the bubble sort by making only one exchange for every pass through the list. In order to do this, a selection sort looks for the largest value as it makes a pass and, after completing the pass, places it in the proper location. As with a bubble sort, after the first pass, the largest item is in the correct place. After the second pass, the next largest is in place. This process continues and requires n−1n−1 passes to sort n items, since the final item must be in place after the (n−1)(n−1) st pass.
   
*(http://interactivepython.org/)* 
#Merge Sort
Conceptually, a merge sort works as follows:   

- Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).   
- Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.   
   
*(Wikipedia)*   
