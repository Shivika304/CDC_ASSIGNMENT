//GeeksforGeeks
public class kokoEatingBanana {
    public int kokoEat(int[] arr, int k) {
        // code here
        int lar=0,s=1;
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
        }
        int res=0,e=lar,mid=0;
        while(s<=e){
            long hrs=0;
            mid=s+(e-s)/2;
            for(int i: arr){
                hrs=hrs+((i+mid-1)/mid);
            }
            if(hrs<=k){
                res=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return res;
    }
}

