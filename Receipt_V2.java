
import java.util.Scanner;

public class Receipt_V2 {
    String name;
    int hot_dogs;
    int hamburgers;
    int sodas;
    int candies;
    double total;


    public Receipt_V2(String name, int hot_dogs, int hamburgers, int sodas, int candies) {
        this.name = name;
        this.hot_dogs = hot_dogs;
        this.hamburgers = hamburgers;
        this.sodas = sodas;
        this.candies = candies;

    }

    public void calculateTotal(){
        double hd = this.hot_dogs * 2.5;
        double hb = this.hamburgers * 3.5;
        double sd = this.sodas * 1.5;
        double cd = this.candies * 1.0;
        this.total = cd + sd + hb + hd;
        
    }

    public String toString(){
        String first_initial = this.name.substring(0,1);
        int space = this.name.indexOf(" ");
        String last_name = this.name.substring(space);
        String new_name = first_initial + "." + last_name;
        return  "\nBurgers and Fries Mart\n" + new_name + "\nBurgers           $" + (hamburgers * 3.5) +"\nHot dogs          $" + hot_dogs * 2.5 + "\nDrinks            $" + (sodas * 1.5) + "\nCandies           $" + (candies * 1) + "\nTax Rate          15%" + "\nTotal             $" + this.total; 
    }

    public void addTax(double rate){
        this.total = this.total*rate;
    }


    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name_V1 = sc.nextLine();

        System.out.println("How many burgers would you like?");
        int burger = sc.nextInt();
        System.out.println("How many candies would you like?");
        int candy = sc.nextInt();
        System.out.println("How many hot dogs would you like");
        int hot_dog = sc.nextInt();
        System.out.println("how many drinks would you like?");
        int drink = sc.nextInt();

        Receipt_V2 W_Fine = new Receipt_V2(name_V1,hot_dog,burger,drink,candy);
        W_Fine.calculateTotal();
        W_Fine.addTax(1.15);
        System.out.println(W_Fine);
    }
}