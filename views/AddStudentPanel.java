package views;


import javax.swing.*;
import entity.Module;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddStudentPanel extends JPanel {

    JTextField studentIdFld, studentNameFld, emailAddressFld, yearOfStudyFld;
    JList displayerList = new JList();
    DefaultListModel listModel = new DefaultListModel();
    String[] moduleNames = new String[Menu.getController().getStudents().size()];
    JScrollPane scrollPane = new JScrollPane();
    
    public AddStudentPanel(){

        initGui();
       
        for (int i = 0; i < Menu.getController().getStudents().size(); i++){
            moduleNames[i] = Menu.getController().getStudent(i).getName();
            System.out.println(moduleNames[i]);
           
            listModel.addElement(moduleNames[i]);



        }
        displayerList.setModel(listModel);
        displayerList.setSelectedIndex(0);



    }


    public void initGui() {


        this.setLayout(null);
        JLabel label = new JLabel("     Fill up all fields below and click add.");
        
        studentIdFld = new JTextField();
        studentNameFld = new JTextField();
        emailAddressFld = new JTextField();
        yearOfStudyFld = new JTextField();

        JLabel studentIdLbl = new JLabel("Student ID:");
        JLabel studentNameLbl = new JLabel("Student's Name:");
        JLabel emailAddressLbl = new JLabel("Email Address:");
        JLabel yearOfStudyLbl = new JLabel("Year of study:");
        Font font = new Font("serif", Font.PLAIN, 15);
        JButton addBtn = new JButton("Add");
        JButton testBtn = new JButton("TEST");
        
       
 
        this.add(scrollPane);
        scrollPane.setViewportView(displayerList);
        
      
        scrollPane.setBounds(400, 170, 250, 230);
        scrollPane.setFont(font);




        testBtn.setBounds(300, 480, 200, 40);
        testBtn.setFont(font);

        // below is created somple layout all the numbers in parameters of setBounds
        // indicates the postion of components


        label.setBounds(140, 100, 400, 50);
        label.setIcon(new ImageIcon(getClass().getResource("/icons/person-plus-fill.png")));

        studentIdLbl.setBounds(50, 170, 200, 40);
        studentIdLbl.setFont(font);

        studentIdFld.setBounds(150, 170, 200, 40);
        studentIdFld.setFont(font);

        emailAddressFld.setBounds(150, 290, 200, 40);
        emailAddressFld.setFont(font);

        emailAddressLbl.setBounds(50, 290, 200, 40);
        emailAddressLbl.setFont(font);

        studentNameFld.setBounds(150, 230, 200, 40);
        studentNameFld.setFont(font);

        studentNameLbl.setBounds(50, 230, 200, 40);
        studentNameLbl.setFont(font);

        yearOfStudyFld.setBounds(150, 350, 200, 40);
        yearOfStudyFld.setFont(font);

        yearOfStudyLbl.setBounds(50, 350, 200, 40);
        yearOfStudyLbl.setFont(font);

        addBtn.setBounds(300, 420, 200, 40);
        addBtn.setFont(font);

        this.add(addBtn);
        this.add(testBtn);

        this.add(label);
        label.setFont(font);

        this.add(studentIdFld);
        this.add(studentIdLbl);

        this.add(studentNameFld);
        this.add(studentNameLbl);

        this.add(emailAddressFld);
        this.add(emailAddressLbl);

        this.add(yearOfStudyFld);
        this.add(yearOfStudyLbl);

        // --- LISTENERS ---- 




        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonAction(e);
            }
        });

        // test button listener, checking the array
        
        testBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                for (int i = 0; i < Menu.getController().getStudents().size(); i++){
                System.out.println(Menu.getController().getStudent(i).getEmailAddress());// retreving info about student
                System.out.println(Menu.getController().getStudents().get(i));
                   
                // in this case email addres
             }

             
             for (int i = 0; i < Menu.getController().getAllModules().size(); i++){
               
                System.out.println(moduleNames[i]);
                   
                // in this case email addres
             }

             
            

            }
        });

    }

    public void addButtonAction(ActionEvent e) {

        if (studentIdFld.getText().isEmpty() || studentNameFld.getText().isEmpty()
                || emailAddressFld.getText().isEmpty() || yearOfStudyFld.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        }

        else {

            //int studentId = Integer.parseInt(studentIdFld.getText().trim());
            String studentName = studentNameFld.getText().trim();
            String emailAddress = emailAddressFld.getText().trim();
            int yearOfStudy = Integer.parseInt(yearOfStudyFld.getText().trim());
            
            
            
            
            Menu.getController().addStudent(studentName, emailAddress, yearOfStudy); // modules ?
            //this.setVisible(false);

            // clear leftover data
            studentIdFld.setText("");
            studentNameFld.setText("");
            emailAddressFld.setText("");
            yearOfStudyFld.setText("");

           



        }

    }

}
