
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
public class test
{

    public static void problem1(){
        int ap = 789;
        ap = ap % 10;
        System.out.print( ap );
    }
    //2 this

    public static void problem3(){
        System.out.print(3 + 3 * 3);
    }

    public static void problem4() {
        // int 124Java; 
        int Java123;
        // int float;
        //int int;
        //int double;
    }

    public static void problem5() {
        System.out.print("\\dog\\cat");  
    }

    public static void problem6() {
        int ans = 0;
        int num = 9;
        if( num >=2 ) { 
            if( num >= 7) {
                ans += 2; 
            }else {
                ans += 3;
            }
        }
        System.out.println (ans);
    }

    public static void problem7(){
        int ans = 0;
        int num = 3; 
        if( num >=2 ) { 
            if( num >= 7){ 
                ans += 2;
            }else {
                ans += 3; } 
            ans += 4; }
        System.out.println (ans);

    }

    public static void problem8( int[] ray ){
        int[] list = {2,12,11,45,52,36,5,3,1};
        double val = 0;
        for(int i=0; i < ray.length; i =  i + 2){
            val = val + ray[i];
        }
        System.out.println(val);
    }

    public static void problem9( int[] ray ){
        int[] list = {2,12,11,45,52,36};
        int val = Integer.MIN_VALUE;
        for(int i=0; i < ray.length; i++)
            if( ray[i] > val )
                val = ray[i];
        System.out.println(val);
    }

    public static void problem10( int[] ray ) { 
        int val = Integer.MIN_VALUE;
        for(int i=0; i < ray.length; i++) {
            if( ray[i] > val ) {
                val = ray[i];
            }
        }
        System.out.println(val);
    } 

    public static void problem11(int[] ray) {
        int val = 0; 
        for(int i=0; i < ray.length; i++) {
            val = val + ray[i]; 
        }
        System.out.println(val);
    }

    public static void problem12() {
        System.out.println("rsteva".substring(3,4)); 
    }

    public static void problem13(){
        int x = 4;
        if( x >= 2 ){
            System.out.print("1" + 7);
        }
        if( x >= 7){
            System.out.print("2" + 4);
        }else  
            System.out.print("3" + 9);
    }

    public static void problem16() {
        for(int h = 1; h <= 10; h++) {
            System.out.print(h); 
        }
    }

    public static void problem17() {
        String a="abcdefsdfg"; 
        String b="ems"; 
        for(int i=0; i < b.length(); i++) { 
            System.out.print(a.indexOf(b.substring(i, i+1))); 
            System.out.print(" "); 
        }
    }

    public static void problem18() {
        ArrayList<String> aList = new ArrayList<String>();
    }

    public static void problem19() {
        int x = 99;
        System.out.println (x % 2 ==0);
    }

    public static void problem20(){
        String s = "computers";
        String t = s.substring (3,7);
        int x = s.indexOf(t + s.substring(7,8)); 
        System.out.println("20:" + x); 
    }

    public static void problem21() {
        ArrayList<String> bList = new ArrayList(); 
        bList.add(0,"one");
        bList.add("two");
        bList.set(0,"three");
        bList.add(1,"four");
        bList.set(1,"five");
        System.out.println(bList.get(0).substring(0,1));

    }

    public static void problem22(){
        ArrayList<Integer> cList  = new ArrayList<Integer>();
        cList.add(0,1);
        cList.add(2);
        cList.set(0,3);
        cList.add(1, 4);
        cList.set(1, 5);
        int i = cList.get(0);
        System.out.println( i );  
    }

    public static void problem25(){
        ArrayList<Integer> dList = new ArrayList<Integer>();
        dList.add(8);
        dList.add(2);
        dList.add(0,5);
        dList.add(0,6);
        dList.add(9);
        System.out.println(dList); 
    }

    public static void problem26 (){
        int out = 0; 
        int in = 0; 
        for (out =1; out < 4; out ++){
            for (in =1; in<3; in++){
                in++;
                out--;
            }
        }
        System.out.println (out*in); 
    }

    public static void  problem27 (int[] ray) {
        int [] list = {1,2,3,4,5,6};
        int val = 0; 
        for (int i =0; i <ray.length; i++)
            val = val + ray[i];
        double ans = (double)val/ray.length;
        System.out.println(ans); 
    }

    public static void problem28() {
        double wNum = 5/2;
        wNum = wNum * 5.0; 
        System.out.println(wNum); 
    }

    public static void problem29() {
        int out = 0; 
        int in = 0; 
        for (out =1; out < 4; out ++){
            for (in =1; in<3; in++){
                in++;
                out--;
            }
        }
        System.out.println (out*in); 

    }

    public static void problem30() {
        int[][] mat = {{2,3,4,5}, 
                {6,7,8,9,10}}; 
        System.out.println(mat[1].length);
        System.out.println(mat.length); 
        System.out.println(mat[0].length); 

    }

    public static void problem31( double[] list ) {
        double big = Integer.MIN_VALUE;
        for(int i=0; i<list.length; i++)
        {
            if( i> big) {
                big = list[i];
            }

        }
        System.out.println(big); 
    }

    public static boolean check(int x){
        return (x%2==0); 
    }    

    public static void problem32() {
        System.out.println(check(92));
    }

    public static void problem33(){
        int[][] mat = {{2,3,4,5}, 
                {6,7,8,9,10}}; 
        System.out.println(mat[1][1] * mat[0][2]); 

    }
    
}
