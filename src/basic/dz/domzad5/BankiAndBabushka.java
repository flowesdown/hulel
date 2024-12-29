package basic.dz.domzad5;

import java.util.Scanner;

public class BankiAndBabushka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apples = sc.nextInt();
        calculateJars(apples);
    }

    public static void calculateJars(int apples) {
        int large = apples / 5;
        apples %= 5;
        int medium = apples / 3;
        apples %= 3;
        int small = apples;
        System.out.println("Large jars - " + large + ";");
        System.out.println("Medium jars - " + medium + ";");
        System.out.println("Small jars - " + small + ";");
    }
}