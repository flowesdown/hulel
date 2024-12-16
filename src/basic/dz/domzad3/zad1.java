package basic.dz.domzad3;

public class zad1 {
    public static void main(String[] args) {
        printAirplaneInfo("Раптор", "Jet");
        printAirplaneInfo("Аеробус", "Airliner", 120);
        printAirplaneInfo("Боинг", "Airliner", 180, 28);
    }


    public static void printAirplaneInfo(String name, String type) {
        System.out.println("Тип: " + type + ", модель: " + name);
    }

    public static void printAirplaneInfo(String name, String type, int economySeats) {
        System.out.println("Тип: " + type + ", модель: " + name + ", кол во в биз класс: " + economySeats);
    }

    public static void printAirplaneInfo(String name, String type, int economySeats, int businessSeats) {
        System.out.println("Тип: " + type + ", модель: " + name + ", кол. во летит: " + economySeats + ", кол во в биз класс: " + businessSeats);
    }
}
