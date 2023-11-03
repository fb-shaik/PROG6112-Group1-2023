package swing_demo_g1;

import javax.swing.*; //this is need for GUI components
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class Swing_Demo_G1 {

    public static void main(String[] args) {
        
        //create JFrame (window)
        JFrame frame = new JFrame("Simple Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150); //setthe size of the window
        
        //Create a Label to add to the JFrame (a text label)
        JLabel  label = new JLabel("Hello to Swing Components! ");
        
        //Create a button to add to the JFrame (clickable button)
        JButton button = new JButton("Click here! "); 
        
        //Add an ActionListener to the button above (behaviour associated to clicking the button)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //This code will be executed when the button is clicked
                label.setText("Button was clicked! ");
            }
        });
        
        //create a JPanel (a container to group all the JSwing aspects within the JFrame)
        JPanel panel = new JPanel();
        panel.add(label); //Add the label to the panel
        panel.add(button); //Add the button to the panel
        
        //Add the panel to the Frame
        frame.add(panel);
        
        //Make the Jframe visible
        frame.setVisible(true);
        
        }
    }
   
