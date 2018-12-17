
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.Math;
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

    public static void problem710(){
        int strLen = 0; //7
        boolean stuActive = true; //8
        String  numVal = "2"; //9
        double launchAngle = 360/15.2; //10
    }

    //problem 11
    public int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void problem12 (){
        for(int i = 2; i > 0 ; i--){
            for(int j = i; j <= 2; j++){
                System.out.print(i + j + ", ");
            }
        }
    }

    public static void problem13() {
        // String myString = pumpkin;
        // double = 2.1;
        // astring = “some string”;
        int myInt = 0;
        // double aDouble = "2.0";

    }

    public static void problem14(){
        int m = 0;
        int n = 7;
        while(m < 3) {
            n--;
            m++;
        }
        System.out.print("" + m + n);
    }

    public static void problem15(){
        int rNum; 
        rNum = (int)(Math.random()*7) + 2;
        System.out.println(rNum);
    }

    public static void problem16() {
        int total = 0;
        int minNum =3;
        int maxNum = 5; 
        int k;
        for (k=1; k <= maxNum; k++) {
            if (k >= minNum) {
                total = total + k;
            }
        }
        System.out.println("the total is:" + total);
    }

    public static void problem17(){
        String s = "Strings are friends, not food";
        int x = s.indexOf("friends");
        int y = s.indexOf("food");
        String str = s.substring(0, x) + "g" + s.substring(y + 1);
        System.out.println(str); 

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

    //FR2
    public int adjustMaxMin(ArrayList<Integer> levels, int maxLevel){
        int change = 0; 
        for (int i = 0; i < levels.size(); i++){
            if ( levels.get(i) > maxLevel){
                levels.set(i,maxLevel);
                change ++; 
            } else if (levels.get(i) < -maxLevel) {
                levels.set(-maxLevel, i);
                change ++; 
            }
        }
        return change; 
    }

    //Given the following array declaration and method call, 
    //write the method that will  randomly choose and 
    //return one of the strings in randStrings.  Use the method signature provided.

    public static void getRandomResponse(){
        String[] randStrings = {"yes", 
                "no", 
                "maybe", 
                "perhaps", 
                "It remains to be seen" };
        String response = randStrings [(int)(Math.random() * (randStrings.length))]; 
        //String response = getRandomResponse(randStrings);
        System.out.println(response); 
    }

    public static void loadNums(){
        int[][] nums = new  int[10][10];
        int numEven = 0; 
        for( int r =0; r< nums.length; r++){
            for( int c =0; c< nums[0].length; c++) {
                nums [r][c] = (int)((Math.random() * 10) +1); 
                if (nums[r][c] % 2 == 0){
                    numEven ++;  
                }
            }
        }
        System.out.println (numEven); 
    }
    
}

