
/**
 * Write a description of class CS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CS
{
    public void one(){
        System.out.print("one");
    }

    public void two(){
        System.out.print("two");
        one();
    }  

    public static void main(){
        CS go = new CS();
        go.one();
        go.two();
        go.two();
    }
}