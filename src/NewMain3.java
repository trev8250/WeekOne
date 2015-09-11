import TurtleGraphics.*;
import java.awt.Color;


public class NewMain3 {

    
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600,400);
       Pen p = new WigglePen(win);
       p.setWidth(10);
       
      int size = 100;
       p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90); 
       p.move(size);
       p.turn(90);
       p.move(size);
       
       
      p.up();
      p.move(200);
      p.down();
      p.turn(90);
      
      p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90); 
       p.move(size);
       p.turn(90);
       p.move(size);
       
       
    }
    
}
