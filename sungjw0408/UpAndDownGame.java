import java.util.Scanner;
import java.util.Random;

public class UpAndDownGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int R = (int)((Math.random() * 50)+ 1);
        while(true){
            System.out.print("1과 50사이의 정수를 입력하세요: ");
            int answer = scanner.nextInt();

            if( (answer>R) && (answer != -1)){
                System.out.println("Down");
            }
            else if( (answer<R) && (answer != -1) ){
                System.out.println("UP");
            }
            else if(answer == R){
                System.out.println("정답입니다.");
                break;
            }
            else if(answer == -1){
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}