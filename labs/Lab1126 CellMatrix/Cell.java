
/**
 * @author (eettlin) 
 * @version (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    public void addNeighbors(Cell cell){
        for(int r = 0; r <neighbors.length;r++) {//traverse the array
            if (neighbors[r] == null){ //if no neighbor
                neighbors[r] = cell;
                r = neighbors.length;

            }
        }
    }

    public int getSum(){ //method to get sum of all neighbors
        int sum = 0; 
        for (int r = 0; r<neighbors.length; r++) {//traverrse arrray
            if (neighbors[r]!= null) { //if there is a neiigtbor
                sum += neighbors[r].getInt();

            }

       
        }
        return sum; 
    }

    public int getInt(){
        return x;
    }
}
