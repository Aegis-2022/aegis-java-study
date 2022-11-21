package model;

class Student{
    private String studentNo;
    private String name;
    private String gender;

    Student(){};

    Student(String studentNo, String name, String gender){
        this.studentNo = studentNo;
        this.name = name;
        this.gender = gender;
    }

    public void getStudentNo(){
        System.out.print(this.studentNo+"/");
    }

    public void getName(){
        System.out.print(this.name+"/");
    }

    public void getGender(){
        System.out.println(this.gender);
    }

    public void print(){
        System.out.print(this.studentNo);
        System.out.print(this.name);
        System.out.print(this.gender);
    }
}
public class Main {
    public static void main(String[] args) {
        Student kim = new Student("32222244 ","성진욱 ","남자 ");

        System.out.println("----------get메소드----------");
        kim.getStudentNo();
        kim.getName();
        kim.getGender();

        System.out.println("----------print메소드----------");
        kim.print();
    }
}
