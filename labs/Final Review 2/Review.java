
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Review
{
    public static void problem1() {
        String str1 = "Jobs, Steven Paul";
        String str2 = "Steven Paul Jobs";
        System.out.println(str1.substring(str1.indexOf("n")+2));

    }

    public static void problem3() {
        int[] nums = {1,2,3,4,5}; 
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(sum < nums[i]){
                sum=nums[i];
            }
        System.out.println(sum); 
    }

    public static void problem5(){
        //String[] ArrayList = new ArrayList<String>[12];
        // String<ArrayList> bob = new String<ArrayList>();
        //ArrayList<int> numberList = new ArrayList<int>();
        ArrayList<Integer> numberList = new ArrayList<Integer>();

    }

    public static void problem6(){
        int x = 3; 
        if (x <= 5)
            System.out.println( "same");
        else if (x >= 3)
            System.out.println( "notsame");
        System.out.println ("done");
    }

    public static void problem18() {
        int num =4;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}