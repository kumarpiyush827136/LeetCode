class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[start++] = nums[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > pivot) {
                ans[end--] = nums[i];
            }
        }

        while (start <= end) {
            ans[start++] = pivot;
        }

        return ans;
    }
}