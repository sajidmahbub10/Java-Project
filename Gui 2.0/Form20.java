import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form20 extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1,b2;
	JPanel p1;
	public Form20()
 {
	super("Crime Management System");
	this.setSize(1920,1080);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		this.add(p1);
		
	l1 = new JLabel("Arrest ID:");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(470,378,150,50);
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l1);	
		
	t1 = new JTextField();
	t1.setBounds(570,378,80,30);
	p1.add(t1);	
		
	b2 = new JButton("Back");
		b2.setForeground(Color.red);
        b2.setBounds(1600,750,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);		
		
	b1 = new JButton("Submit");
		b1.setForeground(Color.red);
        b1.setBounds(770,378,150,30);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);	
 }

public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{Form21 f = new Form21();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b2)
		{Form16 f = new Form16();
		this.setVisible(false);
		f.setVisible(true);
			
		}
	}
}