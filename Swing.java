import java.awt.*;
import java.awt.event.*;

class FirstFrame extends Frame implements ActionListener{
    tf = new Textfield(20);
    tf.setBounds(60,40,170,20);
    b1 = new Button("Print Welcome");
    b1.new Bounds(60,80,170,20);
    b1.addActionListener(this);
    b2 = new Button("End");
    b2.setBounds(60,120,170,20);
    b2.addActionListener(this);
    add(tf); add(b1); add(b2);
    this.setSize(300,300);
    
}

public void show_form(){
    setVisible(true);
}

public void actionPerformed(ActionEvent e){
    String str = e.getActionCommand();
    if(str.equals("Print Welcome")){
        this.tf.setText("Welcome");
    }
    else if(str.equals("End")){
        this.dispose();
    }
}

class Swing{
    public static void main(String args[]){
        FirstFrame fm=new FirstFrame();
        frame.show_form();
    }
}