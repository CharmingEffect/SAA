package controllers;

import java.util.ArrayList;
import java.util.HashMap;

import entity.Module;
import entity.Student;

public class Controller {
    
    private HashMap<Integer, Student> students;


    private ArrayList<Module> allModules;
    private static Integer id = 1;
    private Student student;

    public Controller(){
        this.students = new HashMap<Integer, Student>();
        this.allModules = new ArrayList<Module>();

    }




    public void addStudent(String studentName, String emailAddress, int yearOfStudy){
        

        Student student = new Student(studentName, emailAddress, yearOfStudy);

        students.put(id,student);
        id++;
       
    }

    public void deleteStudent(Integer currentId, Student student ){
        students.remove(currentId, student);


    }

    public HashMap<Integer, Student> getS(){
   
        return this.students;
    }

    public Student getStudent(Integer i){
        return students.get(i);

    }

    public void addModule(String moduleCode, String moduleName){
        Module module = new Module(moduleCode, moduleName);
        allModules.add(module);

    }
    
    public ArrayList<Module> getAllModules() {
        return this.allModules;
    }

    public void setAllModules(ArrayList<Module> allModules) {
        this.allModules = allModules;
    }


}
