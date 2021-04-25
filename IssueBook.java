package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t15,t20;
    private JButton b2,b3,b4,b5;

    public static void main(String[] args) {
	new IssueBook().setVisible(true);
			
    }

    public IssueBook() {
        setBounds(500, 200, 900, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Label ID");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 200, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Book ID");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 200, 23);
	contentPane.add(l2);

        JLabel l13 = new JLabel("Name");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(47, 131, 200, 23);
	contentPane.add(l13);

	JLabel l3 = new JLabel("Author");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 165, 200, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 197, 200, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Edition");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(47, 233, 200, 23);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Price");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(47, 267, 200, 23);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Pages");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(47, 301, 200, 23);
	contentPane.add(l7);

	t1 = new JTextField();    //LABEL_ID
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 186, 20);
	contentPane.add(t1);
	

	t2 = new JTextField();          //BOOK_ID
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 186, 20);
	contentPane.add(t2);
	t2.setColumns(10);

        b5 = new JButton("Search");
	b5.addActionListener(this);
	b5.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
	b5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b5.setBounds(334, 100, 100, 30);
        contentPane.add(b5);

	t3 = new JTextField();    //AUTHOR
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 168, 186, 20);
	contentPane.add(t3);

        t15 = new JTextField();    //BOOK NAME
	t15.setEditable(false);
	t15.setForeground(new Color(47, 79, 79));
	t15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t15.setColumns(10);
	t15.setBounds(126, 134, 186, 20);
	contentPane.add(t15);

	t4 = new JTextField();    //PUBLISHER
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 202, 186, 20);
	contentPane.add(t4);

	t5 = new JTextField();    //EDITION
	t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 236, 186, 20);
	contentPane.add(t5);

	t6 = new JTextField();    //PRICE
	t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(126, 270, 186, 20);
	contentPane.add(t6);

	t7 = new JTextField();     //PAGES
	t7.setEditable(false);
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(126, 304, 186, 20);
	contentPane.add(t7);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 445, 372);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l8 = new JLabel("Student_id");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(484, 63, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(484, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("Father's Name");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(484, 147, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("Course");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(484, 187, 100, 23);
	contentPane.add(l11);

	JLabel l12 = new JLabel("Branch");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(484, 233, 100, 23);
	contentPane.add(l12);

	

	t8 = new JTextField();      //STUDENT_ID
 	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(608, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(704, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	t9 = new JTextField();     //STUDENT NAME
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(608, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();     //FATHERS NAME
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(608, 150, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();    //COURSE
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(608, 190, 208, 20);
	contentPane.add(t11);

	t12 = new JTextField();    //BRANCH
	t12.setForeground(new Color(47, 79, 79));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(608, 236, 208, 20);
	contentPane.add(t12);

	

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Deatails",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(460, 38, 378, 288);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel(" Date of Issue :");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(480, 340, 118, 26);
	contentPane.add(l15);

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(597, 337, 200, 29);
	contentPane.add(dateChooser);

	b3 = new JButton("Issue");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(507, 377, 118, 33);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(660, 377, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);

        t20 = new JTextField();    //QUANTITY
	t20.setEditable(false);
	t20.setForeground(new Color(47, 79, 79));
	t20.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t20.setColumns(10);
	t20.setBounds(126, 236, 186, 20);
	
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();

            if(ae.getSource() == b5){
                String sql = "select * from copies where book_id = ? and label_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
                st.setString(2, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t1.setText(rs.getString("label_id"));
                    t15.setText(rs.getString("name"));
                    t3.setText(rs.getString("author"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
		
            }

            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("father"));
                    t11.setText(rs.getString("course"));
                    t12.setText(rs.getString("branch"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b3){
                    try{
                String sql = "insert into issueBook(label_id, book_id, student_id, bname, author, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t8.getText());
		st.setString(4, t15.getText());
		st.setString(5, t3.getText());
		st.setString(6, t9.getText());
		st.setString(7, t11.getText());
                st.setString(8, t12.getText());
                st.setString(9, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
  
                String sql3 = "select Quantity from book where label_id = ?";
                PreparedStatement st3 = con.c.prepareStatement(sql3);
                st3.setString(1, t1.getText());
                ResultSet rs3 = st3.executeQuery();
                while(rs3.next())  {
                        t20.setText(rs3.getString("Quantity"));
                }

                String sql2 = "update book set Quantity = ? where label_id = ?";
                PreparedStatement st2 = con.c.prepareStatement(sql2);
                st2.setString(1, Integer.toString(Integer.parseInt(t20.getText())-1));
                st2.setString(2, t1.getText());
                st2.executeUpdate();

                String sql4 = "update copies set status = 'Issued' where book_id = ?";
                PreparedStatement st4 = con.c.prepareStatement(sql4);
                st4.setString(1,t2.getText());
                st4.executeUpdate();
                
		int i = st.executeUpdate();
		if (i > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
