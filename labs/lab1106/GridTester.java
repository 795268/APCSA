
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math; 

public class GridTester
{
    public static void loadArray() {
        int [][] testArray = new int [10][10]; 

        for (int r = 0; r<testArray.length; r++) {
            for (int c = 0; c<testArray[r].length; c++) { 
                testArray[r][c] = (int) (Math.random()*100)+1;
                System.out.print(testArray[r][c]); 

            }
        }

    }

    public static int sumAll (int[] testArray) { //finds sum
        int sum = 0; 

        for (int i = 0; i < testArray.length; i++) {
            sum  = sum + testArray[i]; 
        }
        return sum; 
    }

    public static int findGreatest (int [] testArray) { //finds largest int
        int greatest = 0;
        for(int i = 0; i < testArray.length;i++){
            if(testArray[i] > greatest){
                greatest = testArray[i];
            }
        }
        return greatest;
    }

    public static int numberOfGreatest(int[] testArray){ //returns number appearances of greatest number
        int greatest = 0;
        int count = 0;
        for(int i = 0; i < testArray.length;i++){
            if(testArray[i] > greatest){
                greatest = testArray[i];
            }

            for(int j = 0; i < testArray.length;j++){
                if (testArray[j] == greatest){
                    count = count + 1;
                }

            }
        }
        return count;
    }

    public static int findAvg(int[] testArray){//finds the average, the sum divided by the number of numbers
        int sum = 0;
        for(int i = 0; i < testArray.length;i++){
            sum = sum + testArray [i];

        }
        return sum /100;

    }
}
 