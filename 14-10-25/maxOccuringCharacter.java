//solved on GeeksforGeeks

import java.util.*;
class maxOccuringCharacter {
    public char getMaxOccuringChar(String s) {
        char res='\0';
        int cnt=0;
        Map<Character,Integer> map=new HashMap<>();
        
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key=entry.getKey();
            int currcnt=entry.getValue();
            if(currcnt>cnt){
                res=key;
                cnt=currcnt;
            }
            else if(currcnt==cnt && key<res){
                res=key;
            }
        }
        return res;
    }
}