/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
 
/** This program makes a game where the user has to catch rain drops in a bucket
 */


int score = 0;
int bucketWidth = 50;
int bucketHeight;
PImage bucket;
int y= 50;
int x = 100;
int s = 40;

// The setup method is run once when the program starts

void setup() {

  //Set your canvas size
  size(500,500);
  
  //If you are using an image for the bucket, load it and resize it here.
  // A bucket image -  bucket.png - has been provided if you want to use it.

}

// The draw method runs continuously (in a loop) until the program ends
void draw() {


  // Draw a raindrop (ellipse) at the top of the screen
    
    background(130,125,0);
    for(int i=1;i<10;i++){
  ellipse(x,y,s, s);
 y= y+5;
   if(height < s) {  
        x = (int)random(0,450);
        y = (int) random(height);
        }
    
     ellipse(x+100,y,s, s);
      checkCatch(x);  
       
    }

 

   
  // Make the rain fall down the screen.
  // Hint: make a variable for the raindrop's Y position and change it after you
  // draw the raindrop

  
  // When the rain falls off the bottom of the canvas, 
  // start a new rain drop falling from the top.


       int randomNumber = (int) random(width);
       
       rect(mouseX,450,100,200);
      
 
  // Each new drop should start at a random position (X position) at the top. 
  // Hint: This code will give you a random number between 0 and the width of your sketch.
  
  
  
  // Draw a bucket (rectangle or image) at the bottom of the screen. 
  // The bucket's width needs to be stored in the bucketWidth variable.
  
  
  // Make the bucket move side-to-side with the mouse. Hint: use mouseX
  
  
  // When the rain drop has fallen to the bucket, call the checkCatch method
  //  to see if the rain drop is in the bucket.
  
 
 //This code will display the score on the screen. 
 // Change the color if it does not show up on your background.
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}


// DO NOT CHANGE THIS METHOD - CALL IT FROM THE DRAW METHOD 
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+bucketWidth)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
