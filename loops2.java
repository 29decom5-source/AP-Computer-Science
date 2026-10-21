public class loops2{

    public static void main(){
        int num = 43214892;
        int digit = num % 10;
        int counter = 1;
        while(num > 0){
            int temp = num / 10;
            int temp_digit = temp % 10;
            if (temp_digit == digit){
                counter++;
            }
            num = temp;
        }
        if (counter > 1){
            System.out.println("More than Once");
        }
        else{
            System.out.println("Once");
        }
    }
}