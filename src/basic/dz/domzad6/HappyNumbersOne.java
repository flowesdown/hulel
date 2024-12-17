package basic.dz.domzad6;

public class HappyNumbersOne {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) if (!String.valueOf(i).contains("4") && !String.valueOf(i).contains("9")) System.out.print(i + " ");
    }
}
