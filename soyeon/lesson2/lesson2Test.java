package lesson2;
import java.util.Scanner;

public class lesson2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("변수 x를 입력하세요: ");
        int x = scanner.nextInt();
        if(x>15 && x<20){
            System.out.println("성공");
        }
        else{
            System.out.println("실패");
        }

    }
}
