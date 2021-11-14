import java.awt.Color;
public class Assignment4Part3 {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String filename1;
    
    if (args.length > 0) {
      // got a filename passed into program as a parameter
      // don't change this part of the code: needed by the Autograder.
      filename1 = args[0];      
      System.out.println("Filename passed in: " + filename1);
    } else {
      // ask user for a picture
      System.out.println("Please open a file.");
      filename1 = FileChooser.pickAFile();
      System.out.println("User picked file: " + filename1);
    }
    Picture pic = new Picture(filename1);
  
    pic.checkerboard(15, Color.RED);
    pic.show();
  
  
    
    pic.checkerboard(30,100); 
    pic.show();
    
    //pic.checkerboard(30, Color.BLACK);
    //pic.show();
  } 
}  