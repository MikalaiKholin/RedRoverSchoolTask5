public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j >= 0; j--){
                System.out.printf("%d  ", 9 - j - i);
            }
            System.out.println();
        }

        System.out.println("======================================");

        for (int i = 0; i < 10; i++) {
            for (int j = i; j > 0; j--){
                System.out.print("   ");
            }

            for (int j = 9 - i; j >= 0; j--){
                System.out.printf("%d  ", 9 - j - i);
            }
            System.out.println();
        }

        System.out.println("======================================");

        for (int i = 0; i < 10; i++) {
            for (int j = i; j > 0; j--){
                System.out.print("   ");
            }

            for (int j = 9 - i; j >= 0; j--){
                System.out.printf("%d  ", j);
            }

            for (int j = 9 - i - 1; j >= 0; j--){
                System.out.printf("%d  ", 9 - j - i);
            }
            System.out.println();
        }

    }
}