import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class database extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;
JFrame jfr=new JFrame ("Profile Details");
JButton back=new JButton("BACK");
String a,b,c,d,e,f;



database(String str1, String str2, String str3, String str4, String str5, String str6)
  {
     a=str1;         b=str2;        c=str3;         d=str4;       e=str5;            f=str6; 
  }

database()
   {
      jfr.setSize(500,500);
     jfr.setContentPane(new JLabel(new ImageIcon("MOVING AT SPEED.jpg")));

      jfr.setLayout(new FlowLayout(FlowLayout.CENTER));

     l1=new JLabel("Name : "+a); 
     l2=new JLabel("Address : ");
     l3=new JLabel("Religion : ");
     l4=new JLabel("Nationality : ");
     l5=new JLabel("sex : ");

      jfr.add(l1);     jfr.add(l2);     jfr.add(l3);     jfr.add(l4);     jfr.add(l5);
      jfr.add(back);

     back.addActionListener(this);

     jfr.setVisible(true);
 }
  public void actionPerformed(ActionEvent ae)   {     jfr.setVisible(false);  }

}