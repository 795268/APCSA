
/**
 * Write a description of class ClacRunner here.
 * 
 * @author (Elena) 
 * @version (a version number or a date)
 */
public class ClacRunner
{
    public static void main (){
    SimpleCalc number = new SimpleCalc();
    System.out.println(number.add(3,5));
    System.out.println(number.subtract(3,5));
    System.out.println(number.multiply(3,5));
    System.out.println(number.divide(3,5));
    System.out.println(number.moduloDivide(3,5));

    }
}