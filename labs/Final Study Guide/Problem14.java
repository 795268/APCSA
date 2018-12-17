
/**
 * Write a description of class CS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem14
{
    public void one(){
        System.out.print("one");
    }

    public void two(){
        System.out.print("two");
        one();
    }  

    public static void main(){
        Problem14 go = new Problem14();
        go.one();
        go.two();
        go.two();
    }
}