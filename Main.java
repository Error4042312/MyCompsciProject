import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Main {
  public static void main(String args[]) {

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("Insert image here");
    JLabel label = new JLabel(icon);
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack(); 
    frame.setVisible(true);
  }
}