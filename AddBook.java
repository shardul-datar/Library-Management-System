package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7;
    private JButton b1,b2;
    JComboBox comboBox;
        
    public static void main(String[] args) {
	new AddBook().setVisible(true);
    }

    public int random() {
        Random rd = new Random();
        return rd.nextInt(1000+1);
    }

    public AddBook() {
        setBounds(600, 200, 480, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 95));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Name");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(73, 84, 90, 22);
	contentPane.add(l1);

        JLabel l8 = new JLabel("Author");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(73, 120, 90, 22);
	contentPane.add(l8);


	JLabel l2 = new JLabel("Quantity");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(73, 155, 90, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Publisher");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(73, 190, 90, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(73, 256, 90, 22);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Pages");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(73, 289, 90, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Label_id");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(73, 51, 90, 22);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(73, 223, 90, 22);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(169, 54, 198, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(169, 87, 198, 20);
	contentPane.add(t2);

        t7 = new JTextField();
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(169, 123, 198, 20);
	contentPane.add(t7);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(169, 158, 198, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(169, 193, 198, 20);
	contentPane.add(t4);

        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(169, 259, 198, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(169, 292, 198, 20);
	contentPane.add(t6);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	comboBox.setBounds(173, 226, 194, 20);
	contentPane.add(comboBox);

        b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(102, 340, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(212, 340, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Books", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(0, 0, 255)));
	panel.setBounds(30, 30, 398, 390);
	contentPane.add(panel);
        
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
	//random();

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "insert into book(label_id, name, author, Quantity, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
                st.setString(3, t7.getText());
		st.setString(4, t3.getText());
		st.setString(5, t4.getText());
		st.setString(6, (String) comboBox.getSelectedItem());
		st.setString(7, t5.getText());
		st.setString(8, t6.getText());

		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                
		st.close();

                String sql2 = "insert into copies(label_id, book_id, name, author, status, publisher, edition, price, pages) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement st2 = con.c.prepareStatement(sql2);
                st2.setString(1, t1.getText());
                st2.setString(3, t2.getText());
                st2.setString(4, t7.getText());
                st2.setString(5 , "Available");
                st2.setString(6, t4.getText());
                st2.setString(7, (String) comboBox.getSelectedItem());
                st2.setString(8, t5.getText());
                st2.setString(9, t6.getText());

                for(int i=0; i<Integer.parseInt(t3.getText()); i++)
                {
                    st2.setString(2, Integer.toString(random()));
                    st2.executeUpdate();
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");

            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
