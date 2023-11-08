/* Instructions:
 * Create a method with parameters to draw a composite object (consisting of various shapes) at various locations specified by the parameters 
 * Create another method with parameters to draw a composite object at various locations specified by the method parameters. 
 * Include additional parameters to modify the object(s) drawn in this method. i.e colour, size, etc.
 * Demonstration of method with parameters and a return value. i.e methods such that given dimensions of an object, returns the x value 
 * or y value for the object, to be drawn in the middle of the screen. 
 */

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
    flower(50, 50);
    bee(100, 100, 2);
  }

  public void bee(int intBeeX, int intBeeY, int intStrokeWeight){
    fill(255, 230, 0);
    ellipse(intBeeX, intBeeY, 25, 25);
    //strokeWeight(intStrokeWeight);
    //line();

  }

  public void flower(int intFlowerX, int intFlowerY){
    fill(50, 170, 80);
    rect(intFlowerX - 6, intFlowerY, 12, 50);
    fill(60, 160, 200);
    ellipse(intFlowerX - 12, intFlowerY - 12, 25, 25);
    ellipse(intFlowerX - 12, intFlowerY + 12, 25, 25);
    ellipse(intFlowerX + 12, intFlowerY - 12, 25, 25);
    ellipse(intFlowerX + 12, intFlowerY + 12, 25, 25);
    fill(252, 211, 0);
    ellipse(intFlowerX, intFlowerY, 25, 25);
  }

}