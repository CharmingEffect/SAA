package views;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import controllers.ModuleController;
import controllers.StudentController;
import entity.Module;
import entity.Student;

import java.awt.*;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddStudentPanel extends JPanel {

    JTextField studentIdFld, studentNameFld, emailAddressFld, yearOfStudyFld;
    
    ArrayList<Module> modules = new ArrayList<Module>();
    StudentController controller = new StudentController();
   


    public AddStudentPanel() {
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
        ModuleController moduleController = new ModuleController();
        List<String> listA = new ArrayList<>();
    
        JButton addBtn = new JButton("Add");
        JButton testBtn = new JButton("TEST");
        String[] modulesArray = new String[moduleController.getModules().size()];
        // loop for list (scroll pane) of modules
        for (int index = 0; index < moduleController.getModules().size(); index++) {
            modulesArray[index] = moduleController.getModules().get(index).getModuleName();
            listA.add(modulesArray[index]);
           
        }


       

        final JList<String> list = new JList<String>(listA.toArray(new String[listA.size()]));

        JScrollPane scrollPane = new JScrollPane();        
        scrollPane.setViewportView(list);
        
        
        
        this.add(scrollPane);
        scrollPane.setBounds(400, 170, 250, 230);
        list.setFont(font);

        TitledBorder title;
        title = BorderFactory.createTitledBorder("Choose modules for the student (max 5): ");
        scrollPane.setBorder(title);

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

                System.out.println(controller.getStudents().get(0).getEmailAddress()); // retreving info about student
                                                                                       // in this case email addres

            }
        });

    }

    public void addButtonAction(ActionEvent e) {

        if (studentIdFld.getText().isEmpty() || studentNameFld.getText().isEmpty()
                || emailAddressFld.getText().isEmpty() || yearOfStudyFld.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        }

        else {

            int studentId = Integer.parseInt(studentIdFld.getText().trim());
            String studentName = studentNameFld.getText().trim();
            String emailAddress = emailAddressFld.getText().trim();
            int yearOfStudy = Integer.parseInt(yearOfStudyFld.getText().trim());
            
            controller.addStudent(studentId, studentName, emailAddress, yearOfStudy,modules); // modules ?
            this.setVisible(false);

            // clear leftover data
            studentIdFld.setText("");
            studentNameFld.setText("");
            emailAddressFld.setText("");
            yearOfStudyFld.setText("");

        }

    }

}
