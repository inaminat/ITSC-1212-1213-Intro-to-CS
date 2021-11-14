//Add to Picture, refer to these examples for this lab

//Method to brighten a picture
public void lighten2() {
  
  Color color = null;
  Pixel pixel = null;
  
  for (int x = 0; x < getWidth(); x++)
  {
    for (int y = 0; y < getHeight(); y++)
    {
      //get pixel at x,y
      pixel = getPixel(x,y);
      //get this pixel's color
      color = pixel.getColor();
      
      //brighten the pixel
      color = color.brighter();
      
      pixel.setColor(color);
      
    }
  }
}


  //Method to mirror a picture around a verticle line
  public void mirrorVertical() {
    
    int width = this.getWidth();
    int mirrorPoint = width/2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    //loop through all rows
    for (int y = 0; y < getHeight(); y++) {
      
      //loop from 0 to middle
      for (int x = 0; x < mirrorPoint; x++) {
        
        leftPixel = getPixel(x,y);
        rightPixel = getPixel(width - 1 - x, y);
        rightPixel.setColor(leftPixel.getColor());
        
      }
      
    }
    
    
  }
  
  
  //Method to mirror horizontally, top to buttom
  
  public void mirrorHorizontal() {
    int height = this.getHeight();
    int mirrorPoint = height/2;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    //loop through columns
    for (int x = 0; x < getWidth(); x++) {
      //loop from zero to mirror point
      for (int y = 0; y < mirrorPoint; y++) {
        
        topPixel = getPixel(x,y);
        bottomPixel = getPixel(x,height - 1 - y);
        
        bottomPixel.setColor(topPixel.getColor());
        
      }
    }
  }
