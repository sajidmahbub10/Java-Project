import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form17 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	JPanel p1;
	public Form17()
 {
	 super("Crime Management System");
	 this.setSize(1920,1080);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		this.add(p1);
		
	l1 = new JLabel("Criminal Information");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(800,30,450,200);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		p1.add(l1);

    l2 = new JLabel("Criminal Name:");
		l2.setForeground(Color.YELLOW);
		l2.setBounds(770,350,150,50);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		p1.add(l2);	
		
	l3 = new JLabel("Arrest ID:");
		l3.setForeground(Color.YELLOW);
		l3.setBounds(770,450,150,50);
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l3);

    l4 = new JLabel("Criminal Age:");
		l4.setForeground(Color.YELLOW);
		l4.setBounds(770,550,150,50);
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l4);

    l5 = new JLabel("Criminal Gender:");
		l5.setForeground(Color.YELLOW);
		l5.setBounds(770,650,150,50);
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l5);
	l6 = new JLabel("Akkas Ali");
		l6.setForeground(Color.YELLOW);
		l6.setBounds(950,350,120,30);
		l6.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l6);	
		
l7 = new JLabel("502");
		l7.setForeground(Color.YELLOW);
		l7.setBounds(950,450,100,30);
		l7.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l7);
 l8 = new JLabel("23 Years");
		l8.setForeground(Color.YELLOW);
		l8.setBounds(950,550,120,30);
		l8.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l8); 
l9 = new JLabel("Male");
		l9.setForeground(Color.YELLOW);
		l9.setBounds(950,650,100,30);
		l9.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l9);		
   

	b2 = new JButton("Back");
		b2.setForeground(Color.red);
        b2.setBounds(1600,750,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);	
	
 }
 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{Form1 f = new Form1();
		this.setVisible(false);
		f.setVisible(true);}
		
}
}