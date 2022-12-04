package ru.baragvit.algoritms.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numberIndices = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int expected = target - nums[i];
      if (numberIndices.containsKey(expected)) {
        return new int[]{numberIndices.get(expected), i};
      }
      numberIndices.put(nums[i], i);
    }
    throw new IllegalArgumentException();
  }
}