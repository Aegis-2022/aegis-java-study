import java.util.Scanner;

public class UpAndDownGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 50) + 1;

        while(true) {
            System.out.print("정수를 입력하세요: ");
            int guess = scanner.nextInt();

            if (guess == -1) {
                System.out.println("프로그램 종료");
                break;
            }
            if (guess > answer)
                System.out.println("DOWN");

            else if (guess < answer)
                System.out.println("UP");

            else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
