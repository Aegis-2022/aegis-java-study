public class Student {
    private int studentNo;
    private String name;
    private String gender;

    public Student() {}

    public Student(int studentNo, String name, String gender) {
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

    public void print(){
        System.out.println("학번은 " + this.getStudentNo() +
                         "\n이름은 " + this.getName() +
                         "\n성별은 " + this.getGender() + "입니다 (수정)");
    }
}
