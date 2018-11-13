
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    //instance variable 
    int rank; 
    String suit; 
    public Card (int rnk, String s){
        int rank = rnk;
        String suit = s; 
    }

    public int getRank(){//rank getter
        return rank; 
    }

    public String getSuit(){// suit getter 
        return suit; 
    }
}