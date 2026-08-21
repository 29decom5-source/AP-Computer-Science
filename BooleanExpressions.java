public class BooleanExpressions{
    void main() {
    //When using booleans, && is used to check multiple booleans and it (in this case bool3)
    //is only true when all of the booleans inside it is true
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;
        boolean bool4 = (bool1 && bool2 && bool3);
        //System.out.println(bool4);

    //When using the ||, it is the reverse of the previous one, making if there is a true,
    // you will get a true, no matter how many false there are.
        boolean bool5 = true;
        boolean bool6 = false;
        boolean bool7 = !(bool5 || bool6);
    //The exclamation point reverses the answer, no matter what the answer is.
    //True becomes false, false becomes true
        //System.out.println(bool7);

    // !(true OR false) AND True
    //First in the parentheses !(True) AND True
    //Then do the exclamation, False AND True
    //Finally, due to the false, it becomes False
        boolean bool1a = true;
        boolean bool2a = false;
        boolean bool3a = true;
        boolean bool4a = !(bool1a || bool2a) && bool3a;
        //System.out.println(bool4a);

    // ++ adds 1 to whatever the number before is, so in this example, num1++ = 4
        int num1 = 3;
        num1++;
        boolean bool3b = num1 > 3;
        //System.out.println(bool3b);

        int num1a = 3;
        num1a--;
        num1a *= 3;
    //takes num1a and multiplies it by 3, same as num1 = num1*3
        double num2a = 2.2;
        int num3a = (int) num2a + num1a;
        boolean bool1c = num3a > 4;
        System.out.println(bool1c);

        boolean x = true;
        boolean y = true;
        boolean boolA = !(x && y);
        boolean boolB = !(x || y || (bool1 && bool2));
        System.out.println(boolA);
        System.out.println(boolB);




    }
}