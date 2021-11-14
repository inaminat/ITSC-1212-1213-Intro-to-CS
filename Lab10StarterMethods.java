



//Method to copy one picture (source) into an existing picture (target)
public void copyPic() {

//Declare our variables
String filename = FileChooser.pickAFile();
Picture sourcePicture = new Picture(filename);

Pixel sourcePixel = null;
Pixel targetPixel = null;

//loop through columns

for (int sourceX = 0, targetX = 0;sourceX < sourcePicture.getWidth(); sourceX++, targetX++) {
//loop through rows
  for(int sourceY = 0, targetY = 0;sourceY < sourcePicture.getHeight(); sourceY++, targetY++) {
  //get our Pixels, and set target equal to source
    sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
    targetPixel = this.getPixel(targetX,targetY);
    targetPixel.setColor(sourcePixel.getColor());
  
  }
  
}


}