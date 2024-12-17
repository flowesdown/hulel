package basic.dz.domzad5;

import java.util.Random;

public class MinFromRand {
    public static void main(String[] args) {
        int a = new Random().nextInt(), b = new Random().nextInt(), c = new Random().nextInt();
        System.out.println(Math.min(a, Math.min(b, c)));
    }
}
