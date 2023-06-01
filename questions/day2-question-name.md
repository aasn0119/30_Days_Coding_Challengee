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