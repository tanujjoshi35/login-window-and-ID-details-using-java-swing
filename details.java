import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class details extends JFrame implements ActionListener
{
   JLabel fname,lname,address,sex,religion,nation;
   JButton update ,cancel;  
   JFrame jf;
   JTextField t1,t2,t3,t4,t5,t6;
   String s1,s2,s3,s4,s5,s6;

details()
 {
  //set the frame properties
   jf=new JFrame("Edit Details");
   jf.setSize(500,500);

  // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     jf.setContentPane(new JLabel(new ImageIcon("Space Fiction Lunar Mining - 1024x768.jpg")));

   jf.setLayout(new FlowLayout(FlowLayout.LEFT));
   jf.setVisible(true);

//define label on the frame
   fname=new JLabel("First Name");
   lname=new JLabel("Last Name");
   address=new JLabel("Address");
   sex=new JLabel("Sex");
   religion=new JLabel("Religion");
   nation=new JLabel("Nationality");

//define button on the frame
   update=new JButton("Update");   cancel=new JButton("Cancel");

//define textbox on the frame
   t1=new JTextField(15);
   t2=new JTextField(15);
   t3=new JTextField(15);
   t4=new JTextField(15);
   t5=new JTextField(15);
   t6=new JTextField(15);

  //add label,textbox and button on the frame
   jf.add(fname);            jf.add(t1);
   jf.add(lname);            jf.add(t2);
   jf.add(address);         jf.add(t3);
  jf.add(religion);        jf.add(t5);
   jf.add(nation);          jf.add(t6);
   jf.add(sex);                 jf.add(t4);
  
  jf.add(update);     jf.add(cancel);

update.addActionListener(new ActionListener(){
 	           public void actionPerformed(ActionEvent ae){
   s1=t1.getText();    s2=t2.getText();    s3=t3.getText();    s4=t4.getText();    s5=t5.getText();    s6=t6.getText();
              database db=new database(s1,s2,s3,s4,s5,s6);   
                JOptionPane.showMessageDialog(jf,"Update Successful");
                         jf.setVisible(false);                                                                                                       }
                                                                                                                  }  );
 cancel.addActionListener(this);
     
}
 public void actionPerformed(ActionEvent ae)               {   jf.setVisible(false);   }

}


 