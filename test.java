public class test{
    String name;
    int number;
    
    public test(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public test(){
        double randomNum = Math.random();
        double randomNum2 = (randomNum * 67);
        this.number = (int) randomNum2;

    }

    public void addAbs(int num){
        this.number += Math.abs(num);
    }

    public String toString() {
        return "Hello, your name is " + name + " and your number is " + number;
    }

    public static void main() {
        test instance1 = new test("Mike",5);
        test instance2 = new test("Fine",3);
        //instance2.addAbs(-8);
        System.out.println(instance2);
        test will = new test();
       System.out.println(will);

       String substr = instance1.name.substring(0,3);
    }
}