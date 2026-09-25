import java.util.Scanner;

public class email{
    public void main()  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your email?");
        String name_V1 = sc.nextLine();
        while (name_V1.contains(".") == false);{
            System.out.println("That is an invalid email \nPlease try again using the format first_name.Last_name@domain.com/org/net/etc");
            name_V1 = sc.nextLine();
        }
        while (name_V1.contains("@") == false); {
            System.out.println("That is an invalid email \nPlease try again using the format first_name.Last_name@domain.com/org/net/etc");
            name_V1 = sc.nextLine();
        }
        String email = name_V1;
        int period = email.indexOf(".");
        int at = email.indexOf("@");
        while (period > at); {
        System.out.println("That is an invalid email \nPlease try again using the format first_name.Last_name@domain.com/org/net/etc");
        name_V1 = sc.nextLine();
        }

        email = name_V1;
        period = email.indexOf(".");
        at = email.indexOf("@");

        if (period < at) {}
        else {
            System.out.println("That is an invalid email \nPlease try again using the format first_name.Last_name@domain.com/org/net/etc");
            name_V1 = sc.nextLine();
        }

        String First = email.substring(0,period);
        String Last = email.substring(period+1,at);
        String user_1 = First + "_" + Last;
        System.out.println(user_1);

        String initial_1 = email.substring(0,1);
        String username_2 = initial_1 + "_" + Last;
        System.out.println(username_2);

        int number_first = (int) (Math.random() * period);
        int number_Last_v = Last.length();
        int number_Last = (int) (Math.random() * number_Last_v); //Error has to due with the -2 accidently producing either a negative number or a number too high
        int LongLast = Last.length();
        System.out.println(number_Last);
        if (number_Last >= LongLast - 2) {
            if (number_Last == LongLast - 1) {
                number_Last -= 2;
            }
            else if (number_Last == LongLast - 2) {
                number_Last -= 1;
            }
            else {
                number_Last -= 3;
            
            
            }
            }
        //System.out.println(number_Last_v);
        System.out.println(number_Last);

        String user3_1 = First.substring(number_first,number_first+1);
        String user3_2 = Last.substring(number_Last,number_Last + 3); //error occurs here
        System.out.println(user3_1 + "_" + user3_2);
    }
}