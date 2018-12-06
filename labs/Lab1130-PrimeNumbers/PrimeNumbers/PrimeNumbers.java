
/**
 * Write a description of class PrimeNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class PrimeNumbers
{
    /*
     * hat will take an integer as an input
     * and put each of the digits into an ArrayList of Integer objects.  

     */
      ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void setListtoNumber (int n) { 
        while(n > 0) {
            numbers.add(0, n % 10);
            n = n / 10;
    }
}

    /*
     * that will take an integer and 
     * add it to an existing ArrayList of Integer objects. 
     */
    public void addNumberToList (int n) {
        for(int i = 0; i < numbers.size(); i++) {
            if(n > 0) {
        
    }
}}
    /*
     * hat will take an integer and 
     * add it to an existing ArrayList of Integer objects. 

     */
    public void addNumbers (ArrayList<Integer> n1, ArrayList<Integer> n2){
        
    }
    
}
