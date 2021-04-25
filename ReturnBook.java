package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class ReturnBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField t20;
    private JButton b1,b2,b3;
    private JDateChooser dateChooser;

    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
    }

    public void delete() {
        try {
            conn con = new conn();
            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, textField.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showConfirmDialog(null, "Book Returned");
            else
                JOptionPane.showMessageDialog(null, "error in Deleting");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
	}
    }

    
    public ReturnBook() {
        setBounds(600, 250, 617, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("Book_Id");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(52, 52, 87, 24);
	contentPane.add(lblNewLabel);

	JLabel lblStudentid = new JLabel("Student_id");
	lblStudentid.setForeground(Color.BLACK);
	lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblStudentid.setBounds(243, 52, 87, 24);
	contentPane.add(lblStudentid);

        JLabel lblNewLabel1 = new JLabel("Label_id");
	lblNewLabel1.setForeground(new Color(0, 0, 0));
	lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel1.setBounds(52, 98, 87, 24);
	contentPane.add(lblNewLabel1);

        JLabel lblNewLabel2 = new JLabel("Author");
	lblNewLabel2.setForeground(new Color(0, 0, 0));
	lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel2.setBounds(300, 98, 87, 24);
	contentPane.add(lblNewLabel2);

	JLabel lblBook = new JLabel("Book");
	lblBook.setForeground(Color.BLACK);
	lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBook.setBounds(52, 144, 71, 24);
	contentPane.add(lblBook);

	JLabel lblName = new JLabel("Name");
	lblName.setForeground(Color.BLACK);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(300, 144, 71, 24);
	contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
	lblCourse.setForeground(Color.BLACK);
	lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblCourse.setBounds(52, 190, 87, 24);
	contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
	lblBranch.setForeground(Color.BLACK);
	lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBranch.setBounds(303, 190, 68, 24);
	contentPane.add(lblBranch);

	JLabel lblDateOfIssue = new JLabel("Date of Issue");
	lblDateOfIssue.setForeground(Color.BLACK);
	lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfIssue.setBounds(52, 236, 105, 29);
	contentPane.add(lblDateOfIssue);

	JLabel lblDateOfReturn = new JLabel("Date of Return");
	lblDateOfReturn.setForeground(Color.BLACK);
	lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfReturn.setBounds(52, 282, 118, 29);
	contentPane.add(lblDateOfReturn);

        textField = new JTextField();    //Book_ID
	textField.setForeground(new Color(105, 105, 105));
	textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField.setBounds(128, 56, 105, 20);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();    //Student_ID
	textField_1.setForeground(new Color(105, 105, 105));
	textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField_1.setBounds(340, 56, 93, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

        textField_7 = new JTextField();    //Label_ID
	textField_7.setEditable(false);
	textField_7.setForeground(new Color(0, 100, 0));
	textField_7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_7.setBounds(128, 102, 162, 20);
	contentPane.add(textField_7);
	textField_7.setColumns(10);

        textField_8 = new JTextField();    //Author
	textField_8.setEditable(false);
	textField_8.setForeground(new Color(0, 100, 0));
	textField_8.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_8.setColumns(10);
	textField_8.setBounds(369, 102, 179, 20);
	contentPane.add(textField_8);

	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setForeground(new Color(0, 100, 0));
	textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_2.setBounds(128, 148, 162, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);

	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setForeground(new Color(0, 100, 0));
	textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_3.setColumns(10);
	textField_3.setBounds(369, 148, 179, 20);
	contentPane.add(textField_3);

        textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setForeground(new Color(0, 100, 0));
	textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_4.setColumns(10);
	textField_4.setBounds(128, 194, 162, 20);
	contentPane.add(textField_4);

	textField_5 = new JTextField();
	textField_5.setForeground(new Color(0, 100, 0));
	textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_5.setEditable(false);
	textField_5.setColumns(10);
	textField_5.setBounds(369, 194, 179, 20);
	contentPane.add(textField_5);

	textField_6 = new JTextField();
	textField_6.setForeground(new Color(0, 100, 0));
	textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_6.setEditable(false);
	textField_6.setColumns(10);
	textField_6.setBounds(167, 240, 162, 20);
	contentPane.add(textField_6);

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(167, 284, 172, 29);
	contentPane.add(dateChooser);

	b2 = new JButton("Return");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b2.setBounds(369, 240, 149, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b3.setBounds(369, 290, 149, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	contentPane.add(b3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Return-Panel",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
	panel.setBounds(20, 24, 560, 340);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

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
            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField_1.getText());
		st.setString(2, textField.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    textField_7.setText(rs.getString("label_id"));
                    textField_8.setText(rs.getString("author"));
                    textField_2.setText(rs.getString("bname"));
                    textField_3.setText(rs.getString("sname"));
                    textField_4.setText(rs.getString("course"));
                    textField_5.setText(rs.getString("branch"));
                    textField_6.setText(rs.getString("dateOfIssue"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(label_id, book_id, student_id, bname, author, sname, course, branch, dateOfIssue, dateOfReturn) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField_7.getText());
                st.setString(2, textField.getText());
		st.setString(3, textField_1.getText());
		st.setString(4, textField_2.getText());
                st.setString(5, textField_8.getText());
		st.setString(6, textField_3.getText());
		st.setString(7, textField_4.getText());
		st.setString(8, textField_5.getText());
		st.setString(9, textField_6.getText());
                st.setString(10, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

		int i = st.executeUpdate();
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing...");
                    delete();
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
                String sql4 = "update copies set status = 'Available' where book_id = ?";
                PreparedStatement st4 = con.c.prepareStatement(sql4);
                st4.setString(1,textField.getText());
                st4.executeUpdate();

                String sql3 = "select Quantity from book where label_id = ?";
                PreparedStatement st3 = con.c.prepareStatement(sql3);
                st3.setString(1, textField_7.getText());
                ResultSet rs3 = st3.executeQuery();
                while(rs3.next())  {
                        t20.setText(rs3.getString("Quantity"));
                }

                String sql2 = "update book set Quantity = ? where label_id = ?";
                PreparedStatement st2 = con.c.prepareStatement(sql2);
                st2.setString(1, Integer.toString(Integer.parseInt(t20.getText())+1));
                st2.setString(2, textField_7.getText());
                st2.executeUpdate();

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}
