public class ForLoops{

    /*public static void main(){
        for (int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
    }*/

    public static void main(){
        String word = "Open House";
        String temp = "";
        for (int i = 0; i <= word.length()-1; i++){
            String word_2 = word.substring(i,i+1);
            if (word_2.equals(" ") != true){
                temp = temp + word_2;
                //System.out.println(word_2);
            }
        }
        System.out.println(temp);
    

    
        int total = 0;
        for (int i = 15; i > 0; i--){
            total += i;
            
        }
        //System.out.println(1+2+3+4+5+6+7+8+9+10+11+12+13+14+15);
        //System.out.println(total);
        //for (int i = 10; i > 0; i-- ){
        //     System.out.println(i);
        //}

        /*int counter = 0;
        for (int x = 0; x<4; x++){
            for (int y = 0; y<2; y++){
            counter++;
        }
    }
        System.out.println(counter);*/

        /*int counter = 0;
        for (int x=0;x<=5;x++){
            for (int y=0;y<3;y++)
            counter++;
        }
        System.out.println(counter);*/
        int counter = 0;
        /*for (int x=1;x<=12;x++){
            for (int y=1;y<=12;y++){
                System.out.print(y*x);
                System.out.print("\t");
                counter++;
                if (counter == 12){
                    System.out.println('\n');
                    counter = 0;
                }
            }

            
        }*/
        counter = 0;
        boolean isPrime;
       for (int i = 2;i<=100;i++){
        isPrime = true;
            for (int j = 2;j<i;j++){
                if (i % j == 0){
                    //System.out.println(i);
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
            }
        
       
    }
}