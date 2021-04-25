package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddCopies extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private JButton b1,b2,b3;
    
        
    public static void main(String[] args) {
	new AddCopies().setVisible(true);
    }

    public int random() {
        Random rd = new Random();
	return rd.nextInt(1000 + 1);
    }

    public AddCopies() {
        setBounds(600, 200, 500, 530);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
	l8.setBounds(73, 117, 90, 22);
	contentPane.add(l8);

	JLabel l2 = new JLabel("Quantity");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(73, 150, 90, 22);
	contentPane.add(l2);

        JLabel l9 = new JLabel("New Copies");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(73, 183, 90, 22);
	contentPane.add(l9);

	JLabel l3 = new JLabel("Publisher");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(73, 216, 90, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(73, 282, 90, 22);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Pages");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(73, 315, 90, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Label_id");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(73, 51, 90, 22);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(73, 249, 90, 22);
	contentPane.add(l7);

	t1 = new JTextField();    //Label_id
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(169, 54, 100, 20);
	contentPane.add(t1);
	t1.setColumns(10);

        b3 = new JButton("Search");
	b3.addActionListener(this);
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBounds(280, 52, 100, 25);
        contentPane.add(b3);
        
	t2 = new JTextField();    //Name
        t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(169, 87, 198, 20);
	contentPane.add(t2);

	t3 = new JTextField(); //Quantity
        t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(169, 153, 198, 20);
	contentPane.add(t3);

	t4 = new JTextField();   //Publisher
        t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(169, 219, 198, 20);
	contentPane.add(t4);

        t5 = new JTextField();  //Price
        t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(169, 285, 198, 20);
	contentPane.add(t5);

	t6 = new JTextField();    //Pages
        t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(169, 318, 198, 20);
	contentPane.add(t6);

	t7 = new JTextField();   //Edition
        t7.setEditable(false);
        t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(169, 252, 194, 20);
	contentPane.add(t7);

        t8 = new JTextField();    //author
        t8.setEditable(false);
        t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(169, 120, 194, 20);
	contentPane.add(t8);

        t9 = new JTextField();    //new_copies
        t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setColumns(10);
	t9.setBounds(169, 186, 194, 20);
	contentPane.add(t9);

        b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(102, 366, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(232, 366, 100, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Copies", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(0, 0, 255)));
	panel.setBounds(35, 25, 398, 400);
	contentPane.add(panel);
        
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
	

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){

                String sql = "update book set Quantity = ? where label_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
                
                st.setString(1, Integer.toString(Integer.parseInt(t9.getText())+ Integer.parseInt(t3.getText())));
                st.setString(2, t1.getText());
                
		
		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");

                String sql2 = "insert into copies(label_id, book_id, name, author, status, publisher, edition, price, pages) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement st2 = con.c.prepareStatement(sql2);

                st2.setString(1, t1.getText());
                st2.setString(3, t2.getText());
                st2.setString(4, t8.getText());
                st2.setString(5 , "Available");
                st2.setString(6, t4.getText());
                st2.setString(7, t7.getText());
                st2.setString(8, t5.getText());
                st2.setString(9, t6.getText());

                for(int i=0; i<Integer.parseInt(t9.getText()); i++)
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
                t8.setText("");
                t9.setText("");
		st.close();
                
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);
            }
            
            if(ae.getSource() == b3){
                String sql = "select * from book where label_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t8.setText(rs.getString("author"));
                    t3.setText(rs.getString("Quantity"));
                    t4.setText(rs.getString("publisher"));
                    t7.setText(rs.getString("edition"));
                    t5.setText(rs.getString("price"));
                    t6.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
