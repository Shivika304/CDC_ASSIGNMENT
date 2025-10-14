//451- Leetcode

import java.util.*;
class FrequencyOfCharacter {
    public String frequencySort(String s) {
        if(s==null || s.length()<2){
            return s;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //list to do bucket sort
        List<Character>[] bucket=new List[s.length()+1];
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key=entry.getKey();
            int freq=entry.getValue();
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>0;i--){
            List<Character> list=bucket[i];
            if(list!=null){
                for(char c: list){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}