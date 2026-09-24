public class email{
    public void main()  {
        String email = "william.fine@archbishopshaw.us";

        int period = email.indexOf(".");
        int at = email.indexOf("@");

        String First = email.substring(0,period);
        String Last = email.substring(period+1,at);
        String user_1 = First + "_" + Last;
        System.out.println(user_1);

        String initial_1 = email.substring(0,1);
        String username_2 = initial_1 + "_" + Last;
        System.out.println(username_2);

        int number_first = (int) (Math.random() * period);
        int number_Last_v = Last.length();
        int number_Last = (int) (Math.random() * number_Last_v - 2);

        String user3_1 = First.substring(number_first,number_first+1);
        //System.out.println("Helloooo");
        String user3_2 = Last.substring(number_Last,number_Last+3);

        System.out.println(user3_1 + "_" + user3_2);
    }

}