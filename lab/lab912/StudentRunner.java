
/**
 * Write a description of class StudentRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentRunner
{
    public static void main(){
        String [] studNum = new String [5];
        for (int i = 0; i <5; i++) {
            Student s1 = new Student ();
            s1.setStudNumber(12345);
            System.out.println(s1.getStudNumber());
            Student s2 = new Student ();
            s2.setStudNumber(12346);
            System.out.println(s2.getStudNumber());
            Student s3 = new Student ();
            s3.setStudNumber(12347);
            System.out.println(s3.getStudNumber());
            Student s4 = new Student ();
            s4.setStudNumber(12348);
            System.out.println(s4.getStudNumber());
            Student s5 = new Student ();
            s5.setStudNumber(12349);
            System.out.println(s5.getStudNumber());
        }

        String [] names = {"Bob", "Sarah", "Joe", "Harry", "Ann"};
        for (int i =0; i<5; i++) {

            Student s1 = new Student ();
            s1.setstudName(names [i]); 
            System.out.println (s1.getstudName()); 

        
        }
        
    }
}