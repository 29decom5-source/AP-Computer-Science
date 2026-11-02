public class Unit4_CodeAssignment_p2{
    
    public void main(){
        String word = "text";
        String first_letter = word.substring(0,1);
        int counter = 0;
        for(int i = 0; i <= word.length()-1;i++){
            String letter = word.substring(i,i+1);
            if (letter.equals(first_letter)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}