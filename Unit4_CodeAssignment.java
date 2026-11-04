

public class Unit4_CodeAssignment{
    
    public void main(){
        int number = 4359;
        int counter = 0;
        int run_num = 0;
        while(number > 0){
            run_num++;
            int digit = number % 10;
            number = number / 10;
            if (digit == 1){
                counter++;
            }
            //System.out.println(digit);
            //System.out.println(digit);
                for (int i = 2;i<digit;i++){
                    if (digit % i == 0){
                        counter++;
                        i += 100;
                    }
                }
        }
        System.out.println(run_num - counter);
            }
        }