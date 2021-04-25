package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class student_aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;

        public static void main(String[] args) {
            new student_aboutUs().setVisible(true);			
	}
    
        public student_aboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(270, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(0, 250, 154));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(180, 90, 405, 40);
            contentPane.add(l4);


            JLabel l5 = new JLabel("GUIDE - Rugved Deolkar Sir. ");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(180, 180, 600, 34);
            contentPane.add(l5);


            JLabel l7 = new JLabel(" Shardul Datar : 19102A0065");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(180, 250, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel(" Yash Patil       : 19102A0037");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(180, 280, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel(" Japleen Singh : 19102A0002");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(180, 310, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel(" Suraj Gadekar : 19102A0048");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l10.setBounds(180, 340, 600, 34);
            contentPane.add(l10);

            JLabel l2 = new JLabel("Back");
            l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Student_home().setVisible(true);
                 }
            });
	l2.setForeground(Color.GRAY);
	l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l2.setIcon(i9);
	l2.setBounds(60, 70, 75, 35);
	contentPane.add(l2);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        
 public void actionPerformed(ActionEvent ae){
        try{
         }
    
    catch(Exception e){
            
        }
    }
}

