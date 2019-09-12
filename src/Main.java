import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the price of a car trip");

        System.out.println("Enter driving distance: ");
        double drivingDistance = input.nextDouble();

        System.out.println("Enter miles pr. gallon: ");
        double milesPrGallon = input.nextDouble();

        System.out.println("Enter price pr. gallon: ");
        double pricePrGallon = input.nextDouble();

        double price = drivingDistance / milesPrGallon * pricePrGallon;
        System.out.println("The price of the trip was = " + ((int)(price * 100) / 100.0));
    }
}
