class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=Arrays.stream(nums).sum();
        int leftSum= 0;
        for (int i = 0; i < nums.length ; i++) {
            rightSum -= nums[i];
            if(i-1 >=0 )leftSum+=nums[i-1];
            if(rightSum== leftSum) return i;
        }
        return -1;
    }
}