package postoffice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class LostAricleMaster extends Employee1 {
    class makeNewRegistration extends JFrame implements ActionListener {
        
        public void reconcile() {
            System.out.println("exec");
            String url = " jdbc:odbc:student ";
            String s1="\n";
            
            try {
                
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                Statement stmt = con.createStatement();
                String selectString = "select * from LOST_ARTICLES;";
                ResultSet reset = stmt.executeQuery(selectString);
                
                //Print the data to the console
                while(reset.next()){
                    s1=s1+reset.getString(1)+" "+reset.getString(2)+"  "+reset.getString(3)+" "+reset.getString(4)+"\n";
                    // System.out.println(s1);
                }
                String selectString2 = "select * from LOST_LETTERS;";
                ResultSet reset2 = stmt.executeQuery(selectString2);
                while(reset2.next()){
                    s1=s1+reset2.getString(1)+" "+reset2.getString(2)+" "+reset2.getString(3)+" "+reset2.getString(4)+"\n";
                    
                }
                // makeArticleReconcillation rec= new makeArticleReconcillation(s1);
                
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
        }
        
        JButton register,cancel;
        // JButton register,cancel;
        JPanel panel,panel1,panel2,panel3;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
        final JTextField text2,text3,text4 ;
        makeNewRegistration(String s1)
        {
            
            
            label1 = new JLabel();
            label1.setText("Welcome :Article master");
            Font font=new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            
            label2 = new JLabel();
            label2.setText("Article type: ");
            text2 = new JTextField(15);
            font=new Font("Serif", Font.BOLD, 20);
            label2.setFont(font);
            label2.setForeground(Color.WHITE);
            
            label3 = new JLabel();
            label3.setText("Color: ");
            text3 = new JTextField(13);
            font=new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            
            label4 = new JLabel();
            label4.setText("Pin code : ");
            text4 = new JTextField(6);
            font=new Font("Serif", Font.BOLD, 20);
            label4.setFont(font);
            label4.setForeground(Color.WHITE);
            
            register=new JButton("Register");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(6,5));
            panel.add(label1);
            
            panel1=new JPanel(new GridLayout(4,4));
            panel1.setLayout(null);
            panel1.add(label2);
            panel1.add(text2);
            panel1.add(label3);
            panel1.add(text3);
            
            Insets insets=panel1.getInsets();
            Dimension sizel2=label2.getPreferredSize();
            Dimension sizet2=text2.getPreferredSize();
            Dimension sizel3=label3.getPreferredSize();
            Dimension sizet3=text3.getPreferredSize();
            label2.setBounds(insets.left+20,insets.top,sizel2.width,sizel2.height);
            text2.setBounds(insets.left+280,insets.top,sizet2.width,sizet2.height);
            label3.setBounds(insets.left+20,insets.top+30,sizel3.width,sizel3.height);
            text3.setBounds(insets.left+280,insets.top+30,sizet3.width,sizet3.height);
            
            panel1.setBackground(Color.black);
            panel.add(panel1);
            
            panel2=new JPanel(new GridLayout(4,4));
            panel2.setLayout(null);
            panel2.add(label4);
            panel2.add(text4);
            
            insets=panel2.getInsets();
            Dimension sizel4=label4.getPreferredSize();
            Dimension sizet4=text4.getPreferredSize();
            label4.setBounds(insets.left+20,insets.top,sizel4.width,sizel4.height);
            text4.setBounds(insets.left+280,insets.top,sizet4.width,sizet4.height);
            
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            panel3=new JPanel(new GridLayout(4,4));
            panel3.setLayout(null);
            panel3.add(register);
            panel3.add(cancel);
            insets=panel3.getInsets();
            Dimension sizeb1=register.getPreferredSize();
            Dimension sizeb2=cancel.getPreferredSize();
            register.setBounds(insets.left+300,insets.top+50,sizeb1.width,sizeb1.height);
            cancel.setBounds(insets.left+100,insets.top+50,sizeb2.width,sizeb2.height);
            panel3.setBackground(Color.black);
            panel.add(panel3);
            
            add(panel,BorderLayout.CENTER);
            setLocation(200,200);
            setSize(500,500);
            panel.setBackground(Color.black);
            register.addActionListener(this);
            
            add(panel,BorderLayout.CENTER);
            setLocation(200,200);
            setSize(500,500);
            panel.setBackground(Color.black);
            register.addActionListener(this);
            
            setTitle(s1);
            cancel.addActionListener(this);
            setVisible(true);
            
        }
        String userid="oom", password = "123";
        String url = "jdbc:odbc:student"; // String url = "jdbc:mySubprotocol:myDataSource"; ?
        Statement stmt1;
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
            Random r=new Random();
            
            a[5]=Long.toString(Math.abs(r.nextLong()));
            String insertString1, insertString2, insertString3, insertString4;
            insertString1 = "insert into LOST_ARTICLES values( '"+a[2]+"','"+a[3]+"','"+a[4]+"','"+a[5]+"','UNCLAIMED')";
            System.out.println(insertString1);
            try {
                stmt1 = con.createStatement();
                stmt1.executeUpdate(insertString1);
                stmt1.close();
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
            System.out.println("yahan to thkee hai");
            if (s1.equals("Register")) {
                System.out.println("haan");
                this.insertids(a);
                this.reconcile();
                setVisible(false);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("done");
            }
            
        }
    }
    public void makeNewArticleRegistration(){
        String s1="Register New LostArticle Master";
        System.out.println("its here baby");
        makeNewRegistration a1=new makeNewRegistration(s1);
    }
    
}