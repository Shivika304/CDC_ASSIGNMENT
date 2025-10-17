//LeetCode
public class firstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public int firstBadVersion(int n) {
        int s=1,e=n,mid;
        while(s<=e){
            mid=s+(e-s)/2;
            if(!isBadVersion(mid)){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
}