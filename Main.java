public class Main {
    public static void main(String[] agrs) {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0 || i % 13 == 0) {
                count ++;

            }

        }
        System.out.println( count) ;
    }
}
