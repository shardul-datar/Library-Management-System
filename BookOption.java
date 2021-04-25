package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookOption extends JFrame implements ActionListener {

        private JPanel panel;
        private JButton b1, b2;

        public BookOption() {
                
        setBackground(new Color(169, 169, 169));
        setBounds(600, 300, 600, 400);
        
        panel = new JPanel();
        panel.setBackground(new Color(176, 224, 230));
	setContentPane(panel);
	panel.setLayout(null);

        JLabel l1 = new JLabel("Select Option ");
	l1.setBounds(230, 100, 100, 70);
	panel.add(l1);

        b1 = new JButton("Add New Book");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(149, 181, 133, 49);
	panel.add(b1);
		
        b2 = new JButton("Add Copies");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 133, 49);
	panel.add(b2);

        }
        
        public void actionPerformed(ActionEvent ae) {
 
            if(ae.getSource() == b2) {
            this.setVisible(false);
            new AddCopies().setVisible(true);
            }
        
            if(ae.getSource() == b1){
            new AddBook().setVisible(true);
            this.setVisible(false);
            }
        }
        
        public static void main(String[] args) {
                new BookOption().setVisible(true);
        }

}
