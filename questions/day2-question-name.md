# Day 2: 
## Question 5 and 6: Rotate Array

## Problem Statement

Given an integer array nums, rotate the array to the right (or left) by k steps, where k is non-negative.

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
nums = [1,2,3,4,5,6,7], k = 3

_Output:_ [5,6,7,1,2,3,4]

_Explanation:_ 
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

**Example 2:**

_Input:_
nums = [-1,-100,3,99], k = 2
_Output:_ 
[3,99,-1,-100]
_Explanation_: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

## Solution

1. [Brute Force Solution:](../solutions/prob5.java)
2. [Optimal Solution:](../solutions/prob5.java)


## Question 7: Move Zeroes to the End

## Problem Statement

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.
 

- Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

## Examples

**Example 1:**
_Input:_
nums = [0]

_Output:_ [0]


**Example 2:**
_Input:_
nums = [0,1,0,3,12]
_Output:_ 
[1,3,12,0,0]

## Solution

1. [Brute Force Solution:](../solutions/prob7.java)
2. [Optimal Solution:](../solutions/prob7.java)


## Question 8: Searching an element in a sorted array

## Problem Statement :

Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

## Instructions:

 You don't need to read input or print anything. Complete the function searchInSorted() which takes the sorted array arr[], its size N and the element K as input parameters and returns 1 if K is present in the array, else it returns -1. 


Expected Time Complexity: O(Log N)
Expected Auxiliary Space: O(1)

- Constraints:
1 <= N <= 106
1 <= K <= 106
1 <= arr[i] <= 106

## Examples

**Example 1:**
_Input:_
N = 5, K = 2
arr[] = {1,3,4,5,6}
_Output:_ -1
_Exlpanation:_ Since, 2 is not present in the array, output is -1.

**Example 2:**
_Input:_
N = 5, K = 6
arr[] = {1,2,3,4,6}
_Output:_ 1
_Exlpanation:_ Since, 6 is present in the array at index 4 (0-based indexing), output is 1.


## Solution

1. [Optimal Solution:](../solutions/prob8.java)


## Question 7: Union of Two Sorted Arrays

## Problem Statement

Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.


- Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

## Examples

**Example 1:**
_Input:_
int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int arr2[] = {2, 3, 4, 4, 5, 11, 12};

_Output:_ [1 2 3 4 5 6 7 8 9 10 11 12]


## Solution

1. [Brute Force Solution:](../solutions/prob9.java)
2. [Optimal Solution:](../solutions/prob9.java)