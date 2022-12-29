class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum;
        int leftSum;
        for (int i = 0; i < nums.length ; i++) {
            rightSum=0;
            leftSum=0;
            for (int j = 0; j < nums.length ; j++) {
                if(j<i)leftSum+= nums[j];
                else if(j>i)rightSum+=nums[j];
            }
            if(rightSum== leftSum) return i;
        }
        return -1;
    }
}