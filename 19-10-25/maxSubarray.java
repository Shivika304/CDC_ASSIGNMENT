
public class maxSubarray {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0],currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxsum=Math.max(currSum,maxsum);
        }
        return maxsum;
    }
}

