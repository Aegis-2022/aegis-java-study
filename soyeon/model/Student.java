package model;

public class Student {
    private int studentNo;
    private String name;
    private String gender;

    public Student(int studentNo, String name, String gender){
        this.studentNo = studentNo;
        this.name = name;
        this.gender = gender;
    }
    public int getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("학번은 "+ studentNo + "이고\n" +
                "이름은 "+ name + "이고\n" +
                "성별은 "+ gender + "입니다.");

    }
}
