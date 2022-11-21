public class Test2 {
    public static void main(String[] args) {

        for (int i = 9; i > 0; i--){
            System.out.println( i + "단");
            for ( int j = 9; j > 0; j--) {
                System.out.println( i + " * " + j + " = " + i*j );
            }
        }
    }
}
