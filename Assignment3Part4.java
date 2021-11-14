/**
 * Auto Generated Java Class.
 */

public class Assignment3Part4 {
  
  
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
   pic.show();  
   Pixel[] tempPixelArray = pic.getPixels(); //array of pic copy
   Pixel pixel = null;
   
   
   
   //-------------------First (Psychedelic) part-----------------
    
   
      
    for (int k=0; k<=3; k++){   //loop for call each method 3 times
    
    pic.goPsychedelicGreen(0.7);// you can choose begining parameter for change green color in % 
                                //(0<your %< 1)in decimal format for ex.70%=0.7
                                   
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
       
    pic.goPsychedelicBlue(0.7);// you can choose parameter of changing blue color in %
                              //(0<your %< 1)in decimal format for ex.70%=0.7
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
       
    pic.goPsychedelicRed(0.7); // you can choose parameter of changing red color in %
                              //(0<your %< 1)in decimal format for ex.70%=0.7
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    }
    
    
    //-------------------Second (Luxembourger) part-----------------
      
     Pixel[] currentPixels = tempPixelArray;          
     for (int i =0; i<currentPixels.length; i++) { //loop through pixels
       
     pixel = currentPixels[i];//Set pixel to original value 
     
    //make first loop for upper 1/3 of the picture
    
    for (int x=0; x<tempPixelArray.length/3; x++){
   
     pixel.setBlue(tempPixelArray[i].getBlue());
    //pixel.setRed((int)(pixel.getRed()*0.5));  // set the new values of red
    }
    
   
    //make 2-nd loop for next 2/3 of the picture
 
    //for (int x=tempPixelArray.length/3; x<2*tempPixelArray.length/3; x++){
    //pixel = tempPixelArray[x];  //get current pixel
    
    // set the new values color to white usung combination RGB color
    //pixel.setBlue((int)(pixel.getBlue()*4));
    //pixel.setRed((int)(pixel.getRed()*4));
    //pixel.setGreen((int)(pixel.getGreen()*4));
    }

    //make 3-rd loop for the bottom 1/3 of the picture
  
    //for (int x=2*tempPixelArray.length/3; x<tempPixelArray.length; x++){
    //pixel = tempPixelArray[x];
    //pixel.setBlue((int)(pixel.getBlue()*0.5)); // set the new values of blue
   
    }//pic.repaint(); 
     
    
  }
