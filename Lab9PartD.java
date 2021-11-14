/* Lab 9, Part D: Created by Celine Latulipe, modified by Bruce Long  */  
public class Lab9PartD {   
  public static void main(String [] args)  
  {   
    String filename;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename = args[0];
       System.out.println("Filename passed in: " + filename);
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    
    Picture pic = new Picture(filename);
    // show the original picture
    pic.show();
    
    // call the tile method
    // save resulting picture to a variable so we can show it separate from the original
    Picture result;
    result = pic.tile();
    // show the new picture
    result.show();

  } 
}  