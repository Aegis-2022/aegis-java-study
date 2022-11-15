package Aegis;

import java.util.Scanner;

public class lesson2Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X < 20 && X > 15) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}