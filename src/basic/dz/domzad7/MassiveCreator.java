package basic.dz.domzad7;

import java.util.Scanner;

public class MassiveCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayBigLength = 20;
        String[] ArrB = new String[arrayBigLength];
        for (int i = 0; i < arrayBigLength; i++) {
            ArrB[i] = scanner.nextLine();
        }

        int arraySmallLength = arrayBigLength / 2;
        String[] ArrLOne = new String[arraySmallLength];
        String[] ArrLTwo = new String[arraySmallLength];

        for(int i = 0; i < arraySmallLength; i++){
            ArrLOne[i] = ArrB[i];
            ArrLTwo[i] = ArrB[i+arraySmallLength];
        }
    }
}
