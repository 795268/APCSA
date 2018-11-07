
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{ 
    /*  // 
    // create static method to 'run' activity 1 

    public static void activity1 (){
    //creates window for the ballBots to run in 
    BallWorld ballWorld = new BallWorld(400,400);
    //initiates where the ballBots begin
    TGPoint startPoint = new TGPoint (0,0); 
    //int startPoint= 0;
    int startHeading = 0;
    //gives the ball bot an initial radidus 
    int radius = 25;
    //creates a ballBot object with a parameter of the window, where it starts, what direction it faces, and the radius length
    BallBot ballBot = new BallBot (ballWorld, startPoint, startHeading, radius); 
    //while loop that goes on forever
    while (2==2) {
    if(ballBot.canMoveForward(ballWorld) == true){
    ballBot.moveForward(); 
    //if it can't move forward, it has to turn a random number of degrees within 360 
    } else {

    startHeading = (startHeading + 90) % 360;
    ballBot.setHeading(startHeading);

    }
    }
    }
     */

    /*
     *
    public static void activity2 (){
    BallWorld ballWorld = new BallWorld(400,400);
    TGPoint startPoint = new TGPoint (0,0); 
    //int startPoint= 0;
    int startHeading = (int)(Math.random()*360);
    int radius = (int)(Math.random()*20+1);
    BallBot ballBot = new BallBot (ballWorld, startPoint, startHeading, radius); 

    BallBot[] ballBotArray = new BallBot [10];
    BallRunner ballRunner = new BallRunner (); 

    while (1+1==2){
    int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray); 
    if(freeBallBotIndex < ballBotArray.length) {
    ballBotArray[freeBallBotIndex] = new BallBot (ballWorld, startPoint, startHeading, radius); 
    }

    for (int index = 0; index < ballBotArray.length; index++) {
    if (ballBotArray[index] != null){
    if (ballBotArray[index].canMoveForward(ballWorld) == true) {
    ballBotArray [index].moveForward();
    }else {
    startHeading = (int)(Math.random()*360); 
    ballBotArray[index].setHeading(startHeading);
    }
    }
    }
    }
    }

    public int findFreeBallBotIndex(BallBot [] ballBotArray){
    boolean empty = false; 
    int x = 0; 
    for (int i = 0; i<ballBotArray.length && empty== false; i++) {
    if (ballBotArray [i] == null){ 
    empty = true; 
    x = i; 
    }
    }
    if (empty == true){
    return x; 
    } else { 
    return ballBotArray.length;    
    }

    }
     */
    public static void activity3 (){
        // creates 10 ball objects
        BallWorld ballWorld = new BallWorld(400,400);
        TGPoint startPoint = new TGPoint (0,0); 
        //int startPoint= 0;
        int startHeading = (int)(Math.random()*360);
        int radius = (int)(Math.random()*20+1);
        BallBot ballBot = new BallBot (ballWorld, startPoint, startHeading, radius); 

        BallBot[] ballBotArray = new BallBot [10]; //declares and intilizes an array of ballbot objects
        BallRunner ballRunner = new BallRunner (); // new ball

        while (1+1==2){ //creates an endless while loop
            int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray); //empty spot in the array?
            if(freeBallBotIndex < ballBotArray.length) { //looking for empty spot in the array
                ballBotArray[freeBallBotIndex] = new BallBot (ballWorld, startPoint, startHeading, radius); //creates a new ballbot
            }

            for (int index = 0; index < ballBotArray.length; index++) {
                if (ballBotArray[index] != null){ //if the index is not empty
                    if (ballBotArray[index].canMoveForward(ballWorld) == true) { //if it can move forward
                        ballBotArray [index].moveForward(); 
                        if (ballRunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null) {

                        }
                    }else { //if it can't move forward it goes in a random direction 
                        startHeading = (int)(Math.random()*360); 
                        ballBotArray[index].setHeading(startHeading);
                    }
                }
            }
        }
    }

    public int findFreeBallBotIndex(BallBot [] ballBotArray){
        boolean empty = false; 
        int x = 0; 
        for (int i = 0; i<ballBotArray.length && empty== false; i++) {
            if (ballBotArray [i] == null){ 
                empty = true; 
                x = i; 
            }
        }
        if (empty == true){
            return x; 
        } else { 
            return ballBotArray.length;
        }
    }

    public double distanceBetweenPoints (TGPoint point1, TGPoint point2) {
        double xDiff = point1.x - point2.x;  
        double yDiff = point2.x - point2.y; 
        double xSquare = xDiff * xDiff; //square root in the change of x
        double ySquare = yDiff * yDiff; //square root in the change of y 
        return Math.sqrt(xSquare + ySquare); //returns the difference between the two points

    }

    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint) { //creates a method to find if there is an empty space
        boolean clear = true; 
        for (int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i]!= null){ //if the index is empty
                double distance = distanceBetweenPoints(ballBotArray [i].getPoint(), entrancePoint); 
                if (distance < ballBotArray [i].getRadius ()*2){ //if the distance is not greater than the radius of the bot
                    clear = false; //dont add a bot
                }
            }

        }
        return clear; 
    }

    public static void activity4 () {  //makes the balls bounce off of each other
        BallWorld ballworld = new BallWorld (400,400);
        TGPoint entrancePoint = new TGPoint (0,0);
        int radius = 25; 

        BallBot[] ballBotArray = new BallBot[10]; 
        BallRunner ballrunner = new BallRunner(); //creates new ball

        while (2==2) {//endless loop
            if (ballrunner.entranceClear(ballBotArray, entrancePoint) == true) {//is there an empty space in array?
                int freeBallBotIndex = ballrunner.findFreeBallBotIndex(ballBotArray);
                if (freeBallBotIndex < ballBotArray.length){
                    ballBotArray[freeBallBotIndex] = new BallBot (ballworld, entrancePoint, Math.random()*360.0, radius);//creates new ballbot

                }
            }
            for (int index = 0; index < ballBotArray.length; index++) { // traverse the array
                if (ballBotArray [index] != null) {//if the array is not empty
                    if (ballBotArray[index].canMoveForward(ballworld) == true){ //if it can move forward 
                        if (ballrunner.ballBotToBounceOff (ballBotArray [index], ballBotArray) == null) {
                            ballBotArray[index].moveForward();//moves forward if it isn't touching another ball
                        } else {
                            ballBotArray[index].setHeading(Math.random()*360); //will turn another direction if touching something else
                        }
                    }
                }

            }
        }
    }

    public BallBot ballBotToBounceOff (BallBot ballBot, BallBot[] ballBotArray){ // creates method to have balls bounce off of each other 
        TGPoint touch1 = ballBot.getPoint ();
        TGPoint nextPoint = ballBot.forwardPoint();
        for (int i = 0; i < ballBotArray.length; i++) {
            BallBot otherBallBot = ballBotArray [i] ; // otherballbot object as an object in the array
            if (otherBallBot != null && otherBallBot != ballBot) { 
                double currentDistance = distanceBetweenPoints(touch1, otherBallBot.getPoint()); //distance be
                if (currentDistance <= ballBot.getRadius() + otherBallBot.getRadius ()){
                    double nextDistance  = distanceBetweenPoints(nextPoint, otherBallBot.getPoint());
                    if (nextDistance <= currentDistance) { 
                        return otherBallBot;
                    }
                }
            }

        }
        return null; 

    }
}

