package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Student_home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;

	public static void main(String[] args) {
            new Student_home().setVisible(true);
	}
        
        public Student_home() {
	
            setBounds(400, 150, 1000, 800);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.CYAN);
            menuBar.setBounds(0, 10, 1000, 35);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(new Color(211, 211, 211));
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(new Color(105, 105, 105));
            mntmExit.setBackground(new Color(211, 211, 211));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);            

            
            menuBar.add(mnExit);

            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(300, 100, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(170, 260, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(410, 260, 139, 152);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/seventh.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(640, 260, 225, 152);
            contentPane.add(l4);

            b1 = new JButton("Book Details");
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(170, 440, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Request Book");
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(423, 440, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("About Us");
            b3.addActionListener(this);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(672, 440, 167, 44);
            contentPane.add(b3);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(100, 240, 800, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

           

            

           
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new login_option().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }
		
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new student_BookDetails().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new request().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new student_aboutUs().setVisible(true);
            }
           
            
            
        }
}
