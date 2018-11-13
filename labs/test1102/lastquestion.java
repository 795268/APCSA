
/**
 * Write a description of class magpie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList; 
import java.lang.Math; 

public class lastquestion
{

    public String transformILike(String str){

        ArrayList <String> strings;
        strings = new ArrayList <String>(); 

        strings.add ("Why do you like"); 
        strings.add ("Do you eat");
        strings.add ("What are");
        strings.add ("What color are"); 

        String statement = "I like";

        String lastChar = str.substring(str.length()-1);

        if (str.substring(0,5).equals(statement) && lastChar.equals(".")){
            String subject = str.substring(str.indexOf(statement) +1, str.indexOf(lastChar)); 
            return (strings.get((int)Math.random()*100) + subject + "?");
        }

        return str;

    }
}
