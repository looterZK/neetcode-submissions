class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output =  new int[ n - k + 1];

        for(int i = 0 ; i <= n - k; i++){
            int max = nums[i];
            for(int j=i; j < i + k; j++){
                max = Math.max(max, nums[j]);
            }
            output[i] = max;
        }

        return output;
    }
}
