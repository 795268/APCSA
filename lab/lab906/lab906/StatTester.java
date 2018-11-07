
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * Elena Campell
 * lab906
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;

    // Constructor
    public StatTester(){
        nums = new int [100];
    }

    //  Methods
    public void loadArray(){
        for (int i=0; i < nums.length; i ++) {
            nums [i] = (int) (Math.random () * 10 + 1);
        }
        System.out.println (nums);
    }

    public void printArrary (){
        for (int i=0; i < nums.length; i ++){
            System.out.print (nums[i] + ", ");
            if ((i+1)%10==0 & i!=0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public int getSum (){
        int total = 0;
        for (int i=0; i < nums.length; i++) {
            total = total + nums [i]; 

        }
        return total; 

    }

    public double getMean (){
        int total = 0;
        for (int i=0; i < nums.length; i++) {
            total = total + nums [i]; 

        }
        return (double) total / nums.length;
    }

    public double getMedian () {
        Arrays.sort(nums);
        return(double) (nums[49]+nums[50])/2;
    }

     

    }

