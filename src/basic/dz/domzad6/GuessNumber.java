package basic.dz.domzad6;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        int num = new Random().nextInt(11);
        Scanner sc = new Scanner(System.in);
        while (sc.nextInt() != num);
    }
}
