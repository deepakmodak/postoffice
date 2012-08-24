package postoffice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


public class ComplaintMaster extends Employee1{
    ComplaintMaster(){
        
    }
    String alpha="";
    class makeNewRegistrationLetter extends JFrame implements ActionListener {
        class makeLetterReconcillation extends JFrame implements ActionListener{
            JButton register,cancel,Enter;
            JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
            JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
            final JTextField text2,text3,text4,text5,text6;
            JPasswordField text7;
            
            makeLetterReconcillation(String s1)
            {
                
                
                add(panel,BorderLayout.CENTER);
                setLocation(200,200);
                setSize(500,500);
                Enter.addActionListener(this);
                cancel.addActionListener(this);
                setTitle("LostLetterReconcillation");
                //setVisible(true);*/
                
                
                label1 = new JLabel();
                label1.setText("Welcome :Complaint Master");
                label2 = new JLabel();
                label2.setText("Name: ");
                text2 = new JTextField(15);
                label3 = new JLabel();
                label3.setText("Address: ");
                text3 = new JTextField(3);
                label4 = new JLabel();
                label4.setText("Type: ");
                text4 = new JTextField(25);
                label5 = new JLabel();
                label5.setText("Color : ");
                text5 = new JTextField(2);
                label6 = new JLabel();
                label6.setText("Pin code : ");
                text6 = new JTextField(7);
                
                
                register=new JButton("Register");
                cancel=new JButton("Cancel");
                panel=new JPanel(new GridLayout(6,5));
                panel.add(label1);
                
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
                insets=panel6.getInsets();
                Dimension sizel6=label6.getPreferredSize();
                Dimension sizet6=text6.getPreferredSize();
                label6.setBounds(insets.left+20,insets.top+0,sizel6.width,sizel6.height);
                text6.setBounds(insets.left+280,insets.top+0,sizet6.width,sizet6.height);
                panel6.setBackground(Color.black);
                panel.add(panel6);
                
                panel7=new JPanel(new GridLayout(4,4));
                panel7.setLayout(null);
                panel7.add(register);
                panel7.add(cancel);
                insets=panel7.getInsets();
                Dimension sizeb1=register.getPreferredSize();
                Dimension sizeb2=cancel.getPreferredSize();
                register.setBounds(insets.left+300,insets.top+50,sizeb1.width,sizeb1.height);
                cancel.setBounds(insets.left+100,insets.top+50,sizeb2.width,sizeb2.height);
                panel7.setBackground(Color.black);
                panel.add(panel7);
                add(panel,BorderLayout.CENTER);
                setLocation(200,200);
                setSize(500,500);
                register.addActionListener(this);
                
                setTitle(s1);
                cancel.addActionListener(this);
                setVisible(true);
                
                
            }
            public void actionPerformed(ActionEvent ae) {
                String s1 =(String)ae.getActionCommand();
                String a[]=new String[20];
                a[2]=text2.getText();
                
                
                System.out.println("oki");
                if (s1.equals("Enter")) {
                    String url = " jdbc:odbc:student ";
                    
                    try {
                        
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                        Statement stmt = con.createStatement();
                        String selectString = "update LOST_LETTERS set status='CLAIMED' where ALPHANUMERIC_KEY='"+a[2]+"'";
                        String selectString1 = "update COMPLAINT_LETTER set status='FOUND' where ALPHANUMERIC_KEY='"+alpha+"'";
                        stmt.executeUpdate(selectString);
                        stmt.executeUpdate(selectString1);
                        
                        
                    }
                    catch( Exception e ) {
                        e.printStackTrace();
                    }
                    System.out.println("haan");
                    
                }
                if (s1.equals("Cancel")) {
                    setVisible(false);
                    System.out.println("ok");
                }
            }
        }
        JButton register,cancel;
        JPanel panel;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
        final JTextField text2,text3,text4,text5,text6;
        JPasswordField text7;
        
