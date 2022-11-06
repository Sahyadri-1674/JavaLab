import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Studentform1 implements ActionListener {
    JFrame f = new JFrame("Student form");
	JLabel l1 = new JLabel("Name");	
	JLabel l2 = new JLabel("Mobile no");	
	JLabel l3 = new JLabel("Gender");	
	JLabel l4 = new JLabel("Age");
	JLabel l5 = new JLabel("Hobbies");	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JComboBox cb;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JButton b = new JButton("SUBMIT");
	JRadioButton rb1 = new JRadioButton("A.MALE");
	JRadioButton rb2 = new JRadioButton("B.FEMALE");
	JTextArea a = new JTextArea();
	Studentform1(){
		f.setVisible(true);f.setLayout(null);f.setSize(400,650);
		
		l1.setBounds(50,30,100,20);
		l2.setBounds(50,90,100,20);
		l3.setBounds(50,150,100,20);
		l4.setBounds(50,210,100,20);
		l5.setBounds(50,270,100,20);
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);
		
		t1.setBounds(160,30,150,25);
		t2.setBounds(160,90,150,25);
		rb1.setBounds(160,150,100,25);
		rb2.setBounds(260,150,100,25);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		f.add(t1);f.add(t2);f.add(rb1);f.add(rb2);
		
	    String []age = {"18","19","20","21","22","23","24"};
		cb= new JComboBox(age);
		cb.setBounds(160,210,100,25);
		f.add(cb);
		
		cb1= new JCheckBox("Reading");
		cb2= new JCheckBox("Singing");
		cb3= new JCheckBox("Drawing");
		
		cb1.setBounds(120,270,80,25);
		cb2.setBounds(200,270,80,25);
		cb3.setBounds(280,270,80,25);
		f.add(cb1);f.add(cb2);f.add(cb3);
       	
        b.setBounds(160,300,100,25);        
		f.add(b);
		a.setBounds(50,340,300,250);
		f.add(a);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String name = t1.getText();
		String MobileNo= t2.getText();
	    String age1 = cb.getItemAt(cb.getSelectedIndex()).toString();
        String gender = rb1.isSelected() ? "Male" : rb2.isSelected()?"Female":"-";
        String hobby = "";
        if(cb1.isSelected()){
		hobby= "Reading";}
        if(cb2.isSelected()){hobby = hobby +" "+ "Singing";}
        if(cb3.isSelected()){hobby = hobby+" "+ "Drawing";}
        a.setText("Name: "+name+"\n"+"Mobile No: "+MobileNo+"\n"+"Gender: "+gender+"\n"+"Age: "+age1+"\n"+"Hobbies: "+hobby);		
	}
	public static void main(String [] args){
        new Studentform1();		
	}
}