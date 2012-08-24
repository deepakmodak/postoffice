package postoffice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class Admin extends JFrame implements ActionListener {
    JButton reg, mod, inq, can;
    JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6, panel7;
    JLabel label1, label2, label3, label4, label5, label6;
    JButton nlm, nam, ncm;
    
    JButton logout;
    Admin(Employee1 e) {
        
        label1 = new JLabel();
        label1.setText("Welcome : Admin");
        Font font = new Font("Serif", Font.BOLD, 20);
        label1.setFont(font);
        label1.setForeground(Color.WHITE);
        label2 = new JLabel();
        label2.setText("Goodname : " + e.getFirstName());
        //font = new Font("Serif", Font.BOLD, 20);
        label2.setFont(font);
        label2.setForeground(Color.WHITE);
        label3 = new JLabel();
        label3.setText("Age : " + e.getAge());
        label3.setFont(font);
        label3.setForeground(Color.WHITE);
        label4 = new JLabel();
        label4.setText("Email_ID : " + e.getEmail_Id());
        label4.setFont(font);
        label4.setForeground(Color.WHITE);
        label5 = new JLabel();
        label5.setText("Address : " + e.getAddress());
        label5.setFont(font);
        label5.setForeground(Color.WHITE);
        label6 = new JLabel();
        label6.setText("Sex : " + e.getSex());
        label6.setFont(font);
        label6.setForeground(Color.WHITE);
        
        
        nlm = new JButton("New Lost Letter Master");
        nam = new JButton("New Article Letter Master");
        ncm = new JButton("New Complain Master");
        logout = new JButton("Logout");
        panel = new JPanel(new GridLayout(6, 5));
        
        
        panel1 = new JPanel(new GridLayout(4, 4));
        panel1.setLayout(null);
        panel1.add(label1);
        Insets insets = panel1.getInsets();
        Dimension sizel1 = label1.getPreferredSize();
        label1.setBounds(insets.left + 180, insets.top + 20, sizel1.width, sizel1.height);
        panel1.setBackground(Color.black);
        panel.add(panel1);
        
        panel2 = new JPanel(new GridLayout(4, 4));
        panel2.setLayout(null);
        panel2.add(label2);
        panel2.add(label3);
        insets = panel2.getInsets();
        
        Dimension sizel2 = label2.getPreferredSize();
        Dimension sizel3 = label3.getPreferredSize();
        label2.setBounds(insets.left + 40, insets.top, sizel2.width, sizel2.height);
        label3.setBounds(insets.left + 40, insets.top + 40, sizel3.width, sizel3.height);
        panel2.setBackground(Color.black);
        panel.add(panel2);
        
        panel3 = new JPanel(new GridLayout(4, 4));
        panel3.setLayout(null);
        panel3.add(label4);
        panel3.add(label5);
        //panel3.add(label6);
        insets = panel3.getInsets();
        Dimension sizel4 = label4.getPreferredSize();
        Dimension sizel5 = label5.getPreferredSize();
        //Dimension sizel6=label6.getPreferredSize();
        label4.setBounds(insets.left + 40, insets.top, sizel4.width, sizel4.height);
        label5.setBounds(insets.left + 40, insets.top + 40, sizel5.width, sizel5.height);
        //label6.setBounds(insets.left+40,insets.top+70,sizel4.width,sizel4.height);
        
        panel3.setBackground(Color.black);
        panel.add(panel3);
        
        
        panel4 = new JPanel(new GridLayout(4, 4));
        panel4.setLayout(null);
        
        panel4.add(label6);
        insets = panel3.getInsets();
        Dimension sizel6 = label6.getPreferredSize();
        
        label6.setBounds(insets.left + 40, insets.top, sizel6.width, sizel6.height);
        
        panel4.setBackground(Color.black);
        panel.add(panel4);
        
        panel5 = new JPanel(new GridLayout(4, 4));
        panel5.setLayout(null);
        panel5.add(nlm);
        panel5.add(nam);
        panel5.add(ncm);
        panel5.add(logout);
        
        ButtonGroup group = new ButtonGroup();
        group.add(nlm);
        group.add(nam);
        group.add(ncm);
        group.add(logout);
        //panel3.add(label6);
        insets = panel3.getInsets();
        Dimension sizeb1 = nlm.getPreferredSize();
        Dimension sizeb2 = nam.getPreferredSize();
        Dimension sizeb3 = ncm.getPreferredSize();
        Dimension sizeb4 = logout.getPreferredSize();
        
        //Dimension sizel6=label6.getPreferredSize();
        nlm.setBounds(insets.left + 20, insets.top + 0, sizeb1.width, sizeb1.height);
        nam.setBounds(insets.left + 210, insets.top + 0, sizeb2.width, sizeb2.height);
        ncm.setBounds(insets.left + 410, insets.top + 0, sizeb3.width, sizeb3.height);
        logout.setBounds(insets.left + 240, insets.top + 40, sizeb4.width + 0, sizeb4.height + 0);
        panel5.setBackground(Color.black);
        panel.add(panel5);
        
        add(panel, BorderLayout.CENTER);
        setLocation(300, 100);
        setSize(600, 550);
        
        nlm.addActionListener(this);
        ncm.addActionListener(this);
        nam.addActionListener(this);
        logout.addActionListener(this);
        
        setTitle("Admin");
        panel.setBackground(Color.black);
        
        
        } public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("New Lost Letter Master")) {
            // super.setVisible(false);
            System.out.println("yo!");
            UserMaster a = new UserMaster();
            a.makeNewLetterMaster();
            // UserMaster.makeNewRegistration.setvisible(true);
        }
        if (s.equals("New Article Letter Master")) {
            UserMaster a = new UserMaster();
            a.makeNewArticleMaster();
        }
        if (s.equals("New Complain Master")) {
            System.out.println("sanjeev ka aur");
            UserMaster a = new UserMaster();
            a.makeNewComplainMaster();
        }
        if (s.equals("Logout")) {
            setVisible(false);
            //  Login new1 = new1 Login();
            
        }
        
    }
}

