import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//1st page:label-1,button-5,panel-1
public class Form1 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	public Form1()
	{
		super("Crime Management System");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		this.add(p1);
		
		l1 = new JLabel("Have An Emergency Complain?");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(770,350,400,300);
		l1.setFont(new Font("Bonveno Cf",Font.BOLD,20));
		p1.add(l1);
		
		b1 = new JButton("Admin Login");
		b1.setForeground(Color.red);
        b1.setBounds(1050,100,200,100);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Civilian Login");
		b2.setForeground(Color.red);
        b2.setBounds(1250,100,200,100);
        b2.addActionListener(this);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		p1.add(b2);
		
		b3 = new JButton("Police Login");
		b3.setForeground(Color.red);
        b3.setBounds(1450,100,200,100);		
		b3.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Exit");
		b4.setForeground(Color.red);
        b4.setBounds(1650,100,200,100);		
		b4.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Fill In!");
		b5.setForeground(Color.red);
        b5.setBounds(820,550,200,100);		
		b5.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b5.addActionListener(this);
		p1.add(b5);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==b1){
		Form2 f = new Form2();
	    this.setVisible(false);
		f.setVisible(true); }
		else if(ae.getSource()==b5){
		Form5 f = new Form5();
		this.setVisible(false);
		f.setVisible(true); }
		else if(ae.getSource()==b4)
		{System.exit(0);}
	    else if(ae.getSource()==b2){
		Form13 f = new Form13();
		this.setVisible(false);
		f.setVisible(true); }
		else if(ae.getSource()==b3){
		Form15 f = new Form15();
		this.setVisible(false);
		f.setVisible(true); }
		
	}	
	
}