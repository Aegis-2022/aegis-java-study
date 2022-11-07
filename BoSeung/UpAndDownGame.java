import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(50);
        int answer;
        Scanner scan = new Scanner(System.in);

        for (;;){
            System.out.println("1과 50사이의 정수를 입력해주세요(-1을 입력하시면 프로그램을 종료합니다.) : ");
            answer = scan.nextInt();

            if (answer == -1){
                break;
            }
            if (answer == num) {
                System.out.println("정답입니다.");
                break;
            }
            else if (answer < num){
                System.out.println("입력하신 숫자가 더 작습니다.");
            }
            else if (answer > num){
                System.out.println("입력하신 숫자가 더 큽니다.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
