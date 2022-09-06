import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//2nd page:Label-2,Text Field-2,Button-2,Panel-1

public class Form13 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	JPanel p1;

 public Form13()
 {
	 super("Crime Management System");
	 this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.green);
		p1.setLayout(null);
		this.add(p1);
		
	l1 = new JLabel("Victim Name: ");
		l1.setForeground(Color.BLACK);
		l1.setBounds(770,350,150,50);
		l1.setFont(new Font("Bonveno Cf",Font.PLAIN,15));
		p1.add(l1);

    l2 = new JLabel("Arrest ID: ");
		l2.setForeground(Color.BLACK);
		l2.setBounds(770,450,150,50);
		l2.setFont(new Font("Bonveno Cf",Font.PLAIN,15));
		p1.add(l2);		
		
	t1 = new JTextField();
    t1.setBounds(950,350,100,30);
	p1.add(t1);
	
	t2 = new JTextField();
	t2.setBounds(950,450,100,30);
	p1.add(t2);
	
	b1 = new JButton("Back");
		b1.setForeground(Color.red);
        b1.setBounds(650,650,200,100);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);

	b2 = new JButton("Submit");
		b2.setForeground(Color.red);
        b2.setBounds(1050,650,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);	
}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{Form1 f = new Form1();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b2)
		{Form14 f = new Form14();
		this.setVisible(false);
		f.setVisible(true);}
		}
		
	}	
		

