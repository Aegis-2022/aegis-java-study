class Animals {
    String name;
    int age;

    int level = 0 ;

    public void SetName(String name) {
        this.name = name; // this is a method, this 는 객체를 지칭하는 것이다. sample class 에서 cat, dog
                          // 등의 객체를 만들고 대입하기위한 form 과 유사하다.
    }
    public void SetAge(int age) {

        this.age = age;
    }

    public void LevelUp(){

        this.level++;

    }
}

public class Sample {
    public static void  main(String[] args) {
        Animals cat = new Animals();
        Animals dog = new Animals();
        Animals horse = new Animals();

        cat.SetName("jerry");   //  this.name = "jerry";
        cat.SetAge(5);
        cat.LevelUp();
        cat.LevelUp();

        System.out.println("Name; " + cat.name + " " + " Age; " + cat.age + " " + "level; " + cat.level); // 객체.객체변수 = 값


    }
}
