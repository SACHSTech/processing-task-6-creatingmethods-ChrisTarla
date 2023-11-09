/* Instructions:
 * > Create a method with parameters to draw a composite object (consisting of various shapes) at various locations specified by the parameters 
 * > Create another method with parameters to draw a composite object at various locations specified by the method parameters. 
 * Include additional parameters to modify the object(s) drawn in this method. i.e colour, size, etc.
 * Demonstration of method with parameters and a return value. i.e methods such that given dimensions of an object, returns the x value 
 * or y value for the object, to be drawn in the middle of the screen. 
 */

import java.util.Random;
import processing.core.PApplet;

public class Sketch extends PApplet {
		
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

  // Called repeatedly, anything drawn to the screen goes here
  public void draw() {
    flower(375, 375, 25, 25);
    bee(100, 100);
    //while (i < 100){
      //noLoop();
    //}
  }

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

  public int flower(int intUpperX, int intUpperY, int intLowerX, int intLowerY){
    int intColourSequence = 0;
    int i = 0;
    Random ranFlowerX = new Random();
    Random ranFlowerY = new Random();
    int intFlowerX = ranFlowerX.nextInt(((intUpperX - intLowerX) + 1) + intLowerX);
    int intFlowerY = ranFlowerY.nextInt(((intUpperY - intLowerY) + 1) + intLowerY);
    
    fill(50, 170, 80);
    rect(intFlowerX - 6, intFlowerY, 12, 50);

    for (i = 0; i < 1; i ++){
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
      
    }
    return i;
  }
}