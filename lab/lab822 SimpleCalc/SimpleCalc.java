
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (Elena Campell) 
 * @version (8/22)
 */
public class SimpleCalc
{
public SimpleCalc(){
    
}

public double add(int a, int b){
    return a+b;
}
public double subtract(int a, int b){
    return a-b;
}
public double multiply (int a, int b){
    return a*b;
}
public double divide (int a, int b) {
    if (b != 0) {
        return a/b;
    }
        else {
           return 0;
        }
    }
    public double moduloDivide (int a, int b) {
        if (b != 0) {
            return a%b;
        }
        else {
            return 0;
        }

}
}
    

