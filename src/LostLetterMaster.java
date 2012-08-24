package postoffice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class LostLetterMaster extends Employee1 {
    class makeNewRegistration extends JFrame implements ActionListener {
        JButton register, cancel;
        JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6, panel7;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
        final JTextField text2, text3, text4;
        
        makeNewRegistration(String s1) {
            
            
            label1 = new JLabel();
            label1.setText("Welcome :Letter master");
            Font font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            
            label2 = new JLabel();
            label2.setText("letter type: ");
            text2 = new JTextField(15);
            font = new Font("Serif", Font.BOLD, 20);
            label2.setFont(font);
            label2.setForeground(Color.WHITE);
            
            
            label3 = new JLabel();
            label3.setText("Color: ");
            text3 = new JTextField(13);
            font = new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            
            label4 = new JLabel();
            label4.setText("Pin code : ");
            text4 = new JTextField(6);
            font = new Font("Serif", Font.BOLD, 20);
            label4.setFont(font);
            label4.setForeground(Color.WHITE);
            
            
            register = new JButton("Register");
            cancel = new JButton("Cancel");
            panel = new JPanel(new GridLayout(6, 5));
            
            panel2 = new JPanel(new GridLayout(4, 4));
            panel2.setLayout(null);
            panel2.add(label2);
            panel2.add(text2);
            panel2.add(label3);
            panel2.add(text3);
            Insets insets = panel2.getInsets();
            Dimension sizel2 = label2.getPreferredSize();
            Dimension sizet2 = text2.getPreferredSize();
            label2.setBounds(insets.left + 20, insets.top + 20, sizel2.width, sizel2.height);
            text2.setBounds(insets.left + 280, insets.top + 20, sizet2.width, sizet2.height);
            Dimension sizel3 = label3.getPreferredSize();
            Dimension sizet3 = text3.getPreferredSize();
            label3.setBounds(insets.left + 20, insets.top + 50, sizel3.width, sizel3.height);
            text3.setBounds(insets.left + 280, insets.top + 50, sizet3.width, sizet3.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            
            panel4 = new JPanel(new GridLayout(4, 4));
            panel4.setLayout(null);
            panel4.add(label4);
            panel4.add(text4);
            // panel4.add(label5);
            //  panel4.add(text5);
            insets = panel4.getInsets();
            Dimension sizel4 = label4.getPreferredSize();
            Dimension sizet4 = text4.getPreferredSize();
            // Dimension sizel5=label5.getPreferredSize();
            // Dimension sizet5=text5.getPreferredSize();
            label4.setBounds(insets.left + 20, insets.top + 0, sizel4.width, sizel4.height);
            text4.setBounds(insets.left + 280, insets.top + 0, sizet4.width, sizet4.height);
            //label5.setBounds(insets.left+20,insets.top+30,sizel5.width,sizel5.height);
            //text5.setBounds(insets.left+280,insets.top+30,sizet5.width,sizet5.height);
            
            panel4.setBackground(Color.black);
            panel.add(panel4);
            
            
            panel6 = new JPanel(new GridLayout(4, 4));
            panel6.setLayout(null);
            panel6.add(register);
            panel6.add(cancel);
            insets = panel6.getInsets();
            Dimension sizeb1 = register.getPreferredSize();
            Dimension sizeb2 = cancel.getPreferredSize();
            register.setBounds(insets.left + 300, insets.top + 50, sizeb1.width, sizeb1.height);
            cancel.setBounds(insets.left + 100, insets.top + 50, sizeb2.width, sizeb2.height);
            panel6.setBackground(Color.black);
            panel.add(panel6);
            
            add(panel, BorderLayout.CENTER);
            setLocation(200, 200);
            setSize(500, 500);
            panel.setBackground(Color.black);
            register.addActionListener(this);
            
            setTitle(s1);
            cancel.addActionListener(this);
            setVisible(true);
            // return a;
            
            
        } String userid = "oom", password = "123";
        String url = "jdbc:odbc:student"; // String url = "jdbc:mySubprotocol:myDataSource"; ?
        Statement stmt;
        Connection con;
        public Connection getConnection() {
            
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Class.forName("myDriver.ClassName"); ?
                
                } catch(java.lang.ClassNotFoundException e) {
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
            }
            
            try {
                con = DriverManager.getConnection(url, userid, password);
                
                } catch(SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
            
            return con;
        }
        public void insertids(String a[]) {
            Connection con = getConnection();
            Random r = new Random();
            
            a[5] = Long.toString(Math.abs(r.nextLong()));
            String insertString1, insertString2, insertString3, insertString4;
            insertString1 = "insert into LOST_LETTERS values( '" + a[2] + "','" + a[3] + "','" + a[4] + "','" + a[5] + "','UNCLAIMED')";
            System.out.println(insertString1);
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(insertString1);
                
                stmt.close();
                con.close();
                
                } catch(SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
        }
        public void actionPerformed(ActionEvent ae) {
            String s1 = (String) ae.getActionCommand();
            String a[] = new String[20];
            a[2] = text2.getText();
            a[3] = text3.getText();
            a[4] = text4.getText();
            System.out.println("yahan to thkee hai");
            if (s1.equals("Register")) {
                System.out.println("haan");
                this.insertids(a);
                setVisible(false);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("gaya");
            }
            
        }
    }
    
    
    public void makeNewLetterRegistration() {
        String s1 = "Register New LostLetter Master";
        System.out.println("its here baby");
        makeNewRegistration a1 = new makeNewRegistration(s1);
    }
    
}
 