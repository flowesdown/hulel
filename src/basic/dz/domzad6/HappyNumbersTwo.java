package basic.dz.domzad6;

public class HappyNumbersTwo {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 != 4 && i % 10 != 9 && i / 10 != 4 && i / 10 != 9) {
                System.out.print(i + " ");
            }
        }
    }
}