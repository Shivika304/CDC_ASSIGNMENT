public class reverseArray {
    public void reverseArray(int arr[]) {
        // code here
        int temp[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            temp[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
}