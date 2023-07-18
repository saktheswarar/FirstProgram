package sakthe2;
/*
 * UI--->user interface
 *  	communication between the user and system
 *  GUI-->Graphical User Interface
 *  Packages:
 *  		import java.awt.*;     awt	:	abstraction window toolkit
 *  		import javax.swing.*;  swing:	updational(extra features) component accessing mode,without tools
 *  
 *  container component :
 *  	window
 *  	frame
 *  	panel
 *  	dialog box
 *  
 *  common methods
 *  	add(component name);
 *  	setSize(fx,fy);
 *  	setLayout(null);
 *  	setVisible(boolean);
 *   
 */
import java.awt.*;
import javax.swing.*;
public class evnt extends Frame{
	evnt(){
		Button b=new Button("submit");
		Label c=new Label("name");
		Label d=new Label("Age");
		Label m=new Label("language");
		Label tb=new Label("option");
		Label ra=new Label("Gender");
		setBackground(Color.cyan);
		Label pa=new Label("password");
		TextField g=new TextField();
		TextArea f=new TextArea();
		Checkbox k=new Checkbox("Tamil");
		Checkbox l=new Checkbox("English");
		JToggleButton jt=new JToggleButton();
		JRadioButton jr=new JRadioButton("male");
		JRadioButton jra=new JRadioButton("female");
		JPasswordField jp=new JPasswordField();
			
		b.setBounds(200,450,100,20);
		c.setBounds(50,50,100,30);
		d.setBounds(50,100,100,30);
		m.setBounds(50,150,100,30);
		g.setBounds(200,50,100,30);
		f.setBounds(200,100,100,30);
		k.setBounds(200,150,50,30);
		l.setBounds(280,150,50,30);
		tb.setBounds(50,200,100,30);
		pa.setBounds(50,250,100,30);
		ra.setBounds(50,300,100,30);
		jp.setBounds(200,250,100,30);
		jt.setBounds(200,200,100,30);
		jra.setBounds(320,300,100,30);
		jr.setBounds(200,300,100,30);
		
		add(jra);
		add(tb);
		add(pa);
		add(ra);
		add(jt);
		add(jr);
		add(jp);
		add(b);
		add(c);
		add(d);
		add(g);
		add(f);
		add(m);
		add(k);
		add(l);
		setTitle("new frame");
		setSize(800,800);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		evnt e=new evnt();
	}
	
	
	
	
	

}
