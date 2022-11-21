import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("변수 X를 입력해주세요 : ");
        x = scanner.nextInt();

        if (x > 15 && x < 20){System.out.println("성공");}
        else {System.out.println("실패");}
    }
}
