
// Student Assessment Administration

package entity;

import java.io.Serializable;


public class Student implements Serializable {

    private int id;
    private String studentName;
    private String emailAddress;
    private int yearOfStudy;

   
    public Student(int id, String studentName, String emailAddress, int yearOfStudy){
        this.id = id;
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.yearOfStudy = yearOfStudy;

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