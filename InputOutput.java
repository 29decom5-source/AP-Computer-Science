import java.util.Scanner;
public class InputOutput {
    void main() {
        System.out.println("\n INPUT AND OUTPUT \n");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("You are "+age+" years old");   
        
        str name = sc.NextStr();
        System.out.println("hello "+name+ ", How are you?");
    }
}