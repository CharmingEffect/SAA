
// Student Assessment Administration

package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Student implements Serializable {

    private String studentName;
    private String emailAddress;
    private int yearOfStudy;
    private List<Module> modules = new ArrayList<>();

   
    public Student(String studentName, String emailAddress, int yearOfStudy){

        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.yearOfStudy = yearOfStudy;
   

    }

    public Student(String studentName, String emailAddress, int yearOfStudy, List<Module> modules){
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.yearOfStudy = yearOfStudy;
        this.modules = modules;
   

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

    public List<Module> getModules() {
        return this.modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

   
  }