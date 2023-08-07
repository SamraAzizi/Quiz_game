
 
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back, start;
    
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+name+" To Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28 ));
        heading.setForeground(new Color(20,144,254));
        add(heading);
        
        
        
        JLabel rules = new JLabel("");
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
        "<html>"+ 
                "1. Answer each question to the best of your knowledge."+ "<br><br>"+
                "2. Do not collaborate or share answers with others."+" <br><br>"+
                "3. Once you submit an answer, it cannot be changed. "+"<br><br>"+
                "4. Respect the time limit for each question."+" <br><br>"+
                "5. Use only the provided materials; no external resources allowed."+" <br><br>"+
                "6. Stay attentive and focused during the quiz. <br><br>"+
                "7. Any form of cheating will result in disqualification."+" <br><br>"+
                "8. Have fun and good luck! "+"<br><br>"+
            "<html>");
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500, 100, 30);
        back.setBackground(new Color(30,144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("Start");
        start.setBounds(400,500, 100, 30);
        start.setBackground(new Color(30,144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
        
        
 
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        }else{
            setVisible(false);
            new login();
        }
            
    }
    public static void main(String[] args){
        new Rules(user);
    }
    
}
