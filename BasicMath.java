public class BasicMath {
    void main() {
        int num1 = 1;
        int num2 = 2;
        double decimalNumber = 3.1;
        boolean yesNo = true;
        int num3 = num1 + num2;
        System.out.println(num3);
        int num4 = num2 - num1;
        System.out.println(num4);
        int num5 = num4 * num3;
        System.out.println(num5);
        int num6 = 8;
        int num7 = 5;
        int num8 = num6/num7;
        System.out.println(num8);
        double num9 = num6/num7;
        System.out.println(num9);
        double num10 = 10;
        int num11 = 7;
        double num12 = num10/num11;
        System.out.println(num12);
        double num13 = num11;
        System.out.println ("// New work //");

        int number1 = 3;
        double number2 = 4.3;
        int number3 = (int) number2;
        //this is a comment
        //When casting, you cannot cast during arithmatic, you must first leave it as whatever
        //it would be, then in the next line, recast it
        double number4 = (double) num3;

        System.out.println (num3);
        System.out.println (num4);

        int max = Integer.MAX_VALUE;
        System.out.println(max);

        
    }
}