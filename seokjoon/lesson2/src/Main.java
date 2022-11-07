import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int x;

        int i = 9;
        int j = 9;

        System.out.println("변수 x 를 입력하세요");


        Scanner sc;
        sc = new Scanner(System.in);
        x = sc.nextInt();

        if (15 < x && x < 20) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }


        for (i = 9; i > 0; i--) {
            for (j = 9; j > 0; j--) {

                System.out.println(i + "x" + j + "=" + i * j);

            }
        }
    }
}

