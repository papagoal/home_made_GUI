public class Checkbox extends GUIelement {
  public Checkbox(double xc, double yc, double size, String txt) { 
    super(xc,yc,size,size,txt,false);
  }
  public void draw(){    
    StdDraw.setPenRadius();
    super.draw();
    StdDraw.textLeft(xCentre+halfWidth+0.005,yCentre,text);
    if(super.isHighlighted()) {
      
      StdDraw.line(xCentre-halfWidth,yCentre+halfHeight,
                   xCentre+halfWidth,yCentre-halfHeight);
      StdDraw.line(xCentre-halfWidth,yCentre-halfHeight,
                   xCentre+halfWidth,yCentre+halfHeight);
    }
  }
  
  public boolean handleClick(double x, double y) {
    if(!super.handleClick(x,y)){
      return false;
    }
    else {
      highlighted = !highlighted;
      draw();
      return true;
    }
  }

}
