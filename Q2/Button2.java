public class Button2 extends GUIelement{
  private Handler han;
  public Button2(double xc, double yc, double hw, double hh, String title, Handler han){
    super(xc,yc,hw,hh,title,false);
    this.han = han;
  }
  public void draw(){
    StdDraw.setPenColor();
    StdDraw.setPenRadius();
    StdDraw.rectangle(xCentre,yCentre,halfWidth,halfHeight);
    if(super.isHighlighted()){
     StdDraw.setPenColor(StdDraw.LIGHT_GRAY); 
    }
    else{
      StdDraw.setPenColor(StdDraw.WHITE);
    }
    
    StdDraw.filledRectangle(xCentre,yCentre,halfWidth-0.005,halfHeight-0.005);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.text(xCentre, yCentre,text);
  }
  public boolean handleClick(double x, double y){
    boolean result = false;
    if(super.handleClick(x,y)){
     highlighted = true;
     draw();
     result = true;
     if(StdDraw.mousePressed()){
       Utilities.waitMouseUp();
     }
    }
     else{
       return false;
     }
     han.doIt();
     highlighted = false;
     draw();  
     return result;  
  }
  
}