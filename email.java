import java.util.Scanner;

public class email{
    public void main()  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your email?");
        String name_V1 = sc.nextLine();

        while(true){
            boolean period_check = name_V1.contains(".");
            boolean at_check = name_V1.contains(".");

            if (period_check){
                //System.out.println("Period: True");
                if (at_check) {
                    //System.out.println("@: True");
                    int period = name_V1.indexOf(".");
                    int at = name_V1.indexOf("@");
                    if (period < at) {
                        //System.out.println("Order: True");
                        if (period + 3 < at) {
                            //System.out.println("numerics: True");
                            break;
                        }
                    }
                }
            }
            System.out.println("That email is incorrect, please try again using the format \nfirst_name.Last_Name");
            name_V1 = sc.nextLine();
        }

        String email = name_V1;
        email = name_V1;
        int period = email.indexOf(".");
        int at = email.indexOf("@");

        String First = email.substring(0,period);
        String Last = email.substring(period+1,at);
        String user_1 = First + "_" + Last;


        String initial_1 = email.substring(0,1);
        String username_2 = initial_1 + "_" + Last;

        int number_first = (int) (Math.random() * period);
        int number_Last_v = Last.length();
        int number_Last = (int) (Math.random() * number_Last_v);
        int LongLast = Last.length();
        //System.out.println(number_Last);
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
        //System.out.println(number_Last);

        String user3_1 = First.substring(number_first,number_first+1);
        String user3_2 = Last.substring(number_Last,number_Last + 3);
        System.out.println(user_1);
        System.out.println(username_2);
        System.out.println(user3_1 + "_" + user3_2);
    }
}