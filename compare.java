public class compare {
    public static void main() {
        String str1 = "name"; //primitive
        String str2 = "name"; //primitive
        System.out.println(str1== str2); //true, comparing primitives with double equals checks value
        String str3 = new String ("name"); //object
        System.out.println(str1 == str3); //false, comparing objects checks to see if you are referring to the same object
        String str4 = str3; //str4 is now referring to the object, not a primitive
        System.out.println(str3 == str4); //true, because str3 refers to the same object as str4

        int var1 = 3;
        int var2 = 3;
        System.out.println(var1 == var2); //true, comparing two primitives
        String str5 = new String("Hello");
        String str6 = new String("Hello");
        System.out.println(str5 ==str6); //false, while comparing two objects, they are stored in different places in memory
        String str7 = str5;
        System.out.println(str5 == str7); //true, same reason as previous
        System.out.println(str6 == str7); //false, str7 = str5. even if they  contain the same value, they are diffent due to their memory
        System.out.println(str5.equals(str6)); //true, the .equals() directly looks at value

        Dog winston = new Dog("terrier","winston",8);
        Dog winston_2 = new Dog("terrier","winston","8");
        System.out.println(winston == winston2);
        }
}