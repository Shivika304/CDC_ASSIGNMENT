//GeeksforGeeks
public class LowerBound {
    public int loweBoun(int[] arr, int target) {
        // code here
        int s=0,e=arr.length-1, mid=s+(s-e)/2; 
        int ret=arr.length;
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]>=target){
                ret=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ret;
        }
}
