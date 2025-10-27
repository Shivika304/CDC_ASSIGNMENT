public class rem_Min_Max {
    public int minimumDeletions(int[] nums) {
        int minIn=0,maxIn=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxIn]){
                maxIn=i;
            }
            if(nums[i]<nums[minIn]){
                minIn=i;
            }
        }
        int defront=Math.max(maxIn,minIn)+1;
        int deback=n-Math.min(maxIn,minIn);
        int both=(Math.min(maxIn,minIn)+1) + (n-Math.max(maxIn,minIn));
        return Math.min(both,Math.min(deback,defront));
    }

}
