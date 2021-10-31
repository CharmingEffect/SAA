package views;

import java.awt.Dimension;

import javax.swing.*;

import controllers.Controller;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentPanel extends JPanel {

    JTextField studentIdFld, studentNameFld, emailAddressFld, yearOfStudyFld;

    Controller controller;

    public AddStudentPanel() {

        JLabel label = new JLabel("Fill up all fields below and click add");
        studentIdFld = new JTextField();
        studentNameFld = new JTextField();
        emailAddressFld = new JTextField();
        yearOfStudyFld = new JTextField();

        JLabel studentIdLbl = new JLabel("Student ID:");
        JLabel studentNameLbl = new JLabel("Student's Name:");
        JLabel emailAddressLbl = new JLabel("Email Address:");
        JLabel yearOfStudyLbl = new JLabel("Year of study:");

        JButton addBtn = new JButton("Add");

        this.setLayout(null);
        Font font = new Font("serif", Font.PLAIN, 20);
        // below is created somple layout all the numbers in bracets indicates the
        // postion of compinents
        label.setBounds(140, 100, 300, 40);
        label.setFont(font);

        studentIdLbl.setBounds(100, 170, 200, 40);
        studentIdLbl.setFont(font);

        studentIdFld.setBounds(300, 170, 200, 40);
        studentIdFld.setFont(font);

        emailAddressFld.setBounds(300, 290, 200, 40);
        emailAddressFld.setFont(font);

        emailAddressLbl.setBounds(100, 290, 200, 40);
        emailAddressLbl.setFont(font);

        studentNameFld.setBounds(300, 230, 200, 40);
        studentNameFld.setFont(font);

        studentNameLbl.setBounds(100, 230, 200, 40);
        studentNameLbl.setFont(font);

        yearOfStudyFld.setBounds(300, 350, 200, 40);
        yearOfStudyFld.setFont(font);

        yearOfStudyLbl.setBounds(100, 350, 200, 40);
        yearOfStudyLbl.setFont(font);

        addBtn.setBounds(300, 420, 200, 40);
        addBtn.setFont(font);

        this.add(addBtn);

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

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonAction(e);
            }
        });

    }

    public void addButtonAction(ActionEvent e) {

        if (studentIdFld.getText().isEmpty() || studentNameFld.getText().isEmpty() || emailAddressFld.getText().isEmpty()
                || yearOfStudyFld.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        }

        else {

            int studentId = Integer.parseInt(studentIdFld.getText().trim());
            String studentName = studentNameFld.getText().trim();   
            String emailAddress = emailAddressFld.getText().trim();   
            int yearOfStudy = Integer.parseInt(yearOfStudyFld.getText().trim());
      
            controller.addStudent(studentId, studentName, emailAddress, yearOfStudy);

        }

    }

}
