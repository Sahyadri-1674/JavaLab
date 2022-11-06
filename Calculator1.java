import java.awt.*;
import java.awt.event.*;

public class Calculator1 implements ActionListener{
        Frame f = new Frame("Calculator");
	    Label l1 = new Label("First Number");
		Label l2 = new Label("Second Number");
		Label l3 = new Label("Result");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		Button b1 = new Button("Add");
		Button b2 = new Button("Subtraction");
		Button b3 = new Button("Multiplication");
		Button b4 = new Button("Divisiion");
		Button b5 = new Button("Cancel");
	  
	  Calculator1(){
	    
		f.setLayout(null);f.setSize(500,450);f.setVisible(true);
		
		
		l1.setBounds(100,80,120,30);
		l2.setBounds(100,160,120,30);
		l3.setBounds(100,240,120,30);
	    f.add(l1);f.add(l2);f.add(l3);
		
		t1.setBounds(220,80,120,25);
		t2.setBounds(220,160,120,25);
		t3.setBounds(220,240,120,25);
		f.add(t1);f.add(t2);f.add(t3);
		
		b1.setBounds(30,360,80,30);
		b2.setBounds(120,360,80,30);
		b3.setBounds(210,360,80,30);
		b4.setBounds(300,360,80,30);
		b5.setBounds(390,360,80,30);
		
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		
		b1.addActionListener(this);
	      b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
		  b5.addActionListener(this);
        
		
		}
		public void actionPerformed(ActionEvent e){
			int n1 = Integer.parseInt(t1.getText());
			double n2 = Double.parseDouble(t2.getText());
			if(e.getSource()==b1){
				t3.setText(String.valueOf(n1+n2));
			}
			if(e.getSource()==b2){
			    t3.setText(String.valueOf(n1-n2));
			}
			if(e.getSource()==b3){
				t3.setText(String.valueOf(n1*n2));
			}
			if(e.getSource()==b4){
				t3.setText(String.valueOf(n1/n2));
			}
			if(e.getSource()==b5){
				System.exit(0);
			}
	  }
	  public static void main(String args [])
	  {
	       new Calculator1();
	  }
	  
}	