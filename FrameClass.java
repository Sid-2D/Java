import java.awt.*;
import java.awt.event.*;

class FrameClass extends Frame implements ActionListener {
	Frame f;
	Button ok, cancel;
	TextField tf;
	FrameClass(String s) 
	{
		// f = new Frame(s);
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 100, 0);
    	GridLayout grid = new GridLayout(2, 3);
    	BorderLayout border = new BorderLayout(2, 3);
    	CardLayout card = new CardLayout();
		setLayout(flow);
		ok = new Button("Ok");
		cancel = new Button("Cancel");
		ok.setBounds(20, 100, 40, 40);
		cancel.setBounds(70, 100, 60, 40);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		add(ok);
		add(cancel);
		tf = new TextField();
		tf.setBounds(20, 40, 100, 40);
		add(tf);
		addWindowListener(new WindowEventListener());
		addMouseListener(new MouseEventListener(this));
		Helper h1 = new Helper();
    	ok.addKeyListener(h1);
		setSize(400, 400);
		setAlwaysOnTop(true); 
		setVisible(true);
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == ok) {
			tf.setText("Ok");
		}
		if (e.getSource() == cancel) {
			tf.setText("Cancel");
		}
	}
	class WindowEventListener extends WindowAdapter {
		public void windowClosing (WindowEvent e) {
			System.out.println("Close button on window pressed.");
			System.exit(0);
		}
	}
	class KeyEventListener extends KeyAdapter {
		FrameClass t;
		KeyEventListener (FrameClass f) {
			this.t = f;
		}
		public void keyTyped (KeyEvent e) {
			String str = "" + e.getKeyChar();
			//t.tf.setText(str);
			System.out.println(str);
		}
	}
	class MouseEventListener extends MouseAdapter {
		FrameClass t;
		MouseEventListener (FrameClass f) {
			this.t = f;
		}
		public void mouseClicked (MouseEvent e) {
			t.tf.setText("MouseEvent");
		}
	}
	public static void main (String args[]) {
		new FrameClass("Frame");
	}
	public Insets getInsets () {
		return new Insets(100, 100, 100, 100);
	}
}
class Helper extends KeyAdapter
{
  public void keyTyped(KeyEvent e)
  {
    char char1 = e.getKeyChar();
    System.out.println("You typed " + char1 + " character from keyboard");
  }
}