//LeetCode
import java.util.*;
class MinStack {
    private List<int[]> list;
    public MinStack() {
      list=new ArrayList<>();  
    }
    
    public void push(int val) {
        int[] top=list.isEmpty()? new int[]{val,val}: list.get(list.size()-1);
        int min_val=top[1];
        if(min_val>val){
            min_val=val;
        }
        list.add(new int[]{val,min_val});
    }
    public void pop() {
        list.remove(list.size()-1);
    }
    public int top() {
        return list.isEmpty()?-1: list.get(list.size()-1)[0];
    }
    public int getMin() {
        return list.isEmpty()? -1:list.get(list.size()-1)[1];
    }
}
