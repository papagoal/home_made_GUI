public class RadioButton extends GUIelement {
   private GUIgroup g;
   private double radius;
   
   public RadioButton(double xc, double yc, double radius, String title, boolean hilite, GUIgroup g) { 
    super(xc,yc, radius, radius, title, hilite); 
    this.radius = radius;
    this.g = g;    
   }
   public void draw(){  
     StdDraw.setPenRadius();
     StdDraw.textLeft(xCentre+radius+0.005, yCentre,text);
      if(super.isHighlighted()) {
        StdDraw.filledCircle(xCentre, yCentre, radius-0.001); 
      }
      else {
        StdDraw.setPenColor(StdDraw.WHITE);
       StdDraw.filledCircle(xCentre, yCentre, radius-0.001); 
      }
      StdDraw.setPenColor();
      StdDraw.circle(xCentre, yCentre, radius); 
  }  
   public void reset(){ 
    highlighted = false;
    draw();
  }   
  
   public boolean handleClick(double x, double y) {
     boolean result = false;
     if(!super.handleClick(x,y)){
       result = false;
     }else {
       g.resetRadioButtons();
       highlighted = !highlighted;
       draw();
       result = true;
     }
     return result; 
   }
   
}
