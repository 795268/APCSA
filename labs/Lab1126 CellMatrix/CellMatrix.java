
/**
 * 
 * CellMatrix
 * @author (Elena Campell) 
 * @version (11-26-18)
 */
import java.lang.Math;
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;
    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }
     //  load cell with random  numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for (int r = 0; r < cells.length; r ++) { //traverse rows
            for (int c = 0; c< cells[0].length; c++) { //traverse columns
                cells[r][c] = new Cell((int)(Math.random()*10) +1); //loads [r][c] with a random int
            }
        }

    }

    /**
     * ++++++++++++++  methods
     */

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(Cell cell){
        for (int r = 0; r < cells.length; r ++) { //traverses rows
            for (int c = 0; c< cells[0].length; c++) { //traverses columns
                if(r>0){ // if there is a row above
                    cell.addNeighbors(cells[r-1][c]); //adds a neighbor 
                }
                if (r < cells.length-1){ // if there is a row below
                    cell.addNeighbors(cells[r+1][c]); // add a neighbor

                }
                if (c>0){ //if there is a column above
                    cell.addNeighbors(cells[r][c-1]); // add a neighbor
                }
                if (c < cells.length - 1) { //if there is no column below
                    cell.addNeighbors(cells[r][c+1]); // add a neighbor

                }
            }
        }
    }

    

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for (int r = 0; r < cells.length; r ++) { //traverses rows
            for (int c = 0; c< cells[0].length; c++) { //traverses columns
                System.out.println(cells[r][c].getInt() + ", ");//prints int value at [r][c]
            }
        }
    }
   

    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
        for (int r = 0; r< cells.length; r++){ //traverses rows
            for(int c = 0; c <cells[r].length; c++){//traverses columns
                int sum = cells[r][c].getSum(); //sum of the neighbors
                if(sum > greatest){ //if the sum is bigger than the last sum, it becomes greatest                    greatest = sum;
                }
            }
        }
        return greatest;
    }

  

}
