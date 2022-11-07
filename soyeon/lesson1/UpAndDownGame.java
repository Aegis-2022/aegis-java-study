package lesson1;

import java.util.Scanner;
import java.util.Random;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("[UP AND DOWN GAME]");
        int random = rand.nextInt(50)+1;

        while (true) {
            System.out.print("1과 50 사이의 정수를 입력하세요.: ");
            int inputnum = scanner.nextInt();
            if (inputnum == -1) {
                System.out.print("GAME OVER");
                break;
            }
            if (inputnum > random) {
                System.out.println("DOWN");
            } else if (inputnum < random) {
                System.out.println("UP");
            } else {
                System.out.println("정답입니다!");
            }
        }
    }


}