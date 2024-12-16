package basic.dz.domzad4;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину сумки (см): ");
        int length = sc.nextInt();
        System.out.print("Введите ширину сумки (см): ");
        int width = sc.nextInt();
        System.out.print("Введите высоту сумки (см): ");
        int height = sc.nextInt();

        int maxLength = 550, maxWidth = 90, maxHeight = 2000;

        switch (length <= maxLength && width <= maxWidth && height <= maxHeight ? 1 : 0) {
            case 1:
                System.out.println("Сумка пройдет как ручная кладь.");
                break;
            case 0:
                System.out.println("Сумка не пройдет как ручная кладь.");
                break;
        }
    }
}
