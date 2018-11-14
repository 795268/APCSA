
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList; 

public class test
{
    public static void main(){
        //1

        String str1 = "Obama, Barack";
        String str2 = "Barack Hussein Obama"; 
        System.out.println (str1.substring(0,7) );
        System.out.println (str2.substring(str2.indexOf("H"), str2.indexOf("n") ));
        System.out.println (str1.substring(str1.indexOf(" ")+1));
        System.out.println (str2.substring((str2.indexOf("n")+2)));

        //2

        ArrayList<Double> nums;
        nums = new ArrayList<Double>(); 
        int sum = 0; 
        for(int i =0; i<nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.println(sum); 

        //3
        System.out.println (someFun(7)); 
          
         //4
         String str = "199 Churchill Ave. Woodside CA, 94062"; 
         System.out.println(str.substring(str.indexOf("Woodside"), str.indexOf ("W")+8));
         
         //5
         for (int i = 6; i>3; i--) {
             for (int j =3; j< i; j++) {
                 System.out.print(" i =" + i + ", j =" + j);
                }
                System.out.print("/n");
                
         
    }
}

    public static String someFun (int x){
        if (x <= 12){
            return "SeeYa";
        }
        else if (x>5) {
            return "Bye";

        }
        return "SoLong"; 

    }
    
}
