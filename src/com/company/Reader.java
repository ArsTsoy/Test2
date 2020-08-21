package com.company;

public class Reader {
    private String shortNamestudent;
    private int studentNumber;
    private String studentGroup;
    private String studentDateOfBirth;
    private String studentPhoneNumber;

    /*public Reader(String shortNamestudent, int studentNumber, String studentGroup, String studentDateOfBirth, String studentPhoneNumber){
        this.shortNamestudent = shortNamestudent;
        this.studentNumber = studentNumber;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentGroup = studentGroup;
        this.studentPhoneNumber = studentPhoneNumber;
    }*/

    public void setShortNamestudent(String shortNamestudent) {
        this.shortNamestudent = shortNamestudent;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getShortNamestudent() {
        return shortNamestudent;
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

//Overload takeBook
    public String takeBook(){
        return null;
    }

    public String takeBook(String shortNamestudent){
        return shortNamestudent;
    }

    public String takeBook(String shortNamestudent, int countbooks){
        return "Студент: " + shortNamestudent + " взял: " +  countbooks + " книги/книг";
    }

    public String takeBook(String shortNamestudent, String[] arrayListOftakebooks){
            return "Студент: " + shortNamestudent + "," + " взял: " + arrayListOftakebooks;
    }

    public String takeBook(String shortNamestudent, Object Books ){
        return "Студент: " + shortNamestudent + "," + " взял: " + Books;
    }
}
