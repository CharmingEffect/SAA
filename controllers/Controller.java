package controllers;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Student;

public class Controller {
    
    private ArrayList<Student> students = new ArrayList<Student>();
 
    public Controller(){
 

        populateArrayList();


    }

    public void addStudent(int id, String studentName, String emailAddress, int yearOfStudy){

        Student student = new Student(id, studentName, emailAddress, yearOfStudy);

        students.add(student);
        saveStudent();

    }

    public void populateArrayList() {   //populate array list 

        try {

            FileInputStream file = new FileInputStream("students.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;

            while (!endOfFile) {

                try {

                    students.add((Student) inputFile.readObject());

                } catch (EOFException e) {

                    endOfFile = true;

                } catch (Exception f) {

                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public void saveStudent() {

        try {
            FileOutputStream file = new FileOutputStream("students.dat"); // try to create a file if not created
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
    
            for (int i = 0; i < students.size(); i++) {
    
                outputFile.writeObject(students.get(i));
    
            }
    
            outputFile.close();
    
            JOptionPane.showMessageDialog(null, "The student has been sacessfully added");
           
    
        } catch (IOException e) {
    
            JOptionPane.showMessageDialog(null, e.getMessage());
    
        }
    
    }




}
