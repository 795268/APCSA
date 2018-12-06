import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    /** Method to keep only blue  */
    public void onlyBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from right to left*/
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture vertically, top to bottom*/
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture vertically, bottom to top*/
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor(bottomPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count ++; 
            }
        }
        System.out.println(count);
    }

    /** method to mirror the arms of the snowman*/
    public void mirrorArms() {
        int mirrorPoint = 193;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        // loops to mirror the left arm down 
        for (int row = 157; row < mirrorPoint; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 103; col < 171; col++)
            {

                topPixel = pixels[row][col];      
                bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                bottomPixel.setColor(topPixel.getColor());

            }
        }
        int mP = 198;
        Pixel tP = null;
        Pixel bP = null;

        // loops to mirror the right arm down 
        for (int row = 171; row < mP; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 239; col < 295; col++)
            {

                tP = pixels[row][col];      
                bP = pixels[mP - row + mP][col];
                bP.setColor(tP.getColor());

            }
        }

    }

    /**method to mirror the gulls right to left */

    public void mirrorGull(){
        int mirrorPoint = 345;
        Pixel rightPixel = null;
        Pixel leftPixel = null;
        Pixel[][] pixels = this.getPixels2D();   

        // to mirror the gull 
        for (int row = 235; row < 323; row++)
        {
            for (int col = 238; col < mirrorPoint; col++)
            {
                rightPixel = pixels[row][col];      
                leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 500, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    public void copy2(Picture fromPic, 
    int startRow, int endRow, int startCol, int endCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++){
            for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to create a collage of several pictures */
    public void myCollage()
    {
        Picture koala = new Picture("chip.jpg");
        Picture barbara = new Picture("HOTdog.jpg");
        this.copy(koala,0, 0 );
        this.copy(barbara,200,0);
        this.copy(koala,200,0);
        Picture barbaraNoBlue = new Picture(barbara);
        barbaraNoBlue.zeroBlue();
        this.copy(barbaraNoBlue,300,0);
        this.copy(koala,400,0);
        this.copy(barbara,500,0);

        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        //variables for top, bottom, left, right 
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        //variabels for pixel array 
        Pixel[][] pixels = this.getPixels2D();
        //variables for right and bottom color 
        Color rightColor = null;
        Color bottomColor = null; 
        //nested for loop 
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length-1; col++)
            {
                //find each edge by setting left right top and bottom to their row& column
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                topPixel = pixels[row][col];
                bottomPixel = pixels[row][col+1];
                bottomColor = bottomPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > edgeDist || topPixel.colorDistance(bottomColor) > edgeDist  ) {
                    leftPixel.setColor(Color.BLACK);
                    topPixel.setColor(Color.BLACK);

                }else{
                    leftPixel.setColor(Color.WHITE);
                    topPixel.setColor(Color.WHITE);

                }
            }

        }
    }

    /**
     *  my method for edge detection
     */
    public void myedgeDetection(int edgeDist){
        // top, bottom, right, left 

        Pixel top = null;
        Pixel bottom = null;
        Pixel left = null;
        Pixel right = null;
        //variabels for pixel array 
        Pixel[][] pixels = this.getPixels2D();
        //variables for right and bottom color 
        Color rightColor = null;
        Color bottomColor = null; 
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length-1; col++)
            {
                //find each edge by setting left right top and bottom to their row& column
                left = pixels[row][col];
                right = pixels[row][col+1];
                rightColor = right.getColor();
                top = pixels[row][col];
                bottom = pixels[row][col+1];
                bottomColor = bottom.getColor();
                if (left.colorDistance(rightColor) > edgeDist || top.colorDistance(bottomColor) > edgeDist  ) {

                    left.setColor(Color.BLACK);
                    top.setColor(Color.BLACK);

                }else{
                    left.setColor(Color.BLACK);
                    top.setColor(Color.BLACK);

                }
            }

        }
    }

    public void colorEdge(int edgeDist){

        // top, bottom, right, left

        Pixel left = null;
        Pixel right = null;
        //variabels for pixel array 
        Pixel[][] pixels = this.getPixels2D();
        //variables for right and bottom color 
        Color rightColor = null;
        Color bottomColor = null; 
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length-1; col++)
            {
                //find each edge by setting left right top and bottom to their row& column
                left = pixels[row][col];
                right = pixels[row][col+1];
                rightColor = right.getColor();
                if (left.colorDistance(rightColor) > edgeDist || left.colorDistance(bottomColor) > edgeDist  ) {
                    
                    Color color = new Color ((int)(Math.random()*254)+1, (int)(Math.random()*254)+1,(int)(Math.random()*254)+1); 
                    left.setColor(color);

                }else{
                    left.setColor(Color.BLACK);

                }
            }

        }
    }

    public void Negate(){ //method to negate all colors 
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255-pixelObj.getRed());
                pixelObj.setGreen(255-pixelObj.getGreen());
                pixelObj.setBlue(255-pixelObj.getBlue()); 
            }
        }

    }

    public void Grayscale(){ //method to setpicture to grayscale 
        Pixel[][] pixels = this.getPixels2D();
        int avg = 0;
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                avg = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed())/3;
                pixelObj.setRed(avg);
                pixelObj.setGreen(avg);
                pixelObj.setBlue(avg);
            }
        }

    }

    public void fixUnderwater() { //method to make the fish stand out 
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                if (pixelObj.getBlue()>165 && pixelObj.getGreen()<170 &&  pixelObj.getRed()<20) {
                    pixelObj.setRed(200);
                    pixelObj.setGreen(50);
                    pixelObj.setBlue(50);
                }
            }

        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
