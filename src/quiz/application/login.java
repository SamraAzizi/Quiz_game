
package quiz.application;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
  



public class login extends JFrame implements ActionListener{
    JButton rule, back;
    JTextField tfname;
    
    login(){
     
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40 ));
        heading.setForeground(new Color(20,144,254));
        add(heading);
        
        
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18 ));
        name.setForeground(new Color(20,144,254));
        
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("TImes New Roman", Font.BOLD, 20));
        add(tfname);
        
        rule = new JButton("Rules");
        rule.setBounds(735,270, 120, 25);
        rule.setBackground(new Color(30,144, 254));
        rule.setForeground(Color.WHITE);
        rule.addActionListener(this);
        add(rule);
        
        
        back = new JButton("Back");
        back.setBounds(915,270, 120, 25);
        back.setBackground(new Color(30,144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rule){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
    
    
    public static void main(String[] args){
        new login();
    }
    
}