class Lostarticle extends JFrame implements ActionListener {
    JButton reg, mod, inq, can, logout;
    JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label0, label10;
    
    Lostarticle(Employee1 e) {
        label0 = new JLabel();
        label0.setText("Welcome: ");
        Font font = new Font("Serif", Font.BOLD, 20);
        label0.setFont(font);
        label0.setForeground(Color.WHITE);
        
        label10 = new JLabel();
        label10.setText("LostArticleMaster");
        font = new Font("Serif", Font.BOLD, 20);
        label10.setFont(font);
        label10.setForeground(Color.WHITE);
        label1 = new JLabel();
        label1.setText("First Name  " + e.getFirstName());
        font = new Font("Serif", Font.BOLD, 20);
        label1.setFont(font);
        label1.setForeground(Color.WHITE);
        //create another label using data base
        
        
        label3 = new JLabel();
        label3.setText("Email Address  " + e.getEmail_Id());
        font = new Font("Serif", Font.BOLD, 20);
        label3.setFont(font);
        label3.setForeground(Color.WHITE);
        label7 = new JLabel();
        label7.setText("Location  " + e.getAddress());
        font = new Font("Serif", Font.BOLD, 20);
        label7.setFont(font);
        label7.setForeground(Color.WHITE);
        label8 = new JLabel();
        label8.setText("Age " + e.getAge());
        font = new Font("Serif", Font.BOLD, 20);
        label8.setFont(font);
        label8.setForeground(Color.WHITE);
        label9 = new JLabel();
        label9.setText("Sex  " + e.getSex());
        font = new Font("Serif", Font.BOLD, 20);
        label9.setFont(font);
        label9.setForeground(Color.WHITE);
        reg = new JButton("Register an Entry");
        
        inq = new JButton("Inquiry abt an Entry");
        can = new JButton("Cancel an Entry");
        logout = new JButton("Logout");
        panel = new JPanel(new GridLayout(6, 5));
        
        panel1 = new JPanel(new GridLayout(4, 4));
        panel1.setLayout(null);
        panel1.add(label0);
        panel1.add(label10);
        Insets insets = panel1.getInsets();
        
        Dimension sizel0 = label0.getPreferredSize();
        Dimension sizel10 = label10.getPreferredSize();
        label0.setBounds(insets.left + 40, insets.top, sizel0.width, sizel0.height);
        label10.setBounds(insets.left + 40, insets.top + 40, sizel10.width, sizel10.height);
        panel1.setBackground(Color.black);
        panel.add(panel1);
        
        panel2 = new JPanel(new GridLayout(4, 4));
        panel2.setLayout(null);
        panel2.add(label1);
        panel2.add(label3);
        insets = panel2.getInsets();
        
        Dimension sizel1 = label1.getPreferredSize();
        Dimension sizel3 = label3.getPreferredSize();
        label1.setBounds(insets.left + 40, insets.top, sizel0.width, sizel1.height);
        label3.setBounds(insets.left + 40, insets.top + 40, sizel10.width, sizel3.height);
        panel2.setBackground(Color.black);
        panel.add(panel2);
        
        panel3 = new JPanel(new GridLayout(4, 4));
        panel3.setLayout(null);
        panel3.add(label7);
        panel3.add(label8);
        insets = panel3.getInsets();
        
        Dimension sizel7 = label7.getPreferredSize();
        Dimension sizel8 = label8.getPreferredSize();
        label7.setBounds(insets.left + 40, insets.top, sizel7.width, sizel7.height);
        label8.setBounds(insets.left + 40, insets.top + 40, sizel8.width, sizel8.height);
        panel3.setBackground(Color.black);
        panel.add(panel3);
        
        panel4 = new JPanel(new GridLayout(4, 4));
        panel4.setLayout(null);
        panel4.add(label9);
        //panel4.add(label10);
        insets = panel4.getInsets();
        
        Dimension sizel9 = label9.getPreferredSize();
        //Dimension sizel1=label10.getPreferredSize();
        label9.setBounds(insets.left + 40, insets.top, sizel9.width, sizel9.height);
        //label10.setBounds(insets.left+40,insets.top+40,sizel10.width,sizel10.height);
        panel4.setBackground(Color.black);
        panel.add(panel4);
        
        panel5 = new JPanel(new GridLayout(4, 4));
        panel5.setLayout(null);
        //panel5.add(label0);
        panel5.add(reg);
        panel5.add(logout);
        insets = panel5.getInsets();
        
        Dimension sizeb1 = reg.getPreferredSize();
        Dimension sizeb2 = logout.getPreferredSize();
        reg.setBounds(insets.left + 40, insets.top, sizeb1.width, sizeb1.height);
        logout.setBounds(insets.left + 40, insets.top + 40, sizeb2.width, sizeb2.height);
        panel5.setBackground(Color.black);
        panel.add(panel5);
        
        
        add(panel, BorderLayout.CENTER);
        setLocation(200, 200);
        setSize(500, 500);
        
        
        
        reg.addActionListener(this);
        logout.addActionListener(this);
        //inq.addActionListener(a);
        //can.addActionListener(a);
        setTitle("Lost Article");
        
        
    }
    //class MyActionListenerLostArticle implements ActionListener { public void actionPerformed(ActionEvent ae) {
            String s = ae.getActionCommand();
            if (s.equals("Register an Entry")) {
                System.out.println("MYActionListenerLostArticle");
                LostAricleMaster a = new LostAricleMaster();
                a.makeNewArticleRegistration();
                
            }
            if (s.equals("Logout")) {
                this.setVisible(false);
            }
            
        }
    }
    
    class Lostletter extends JFrame implements ActionListener {
        JButton reg, mod, inq, can, logout;
        JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label0, label10;
        
        Lostletter(Employee1 e) {
            
            
            //  ActionListener a = new MyActionListenerAdmin();
            label0 = new JLabel();
            label0.setText("Welcome: ");
            Font font = new Font("Serif", Font.BOLD, 20);
            label0.setFont(font);
            label0.setForeground(Color.WHITE);
            
            label10 = new JLabel();
            label10.setText("LostLetterMaster");
            font = new Font("Serif", Font.BOLD, 20);
            label10.setFont(font);
            label10.setForeground(Color.WHITE);
            label1 = new JLabel();
            label1.setText("First Name  " + e.getFirstName());
            font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            //create another label using data base
            
            
            label3 = new JLabel();
            label3.setText("Email Address  " + e.getEmail_Id());
            font = new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            label7 = new JLabel();
            label7.setText("Location  " + e.getAddress());
            font = new Font("Serif", Font.BOLD, 20);
            label7.setFont(font);
            label7.setForeground(Color.WHITE);
            label8 = new JLabel();
            label8.setText("Age " + e.getAge());
            font = new Font("Serif", Font.BOLD, 20);
            label8.setFont(font);
            label8.setForeground(Color.WHITE);
            label9 = new JLabel();
            label9.setText("Sex  " + e.getSex());
            font = new Font("Serif", Font.BOLD, 20);
            label9.setFont(font);
            label9.setForeground(Color.WHITE);
            reg = new JButton("Letter Entry");
            logout = new JButton("Logout");
            //inq=new JButton("Inquiry abt an Entry");
            //can=new JButton("Cancel an Entry");
            
            panel = new JPanel(new GridLayout(6, 5));
            panel1 = new JPanel(new GridLayout(4, 4));
            panel1.setLayout(null);
            panel1.add(label0);
            panel1.add(label10);
            Insets insets = panel1.getInsets();
            
            Dimension sizel0 = label0.getPreferredSize();
            Dimension sizel10 = label10.getPreferredSize();
            label0.setBounds(insets.left + 40, insets.top, sizel0.width, sizel0.height);
            label10.setBounds(insets.left + 40, insets.top + 40, sizel10.width, sizel10.height);
            panel1.setBackground(Color.black);
            panel.add(panel1);
            
            panel2 = new JPanel(new GridLayout(4, 4));
            panel2.setLayout(null);
            panel2.add(label1);
            panel2.add(label3);
            insets = panel2.getInsets();
            
            Dimension sizel1 = label1.getPreferredSize();
            Dimension sizel3 = label3.getPreferredSize();
            label1.setBounds(insets.left + 40, insets.top, sizel1.width, sizel1.height);
            label3.setBounds(insets.left + 40, insets.top + 40, sizel3.width, sizel3.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            panel3 = new JPanel(new GridLayout(4, 4));
            panel3.setLayout(null);
            panel3.add(label7);
            panel3.add(label8);
            insets = panel3.getInsets();
            
            Dimension sizel7 = label7.getPreferredSize();
            Dimension sizel8 = label8.getPreferredSize();
            label7.setBounds(insets.left + 40, insets.top, sizel7.width, sizel7.height);
            label8.setBounds(insets.left + 40, insets.top + 40, sizel8.width, sizel8.height);
            panel3.setBackground(Color.black);
            panel.add(panel3);
            
            panel4 = new JPanel(new GridLayout(4, 4));
            panel4.setLayout(null);
            panel4.add(label9);
            //panel4.add(label10);
            insets = panel4.getInsets();
            
            Dimension sizel9 = label9.getPreferredSize();
            //Dimension sizel1=label10.getPreferredSize();
            label7.setBounds(insets.left + 40, insets.top, sizel7.width, sizel7.height);
            //label10.setBounds(insets.left+40,insets.top+40,sizel10.width,sizel10.height);
            panel4.setBackground(Color.black);
            panel.add(panel4);
            
            panel5 = new JPanel(new GridLayout(4, 4));
            panel5.setLayout(null);
            panel5.add(reg);
            panel5.add(logout);
            insets = panel5.getInsets();
            
            Dimension sizeb1 = reg.getPreferredSize();
            Dimension sizeb2 = logout.getPreferredSize();
            reg.setBounds(insets.left + 40, insets.top, sizeb1.width, sizeb1.height);
            logout.setBounds(insets.left + 40, insets.top + 40, sizeb2.width, sizeb2.height);
            panel5.setBackground(Color.black);
            panel.add(panel5);
            add(panel, BorderLayout.CENTER);
            setLocation(300, 100);
            setSize(600, 550);
            //ActionListener a = new MyActionListenerLostLetter();
            
            //  add(panel,BorderLayout.CENTER);
            reg.addActionListener(this);
            logout.addActionListener(this);
            //nam.addActionListener(a);
            
            //  setTitle("Admin");
            panel.setBackground(Color.black);
            
            setTitle("Lost letter");
            
            
            
        }
    //}//class MyActionListenerLostLetter implements ActionListener { public void actionPerformed(ActionEvent ae) {
            String s = ae.getActionCommand();
            if (s.equals("Letter Entry")) {
                LostLetterMaster a = new LostLetterMaster();
                a.makeNewLetterRegistration();
            }
            if (s.equals("Logout")) {
                this.setVisible(false);
            }
        }
    }
    
    class Complaint_Master extends JFrame implements ActionListener {
        JButton reg_article, reg_letter, mod, inq, can, listall;
        JPanel panel, panel1, panel2, panel3, panel4, panel5;
        JButton logout;
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label0, label10;
        Complaint_Master(Employee1 e) {
            
            label0 = new JLabel();
            label0.setText("Welcome: ");
            Font font = new Font("Serif", Font.BOLD, 20);
            label0.setFont(font);
            label0.setForeground(Color.WHITE);
            
            label10 = new JLabel();
            label10.setText("LostLetterMaster");
            font = new Font("Serif", Font.BOLD, 20);
            label10.setFont(font);
            label10.setForeground(Color.WHITE);
            label1 = new JLabel();
            label1.setText("First Name  " + e.getFirstName());
            font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            //create another label using data base
            
            
            label3 = new JLabel();
            label3.setText("Email Address  " + e.getEmail_Id());
            font = new Font("Serif", Font.BOLD, 20);
            label3.setFont(font);
            label3.setForeground(Color.WHITE);
            label7 = new JLabel();
            label7.setText("Location  " + e.getAddress());
            font = new Font("Serif", Font.BOLD, 20);
            label7.setFont(font);
            label7.setForeground(Color.WHITE);
            label8 = new JLabel();
            label8.setText("Age " + e.getAge());
            font = new Font("Serif", Font.BOLD, 20);
            label8.setFont(font);
            label8.setForeground(Color.WHITE);
            label9 = new JLabel();
            label9.setText("Sex  " + e.getSex());
            font = new Font("Serif", Font.BOLD, 20);
            
            reg_article = new JButton("Register an Article Complaint");
            reg_letter = new JButton("Register a Letter Complaint");
            inq = new JButton("Inquiry");
            can = new JButton("Cancel");
            listall = new JButton("List all complaints");
            logout = new JButton("Logout");
            
            panel = new JPanel(new GridLayout(6, 5));
            
            panel1 = new JPanel(new GridLayout(4, 4));
            panel1.setLayout(null);
            panel1.add(label0);
            panel1.add(label10);
            Insets insets = panel1.getInsets();
            
            Dimension sizel0 = label0.getPreferredSize();
            Dimension sizel10 = label10.getPreferredSize();
            label0.setBounds(insets.left + 40, insets.top, sizel0.width, sizel0.height);
            label10.setBounds(insets.left + 40, insets.top + 40, sizel10.width, sizel10.height);
            panel1.setBackground(Color.black);
            panel.add(panel1);
            
            panel2 = new JPanel(new GridLayout(4, 4));
            panel2.setLayout(null);
            panel2.add(label1);
            panel2.add(label3);
            insets = panel2.getInsets();
            
            Dimension sizel1 = label1.getPreferredSize();
            Dimension sizel3 = label3.getPreferredSize();
            label1.setBounds(insets.left + 40, insets.top, sizel1.width, sizel1.height);
            label3.setBounds(insets.left + 40, insets.top + 40, sizel3.width, sizel3.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            panel3 = new JPanel(new GridLayout(4, 4));
            panel3.setLayout(null);
            panel3.add(label7);
            panel3.add(label8);
            insets = panel3.getInsets();
            
            Dimension sizel7 = label7.getPreferredSize();
            Dimension sizel8 = label8.getPreferredSize();
            label7.setBounds(insets.left + 40, insets.top, sizel7.width, sizel7.height);
            label8.setBounds(insets.left + 40, insets.top + 40, sizel8.width, sizel8.height);
            panel3.setBackground(Color.black);
            panel.add(panel3);
            
            panel4 = new JPanel(new GridLayout(4, 4));
            panel4.setLayout(null);
            panel4.add(label9);
            //panel4.add(label10);
            insets = panel4.getInsets();
            
            Dimension sizel9 = label9.getPreferredSize();
            //Dimension sizel1=label10.getPreferredSize();
            label9.setBounds(insets.left + 40, insets.top, sizel9.width, sizel9.height);
            //label10.setBounds(insets.left+40,insets.top+40,sizel10.width,sizel10.height);
            panel4.setBackground(Color.black);
            panel.add(panel4);
            
            
            ButtonGroup group = new ButtonGroup();
            group.add(reg_article);
            group.add(reg_letter);
            group.add(inq);
            group.add(can);
            group.add(listall);
            group.add(logout);
            panel5 = new JPanel(new GridLayout(4, 4));
            panel5.setLayout(null);
            panel5.add(reg_article);
            panel5.add(reg_letter);
            panel5.add(inq);
            panel5.add(can);
            panel5.add(listall);
            panel5.add(logout);
            insets = panel5.getInsets();
            
            Dimension sizeb1 = reg_article.getPreferredSize();
            Dimension sizeb2 = reg_letter.getPreferredSize();
            Dimension sizeb3 = inq.getPreferredSize();
            Dimension sizeb4 = can.getPreferredSize();
            Dimension sizeb5 = listall.getPreferredSize();
            Dimension sizeb6 = logout.getPreferredSize();
            //Dimension sizel=label10.getPreferredSize();
            reg_article.setBounds(insets.left + 10, insets.top, sizeb1.width, sizeb1.height);
            reg_letter.setBounds(insets.left + 240, insets.top, sizeb2.width, sizeb2.height);
            inq.setBounds(insets.left + 460, insets.top, sizeb3.width, sizeb3.height);
            can.setBounds(insets.left + 560, insets.top, sizeb4.width, sizeb4.height);
            listall.setBounds(insets.left + 650, insets.top, sizeb5.width, sizeb5.height);
            logout.setBounds(insets.left + 820, insets.top, sizeb6.width, sizeb6.height);
            //label10.setBounds(insets.left+40,insets.top+40,sizel10.width,sizel10.height);
            panel5.setBackground(Color.black);
            panel.add(panel5);
            //  ActionListener a = new MyActionListenerComplaintMaster();
            panel.setBackground(Color.black);
            add(panel, BorderLayout.CENTER);
            setLocation(100, 00);
            setSize(1000, 1000);
            
            reg_article.addActionListener(this);
            reg_letter.addActionListener(this);
            inq.addActionListener(this);
            can.addActionListener(this);
            listall.addActionListener(this);
            logout.addActionListener(this);
            setTitle("COMPLAINT MASTER");
            
            
            
            
        }
    //}//class MyActionListenerComplaintMaster implements ActionListener { public void actionPerformed(ActionEvent ae) {
            String s = ae.getActionCommand();
            if (s.equals("Register an Article Complaint")) {
                ComplaintMaster a;
                a = new ComplaintMaster();
                a.makeRegistrationArticle();
            }
            if (s.equals("Register a Letter Complaint")) {
                ComplaintMaster a = new ComplaintMaster();
                a.makeRegistrationLetter();
            }
            if (s.equals("Inquiry")) {
                ComplaintMaster a = new ComplaintMaster();
                a.makeInquiry();
                
            }
            if (s.equals("List all complaints")) {
                ComplaintMaster a = new ComplaintMaster();
                a.displayall();
                
            }
            
            if (s.equals("Cancel")) {
                this.setVisible(false);
            }
            if (s.equals("Logout")) {
                this.setVisible(false);
            }
        }
    }
    
    class Login extends JFrame implements ActionListener {
        class changepassword extends JFrame implements ActionListener {
            JButton change, cancel;
            JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6;
            JLabel label1, label2, label3;
            //JRadioButton rb1,rb2;
            JButton enter;
            final JTextField text1;
            final JPasswordField text2, text3, text4;
            changepassword() {
                label1 = new JLabel();
                label1.setText("Username:");
                Font font = new Font("Serif", Font.BOLD, 20);
                label1.setFont(font);
                label1.setForeground(Color.WHITE);
                text1 = new JTextField(15);
                
                label2 = new JLabel();
                label2.setText("Old Password:");
                font = new Font("Serif", Font.BOLD, 20);
                label2.setFont(font);
                label2.setForeground(Color.WHITE);
                text2 = new JPasswordField(15);
                
                label3 = new JLabel();
                label3.setText("New Password:");
                font = new Font("Serif", Font.BOLD, 20);
                label3.setFont(font);
                label3.setForeground(Color.WHITE);
                text3 = new JPasswordField(15);
                
                label4 = new JLabel();
                label4.setText("Confirm Password:");
                font = new Font("Serif", Font.BOLD, 20);
                label4.setFont(font);
                label4.setForeground(Color.WHITE);
                text4 = new JPasswordField(15);
                
                enter = new JButton("SUBMIT");
                panel = new JPanel(new GridLayout(6, 5));
                
                
                panel1 = new JPanel(new GridLayout(4, 4));
                panel1.setLayout(null);
                panel1.add(label1);
                panel1.add(text1);
                Insets insets = panel1.getInsets();
                Dimension sizel1 = label1.getPreferredSize();
                Dimension sizet1 = label1.getPreferredSize();
                label1.setBounds(insets.left + 30, insets.top + 10, sizel1.width, sizel1.height);
                text1.setBounds(insets.left + 210, insets.top + 10, sizet1.width + 120, sizet1.height);
                panel1.setBackground(Color.black);
                panel.add(panel1);
                
                panel2 = new JPanel(new GridLayout(4, 4));
                panel2.setLayout(null);
                panel2.add(label2);
                panel2.add(text2);
                insets = panel2.getInsets();
                Dimension sizel2 = label2.getPreferredSize();
                Dimension sizet2 = text2.getPreferredSize();
                label2.setBounds(insets.left + 30, insets.top, sizel2.width, sizel2.height);
                text2.setBounds(insets.left + 210, insets.top, sizet2.width + 120, sizet2.height);
                panel2.setBackground(Color.black);
                panel.add(panel2);
                
                panel3 = new JPanel(new GridLayout(4, 4));
                panel3.setLayout(null);
                panel3.add(label3);
                panel3.add(text3);
                insets = panel3.getInsets();
                Dimension sizel3 = label3.getPreferredSize();
                Dimension sizet3 = text3.getPreferredSize();
                label3.setBounds(insets.left + 30, insets.top, sizel3.width, sizel3.height);
                text3.setBounds(insets.left + 210, insets.top, sizet3.width + 120, sizet3.height);
                panel3.setBackground(Color.black);
                panel.add(panel3);
                
                panel4 = new JPanel(new GridLayout(4, 4));
                panel4.setLayout(null);
                panel4.add(label4);
                panel4.add(text4);
                insets = panel4.getInsets();
                Dimension sizel4 = label4.getPreferredSize();
                Dimension sizet4 = text4.getPreferredSize();
                label4.setBounds(insets.left + 30, insets.top, sizel4.width, sizel4.height);
                text4.setBounds(insets.left + 210, insets.top, sizet4.width + 120, sizet4.height);
                panel4.setBackground(Color.black);
                panel.add(panel4);
                
                panel5 = new JPanel(new GridLayout(4, 4));
                panel5.setLayout(null);
                panel5.add(enter);
                insets = panel5.getInsets();
                Dimension sizel5 = enter.getPreferredSize();
                enter.setBounds(insets.left + 200, insets.top + 20, sizel5.width, sizel5.height);
                panel5.setBackground(Color.black);
                panel.add(panel5);
                
                enter.addActionListener(this);
                
                panel.setBackground(Color.black);
                add(panel, BorderLayout.CENTER);
                setLocation(300, 100);
                setSize(800, 550);
                
                //  enter.addActionListener(this);
                setVisible(true);
                } public void actionPerformed(ActionEvent ae) {
                String value1 = text1.getText();
                String value2 = text2.getText();
                String value3 = text3.getText();
                String value4 = text4.getText();
                String value5 = (String) ae.getActionCommand();
                if (value5.equals("SUBMIT")) {
                    if (!value3.equals(value4)) {
                        System.out.println("paswrd do nt match");
                        //  JOptionPane.showMessageDialog(null,"Passwords do not match","",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Main.class.getResource("loginfailed.jpg")));
                        JOptionPane.showMessageDialog(null, "", "Password do not match", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("passworderror.jpg")));
                        
                        return;
                        } else {
                        try {
                            
                            
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            Connection con = DriverManager.getConnection("jdbc:odbc:student", "oom", "123");
                            Statement stmt = con.createStatement();
                            
                            
                            String selectString = "select * from users "; //where username='"+value1+"' and password='"+value2+"'";
                            ResultSet reset = stmt.executeQuery(selectString);
                            int m = 0;
                            
                            while (reset.next()) {
                                if (value1.equals(reset.getString(1)) && value2.equals(reset.getString(2))) {
                                    m = 1;
                                    Statement smt1 = con.createStatement();
                                    String selectString1 = "update users set Password='" + value4 + "' where Username='" + value1 + "'";
                                    smt1.executeUpdate(selectString1);
                                    smt1.close();
                                    System.out.println("successful");
                                    JOptionPane.showMessageDialog(null, "Password Changed Successfully", "Password Changed Successfully", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                    
                                }
                                
                            }
                            stmt.close();
                            con.close();
                            if (m == 0) {
                                JOptionPane.showMessageDialog(null, "", "Wrong Username or Password", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("passworderror.jpg")));
                                System.out.println("wrng username or paswwrs");
                                return;
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        int randomInt = 0;
        JButton SUBMIT, REGISTER, CHANGE, FORGOT;
        JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6;
        JLabel label1, label2, label3, label4;
        JRadioButton rb1, rb2;
        final JTextField text1, text2, text3;
        Login() {
            
            label1 = new JLabel();
            label1.setText("Username:");
            Font font = new Font("Serif", Font.BOLD, 20);
            label1.setFont(font);
            label1.setForeground(Color.WHITE);
            
            text1 = new JTextField(15);
            
            label2 = new JLabel();
            label2.setText("Password:");
            text2 = new JPasswordField(15);
            
            label3 = new JLabel();
            label3.setText("WELCOME to myProject:");
            //Font font = new Font("Serif", Font.ITALIC, 20);
            label3.setFont(font);
            label3.setForeground(Color.RED);
            
            SUBMIT = new JButton();
            SUBMIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("red-envelope1.jpg")));
            //FORGOT=new JButton("Forgot Password?");
            CHANGE = new JButton("Change Password");
            
            panel = new JPanel(new GridLayout(6, 5));
            
            ImageIcon img = new ImageIcon(Main.class.getResource("post_box.jpg"));
            label4 = new JLabel(img);
            panel.add(label4);
            
            panel1 = new JPanel(new GridLayout(4, 4));
            panel1.setLayout(null);
            panel1.add(label3);
            Insets insets = panel1.getInsets();
            Dimension sizel3 = label3.getPreferredSize();
            label3.setBounds(insets.left + 180, insets.top + 20, sizel3.width, sizel3.height);
            panel1.setBackground(Color.black);
            panel.add(panel1);
            
            panel2 = new JPanel(new GridLayout(4, 4));
            panel2.setLayout(null);
            panel2.add(label1);
            panel2.add(text1);
            insets = panel2.getInsets();
            Dimension sizel1 = label1.getPreferredSize();
            Dimension sizet1 = label1.getPreferredSize();
            label1.setBounds(insets.left + 80, insets.top, sizel1.width, sizel1.height);
            text1.setBounds(insets.left + 210, insets.top, sizet1.width + 120, sizet1.height);
            panel2.setBackground(Color.black);
            panel.add(panel2);
            
            
            panel3 = new JPanel(new GridLayout(4, 4));
            panel3.setLayout(null);
            panel3.add(label2);
            panel3.add(text2);
            label2.setFont(font);
            label2.setForeground(Color.WHITE);
            insets = panel3.getInsets();
            Dimension sizel2 = label2.getPreferredSize();
            Dimension sizet2 = text2.getPreferredSize();
            label2.setBounds(insets.left + 80, insets.top, sizel2.width, sizel2.height);
            text2.setBounds(insets.left + 210, insets.top, sizet2.width + 40, sizet2.height + 5);
            panel3.setBackground(Color.black);
            panel.add(panel3);
            
            
            panel4 = new JPanel(new GridLayout(4, 4));
            panel4.setLayout(null);
            panel4.add(SUBMIT);
            panel4.add(CHANGE);
            insets = panel4.getInsets();
            Dimension sizeb1 = SUBMIT.getPreferredSize();
            Dimension sizeb2 = CHANGE.getPreferredSize();
            SUBMIT.setBounds(insets.left + 200, insets.top + 30, sizel3.width - 170, sizel3.height + 10);
            CHANGE.setBounds(insets.left + 350, insets.top + 30, sizel3.width - 90, sizel3.height);
            panel4.setBackground(Color.black);
            //panel.add(panel4);
            Random randomGenerator = new Random();
            // for (int idx = 1; idx &lt;= 10; ++idx){
                randomInt = randomGenerator.nextInt(10);
                ImageIcon img1 = new ImageIcon(Main.class.getResource("img/combscreck_1.jpg"));
                if (randomInt == 1) {
                    img1 = new ImageIcon(Main.class.getResource("img/combscreck_1.jpg"));
                    
                }
                if (randomInt == 2) {
                    img1 = new ImageIcon(Main.class.getResource("img/bledsmuto_2.jpg"));
                    
                }
                if (randomInt == 3) {
                    img1 = new ImageIcon(Main.class.getResource("img/trabilly_3.jpg"));
                    
                }
                if (randomInt == 4) {
                    img1 = new ImageIcon(Main.class.getResource("img/ebannint_4.jpg"));
                    
                }
                if (randomInt == 5) {
                    img1 = new ImageIcon(Main.class.getResource("img/dorph_5.jpg"));
                    
                }
                if (randomInt == 6) {
                    img1 = new ImageIcon(Main.class.getResource("img/vismicalyp_6.jpg"));
                    
                }
                if (randomInt == 7) {
                    img1 = new ImageIcon(Main.class.getResource("img/rescu_7.jpg"));
                    
                }
                if (randomInt == 8) {
                    img1 = new ImageIcon(Main.class.getResource("img/chroidend_8.jpg"));
                    
                }
                if (randomInt == 9) {
                    img1 = new ImageIcon(Main.class.getResource(" img/hicerati_9.jpg"));
                    
                }
                if (randomInt == 10) {
                    img1 = new ImageIcon(Main.class.getResource("img/hookey_10.jpg"));
                    
                }
                if (randomInt == 11) {
                    img1 = new ImageIcon(Main.class.getResource("img/copotstri_11.jpg"));
                    
                }
                //ImageIcon img1=new ImageIcon(Main.class.getResource("red-envelope1.jpg"));
                JLabel label20 = new JLabel(img1);
                text3 = new JTextField();
                JLabel label21 = new JLabel("Enter Verification Code");
                //panel.add(label20);
                label21.setFont(font);
                label21.setForeground(Color.RED);
                
                panel5 = new JPanel(new GridLayout(4, 4));
                panel5.setLayout(null);
                panel5.add(label21);
                panel5.add(label20);
                panel5.add(text3);
                insets = panel5.getInsets();
                Dimension sizel21 = label21.getPreferredSize();
                Dimension sizel20 = label20.getPreferredSize();
                Dimension sizet3 = text3.getPreferredSize();
                label21.setBounds(insets.left + 200, insets.top, sizel21.width, sizel21.height);
                label20.setBounds(insets.left + 50, insets.top + 40, sizel20.width, sizel20.height);
                text3.setBounds(insets.left + 350, insets.top + 40, sizet3.width + 150, sizet3.height);
                panel5.setBackground(Color.black);
                panel.add(panel5);
                panel.add(panel4);
                
                panel.setBackground(Color.black);
                add(panel, BorderLayout.CENTER);
                setLocation(300, 0);
                SUBMIT.addActionListener(this);
                CHANGE.addActionListener(this);
                //SUBMIT.enabled;
                //setEnabled(1);
                setTitle("MODERN POST_OFFICE");
                
            }
            public void actionPerformed(ActionEvent ae) {
                String value1 = text1.getText();
                String value2 = text2.getText();
                String value4 = text3.getText();
                String value3 = (String) ae.getActionCommand();
                if (value3.equals("Change Password")) {
                    changepassword ch = new changepassword();
                    // JOptionPane.showMessageDialog(null,"successfully changed","",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Main.class.getResource("loginfailed.jpg")));
                    
                    } else {
                    if (value1.equals("") || value2.equals("")) {
                        JOptionPane.showMessageDialog(null, "", "LoginRequired", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("loginrequired.jpg")));
                        return;
                    }
                    if (randomInt == 1) {
                        if (!value4.equals("combscreck")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 2) {
                        
                        if (!value4.equals("bledsmuto")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 3) {
                        
                        if (!value4.equals("trabilly")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 4) {
                        
                        if (!value4.equals("ebannint")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 5) {
                        
                        if (!value4.equals("dorph")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 6) {
                        
                        if (!value4.equals("vismicalyp")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 7) {
                        
                        if (!value4.equals("rescu")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 8) {
                        
                        if (!value4.equals("chroidend")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 9) {
                        
                        
                        if (!value4.equals("hicerati")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 10) {
                        
                        if (!value4.equals("hookey")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    if (randomInt == 11) {
                        
                        if (!value4.equals("copotstri ")) {
                            JOptionPane.showMessageDialog(null, "Wrong Verification Code", "", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                    
                    
                    try {
                        
                        
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        Connection con = DriverManager.getConnection("jdbc:odbc:student", "oom", "123");
                        Statement stmt = con.createStatement();
                        
                        
                        String selectString = "select * from users "; //where username='"+value1+"' and password='"+value2+"'";
                        ResultSet reset = stmt.executeQuery(selectString);
                        
                        int got = 0;
                        while (reset.next()) {
                            
                            
                            if (value1.equals(reset.getString(1)) && value2.equals(reset.getString(2))) {
                                
                                setVisible(false);
                                got++;
                                String type;
                                type = reset.getString(3);
                                value1 = reset.getString(4);
                                Employee1 e = new Employee1();
                                
                                e.setAge(reset.getString(14));
                                e.setEmail_Id(reset.getString(6));
                                e.setAddress(reset.getString(10));
                                e.setSex(reset.getString(5));
                                e.setFirstName(value1);
                                JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("login.jpg")));
                                
                                if (type.equals("1")) {
                                    Admin page = new Admin(e);
                                    //System.out.println(value1);
                                    page.setVisible(true);
                                }
                                
                                if (type.equals("2")) {
                                    Lostarticle page = new Lostarticle(e);
                                    page.setVisible(true);
                                }
                                if (type.equals("3")) {
                                    Lostletter page = new Lostletter(e);
                                    page.setVisible(true);
                                }
                                if (type.equals("4")) {
                                    Complaint_Master page = new Complaint_Master(e);
                                    page.setVisible(true);
                                    
                                }
                                
                            }
                            if (got &gt; 0) {
                                break;
                            }
                        }
                        if (got == 0) {
                            //JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
                            Toolkit.getDefaultToolkit().beep();
                            
                            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("loginfailed.jpg")));
                            
                            
                            
                        }
                        
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                    
                }
            }
        }
        
        public class Main {
            
            public static void main(String arg[]) {
                String url = " jdbc:odbc:student ";
                
                
                
                try {
                    Login frame = new Login();
                    frame.setSize(800, 750);
                    frame.setVisible(true);
                    //frame.setBounds(200,200,1800,1800);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //frame.pack();
                    
                    } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
                
            }
        }