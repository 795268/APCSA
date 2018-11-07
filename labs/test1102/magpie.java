
/**
 * Write a description of class magpie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList; 
import java.lang.Math; 

public class magpie
{
    private String transformILike(String str){
	
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
	        
	       }
	       System.out.println (strings.get(Math.random()*100) + subject + "?");
	       
	   
	    
	   
	    
	    
	    
	   }
	   
}
	    
/*
 * \//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		//finds keywords me and you and changes statement to a question of why 
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "Why do you " + restOfStatement + " me?";
	}
 */
		
