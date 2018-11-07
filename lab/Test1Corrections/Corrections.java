
/**
 * @Elena Campell
 * @Test 1 Corrections
 */
import java.lang.Math;
public class Corrections
{
    public static void main(){
        //Number 2. Answer = C
        int x = 4 % 47;
        int y = 10% 3 ;
        int z = 15/4;
        System.out.println(x+y+z);

        //Number 4. Answer = B    
        int num = 4; 
        if (num/3 <= 1) {
            System.out.println ("true");
        }
        System.out.println("false"); 

        /*
         * Number 9:
         * x
         * x x
         * x x x
         * x x x x
         *
         */
        for(int i =0; i<4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("x ");
            }
            System.out.println (); 
        }
    }

    /* Number 10:
    public class Pumpkin{
    public int num;
    int x = 0;
    public Pumpkin(int x){
    num = x; 
    }
    public void setnum(int num){
    num = 7;
    }
    public int getnum(){
    return num; 
    }
    }
     */

    //Number 11
    public int digitsSum (int num){
        int sum = 0;
        int nums = (int) (Math.random()*100) +1;
        int last = 0;
        while (nums >0){
            last = nums % 10;
            sum = last + sum;
            nums++;

        }
        return sum;
 
    }
}
 