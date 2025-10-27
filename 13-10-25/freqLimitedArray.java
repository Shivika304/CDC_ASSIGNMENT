import java.util.*;
public class freqLimitedArray {
     public List<Integer> frequencyCount(int[] arr) {
        // code here
        List<Integer> m=new ArrayList<>();
        int list[]=new int[arr.length];
        for(int i: arr){
           list[i-1]++;
        }
        for(int i: list){
            m.add(i);
        }
        return m;
    }
}
