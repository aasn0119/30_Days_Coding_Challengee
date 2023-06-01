# Day 1:
# Question 1: Largest Element in Array

## Problem Statement

Given an array A[] of size n. The task is to find the largest element in it.

## Instructions

You don't need to read input or print anything. Your task is to complete the function largest() which takes the array A[] and its size n as inputs and returns the maximum element in the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

- Constraints:
1 <= n<= 103
0 <= A[i] <= 103
Array may contain duplicate elements. 

## Examples

**Example 1:**
_Input:_
n = 5
A[] = {1, 8, 7, 56, 90}
_Output:_ 90
_Explanation_: The largest element of given array is 90.

**Example 2:**

_Input:_
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
_Output:_ 5
_Explanation_: The largest element of given array is 5.

## Solution

1. [Brute Force Solution:](../solutions/prob1.java)
2. [Optimal Solution:](../solutions/prob1.java)


# Question 2: Second Largest Element in Array

## Problem Statement

Given an array Arr of size N, print second largest distinct element from an array.

## Instructions

You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

- Constraints:
2 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105 

## Examples

**Example 1:**

_Input:_ 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
_Output:_ 34
_Explanation_: 
The largest element of the array is 35 and the second largest element is 34.

**Example 2:**

_Input_: 
N = 3
Arr[] = {10, 5, 10}
_Output_: 5
__Explanation__: 
The largest element of the array is 10 and the second largest element is 5.

## Solution

1. [Brute Force Solution:](../solutions/prob2.java)
2. [Optimal Solution:](../solutions/prob2.java)

# Question 3: Check if array is sorted

## Problem Statement

Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

## Instructions

You don't need to read input or print anything. Your task is to complete the function arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean value (true if it is sorted otherwise false).


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 

- Constraints:
1 ≤ N ≤ 10^5
1 ≤ Arr[i] ≤ 10^6 

## Examples

**Example 1:**

_Input:_ 
N = 5
arr[] = {10, 20, 30, 40, 50}
_Output:_ 1
_Explanation_: 
The given array is sorted.

**Example 2:**

_Input_: 
N = 3
Arr[] = {10, 5, 10}
_Output_: 0
__Explanation__: 
The given array is not sorted.

## Solution

1. [Brute Force Solution:](../solutions/prob3.java)
2. [Optimal Solution:](../solutions/prob3.java)


# Question 4: Remove duplicate elements from sorted Array

## Problem Statement

Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

## Instructions

1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the generated output will print all the elements of the modified array from index 0 to X-1.


You don't need to read input or print anything. Complete the function remove_duplicate() which takes the array A[] and its size N as input parameters and modifies it in place to delete all the duplicates. The function must return an integer X denoting the new modified size of the array. 


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 

- Constraints:
1 ≤ N ≤ 104
1 ≤ A[i] ≤ 106

## Examples

**Example 1:**

_Input:_ 
N = 5
Array = {2, 2, 2, 2, 2}
_Output:_ {2}
_Explanation_: 
 After removing all the duplicates only one instance of 2 will remain.

**Example 2:**

_Input_: 
N = 3
Array = {1, 2, 2}
_Output_: {1, 2}

## Solution

1. [Brute Force Solution:](../solutions/prob4.java)
2. [Optimal Solution:](../solutions/prob4.java)