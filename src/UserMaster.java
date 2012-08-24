package postoffice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UserMaster extends Employee1{
    
    class makeNewRegistration extends JFrame implements ActionListener {
        JButton register,cancel;
        JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,panel11,panel12;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
        final JTextField text2,text3,text4,text5,text6, text8,text9, text10, text11, text12;
        JPasswordField text7;
        makeNewRegistration(String s1)
        {
            
            label1 = new JLabel();
            label1.setText("Welcome ");
            Font font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            
            label2 = new JLabel();
            label2.setText("New Employee Name: ");
            font = new Font("Serif", Font.BOLD, 20);
            label2.setFont(font);
            label2.setForeground(Color.WHITE);
            
            text2 = new JTextField(25);
            label3 = new JLabel();
            font = new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            
            label3.setText("Age : ");
            text3 = new JTextField(3);
            
            label4 = new JLabel();
            label4.setText("Email_ID : ");
            text4 = new JTextField(25);
            font = new Font("Serif", Font.BOLD, 20);
            label4.setFont(font);
            label4.setForeground(Color.WHITE);
            
            label5 = new JLabel();
            label5.setText("Type : ");
            text5 = new JTextField(3);
            font = new Font("Serif", Font.BOLD, 20);
            label5.setFont(font);
            label5.setForeground(Color.WHITE);
            
            label6 = new JLabel();
            label6.setText("Sex : ");
            text6 = new JTextField(3);
            font = new Font("Serif", Font.BOLD, 20);
            label6.setFont(font);
            label6.setForeground(Color.WHITE);
            
            label7 = new JLabel();
            label7.setText("Password : ");
            text7 = new JPasswordField(25);
            font = new Font("Serif", Font.BOLD, 20);
            label7.setFont(font);
            label7.setForeground(Color.WHITE);
            
            label8 = new JLabel();
            label8.setText("Address : ");
            text8 = new JTextField(25);
            font = new Font("Serif", Font.BOLD, 20);
            label8.setFont(font);
            label8.setForeground(Color.WHITE);
            
            label9 = new JLabel();
            label9.setText("City : ");
            text9 = new JTextField(25);
            font = new Font("Serif", Font.BOLD, 20);
            label9.setFont(font);
            label9.setForeground(Color.WHITE);
            
            label10 = new JLabel();
            label10.setText("State : ");
            text10 = new JTextField(25);
            font = new Font("Serif", Font.BOLD, 20);
            label10.setFont(font);
            label10.setForeground(Color.WHITE);
            
            label11 = new JLabel();
            label11.setText("Pin : ");
            text11 = new JTextField(6);
            font = new Font("Serif", Font.BOLD, 20);
            label11.setFont(font);
            label11.setForeground(Color.WHITE);
            
            label12 = new JLabel();
            label12.setText("Mobile : ");
            text12 = new JTextField(14);
            font = new Font("Serif", Font.BOLD, 20);
            label12.setFont(font);
            label12.setForeground(Color.WHITE);
            
            
            register=new JButton("Register");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(6,5));
            
            
            panel2=new JPanel(new GridLayout(4,4));
            panel2.setLayout(null);
            panel2.add(label2);
            panel2.add(text2);
            panel2.add(label3);
            panel2.add(text3);
            Insets insets=panel2.getInsets();
            Dimension sizel2=label2.getPreferredSize();
            Dimension sizet2=text2.getPreferredSize();
            label2.setBounds(insets.left+20,insets.top+20,sizel2.width,sizel2.height);
            text2.setBounds(insets.left+280,insets.top+20,sizet2.width,sizet2.height);
            Dimension sizel3=label3.getPreferredSize();
            Dimension sizet3=text3.getPreferredSize();
            label3.setBounds(insets.left+20,insets.top+50,sizel3.width,sizel3.height);
            text3.setBounds(insets.left+280,insets.top+50,sizet3.width,sizet3.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            panel4=new JPanel(new GridLayout(4,4));
            panel4.setLayout(null);
            panel4.add(label4);
            panel4.add(text4);
            panel4.add(label5);
            panel4.add(text5);
            insets=panel4.getInsets();
            Dimension sizel4=label4.getPreferredSize();
            Dimension sizet4=text4.getPreferredSize();
            Dimension sizel5=label5.getPreferredSize();
            Dimension sizet5=text5.getPreferredSize();
            label4.setBounds(insets.left+20,insets.top+0,sizel4.width,sizel4.height);
            text4.setBounds(insets.left+280,insets.top+0,sizet4.width,sizet4.height);
            label5.setBounds(insets.left+20,insets.top+30,sizel5.width,sizel5.height);
            text5.setBounds(insets.left+280,insets.top+30,sizet5.width,sizet5.height);
            
            panel4.setBackground(Color.black);
            panel.add(panel4);
            
            
            panel6=new JPanel(new GridLayout(4,4));
            panel6.setLayout(null);
            panel6.add(label6);
            panel6.add(text6);
            panel6.add(label7);
            panel6.add(text7);
            insets=panel6.getInsets();
            Dimension sizel6=label6.getPreferredSize();
            Dimension sizet6=text6.getPreferredSize();
            Dimension sizel7=label7.getPreferredSize();
            Dimension sizet7=text7.getPreferredSize();
            label6.setBounds(insets.left+20,insets.top+0,sizel6.width,sizel6.height);
            text6.setBounds(insets.left+280,insets.top+0,sizet6.width,sizet6.height);
            label7.setBounds(insets.left+20,insets.top+30,sizel7.width,sizel7.height);
            text7.setBounds(insets.left+280,insets.top+30,sizet7.width,sizet7.height);
            
            panel6.setBackground(Color.black);
            panel.add(panel6);
            
            panel8=new JPanel(new GridLayout(4,4));
            panel8.setLayout(null);
            panel8.add(label8);
            panel8.add(text8);
            panel8.add(label9);
            panel8.add(text9);
            insets=panel8.getInsets();
            Dimension sizel8=label8.getPreferredSize();
            Dimension sizet8=text8.getPreferredSize();
            Dimension sizel9=label9.getPreferredSize();
            Dimension sizet9=text9.getPreferredSize();
            label8.setBounds(insets.left+20,insets.top,sizel8.width,sizel8.height);
            text8.setBounds(insets.left+280,insets.top,sizet8.width,sizet8.height);
            label9.setBounds(insets.left+20,insets.top+30,sizel9.width,sizel9.height);
            text9.setBounds(insets.left+280,insets.top+30,sizet9.width,sizet9.height);
            panel8.setBackground(Color.black);
            panel.add(panel8);
            
            panel10=new JPanel(new GridLayout(4,4));
            panel10.setLayout(null);
            panel10.add(label10);
            panel10.add(text10);
            panel10.add(label11);
            panel10.add(text11);
            
            insets=panel10.getInsets();
            Dimension sizel10=label10.getPreferredSize();
            Dimension sizet10=text10.getPreferredSize();
            Dimension sizel11=label11.getPreferredSize();
            Dimension sizet11=text11.getPreferredSize();
            label10.setBounds(insets.left+20,insets.top,sizel10.width,sizel10.height);
            text10.setBounds(insets.left+280,insets.top,sizet10.width,sizet10.height);
            label11.setBounds(insets.left+20,insets.top+30,sizel11.width,sizel11.height);
            text11.setBounds(insets.left+280,insets.top+30,sizet11.width,sizet11.height);
            
            panel10.setBackground(Color.black);
            panel.add(panel10);
            
            panel12=new JPanel(new GridLayout(4,4));
            panel12.setLayout(null);
            panel12.add(label12);
            panel12.add(text12);
            panel12.add(register);
            panel12.add(cancel);
            insets=panel12.getInsets();
            Dimension sizel12=label12.getPreferredSize();
            Dimension sizet12=text12.getPreferredSize();
            Dimension sizeb1=register.getPreferredSize();
            Dimension sizeb2=cancel.getPreferredSize();
            label12.setBounds(insets.left+20,insets.top,sizel12.width,sizel12.height);
            text12.setBounds(insets.left+280,insets.top,sizet12.width,sizet12.height);
            register.setBounds(insets.left+300,insets.top+50,sizeb1.width,sizeb1.height);
            cancel.setBounds(insets.left+100,insets.top+50,sizeb2.width,sizeb2.height);
            
            panel12.setBackground(Color.black);
            panel.add(panel12);
            add(panel,BorderLayout.CENTER);
            setLocation(300,100);
            setSize(600,550);
            register.addActionListener(this);
            
            setTitle(s1);
            cancel.addActionListener(this);
            setVisible(true);
            
        }
        
        String userid="oom", password = "123";
        String url = "jdbc:odbc:student"; // String url = "jdbc:mySubprotocol:myDataSource"; ?
        Statement stmt;
        Connection con;
        public Connection getConnection()
        {
            
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Class.forName("myDriver.ClassName"); ?
                
            }
            catch(java.lang.ClassNotFoundException e) {
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
        public void insertids(String a[])
        {
            Connection con = getConnection();
            
            String insertString1, insertString2, insertString3, insertString4;
            insertString1 = "insert into users values( '"+a[2]+"','"+a[7]+"','"+a[5]+"','"+a[2]+"','"+a[6]+"','"+a[4]+"','"+a[12]+"','NA','NA','"+a[8]+"','"+a[9]+"','"+a[10]+"','"+a[11]+"','"+a[3]+"')";
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
            String s1 =(String)ae.getActionCommand();
            String a[]=new String[20];
            a[2]=text2.getText();
            a[3]=text3.getText();
            a[4]=text4.getText();
            a[5]=text5.getText();
            a[6]=text6.getText();
            a[7]=text7.getText();
            a[8]=text8.getText();
            a[9]=text9.getText();
            a[10]=text10.getText();
            a[11]=text11.getText();
            a[12]=text12.getText();
            System.out.println("ok");
            if (s1.equals("Register")) {
                
                this.insertids(a);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                
            }
            
        }
    }
    
    public void makeNewLetterMaster(){
        String s1="Register New LostLetter Master";
        System.out.println("its here baby");
        makeNewRegistration a1=new makeNewRegistration(s1);
        
    }
    
    public void makeNewArticleMaster(){
        String s1="Register New Article Master";
        makeNewRegistration a2 =new makeNewRegistration(s1);
        // a.fmakeNewRegistration(s1);
    }
    public void makeNewComplainMaster(){
        String s1="Register New Complain Master";
        System.out.println("its here baby");
        makeNewRegistration a1=new makeNewRegistration(s1);
    }
}
