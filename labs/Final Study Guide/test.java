
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
        int ap = 789;
        ap = ap % 10;
        System.out.println ("1: " + ap);

        //3
        System.out.println ("3: " + (3 + 3 * 3)); 

        //5
        System.out.println("5: " +"\\dog\\cat");

        //6
        System.out.println("6: " +getIt(9)); 

        //7
        System.out.println("7:" + getIt(3)); 

        //8
        //9
        //10
        //11

        //12
        System.out.println ("12: " + "rsteva".substring(3,4));

        //13
        System.out.println("13: " + add());

        //16
        System.out.print("16: ");
        for(int h = 1; h <= 10; h++){
            System.out.print(h + ", ");
        }
        System.out.println();

        //17
        System.out.print("17: ");
        String a="abcdefsdfg";
        String b="ems";
        for(int i=0; i < b.length(); i++)
        { System.out.print(a.indexOf(b.substring(i, i+1)));
            System.out.print(" ");
        }
        System.out.println();

        //19
        System.out.println("19: " +check(99)); 

        //26
        //System.out.println("26:" + inOut()); 

        //27
        int[] list = {1,2,3,4,5,6}; 
        System.out.println ("27: " + go2(list)); 

        //30
        int[][] mat = {{2,3,4,5},
                {6,7,8,9,10}};
        System.out.print("30: "); 
        System.out.print(mat[1].length);
        System.out.print(mat.length);
        System.out.println(mat[0].length);

        //31
        // System.out.println("31: " + findBig());

        //32
        System.out.println("32: " + check(92));

        //33
        int[][] matt = {{2,3,4,5},
                {6,7,8,9,10}};
        System.out.println("33: " + matt[1][1] * matt[0][2]);

    }
    //2
    //4

    //6 & 7 
    public static int getIt(int num)
    { int ans = 0;
        if( num >=2 )
        {
            if( num >= 7)
                ans += 2; else
                ans += 3;
        }ans += 4; 
        return ans;
    }

    /*
    //8
    public static double go( int[] ray ){
    int[] list = {2,12,11,45,52,36,5,3,1};
    int val = 0;
    for(int i=0; i < ray.length; i =  i + 2){
    val = val + ray[i];
    }
    return (val);
    }

    //9
    int[] list = {2,12,11,45,52,36};
    public static int go( int[] ray )
    { int val = Integer.MIN_VALUE;
    for(int i=0; i < ray.length; i++)
    if( ray[i] > val )
    val = ray[i];
    return val;
    }

     */

    //13
    public static int add(){
        int x = 4;
        if( x >= 2 ){
            System.out.print("1" + 7);
        }
        if( x >= 7){
            System.out.print("2" + 4);
        }else  
            System.out.print("3" + 9);
        return x;
    }
    //19
    public static boolean check(int x) {
        return (x % 2 ==0);
    }
    //20
    public static void twenty(){
        String s = "computers";
        String t = s.substring (3,7);
        int x = s.indexOf(t + s.substring(7,8)); 
        System.out.println("20:" + x); 
    }

    //21
    public static void bList() {
        ArrayList<String> bList = new ArrayList(); 
        bList.add(0,"one");
        bList.add("two");
        bList.set(0,"three");
        bList.add(1,"four");
        bList.set(1,"five");
        System.out.println(bList.get(0).substring(0,1));

    }

    //22
    public static void cList(){
        ArrayList<Integer> cList  = new ArrayList<Integer>();
        cList.add(0,1);
        cList.add(2);
        cList.set(0,3);
        cList.add(1, 4);
        cList.set(1, 5);
        int i = cList.get(0);
        System.out.println( i );  
    }

    //25
    public static void dList(){
        ArrayList<Integer> dList = new ArrayList<Integer>();
        dList.add(8);
        dList.add(2);
        dList.add(0,5);
        dList.add(0,6);
        dList.add(9);
        System.out.println(dList); 
    }

    //26
    public static int inOut (){
        int out = 0; 
        int in = 0; 
        for (out =1; out < 4; out ++){
            for (in =1; in<3; in++){
                in++;
                out--;
            }
        }
        return (out*in); 
    }

    //27 
    public static double go2 (int[] ray) {

        int val = 0; 
        for (int i =0; i <ray.length; i++)
            val = val + ray[i];
        double ans = (double)val/ray.length;
        return ans; 
    }
    //28
    public static void wNum() {
        double wNum = 5/2;
        wNum = wNum * 5.0; 
        System.out.println(wNum); 
    }

    //31
    public static double findBig( double[] list ) {
        double big = Integer.MIN_VALUE;
        for(int i=0; i<list.length; i++)
        {
            if( i> big) {
                big = list[i];
            }

        }
        return big; 
    }

    
}
