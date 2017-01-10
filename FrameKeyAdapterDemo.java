import java.awt.*;
import java.awt.event.*;
 
public class FrameKeyAdapterDemo extends Frame
{
  public FrameKeyAdapterDemo()
  {
    Helper h1 = new Helper();
    addKeyListener(h1);
 
    setSize(300, 300);
    setVisible(true);
  }
 
  public static void main(String args[])
  {
    new FrameKeyAdapterDemo();    
  }
}
                                              // observe two classes here
class Helper extends KeyAdapter
{
  public void keyTyped(KeyEvent e)
  {
    char char1 = e.getKeyChar();
    System.out.println("You typed " + char1 + " character from keyboard");
  }
}