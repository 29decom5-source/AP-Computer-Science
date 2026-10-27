public class Student{
    private String name;// PIV - Private(private) Instance(string/int/double) Variable(name)
    private String ID;
    private double GPA;

    public Student(String n, String student_id, double student_gpa){ //constructor
        name = n;
        ID = student_id; //Setting equal to whatever is passed to the contstructo
        GPA = student_gpa;
    }
    public Student(){
    }

    public void displayName(){
        System.out.println(name);
    }
    public void displayid(){
        System.out.println(ID);
    }
    public void displaygpa(){
        System.out.println(GPA);
    }


    public String toString(){
        return name + '\n' + ID + '\n' + GPA;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Jacob Lee","ASHS1234",4.0);
        student1.displayName();
        System.out.println(student1);
    }
}