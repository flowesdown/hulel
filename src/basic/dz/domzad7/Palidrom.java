package basic.dz.domzad7;

import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(palindromCheck(line));
    }
    public static String palindromCheck(String line){
        String cleanLine = line.replaceAll("\\s+", "");
        String[] splitLine = cleanLine.split("");
        int lineIndexMax = splitLine.length-1;
        int maxIterration = lineIndexMax/2;
        for(int i =0;i<maxIterration;i++){
            if(!splitLine[i].equals(splitLine[lineIndexMax-i])){
                return "Не є паліндромом";
            }
        }
        return "Є паліндромом";
    }
}
