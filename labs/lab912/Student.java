
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber = 0;
    private String studName;

    public Student()
    {
        // initialise instance variables
        int studNumber = 0;
        String [] names;

    }

    public void setStudNumber(int sn) {
        studNumber = sn;
    }

    public int getStudNumber() {
        return studNumber;

    }

    public void setstudName (String sn) {
        studName =sn;
    }

    public String getstudName(){
        return studName;    
    }

}
