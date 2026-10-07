public class ForLoops{

    /*public static void main(){
        for (int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
    }*/

    public static void main(){
        String word = "Open House";
        for (int i = 0; i <= word.length()-1; i++){
            String word_2 = word.substring(i,i+1);
            if (word_2.equals(" ") != true){
                System.out.println(word_2);
            }
        }
    }
}