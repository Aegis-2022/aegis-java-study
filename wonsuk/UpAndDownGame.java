package lesson4;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 50) + 1;
        int scannerNum = 0;
        System.out.println("[업 앤 다운 게임]");
        while (true) {
            System.out.print("1과 50사이의 정수를 입력하세요 : ");
            scannerNum = scanner.nextInt();
            if (scannerNum == -1) {
                System.out.println("종료합니다.");
                break;
            } else if (randomNum > scannerNum) {
                System.out.println("UP");
            } else if (randomNum < scannerNum) {
                System.out.println("down");
            } else if (randomNum == scannerNum) {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
