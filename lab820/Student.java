
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber;
    private boolean stuActive;
    private double stuGPA;
    private String stuName; 

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
        stuActive = true;
        stuGPA = 0.0;
        stuName = "name"; 
    
    }

    /**
     *Student Methods
     */
    public void setStudNumber(int sn) {
        studNumber = sn;
    }
        public int getStudNumber() {
            return studNumber;
     
    }
    public void setstuActive(boolean sa) {
        stuActive = sa; 
    }
    public boolean getstuActive (){
        return stuActive;
    }
    public void setstuGPA (double sg) {
        stuGPA = sg;
    }
    public double getstuGPA () {
        return stuGPA;
    }
    public void setstuName (String sna) {
        stuName = sna;
    }
    public String getstuName (){
        return stuName;
    }
   
}
