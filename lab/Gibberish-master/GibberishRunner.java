
/**
 * Madlids kind of things
 *
 * @Elena Campell
 * @Gibberish Lab 1011
 */
public class GibberishRunner
{
    public static void main () {
        WordList5000 wordList5000 = new WordList5000(); //new object of type wordlist
        Gibberish gibberish = new Gibberish(); //new object 
        System.out.println(gibberish.makeGibberish(wordList5000)); //prints out final sentence 

    }

}