import java.awt.event.*;  //need to import for interactivity
import java.awt.*;  // needed for gridlayout
import javax.swing.*; //import swing for GUI

public class Main {
  public static void main(String[] args) {
    JFrame f = new JFrame();// creating instance of JFrame

    JLabel l1; // declare label
    l1 = new JLabel("Please click the button"); //assign text to the label
    l1.setBounds(125,100,250,40); // set location and size

    JButton b = new JButton("click");// creating instance of JButton
    b.setBounds(150, 150, 100, 40);// x axis, y axis, width, height

      b.addActionListener(new ActionListener(){  
        //Creates an action listener that activates as soon as the button is clicked
        public void actionPerformed(ActionEvent e){  
            l1.setText("Thank you for clicking the button!"); // set's the label text to thank the user  
        }
      }); //end of action listener

    f.add(b);// adding button in JFrame
    f.add(l1);

    f.setSize(400, 500);// 400 width and 500 height
    f.setLayout(new GridLayout(2,1));// Use gridlayout
    f.setVisible(true);// making the frame visible
  }
}