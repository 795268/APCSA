
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test 
{
    //1
    public static String go(int x) {
        if(x == 5) { // code originally missed this set of brackets; wouldn't run without them
            return "same";
        } else if (x > 5) {
            return "notsame";
        }
        return "done";
    }
    
    public static void main(){
        // 1
        System.out.println(go(-9)); 

        //2
        String str = "199 Churchill Ave. Woodside CA, 94062"; 
        //   System.out.println (str.substring("Church")); doesn't work because substring returns an int  
        //    System.out.println (str.substring(" "));  doesn't work because substring returns an int
        System.out.println (str.indexOf("Bananas")); //will return -1 
        System.out.println (str.substring (str.indexOf("4"))); //will return "4062"
        System.out.println (str.substring (str.indexOf ("CA"))); //will return "CA, 94062"
        System.out.println (str.substring(str.indexOf("W"), str.indexOf("W")+9)); //will return "Woodside"
        System.out.println (str.indexOf(str.substring(2, 4)+1)); // will return -1
        String str2 = str.substring(str.indexOf("Woodside"));
        System.out.println (str2.substring(str.indexOf(" "))); // will return "dside CA, 94062"
        
   
        //3
        /* will return:
         * , 9
         * , 6, 4
         * , 3, 2, 1
         */
        for(int i = 3; i > 0 ; i--){
            for(int j = 3; j>= i; j--){
                System.out.print(", " + i*j);
            }
            System.out.println();
        }

    }

    public static int countCode (String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 4; i ++) {
            if(str.substring(i, i + 2).equals("co")
            && str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }
        if(str.substring(str.length() - 4, str.length() - 2).equals("co")
        && str.substring(str.length() - 1).equals("e")) {
            count++;
        }

        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
        return count;

    }

}
