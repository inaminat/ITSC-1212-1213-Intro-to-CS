/* Assignment 3, Part 2 - Go Lux! */

public class Assignment3Part2
{
//
  public static void main(String [] args) throws InterruptedException
  {
    String filename;
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code needed by TA for grading
       filename = args[0];      
       System.out.println("Filename passed in: " + filename);
       
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    Picture pic = new Picture(filename);   // Picture to modify
    //
    pic.show();             // Show the original picture
    Thread.sleep(1000);     //  Pause for 1 second.  You can pause for less if you like
    
    Pixel[] pixelArray = pic.getPixels();
    
    

  // --------TODO: put your flag tinting code here
       
    
   
    Pixel pixel = null; 
    
    //make first loop for upper 1/3 of the picture
    for (int x=0; x<pixelArray.length/3; x++){
    pixel = pixelArray[x];    //get current pixel
    pixel.setRed((int)(pixel.getRed()*5));  // set the new values of red
    }
    
   
    //make 2-nd loop for next 2/3 of the picture
    for (int x=pixelArray.length/3; x<2*pixelArray.length/3; x++){
    pixel = pixelArray[x];  //get current pixel
    
    // set the new values color to white usung combination RGB color
    pixel.setBlue((int)(pixel.getBlue()*2.05));
    pixel.setRed((int)(pixel.getRed()*2.05));
    pixel.setGreen((int)(pixel.getGreen()*2.05));
    }

    //make 3-rd loop for the bottom 1/3 of the picture
    for (int x=2*pixelArray.length/3; x<pixelArray.length; x++){
    pixel = pixelArray[x];
    pixel.setBlue((int)(pixel.getBlue()*5)); // set the new values of blue
   
    }
      
    pic.repaint();
  }  // End of main
}  // End of Class