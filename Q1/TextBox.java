public class TextBox extends GUIelement{
  private boolean inp;
  public TextBox(double xc, double yc, double hw, double hh, String txt,boolean inp){
   super(xc,yc,hw,hh,txt,inp); 
   this.inp = inp;
  }
  public void draw(){
    StdDraw.setPenRadius();
    super.draw();
    StdDraw.textLeft(xCentre-0.20,yCentre,text);
  }
  public boolean handleClick(double x, double y){
    boolean result = false;
    if(super.handleClick(x,y)){
      if(inp){
        StdDraw.text(xCentre, yCentre,"");
      }
      result = true;
    }
    else{
      result = false;
    }
    return result;
  }
  public boolean handleCharTyped(char c){
    boolean result = false;
    if(inp){    
      text = text + c;
      result = true;
    }
    return result;
  }
  public void displayText(String s){
    if(!inp){
      text = s;
    }
      draw(); 
  }
  
}