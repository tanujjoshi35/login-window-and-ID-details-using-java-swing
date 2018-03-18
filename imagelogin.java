import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class imagelogin extends JFrame implements ActionListener,ItemListener
{
    JCheckBox box;
    JTextField text1, text2;
    JButton submit;
    JFrame JFM;
   imagelogin()
     {

      JFM=new JFrame("Welcome To Login Page");
       JFM.setSize(325,200);
       JFM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JFM.setContentPane(new JLabel(new ImageIcon("image.jpg")));

       JFM.setLayout(new FlowLayout(FlowLayout.CENTER));

       submit=new JButton("SUBMIT"); 

       JLabel id=new JLabel("USERNAME");
       JLabel pass=new JLabel("PASSWORD");

      box=new JCheckBox("Remember Password");
 
      text1=new JTextField(15);    
      text2=new JTextField(15);

     submit.addActionListener(this);        text2.addActionListener(this);           text1.addActionListener(this);
     box.addItemListener(this);


//    JLabel label=new JLabel(new ImageIcon("E:\\Java Programs\\Project\\Image.jpg"));
//  submit.setIcon(new ImageIcon("image.jpg"));      //set the icon for SUBMIT Button 
//  JFM.add(label);


    JFM.add(id);     JFM.add(text1);
    JFM.add(pass);     JFM.add(text2);
    JFM.add(box);
    JFM.add(submit);   
    JFM.setVisible(true);
 
  }

public void itemStateChanged(ItemEvent ie)
{//ie.getState();
}



public void actionPerformed(ActionEvent ae)
  {
    String str1=text1.getText();      
    String str2=text2.getText();

    if(str1.equals("TanujJoshi") && str2.equals("pass123"))
          {  JOptionPane.showMessageDialog(JFM,"Login Successfull");
           
             profile1 pro=new profile1();           pro.setVisible(true);          // calling new Swing
         }

    else
          {
               JOptionPane.showMessageDialog(JFM,"Enter a valid username and password","Incorrect Username or Password",JOptionPane.ERROR_MESSAGE);
                                   //create a simple Dialogbox
         }
   }
  


public static void main(String args[])
  {
         new imagelogin();
  }

}