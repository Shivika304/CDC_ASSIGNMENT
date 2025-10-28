class findPivot {
    public int sum(int[] arr,int start,int end){
        int s=0;
        for(int i=start;i<end;i++){
            s+=arr[i];
        }
        return s;
    }
    public int pivotIndex(int[] nums) {
        //int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(sum(nums,0,i)==sum(nums,i+1,nums.length)){
                return i;
            }
        }
        return -1;
    }
}