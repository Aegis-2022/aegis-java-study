import java.util.Scanner;


public class UpAndDownGame {

        public static void main (String[] args) {

            int i=0;
            int num;

            Scanner scan = new Scanner(System.in);
            int x = (int)(Math.random()*50) + 1;


            do {
                System.out.println("1~ 50 사시의 숫자를 입력하세요 : ");
                num = scan.nextInt();

                if(num == -1)
                {
                    break;

                }


                if (x>num) { System.out.println("UP"); }
                else if (x<num) { System.out.println("DOWN"); }
                else {System.out.println("correctsdf");}
                i++;
            }
            while (x!=num);
            System.out.println("정답입니다! "+i+"회 만에 맞췄습니다.");


        }
    }

