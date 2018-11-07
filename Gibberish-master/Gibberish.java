
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gibberish
{
    
    String sourceString = new String(); 

    public Gibberish () { //gibberish constructor 
        Template template = new Template(); 
        sourceString = template.getSourceString(); 

    }

    public String makeGibberish(WordList5000 wordList5000) {
        int currentSourceIndex = 0; 
        String resultString = ""; 
        while (currentSourceIndex < sourceString.length()) { //if the indec is smaller than the length, make a new string 
            if(sourceString.indexOf("<", currentSourceIndex) == -1 || sourceString.indexOf (">", currentSourceIndex) == 1){ // if  the string isn't found 
                resultString += sourceString.substring(currentSourceIndex); 
                currentSourceIndex = sourceString.length(); //just return length
            }else { //if the string is found 
                int firstCut = sourceString.indexOf ("<", currentSourceIndex) +1; //find the first </>
                int lastCut = sourceString.indexOf (">", currentSourceIndex); // find the end of it
                String hold = sourceString.substring (firstCut, lastCut);  //creates a new string as a placeholder for a random word 
                String add = wordList5000.getRandomWordString(hold); // adds a random word 
                if (add!= null){

                    resultString += sourceString.substring (currentSourceIndex, firstCut - 2) + " " + add;  //concatinates the whole string 

                }
                currentSourceIndex = sourceString.indexOf("</>" , currentSourceIndex) +3;                
                   //checks to see if there is more 
            }
        }
        return resultString; 
    }
}

