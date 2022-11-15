import java.util.Scanner;

public class NumberX {
    public static void main(String[] args) {
        System.out.print("변수x를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(x>15 && x<20){
            System.out.println("성공");
        }
        else
            System.out.println("실패");
    }
}
