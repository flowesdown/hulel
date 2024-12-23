package basic.dz.domzad7;
import java.util.Random;
public class FootballTeams {
    public static void main(String[] args) {
        int footballersQuantity=11;
        int[] teamOne=new int[footballersQuantity];
        int[] teamTwo=new int[footballersQuantity];

        for(int i=0;i<footballersQuantity;i++){
            teamOne[i] = (int) (18 + Math.random() * 27);
            teamTwo[i] = (int) (18 + Math.random() * 27);
        }
        System.out.println("\nКоманда 1: ");
        for(int i=0;i<footballersQuantity;i++){
            System.out.print(" "+teamOne[i]);
        }
        System.out.println("\nКоманда 2: ");
        for(int i=0;i<footballersQuantity;i++){
            System.out.print(" "+teamTwo[i]);
        }
    }
}
