package library.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class requestdetails extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2;
    
    public static void main(String[] args) {
	new requestdetails().setVisible(true);
    }

    public void request() {
        try {
            conn con = new conn();
            String sql = "select * from request";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

    public requestdetails() {
        setBounds(350, 200, 1130, 525);
        contentPane = new JPanel();
	contentPane.setBackground(new Color(220, 220, 220));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(79, 133, 971, 288);
	contentPane.add(scrollPane);

	table = new JTable();
	table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
		search.setText(table.getModel().getValueAt(row, 1).toString());
            }
	});
	table.setBackground(new Color(240, 248, 255));
	table.setForeground(Color.DARK_GRAY);
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	scrollPane.setViewportView(table);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
	b1.setForeground(new Color(199, 21, 133));
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	b1.setBounds(730, 89, 138, 33);
	contentPane.add(b1);

	b2 = new JButton("Delete");
	b2.addActionListener(this);
	b2.setForeground(new Color(199, 21, 133));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	b2.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
	b2.setBounds(880, 89, 138, 33);
	contentPane.add(b2);

	JLabel l1 = new JLabel("Pending Requests");
	l1.setForeground(new Color(102, 205, 170));
	l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
	l1.setBounds(470, 20, 400, 47);
	contentPane.add(l1);


	search = new JTextField();
	search.setBackground(new Color(255, 240, 245));
	search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
	search.setForeground(new Color(47, 79, 79));
	search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
	search.setBounds(210, 89, 480, 33);
	contentPane.add(search);
	search.setColumns(10);

	JLabel l2 = new JLabel("Back");
	l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
		home.setVisible(true);
            }
	});
	l2.setForeground(Color.GRAY);
	l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l2.setIcon(i9);
	l2.setBounds(97, 89, 72, 33);
	contentPane.add(l2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(95, 158, 160), 3, true), "",
		TitledBorder.LEADING, TitledBorder.TOP, null, new Color(72, 209, 204)));
	panel.setBounds(68, 59, 990, 370);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
        
	request();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            conn con = new conn();
            if( ae.getSource() == b1){
                String sql = "select * from request where concat(bname,student_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, "%" + search.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
		rs.close();
		st.close();
            }
    
            if(ae.getSource() == b2){
                String sql = "delete from request where student_id = '" + search.getText() + "'";
		PreparedStatement st = con.c.prepareStatement(sql);

		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
		} else if (response == JOptionPane.CLOSED_OPTION) {
                
                }
		st.close();
		
            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
