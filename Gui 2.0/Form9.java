import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form9 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	JPanel p1;
	public Form9()
 {
	 super("Crime Management System");
	 this.setSize(1920,1080);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		this.add(p1);
		
	l1 = new JLabel("Criminal Information");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(800,30,450,200);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		p1.add(l1);

    l2 = new JLabel("Criminal Name:");
		l2.setForeground(Color.YELLOW);
		l2.setBounds(470,250,150,80);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		p1.add(l2);	
		
	l3 = new JLabel("Arrest ID:");
		l3.setForeground(Color.YELLOW);
		l3.setBounds(470,450,150,100);
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l3);

    l4 = new JLabel("Criminal Age:");
		l4.setForeground(Color.YELLOW);
		l4.setBounds(470,660,150,50);
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l4);

    l5 = new JLabel("Criminal Gender:");
		l5.setForeground(Color.YELLOW);
		l5.setBounds(470,850,150,100);
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l5);
	l6 = new JLabel("Akkas Ali");
		l6.setForeground(Color.YELLOW);
		l6.setBounds(600,275,150,30);
		l6.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l6);	
		
l7 = new JLabel("502");
		l7.setForeground(Color.YELLOW);
		l7.setBounds(570,488,80,30);
		l7.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l7);
 l8 = new JLabel("23 Years");
		l8.setForeground(Color.YELLOW);
		l8.setBounds(580,667,180,30);
		l8.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l8); 
l9 = new JLabel("Male");
		l9.setForeground(Color.YELLOW);
		l9.setBounds(600,880,80,30);
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
		{Form3 f = new Form3();
		this.setVisible(false);
		f.setVisible(true);}
		
}
}