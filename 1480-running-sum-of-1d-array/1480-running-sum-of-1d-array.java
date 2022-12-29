class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumNumbers= new int[nums.length];
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum+= nums[i];
            sumNumbers[i]= tempSum;
        }
        return  sumNumbers;
        
    }
}