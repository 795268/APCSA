
/**
 * Write a description of class It here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Itone
{
    private int x = 78; 

    public Itone () {
        x=99;
    }
   
    public String toString(){
     return "" + x;    
    }

  
    public static void main () {
        Itone anIt = new Itone();
        System.out.println(anIt); 
    }
}
