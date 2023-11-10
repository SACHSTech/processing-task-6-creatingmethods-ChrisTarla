import java.util.Random;
import processing.core.PApplet;

public class Sketch extends PApplet {
  int intEnd = 0;
  int intColourSequence = 0;
		
  // Called once at the beginning of execution, put your size all in this method
  public void settings() {
	// Put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * A method that calls the flower and bee methods 50 times, at a frame rate of 3 frames per second 
   */
  // Called repeatedly, anything drawn to the screen goes here 
  public void draw() {
    frameRate(3);
    flower(375, 375, 25, 25);
    bee(100, 100);
    intEnd++;
    if(intEnd == 50) {
      noLoop();
    }
  }

  /**
   * A method that prints a bee to the screen 
   * 
   * @param intBeeX  The x-coordinate of the center of the bee 
   * @param intBeeY  The y-coordinate of the center of the bee 
   */
  public void bee(int intBeeX, int intBeeY){
    fill(185, 210, 215);
    ellipse(intBeeX, intBeeY - 20, 15, 20);
    fill(255, 230, 0);
    ellipse(intBeeX, intBeeY, 40, 25);
    fill(0);
    rect(intBeeX -13 , intBeeY - 11, 5, 22);
    rect(intBeeX - 2, intBeeY - 12, 5, 25);
    rect(intBeeX + 10, intBeeY - 10, 5, 20);
    line(intBeeX + 15, intBeeY - 10, intBeeX + 25, intBeeY - 20);
  }

  /**
   * A method that prints a flower the the screen, looping between 4 colours 
   * 
   * @param intUpperX  The upper range of the random generation for the x-coordinate of the center of the flower 
   * @param intUpperY  The upper range of the random generation for the y-coordinate of the center of the flower
   * @param intLowerX  The lower range of the random generation for the x-coordinate of the center of the flower
   * @param intLowerY  The lower range of the random generation for the y-coordinate of the center of the flower
   * @return the value of the colour sequence, which determines the colour of the flower petals based on when they are printed 
   */
  public int flower(int intUpperX, int intUpperY, int intLowerX, int intLowerY){
    int i = 0;

    for (i = 0; i < 1; i ++){
      Random ranFlowerX = new Random();
      Random ranFlowerY = new Random();
      int intFlowerX = ranFlowerX.nextInt(((intUpperX - intLowerX) + 1) + intLowerX);
      int intFlowerY = ranFlowerY.nextInt(((intUpperY - intLowerY) + 1) + intLowerY);
      
      fill(50, 170, 80);
      rect(intFlowerX - 6, intFlowerY, 12, 50);
    
      if (intColourSequence == 0){
        fill(60, 160, 200);
        intColourSequence ++;
      } else if (intColourSequence == 1){
        fill(250, 15, 0);
        intColourSequence ++;
      } else if (intColourSequence == 2){
        fill(190, 90, 240);
        intColourSequence ++;
      } else if (intColourSequence == 3){
        fill(255, 200, 0);
        intColourSequence -= 3;
      }

      ellipse(intFlowerX - 12, intFlowerY - 12, 25, 25);
      ellipse(intFlowerX - 12, intFlowerY + 12, 25, 25);
      ellipse(intFlowerX + 12, intFlowerY - 12, 25, 25);
      ellipse(intFlowerX + 12, intFlowerY + 12, 25, 25);
      fill(252, 211, 0);
      ellipse(intFlowerX, intFlowerY, 25, 25);
      
      fill(0);
      text(intColourSequence, intFlowerX - 5, intFlowerY + 5);
    }
    return intColourSequence;
  }
}
