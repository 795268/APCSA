
/**
 * Write a description of class EvenSum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvenSum
{
    
    public static void main(){
        
        int sum=0;
        int num=10;
        for(int i=0; i<=num; i++) {
            if(i%2==0){
                sum = sum + i;
            }
    }
    System.out.println(sum);

}
}
