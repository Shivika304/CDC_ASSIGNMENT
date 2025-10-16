import java.util.Arrays;
public class asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        int n =asteroids.length;
        int[] res = new int[n];
        int count=0;
        int ast;
        for(int i=0;i<n;i++){
            ast = asteroids[i];
            boolean exploded = false;
            while(count>0 && ast<0 && res[count-1]>0){
                if(res[count-1] < -ast){
                    count--;
                }
                else if(res[count-1] == -ast){
                    exploded=true;
                    count--;
                    break;
                }
                else if(res[count-1]>-ast){
                    exploded = true;
                    break;
                }
            }
            if(!exploded){
                res[count]=ast;
                count++;
            }
        }
        return Arrays.copyOf(res,count);
    }
}