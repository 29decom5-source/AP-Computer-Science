public class school{
    public static void main(){
        Student student1 = new Student("Caleb","ASHS1234",4.0);
        student1.displayName();
        System.out.println(student1.name);
        //the above is an error because (name) is private, not public
        //class student is public, meaning it can be used in other classes

        //data encapsulation is when data is only available to a specific class
        //rather than every class ever

        //the only way to access it past this is the (getters) and (setters), making them
        //important
    }
}