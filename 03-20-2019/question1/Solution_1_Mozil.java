class Solution {
    public int searchInsert(int[] nums, int target) {
      if (nums.length == 0) return 0;
      int start = 0;
      int end = nums.length;
      while (start < end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] < target) {
          start = mid + 1;
        } else {
          end = mid;
        }
      }
      return end;
    }
  }