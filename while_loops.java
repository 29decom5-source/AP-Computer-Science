import java.util.Scanner;

public class while_loops {
    public void main() {
        //runs until a condition is met
        int i = 0;

        /*while (i != 10) { //while (i < 10)
            System.out.println(i);
            i ++; //same thing as i += 1
        }*/

        int x = (int) (Math.random() * 25) + 1;
        int guess = 0;
        int counter = 0;
        while (guess != x) {
            System.out.println("You must guess a random number from 1-25, GO");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            counter += 1;
            if (guess < x) {
                System.out.println("You need to go higher");
            } else if (guess > x) {
                System.out.println("You need to go lower");
            }
        }
        System.out.println("You Won in " + counter + " guesses");
    }
}