public class RadioButton extends GUIelement{ 
  private GUIgroup g;
  private double radius;
  
  public RadioButton(double xc, double yc, double radius,String title, boolean hilite,GUIgroup gg){
    super(xc,yc,radius,radius,title,hilite);
    this.g = g;
    this.radius = radius;   
  }
  public void draw(){
    /*StdDraw.setPenRadius();
    StdDraw.setPenColor();
    StdDraw.circle(xCentre,yCentre,radius);
    StdDraw.textLeft(xCentre+radius+MARGIN,yCentre,text);
    if(highlighted){
      StdDraw.filledCircle(xCentre,yCentre,radius*0.8);
    }
    */
    StdDraw.setPenRadius();
    StdDraw.setPenColor();
    StdDraw.circle(xCentre,yCentre,radius);
    StdDraw.textLeft(xCentre+halfWidth+0.005,yCentre,text); //Add the label
    if(highlighted) {
      StdDraw.filledCircle(xCentre,yCentre,radius-0.005);
    }//if
    else{
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledCircle(xCentre,yCentre,radius-0.005);
    }  
  }
  public void reset(){
   highlighted = false;
   draw();    
  }
  public boolean handleClick(double x, double y){
   /*boolean result = false;
    if(super.handleClick(x,y)){
      g.resetRadioButtons();
      highlighted = true;
      draw();
      result = true;
    }
    else
      result = false;  
    return result;
    */
    
    /*if(!super.handleClick(x,y)){
      return false;
    }else {
      //g.resetRadioButtons();
      highlighted = !highlighted;
      draw();
      return true;
    }*/
      boolean result = false;  

  if(super.handleClick(x,y)){
    
       //g.resetRadioButtons();     // Reset all the radio buttons    
       highlighted = true;    // set this one to clicked
       draw();
       result = true;
       }    
      
      return result;
   //}
   
  }
  
  
  
  
  
}
