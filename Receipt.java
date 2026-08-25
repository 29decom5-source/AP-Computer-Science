import java.util.Scanner;

public class Receipt {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = sc.nextLine();

        System.out.println("How many burgers would you like?");
        int burgers = sc.nextInt();
        System.out.println("How many candies would you like?");
        int candies = sc.nextInt();
        System.out.println("How many hot dogs would you like");
        int hot_dogs = sc.nextInt();
        System.out.println("how many drinks would you like?");
        int drinks = sc.nextInt();

        double hot_dog_cost = hot_dogs*3.5;
        int candies_cost = candies*2;
        double burger_cost = burgers*4.5;
        int drinks_cost = drinks*2;

        System.out.println("Burger's & Fries Mart");
        System.out.println("1000 Salesian Lane");
        System.out.println(name);

        System.out.println("\nBurger(s)         " + burger_cost);
        System.out.println("Hot Dog(s)        " + hot_dog_cost);
        System.out.println("Drink(s)          " + drinks_cost);
        System.out.println("Candy(s)          " + candies_cost);
        System.out.println("Gratuity        20%" );

        double total = (burger_cost + hot_dog_cost + drinks_cost + candies_cost);
        total = total + (total*0.2);
        System.out.println("Total          " + total);
    }
}