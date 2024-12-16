package basic.dz.domzad2;

public class zad1 {
    public static void main(String[] args) {
        double[] radii = {1, 0.5, 0.2};
        double density = 0.7;
        double weight = 0;
        for (double r : radii) {
            weight += (4.0 / 3) * Math.PI * Math.pow(r, 3) * density;
        }
        System.out.println(weight);
    }
}
