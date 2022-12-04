package ru.baragvit.algorithms.leetcode.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import ru.baragvit.algoritms.leetcode.twosum.Solution;

class SolutionTest {


  @Test
  void testSimpleCase() {
    int[] nums = {3, 4};
    int[] result = new Solution().twoSum(nums, 7);
    assertArrayEquals(new int[]{0, 1}, result);
  }

  @Test
  void firstAndLastCorrect() {
    int[] nums = {0, 1, 2, 3, 10};
    int[] result = new Solution().twoSum(nums, 10);
    assertArrayEquals(new int[]{0, 4}, result);
  }
}