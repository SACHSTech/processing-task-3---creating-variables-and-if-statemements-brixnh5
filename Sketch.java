import processing.core.PApplet;

public class Sketch extends PApplet {
  
  // initializing variables

  int intWidth = 800;
  int intHeight = 800;

  float fltCloudSize = random(intWidth / 20, intWidth / 8);
  float fltCloudDistance = (fltCloudSize / 1.75f);
  float fltCloudX = random(fltCloudSize, intWidth);
  float fltCloudY = random(fltCloudSize, intHeight / 2);

  float fltCloudSize2 = random(intWidth / 20, intWidth / 8);
  float fltCloudDistance2 = (fltCloudSize2 / 1.75f);
  float fltCloudX2 = random(fltCloudSize2, intWidth);
  float fltCloudY2 = random(fltCloudSize2, intHeight / 2);

  // background size
  public void settings() {
    size(intWidth, intHeight);
  }
  // setting background colour 
  public void setup() {
    background(137, 207, 240);
  }

  public void draw() {

    // setting to remove outlines and fill colour
    noStroke();
    fill(251, 255, 255);
    
    // if the x position of the either cloud is more than half of the width, the background changes colour
    if (fltCloudX > intWidth / 2 || fltCloudX2 > intWidth / 2) {
      background(144, 238, 144);
    }

    // if both cloudsizes are larger than the width / 10, the clouds change colour
    if (fltCloudSize > intWidth / 10 && fltCloudSize2 > intWidth / 10) {
      fill(244, 226, 198);
    }

    // cloud 1 that has random positions and sizes
    ellipse(fltCloudX, fltCloudY, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance, fltCloudY, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance * 2, fltCloudY, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance * 3, fltCloudY, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance / 2, fltCloudY - fltCloudDistance, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance * 1.5f, fltCloudY - fltCloudDistance, fltCloudSize, fltCloudSize);
    ellipse(fltCloudX + fltCloudDistance * 2.5f, fltCloudY - fltCloudDistance, fltCloudSize, fltCloudSize);

    // cloud 2 that has random positions and sizes
    ellipse(fltCloudX2, fltCloudY2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2, fltCloudY2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2 * 2, fltCloudY2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2 * 3, fltCloudY2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2 / 2, fltCloudY2 - fltCloudDistance2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2 * 1.5f, fltCloudY2 - fltCloudDistance2, fltCloudSize2, fltCloudSize2);
    ellipse(fltCloudX2 + fltCloudDistance2 * 2.5f, fltCloudY2 - fltCloudDistance2, fltCloudSize2, fltCloudSize2);
    
    // box to put time in
    fill(255, 255);
    stroke(153);
    rect(150, 500, 500, 200);

    // values for time
    int intHour = hour();
    int intMinute = minute();
    int intSecond = second();

    // print time
    String strTime = (str(intHour % 12) + ":" + str(intMinute) + ":" + str(intSecond));

    // size and font
    noStroke();
    fill(0, 0, 0);
    textSize(100);
    text(strTime, 210, 630);

  }	
	
}
