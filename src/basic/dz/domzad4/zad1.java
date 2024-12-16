package basic.dz.domzad4;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) sum += sc.nextInt();
        double avg = sum / 5.0;
        System.out.println("Средний балл: " + avg);
        if (avg >= 10) System.out.println("Повышенная стипендия");
        else if (avg >= 8) System.out.println("Обычная стипендия");
        else System.out.println("Стипендия не положена");
    }
}