        makeNewRegistrationLetter(String s1)
        {
            
            label1 = new JLabel();
            label1.setText("Welcome :Complaint Master");
            label2 = new JLabel();
            label2.setText("Name: ");
            text2 = new JTextField(15);
            label3 = new JLabel();
            label3.setText("Address: ");
            text3 = new JTextField(3);
            label4 = new JLabel();
            label4.setText("Type: ");
            text4 = new JTextField(25);
            label5 = new JLabel();
            label5.setText("Color : ");
            text5 = new JTextField(2);
            label6 = new JLabel();
            label6.setText("Pin code : ");
            text6 = new JTextField(7);
            
            
            register=new JButton("Register");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(6,5));
            panel.add(label1);
            
            panel.add(label2);
            panel.add(text2);
            panel.add(label3);
            panel.add(text3);
            panel.add(label4);
            panel.add(text4);
            panel.add(label5);
            panel.add(text5);
            panel.add(label6);
            panel.add(text6);
            
            panel.add(register);
            panel.add(cancel);
            
            
            add(panel,BorderLayout.CENTER);
            setLocation(200,200);
            setSize(500,500);
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
        public void reconcile(String a[]) {
            System.out.println("exec");
            String url = " jdbc:odbc:student ";
            String s1="\n";
            
            try {
                
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                Statement stmt = con.createStatement();
                
                
                String selectString2 = "select * from LOST_LETTERS where (TYPE = '"+a[4]+"' AND PIN_CODE='"+a[6]+"')";ResultSet reset2 = stmt.executeQuery(selectString2);
                reset2=stmt.executeQuery(selectString2);
                while(reset2.next()){
                    s1=s1+reset2.getString(1)+" "+reset2.getString(2)+" "+reset2.getString(3)+" "+reset2.getString(4)+"\n";
                    s1+='\n';
                }
                makeLetterReconcillation rec= new makeLetterReconcillation(s1);
                
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
        }
        public void insertids(String a[])
        {
            Connection con = getConnection();
            Random r=new Random();
            a[7]=Long.toString(Math.abs(r.nextLong()));
            alpha = a[7];
            String insertString1, insertString2, insertString3, insertString4;
            insertString1 = "insert into Complaint_Letter values( '"+a[2]+"','"+a[3]+"','"+a[4]+"','"+a[5]+"','"+a[6]+"','"+a[7]+"','NOT_FOUND')";
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
            
            System.out.println("yahan to thkee hai");
            if (s1.equals("Register")) {
                System.out.println("haan");
                
                this.insertids(a);
                this.reconcile(a);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("chu gaya");
            }
            
        }
        
    }
    class makeNewRegistrationArticle extends JFrame implements ActionListener {
        //s1 me saara chahiye
        class makeArticleReconcillation extends JFrame implements ActionListener{
            JButton Enter,cancel;
            JPanel panel;
            JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
            // final JTextField text2,text3,text4,text5,text6;
            final JTextField text2;
            JPasswordField text7;
            makeArticleReconcillation(String s1)
            {
                
                label1 = new JLabel();
                label1.setText("Welcome :Complaint Master");
                label2 = new JLabel();
                label2.setText("List of Matches: " + s1);
                label3=new JLabel();
                label3.setText("Enter alphanumeric key of the match");
                text2 = new JTextField(25);
                
                
                Enter=new JButton("Enter");
                cancel=new JButton("Cancel");
                panel=new JPanel(new GridLayout(6,5));
                panel.add(label1);
                
                panel.add(label2);
                panel.add(text2);
                
                panel.add(Enter);
                panel.add(cancel);
                
                
                add(panel,BorderLayout.CENTER);
                setLocation(200,200);
                setSize(500,500);
                Enter.addActionListener(this);
                cancel.addActionListener(this);
                setTitle("LostArticleReconcillation");
                setVisible(true);
            }
            public void actionPerformed(ActionEvent ae) {
                String s1 =(String)ae.getActionCommand();
                String a[]=new String[20];
                a[2]=text2.getText();
                
                try {
                    
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                    Statement stmt = con.createStatement();
                    String selectString = "update LOST_ARTICLES set status='CLAIMED' where ALPHANUMERIC_KEY='"+a[2]+"'";
                    String selectString1 = "update COMPLAINT_ARTICLE set status='FOUND' where ALPHANUMERIC_KEY='"+alpha+"'";
                    stmt.executeUpdate(selectString);
                    stmt.executeUpdate(selectString1);
                    
                    
                }
                catch( Exception e ) {
                    e.printStackTrace();
                }
                
                System.out.println("yahan to thkee hai");
                if (s1.equals("Enter")) {
                    
                }
                if (s1.equals("Cancel")) {
                    setVisible(false);
                    System.out.println("chu gaya");
                }
            }
        }
        ///////////
        JButton register,cancel;
        JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
        final JTextField text2,text3,text4,text5,text6;
        JPasswordField text7;
        makeNewRegistrationArticle(String s1)
        {
            
            label1 = new JLabel();
            label1.setText("Welcome :Complaint Master");
            Font font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            label2 = new JLabel();
            label2.setText("Name: ");
            font = new Font("Serif", Font.BOLD, 20);
            label2.setFont(font);
            label2.setForeground(Color.WHITE);
            text2 = new JTextField(15);
            label3 = new JLabel();
            label3.setText("Address: ");
            font = new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            text3 = new JTextField(3);
            label4 = new JLabel();
            label4.setText("Type: ");
            font = new Font("Serif", Font.BOLD, 20);
            label4.setFont(font);
            label4.setForeground(Color.WHITE);
            text4 = new JTextField(25);
            label5 = new JLabel();
            label5.setText("Color : ");
            font = new Font("Serif", Font.BOLD, 20);
            label5.setFont(font);
            label5.setForeground(Color.WHITE);
            text5 = new JTextField(2);
            label6 = new JLabel();
            label6.setText("Pin code : ");
            font = new Font("Serif", Font.BOLD, 20);
            label6.setFont(font);
            label6.setForeground(Color.WHITE);
            text6 = new JTextField(7);
            
            
            register=new JButton("Register");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(4,4));
            
