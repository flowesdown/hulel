package basic.dz.domzad3;

public class zad2 {
    public static void main(String[] args) {
        int dogs = 240, cats = 80, foodPerPortion = 5000, costPerPortion = 2, mealsPerDay = 8, daysInMonth = 30;
        int foodForCats = calculateFood(cats, foodPerPortion, mealsPerDay, daysInMonth);
        int foodForDogs = calculateFood(dogs, foodPerPortion, mealsPerDay, daysInMonth);
        int totalCost = calculateTotalCost(foodForCats, foodForDogs, costPerPortion);
        System.out.println("Корма для котов в месяц: " + foodForCats + " грамм.");
        System.out.println("Корма для собак в месяц: " + foodForDogs + " грамм.");
        System.out.println("Необходимая сумма на корм в месяц: копеек: " + totalCost);
    }

    public static int calculateFood(int animals, int foodPerPortion, int mealsPerDay, int daysInMonth) {
        return animals * foodPerPortion * mealsPerDay * daysInMonth;
    }

    public static int calculateTotalCost(int foodForCats, int foodForDogs, int costPerPortion) {
        return ((foodForCats + foodForDogs) / 50) * costPerPortion;
    }
}
