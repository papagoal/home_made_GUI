/**QUESTION 1: A Home-Made GUI(Graphical User InterFace)
 * Assignment02
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment03
 * @author       Danhang Liu, 7716234
 * @version      2015-07-03
 */ 
import java.util.ArrayList;
public class GUIgroup extends GUIelement{
  private ArrayList<GUIelement> list;
  
  public GUIgroup(){
    list = new ArrayList<GUIelement>();
  }
  public void addElement(GUIelement e){
   list.add(e); 
  }
  public void draw(){
    for(int i=0; i<list.size();i++){
      list.get(i).draw(); 
    }
  }
  public boolean handleClick(double x, double y){
    boolean result = false;
    for(int i=0; !result&&i<list.size();i++){
      if(list.get(i).handleClick(x,y)){
        result = true;
      }
    }
    return result;
  }
  public boolean handleCharTyped(char c){
    boolean result = false;
    for(int i=0; i<list.size();i++){
      if(list.get(i).handleCharTyped(c)){
        result = true; 
      }
    }
    return result;
  }
  public void resetRadioButtons(){
    for(int a = 0; a < list.size(); a++)
    {
      if(list.get(a).getClass().equals(RadioButton.class) )
      {
        ((RadioButton)list.get(a)).reset(); 
      }
    }
   }
  
}