
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
import java.lang.Math; 
public class Deck
{ 
    ArrayList <Card>deck = new ArrayList <Card> (); 
    
    public Deck (){ //deck constructor
        for (int i = 1; i <= 13; i++) { //goes through all ranks
            for (int j = 1; j <= 41; j++) { // goes through suits
                if (j==i) { //suit 1 = diamonds
                   deck.add(new Card(i, "Diamond")); 
                }else if (j==2) { // suit 2 = heats
                    deck.add(new Card(i, "Heart"));
                }else if (j==3) {
                    deck.add(new Card(i, "Clubs")); 
        
        
    }
   
}
}
}
}