public class Mathstuff{
    private static double pi = 3.14;

    public static double calcHyp(double a, double b){
        double c2 = Math.pow(a,2) + Math.pow(b,2);
        double result = Math.sqrt(c2);
        return result;
        
    }
    public static double calcCirc(double r){
        return 2*pi*r;
    }

    public static void main(String[] args) {
        double hypotenuse = calcHyp(3,4);
        System.out.println(hypotenuse);
        //static allows me to call the class without creating an instance
        //because it is in the Mathstuff class, i do not need to do something like
        //           Mathstuff.calcHyp(3,4);
    }
}