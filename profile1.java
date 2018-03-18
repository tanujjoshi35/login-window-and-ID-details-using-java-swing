import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class profile1 extends JFrame implements ActionListener
{
  JFrame jfm;
profile1()
  {
     jfm=new JFrame ("Profile");
    jfm.setSize(500,500);
//    jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      jfm.setContentPane(new JLabel(new ImageIcon("Airbus_Military.jpg")));

    jfm.setLayout(new FlowLayout(FlowLayout.CENTER));
    jfm.setVisible(true);


   JButton edit=new JButton("Edit Details");
   jfm.add(edit);
  edit.addActionListener(new ActionListener(){
 		            public void actionPerformed(ActionEvent ae)
                                                           {  details d=new details(); d.setVisible(true);  }
                                             } );

   JButton show=new JButton("Show Details");
   jfm.add(show);
  show.addActionListener(new ActionListener(){
                                                         public void actionPerformed(ActionEvent ae)
                                                             { database da=new database();   da.setVisible(true); }
                                                                                                   });

    JButton logout=new JButton("Logout");
   jfm.add(logout);
  logout.addActionListener(this);


}
public void actionPerformed(ActionEvent ae) 
   {
       JFrame fr=new JFrame();
      JOptionPane.showMessageDialog(fr,"Logout Successful");   //instead of  creating new frame we can use the existing frame "jfm"
     jfm.setVisible(false);
 }  

}