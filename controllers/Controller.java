package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Module;
import entity.Student;


public class Controller {
    
    private HashMap<Integer, Student> students;
    private List<Module> allModules;
    private static Integer studentId = 1;
 

    public Controller(){
        this.students = new HashMap<Integer, Student>();
        this.allModules = new ArrayList<Module>();

    }


    public void addStudent(String studentName, String emailAddress, int yearOfStudy){
        

        Student student = new Student(studentName, emailAddress, yearOfStudy);

        students.put(studentId,student);
        studentId++;
       
    }

    public void deleteStudent(Integer currentId, Student student ){
        students.remove(currentId, student);


    }

    public HashMap<Integer, Student> getStudents(){
   
        return this.students;
    }

    public Student getStudent(Integer i){  // usuwanie ma wygladac pdoobnnie 
        return students.get(i);

    }



    public void addModule(String moduleCode, String moduleName){
        Module module = new Module(moduleCode, moduleName);
        allModules.add(module);

    }
    
    public List<Module> getAllModules() {
        return this.allModules;
    }

    public void setAllModules(List<Module> allModules) {
        this.allModules = allModules;
    }


}
