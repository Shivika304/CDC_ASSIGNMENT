import java.util.*;
class removeDupliElem{
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[n++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        return list;
    }
}

