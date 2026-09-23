import java.util.Scanner;

public class bellwork {


    public static void main() {
        String school = "Archbishop Shaw";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your Input?");
        String input_1 = sc.nextLine();

        int x = (school.compareTo(input_1));

        if (x == 0) {
            System.out.println("they are the same");
        }
        else if (x > 0) {
            System.out.println("Archbishop Shaw comes after it");
        }
        else {
            System.out.println("Archbishop Shaw comes before it");

        }
}
}