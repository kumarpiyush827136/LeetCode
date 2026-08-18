class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int p2 = 1;
        int count = 0;
        int end = nums.length;
        while(start<end && p2<end){
            if (start == p2) {
                p2++;
                continue;
            }
            int diff = nums[p2] - nums[start];
            if(diff==k){
                count++;
                start++;
                p2++;
                while(start<end&& nums[start]==nums[start-1]){
                    start++;
                }
                while (p2 < end && nums[p2] == nums[p2 - 1]) {
                    p2++;
                }
            }
            else if (diff < k){
                p2++;
            }
            else{
                start++;
            }
        }
        return count;
    }
}