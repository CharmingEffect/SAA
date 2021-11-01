
// Student Assessment Administration

package entity;

import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable {

    private int id;
    private String studentName;
    private String emailAddress;
    private int yearOfStudy;
    private ArrayList<Module> modules;

   

   
    public Student(int id, String studentName, String emailAddress, int yearOfStudy, ArrayList<Module> modules){
        this.id = id;
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.yearOfStudy = yearOfStudy;
        this.modules = modules; 

    }

    public ArrayList<Module> getStudentModules() {
        return this.modules;
    }

    public void setStudentModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

   
  }