import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form6 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	public Form6()
 {
	super("Crime Management System");
	this.setSize(1920,1080);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		this.add(p1);
		
	l1 = new JLabel("Police Informations");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(850,30,400,200);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		p1.add(l1);

    l2 = new JLabel("Police ID:");
		l2.setForeground(Color.YELLOW);
		l2.setBounds(770,350,150,50);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		p1.add(l2);	
		
	l3 = new JLabel("Police ID:");
		l3.setForeground(Color.YELLOW);
		l3.setBounds(770,450,150,50);
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l3);

    l4 = new JLabel("Police ID:");
		l4.setForeground(Color.YELLOW);
		l4.setBounds(770,550,150,50);
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l4);

    l5 = new JLabel("Police ID:");
		l5.setForeground(Color.YELLOW);
		l5.setBounds(770,650,150,50);
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		p1.add(l5);
	l6 = new JLabel();
		l6.setForeground(Color.YELLOW);
		l6.setBounds(1510,340,400,300);
		l6.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(l6);	

    t1 = new JTextField();
    t1.setBounds(950,350,100,30);
	p1.add(t1);
	
	t2 = new JTextField();
	t2.setBounds(950,450,100,30);
	p1.add(t2);
	
	t3 = new JTextField();
    t3.setBounds(950,550,100,30);
	p1.add(t3);
	
	t4 = new JTextField();
	t4.setBounds(950,650,100,30);
	p1.add(t4);

    b1 = new JButton("Delete");
		b1.setForeground(Color.red);
        b1.setBounds(1130,350,120,30);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);

	b2 = new JButton("Back");
		b2.setForeground(Color.red);
        b2.setBounds(1600,750,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);	
	b3 = new JButton("Delete");
		b3.setForeground(Color.red);
        b3.setBounds(1130,450,120,30);		
		b3.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b3.addActionListener(this);
		p1.add(b3);	
	b4 = new JButton("Delete");
		b4.setForeground(Color.red);
        b4.setBounds(1130,550,120,30);		
		b4.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b4.addActionListener(this);
		p1.add(b4);	
	b5 = new JButton("Delete");
		b5.setForeground(Color.red);
        b5.setBounds(1130,650,120,30);		
		b5.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b5.addActionListener(this);
		p1.add(b5);	
	
 }
 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{Form3 f = new Form3();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b1)
		{l6.setText("Police Deleted");}
	else if(ae.getSource()==b3)
		{l6.setText("Police Deleted");}
	else if(ae.getSource()==b4)
		{l6.setText("Police Deleted");}
	else if(ae.getSource()==b5)
		{l6.setText("Police Deleted");}
}
}