import java.util.Scanner;
public class InputOutput {
    void main() {
        System.out.println("\n INPUT AND OUTPUT \n");
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name");
        String name = sc.nextLine();
        System.out.println("hello "+name+ ", How are you?");

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("You are "+age+" years old");   
        
        System.out.println("How much money do you have?");
        double money = sc.nextDouble();
        System.out.println("hello, you have $"+money+"in your account");

    System.out.println("Your name is "+name+". Your age is "+age+". You have $"+money+".");


    }
}