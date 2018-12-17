
/**
 * review problem 24 
 * @elena campell
 */
import java.util.ArrayList; 
public class It
{

    private int x = 78;
    public It( ) {
        x = 99;
    }

    public It( int y ) {
        x = y; 
    }

    public String toString(){
        return "" + x;
    }

    public static void main(){

        ArrayList<It> itList = new ArrayList<It>();
        itList.add(new It());
        itList.add(new It(8));
        System.out.println(itList);
    }
}
