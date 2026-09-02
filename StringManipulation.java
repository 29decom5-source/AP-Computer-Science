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

        /*Immutability:
        Unnable to be changed. the String class is an example of this */

    }
}