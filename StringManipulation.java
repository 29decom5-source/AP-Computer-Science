public class StringManipulation {
    public static void main(){
        //String str = "Hello World";
        String str = new String("Hello World");
        int length = str.length();
        System.out.println(length);
        String substr = str.substring(2,7);
        System.out.println(substr);

        String substr_2 = str.substring(6);
        System.out.println(substr_2);

        String substr_3 = str.substring(6,7);
        System.out.println(substr_3);
        
        int eplacement = str.indexOf("e");
        System.out.println(eplacement);

        /*if str2 comes before str3 alphabetically, then it will print -1
          if str2 and str3 are equal alphabetically, then it will print 0
          if str3 comes before str2 alphabetically, then it will return 1*/
        String str2 = "cat";
        String str3 = "dog";
        int compare = str2.compareTo(str3);

        String str4 = "cat";
        System.out.println(compare);
        boolean equality1 = str2.equals(str4);
        boolean equality2 = str2.equals(str3);
        System.out.println(equality1);
        System.out.println(equality2);


        int num1 = -1;
        int num2 = Math.abs(num1);
        double num3 = -8.7;
        double num4 = Math.abs(num3);
        System.out.println(num4);

        int num5 = 3;
        int num6 = 2;
        double result = Math.pow(num5,num6);
        System.out.println(result);
        double result2 = Math.pow(num6,num5);
        System.out.println(result2);

        double result3 = Math.pow(2,3);
        System.out.println(result3);

        double result4 = Math.sqrt(15);
        System.out.println(result4);

        double randomNum = Math.random();
        System.out.println(randomNum);

        double randomNum2 =  (int) (randomNum * 55);
        System.out.println(randomNum2);

        System.out.println(num5 + num6);
        System.out.println("William"+num5+ num6);

        /*Immutability:
        Unnable to be changed. the String class is an example of this */

    }
}