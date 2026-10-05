public class While_Loops_Practice{

    //public static void main() {
      //  int x = 0;
        //while(x <= 10000){
          //  if (x % 2 == 0) {
            //    System.out.println(x);
            //}
            //x++;
     //   }
    //}
    public static void main() {
        int counter = 0;
        String risingSun = "There is a house in New Orleans. It's called the rising sun";
        while(true){
            counter++;
            System.out.println(risingSun);
            int firstword = risingSun.indexOf(" ");
            if (firstword < 0){
                break;
            }
            String word = risingSun.substring(0,firstword+1);
            System.out.println(word);
            String rest = risingSun.substring(firstword);
            risingSun = rest;
            if (counter == 2){
                break;
            }
            
            
        }   
    }
}