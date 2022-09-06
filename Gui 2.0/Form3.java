import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//3rd page:Button-6,Panel-1
public class Form3 extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7;
	JPanel p1;
	public Form3()
 {
	 super("Crime Management System");
	 this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		this.add(p1);
		
    b1 = new JButton("Add Police");
		b1.setForeground(Color.red);
        b1.setBounds(200,50,200,100);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);

	b2 = new JButton("Delete Police");
		b2.setForeground(Color.red);
        b2.setBounds(500,50,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);	
		
	b3 = new JButton("Add Criminal");
		b3.setForeground(Color.red);
        b3.setBounds(800,50,200,100);		
		b3.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b3.addActionListener(this);
		p1.add(b3);

	b4 = new JButton("Delete Criminal");
		b4.setForeground(Color.red);
        b4.setBounds(1100,50,300,100);		
		b4.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b4.addActionListener(this);
		p1.add(b4);	
    b5 = new JButton("Criminal Info");
		b5.setForeground(Color.red);
        b5.setBounds(1450,50,200,100);		
		b5.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b5.addActionListener(this);
		p1.add(b5);

	b6 = new JButton("Logout");
		b6.setForeground(Color.red);
        b6.setBounds(1600,750,200,100);		
		b6.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b6.addActionListener(this);
		p1.add(b6);
	b7 = new JButton("Update");
		b7.setForeground(Color.red);
        b7.setBounds(1200,250,200,100);		
		b7.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b7.addActionListener(this);
		p1.add(b7);	
		
 }
public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b6)
		{Form1 f = new Form1();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b1)
		{
		Form4 f = new Form4();
		this.setVisible(false);
		f.setVisible(true);} 
		else if(ae.getSource()==b2)
		{
		Form6 f = new Form6();
		this.setVisible(false);
		f.setVisible(true);} 
		
	  else if(ae.getSource()==b3)
		{
		Form7 f = new Form7();
		this.setVisible(false);
		f.setVisible(true);} 
		else if(ae.getSource()==b4)
		{
		Form8 f = new Form8();
		this.setVisible(false);
		f.setVisible(true);}
	else if(ae.getSource()==b5)
		{
		Form10 f = new Form10();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b7)
		{
		Form11 f = new Form11();
		this.setVisible(false);
		f.setVisible(true);}
	}
}
		
		
 