            panel1=new JPanel(new GridLayout(4,4));
            panel1.setLayout(null);
            panel1.add(label1);
            Insets insets=panel1.getInsets();
            Dimension sizel1=label1.getPreferredSize();
            label1.setBounds(insets.left,insets.top+40,sizel1.width,sizel1.height);
            panel1.setBackground(Color.black);
            panel.add(panel1);
            panel2=new JPanel(new GridLayout(4,4));
            panel2.setLayout(null);
            panel2.add(label2);
            panel2.add(text2);
            insets=panel2.getInsets();
            Dimension sizel2=label2.getPreferredSize();
            Dimension sizet2=text2.getPreferredSize();
            label2.setBounds(insets.left,insets.top+40,sizel2.width,sizel2.height);
            text2.setBounds(insets.left+100,insets.top+40,sizet2.width+150,sizet2.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            
            
            panel3=new JPanel(new GridLayout(4,4));
            panel3.setLayout(null);
            panel3.add(label3);
            panel3.add(text3);
            insets=panel3.getInsets();
            Dimension sizel3=label3.getPreferredSize();
            Dimension sizet3=text3.getPreferredSize();
            label3.setBounds(insets.left+30,insets.top,sizel3.width,sizel3.height);
            text3.setBounds(insets.left+180,insets.top,sizet3.width,sizet3.height);
            panel3.setBackground(Color.black);
            panel.add(panel3);
            
            
            panel4=new JPanel(new GridLayout(4,4));
            panel4.setLayout(null);
            panel4.add(label4);
            panel4.add(text4);
            insets=panel4.getInsets();
            Dimension sizel4=label4.getPreferredSize();
            Dimension sizet4=text4.getPreferredSize();
            label4.setBounds(insets.left+30,insets.top,sizel4.width,sizel4.height);
            text4.setBounds(insets.left+180,insets.top,sizet4.width,sizet4.height);
            panel4.setBackground(Color.black);
            panel.add(panel4);
            
            panel5=new JPanel(new GridLayout(4,4));
            panel5.setLayout(null);
            panel5.add(label5);
            panel5.add(text5);
            insets=panel5.getInsets();
            Dimension sizel5=label5.getPreferredSize();
            Dimension sizet5=text5.getPreferredSize();
            label5.setBounds(insets.left+30,insets.top,sizel5.width,sizel5.height);
            text5.setBounds(insets.left+180,insets.top,sizet5.width,sizet5.height);
            panel5.setBackground(Color.black);
            panel.add(panel5);
            
            
            panel6=new JPanel(new GridLayout(4,4));
            panel6.setLayout(null);
            panel6.add(label6);
            panel6.add(text6);
            insets=panel6.getInsets();
            Dimension sizel6=label6.getPreferredSize();
            Dimension sizet6=text6.getPreferredSize();
            label6.setBounds(insets.left+30,insets.top,sizel6.width,sizel6.height);
            text6.setBounds(insets.left+180,insets.top,sizet6.width,sizet6.height);
            panel6.setBackground(Color.black);
            panel.add(panel6);
            
            
            panel7=new JPanel(new GridLayout(4,4));
            panel7.setLayout(null);
            panel7.add(register);
            panel7.add(cancel);
            insets=panel7.getInsets();
            Dimension sizeb1=register.getPreferredSize();
            Dimension sizeb2=cancel.getPreferredSize();
            register.setBounds(insets.left+30,insets.top,sizeb1.width,sizeb1.height);
            cancel.setBounds(insets.left+180,insets.top,sizeb2.width,sizeb2.height);
            panel7.setBackground(Color.black);
            panel.add(panel7);
            panel.setBackground(Color.black);
            add(panel,BorderLayout.CENTER);
            setLocation(100,100);
            setSize(800,800);
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
            // System.out.println("exec123");
            Connection con = getConnection();
            Random r=new Random();
            a[7]=Long.toString(Math.abs(r.nextLong()));
            alpha = a[7];
            String insertString1, insertString2, insertString3, insertString4;
            insertString1 = "insert into Complaint_Article values( '"+a[2]+"','"+a[3]+"','"+a[4]+"','"+a[5]+"','"+a[6]+"','"+a[7]+"','NOT_FOUND')";
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
        public void reconcile(String a[]) {
            System.out.println("exec");
            String url = " jdbc:odbc:student ";
            String s1="\n";
            
            try {
                
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                Statement stmt = con.createStatement();
                //String selectString = "select * from LOST_ARTICLES;";
                String selectString = "select * from LOST_ARTICLES where (TYPE = '"+a[4]+"' AND PIN_CODE='"+a[6]+"')";
                System.out.println(selectString);
                ResultSet reset = stmt.executeQuery(selectString);
                
                //Print the data to the console
                while(reset.next()){
                    s1=s1+reset.getString(1)+" "+reset.getString(2)+"  "+reset.getString(3)+" "+reset.getString(4)+"\n";
                    // System.out.println(s1);
                }
                
                makeArticleReconcillation rec= new makeArticleReconcillation(s1);
                
            }
            catch( Exception e ) {
                e.printStackTrace();
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
            
            System.out.println("yahan to thkee hai");
            if (s1.equals("Register")) {
                System.out.println("haan");
                this.insertids(a);
                this.reconcile(a);
                
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("chu gaya");
            }
            
        }
        
    }
    String a3[]=new String[20];
    class makenewInquiry extends JFrame implements ActionListener{
        class makenewInquiryForm extends JFrame implements ActionListener{
            JLabel label1, label2, label3, label4, label5, label6, label7, label8;
            // final JTextField text2, text3, text4, text5, text6, text7, text8;
            JPanel panel,panel1,panel2,panel3,panel4,panel5;
            JButton ok;
            //  String a3[]=new String[20];
            makenewInquiryForm(){
                label1 = new JLabel();
                label1.setText("Details:");
                Font font = new Font("Serif", Font.BOLD, 20);
                label1.setFont(font);
                label1.setForeground(Color.WHITE);
                label2 = new JLabel();
                label2.setText("Name: " + a3[0]);
                font = new Font("Serif", Font.BOLD, 20);
                label2.setFont(font);
                label2.setForeground(Color.WHITE);
                System.out.println(a3[0]+a3[1]+a3[2]+a3[3]+a3[4]+a3[5]+a3[6]+"here");
                //  text2 = new JTextField(30);
                
                label3=new JLabel();
                label4=new JLabel();
                label5=new JLabel();
                label6=new JLabel();
                label7=new JLabel();
                label8=new JLabel();
                
                label3.setText("Address: " + a3[1]);
                font = new Font("Serif", Font.BOLD, 20);
                label3.setFont(font);
                label3.setForeground(Color.WHITE);
                // text3 = new JTextField(30);
                label4.setText("Type: " + a3[2]);
                font = new Font("Serif", Font.BOLD, 20);
                label4.setFont(font);
                label4.setForeground(Color.WHITE);
                // text2 = new JTextField(30);
                label8.setText("Color: " + a3[3]);
                font = new Font("Serif", Font.BOLD, 20);
                label8.setFont(font);
                label8.setForeground(Color.WHITE);
                // text2 = new JTextField(30);
                label5.setText("Pin code: " + a3[4]);
                font = new Font("Serif", Font.BOLD, 20);
                label5.setFont(font);
                label5.setForeground(Color.WHITE);
                // text2 = new JTextField(30);
                label6.setText("Alphanumric Key: " + a3[5]);
                font = new Font("Serif", Font.BOLD, 20);
                label6.setFont(font);
                label6.setForeground(Color.WHITE);
                // text2 = new JTextField(30);
                label7.setText("Status: " + a3[6]);
                font = new Font("Serif", Font.BOLD, 20);
                label7.setFont(font);
                label7.setForeground(Color.WHITE);
                // text2 = new JTextField(30);
                ok=new JButton("Okay");
                //  cancel=new JButton("Cancel");
                panel=new JPanel(new GridLayout(6,5));
                
                panel1=new JPanel(new GridLayout(4,4));
                panel1.setLayout(null);
                panel1.add(label1);
                panel1.add(label2);
                Insets insets=panel1.getInsets();
                Dimension sizel1=label1.getPreferredSize();
                Dimension sizel2=label2.getPreferredSize();
                label1.setBounds(insets.left+30,insets.top,sizel1.width,sizel1.height);
                label2.setBounds(insets.left+30,insets.top+40,sizel2.width,sizel2.height);
                panel1.setBackground(Color.black);
                panel.add(panel1);
                
                panel2=new JPanel(new GridLayout(4,4));
                panel2.setLayout(null);
                panel2.add(label3);
                panel2.add(label4);
                insets=panel1.getInsets();
                Dimension sizel3=label3.getPreferredSize();
                Dimension sizel4=label4.getPreferredSize();
                label3.setBounds(insets.left+30,insets.top,sizel3.width,sizel3.height);
                label4.setBounds(insets.left+30,insets.top+40,sizel4.width,sizel4.height);
                panel1.setBackground(Color.black);
                panel.add(panel2);
                
                panel3=new JPanel(new GridLayout(4,4));
                panel3.setLayout(null);
                panel3.add(label8);
                panel3.add(label5);
                insets=panel3.getInsets();
                Dimension sizel8=label8.getPreferredSize();
                Dimension sizel5=label5.getPreferredSize();
                label8.setBounds(insets.left+30,insets.top,sizel8.width,sizel8.height);
                label5.setBounds(insets.left+30,insets.top+40,sizel5.width,sizel5.height);
                panel3.setBackground(Color.black);
                panel.add(panel3);
                
                panel4=new JPanel(new GridLayout(4,4));
                panel4.setLayout(null);
                panel4.add(label6);
                panel4.add(label7);
                insets=panel4.getInsets();
                Dimension sizel6=label6.getPreferredSize();
                Dimension sizel7=label7.getPreferredSize();
                label6.setBounds(insets.left+30,insets.top,sizel6.width,sizel6.height);
                label7.setBounds(insets.left+30,insets.top+40,sizel7.width,sizel7.height);
                panel4.setBackground(Color.black);
                panel.add(panel4);
                
                panel5=new JPanel(new GridLayout(4,4));
                panel5.setLayout(null);
                //panel5.add(label3);
                panel5.add(ok);
                insets=panel5.getInsets();
                Dimension sizeb1=ok.getPreferredSize();
                //Dimension sizel4=label4.getPreferredSize();
                ok.setBounds(insets.left+30,insets.top,sizeb1.width,sizeb1.height);
                //label4.setBounds(insets.left+30,insets.top+40,sizel2.width,sizel4.height);
                panel5.setBackground(Color.black);
                panel.add(panel5);
                panel.setBackground(Color.black);
                add(panel,BorderLayout.CENTER);
                setLocation(200,200);
                setSize(500,500);
                cancel.addActionListener(this);
                Inquiry.addActionListener(this);
                setVisible(true);
            }
            public void actionPerformed(ActionEvent ae) {
                String s1 =(String)ae.getActionCommand();
                String a[]=new String[20];
                // a[2]=text2.getText();
                
                System.out.println("yahan to thkee hai");
                if (s1.equals("Inquiry")) {
                    System.out.println("haan");
                    //  Employee1 e;
                    //  e.setFirstName(text3.getText());
                    //  this.inquiry_db(a[2]);
                }
                if (s1.equals("Cancel")) {
                    setVisible(false);
                    System.out.println("chu gaya");
                }
                
            }
        }
        
        JLabel label1, label2;
        final JTextField text2;
        JPanel panel;
        JButton Inquiry, cancel;
        makenewInquiry(){
            System.out.println("inquiry wala form");
            label1 = new JLabel();
            label1.setText("Welcome :Complaint Master");
            label2 = new JLabel();
            label2.setText("Alphanumeric Key: ");
            text2 = new JTextField(30);
            Inquiry=new JButton("Inquiry");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(6,5));
            panel.add(label1);
            panel.add(label2);
            panel.add(text2);
            panel.add(Inquiry);
            panel.add(cancel);
            add(panel,BorderLayout.CENTER);
            setLocation(200,200);
            setSize(500,500);
            Inquiry.addActionListener(this);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent ae) {
            String s1 =(String)ae.getActionCommand();
            String a[]=new String[20];
            a[2]=text2.getText();
            
            System.out.println("yahan to thkee hai");
            if (s1.equals("Inquiry")) {
                System.out.println("haan");
                //  Employee1 e;
                //  e.setFirstName(text3.getText());
                this.inquiry_db(a[2]);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("chu gaya");
            }
            
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
        public void inquiry_db(String a)
        {
            Connection con = getConnection();
            try {
                System.out.println(a);
                stmt = con.createStatement();
                String selectString = "select * from COMPLAINT_LETTER,COMPLAINT_ARTICLE";
                //where ALPHANUMERIC_KEY='"+a+"'";
                ResultSet reset = stmt.executeQuery(selectString);
                //  ResultSet reset1 = stmt.executeQuery(selectString1);
                System.out.println("yo!");
                //Print the data to the console
                String a1[];
                
                a1=new String[20];
                System.out.println("sdfs");
                while(reset.next()){
                    // System.out.println("exec");
                    System.out.println(reset.getString(6));
                    System.out.println(reset.getString(2));
                    if(a.equals(reset.getString(6))){
                        a3[0]=reset.getString(1);
                        a3[1]=reset.getString(2);
                        a3[2]=reset.getString(3);
                        a3[3]=reset.getString(4);
                        a3[4]=reset.getString(5);
                        a3[5]=reset.getString(6);
                        a3[6]=reset.getString(7);
                        break;
                    }
                    if(a.equals(reset.getString(13))){
                        a3[0]=reset.getString(8);
                        a3[1]=reset.getString(9);
                        a3[2]=reset.getString(10);
                        a3[3]=reset.getString(11);
                        a3[4]=reset.getString(12);
                        a3[5]=reset.getString(13);
                        a3[6]=reset.getString(14);
                        break;
                    }
                    
                    //System.out.println(reset.getString(2));
                }
                stmt.close();
                con.close();
                makenewInquiryForm a2=new makenewInquiryForm();
                } catch(SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
        }
    }
    class makedisplayall extends JFrame implements ActionListener{
        class PrintModule extends JFrame implements ActionListener{
            JLabel label1, label2, label3 , label4, label5, label6, label7, label8;
            JPanel panel;
            JButton ok;
            String s1[]=new String[20];
            PrintModule(String s){
                
                System.out.println("display all form");
                String url = " jdbc:odbc:student ";
                String tmp="\n";
                try {
                    
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                    Statement stmt = con.createStatement();
                    Statement stmt1 = con.createStatement();
                    String selectString = "select * from COMPLAINT_LETTER";
                    ResultSet reset = stmt.executeQuery(selectString);
                    //Print the data to the console
                    while(reset.next()){
                        if(s.equals(reset.getString(6))){
                            // tmp=tmp+"  "+reset.getString(6)+"\n\n\n";
                            s1[0]=reset.getString(1);
                            s1[1]=reset.getString(2);
                            s1[2]=reset.getString(3);
                            s1[3]=reset.getString(4);
                            s1[4]=reset.getString(5);
                            s1[5]=reset.getString(6);
                            s1[6]=reset.getString(7);
                        }
                    }
                    stmt.close();
                    
                    String selectString1= "select * from COMPLAINT_ARTICLE";
                    ResultSet reset1= stmt1.executeQuery(selectString1);
                    
                    //Print the data to the console
                    while(reset1.next()){
                        if(s.equals(reset1.getString(6))){
                            // tmp=tmp+"  "+reset.getString(6)+"\n\n\n";
                            s1[0]=reset1.getString(1);
                            s1[1]=reset1.getString(2);
                            s1[2]=reset1.getString(3);
                            s1[3]=reset1.getString(4);
                            s1[4]=reset1.getString(5);
                            s1[5]=reset1.getString(6);
                            s1[6]=reset1.getString(7);
                        }
                        //  tmp1=tmp1+"  "+reset1.getString(6)+"\n\n\n";
                    }
                    stmt1.close();
                    
                }
                catch( Exception e ) {
                    e.printStackTrace();
                }label1 = new JLabel();
                
                label1.setText("Details:");
                label2 = new JLabel();
                label2.setText("Name: " + s1[0]);
                // System.out.println(a3[0]+a3[1]+a3[2]+a3[3]+a3[4]+a3[5]+a3[6]+"here");
                //  text2 = new JTextField(30);
                
                label3=new JLabel();
                label4=new JLabel();
                label5=new JLabel();
                label6=new JLabel();
                label7=new JLabel();
                label8=new JLabel();
                
                label3.setText("Address: " + s1[1]);
                // text3 = new JTextField(30);
                label4.setText("Type: " + s1[2]);
                // text2 = new JTextField(30);
                label8.setText("Color: " + s1[3]);
                // text2 = new JTextField(30);
                label5.setText("Pin code: " + s1[4]);
                // text2 = new JTextField(30);
                label6.setText("Alphanumric Key: " + s1[5]);
                // text2 = new JTextField(30);
                label7.setText("Status: " + s1[6]);
                // text2 = new JTextField(30);
                ok=new JButton("Okay");
                //  cancel=new JButton("Cancel");
                panel=new JPanel(new GridLayout(6,5));
                panel.add(label1);
                panel.add(label2);
                panel.add(label3);
                panel.add(label4);
                panel.add(label5);
                panel.add(label6);
                panel.add(label7);
                panel.add(label8);
                // panel.add(text2);
                panel.add(ok);
                // panel.add(cancel);
                add(panel,BorderLayout.CENTER);
                setLocation(200,200);
                setSize(500,500);
                ok.addActionListener(this);
                setVisible(true);
            }
            public void actionPerformed(ActionEvent ae){
                String s=(String)ae.getActionCommand();
                if(s.equals("Okay")){
                    setVisible(false);
                }
            }
        }
        JLabel label1, label2, label3, label4, label5;
        final JTextField text2;
        JPanel panel;
        JButton Inquiryparticular, cancel;
        makedisplayall(){
            System.out.println("display all form");
            String url = " jdbc:odbc:student ";
            String tmp="\n";
            String tmp1="\n";
            try {
                
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:student","oom","123");
                Statement stmt = con.createStatement();
                String selectString = "select * from COMPLAINT_LETTER";
                ResultSet reset = stmt.executeQuery(selectString);
                
                //Print the data to the console
                while(reset.next()){
                    tmp=tmp+"  "+reset.getString(6)+"\n\n\n";
                }
                
                String selectString1= "select * from COMPLAINT_ARTICLE";
                ResultSet reset1= stmt.executeQuery(selectString1);
                
                //Print the data to the console
                while(reset1.next()){
                    tmp1=tmp1+"  "+reset1.getString(6)+"\n\n\n";
                }
                
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
            
            label1 = new JLabel();
            label1.setText("Alphanumeric Key of Lost Letter Complaints: ");
            label2 = new JLabel();
            label2.setText(tmp);
            label3 = new JLabel();
            label4 = new JLabel("Alphanumeric Key of Lost Article Complaints");
            label5 = new JLabel();
            label5.setText(tmp1);
            System.out.println(tmp + tmp1);
            label3.setText("Enter alphanumeric key");
            text2 = new JTextField(30);
            Inquiryparticular=new JButton("Enter");
            cancel=new JButton("Cancel");
            panel=new JPanel(new GridLayout(6,5));
            panel.add(label1);
            panel.add(label2);
            panel.add(label4);
            panel.add(label5);
            panel.add(label3);
            panel.add(text2);
            panel.add(Inquiryparticular);
            panel.add(cancel);
            add(panel,BorderLayout.CENTER);
            setLocation(200,200);
            setSize(500,500);
            Inquiryparticular.addActionListener(this);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent ae) {
            String s1 =(String)ae.getActionCommand();
            String a2;
            a2=text2.getText();
            System.out.println("yahan to thkee hai");
            if (s1.equals("Enter")) {
                System.out.println("haan clicked on Inquiry Particular one");
                PrintModule p=new PrintModule(a2);
                
                //  Employee1 e;
                //  e.setFirstName(text3.getText());
                // this.inquiry_db(a[2]);
            }
            if (s1.equals("Cancel")) {
                setVisible(false);
                System.out.println("chu gaya");
            }
            
        }
        
        
    }
    public void makeRegistrationLetter(){
        String s1="LetterComplaint";
        makeNewRegistrationLetter a=new makeNewRegistrationLetter(s1);
    }
    public void makeRegistrationArticle(){
        String s1="ArticleComplaint";
        makeNewRegistrationArticle a=new makeNewRegistrationArticle(s1);
    }
    public void makeInquiry(){
        System.out.println("exec12");
        makenewInquiry a = new makenewInquiry();
    }
    public void displayall(){
        System.out.println("display all func");
        makedisplayall a= new makedisplayall();
    }
    public void LetterReconcillation(){
        
    }
    public void ArticleReconcillation()
    {
        
    }
}
