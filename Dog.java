class Dog {
    String breed;
    String name;
    String owner;
    int age;
    //attributes, breed, owner, name, age
    //constructor method for dog
    public Dog(String breed, String name, String owner, int age) {
        this.breed = breed; //attribute
        this.name = name; //attribute
        this.age = age; // attribute
        this.owner = owner; //attribute
    }
    //overriding is when there are 2 methods of the same name
    //it knows which one to choose due to number and type of variables
    public Dog (String breed, String name, int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
        }
    public static void main(){
       Dog winston = new Dog("GoldenDoodle","Winston","Nick Delaune",12);
        //instance of object dog
        
    public static void main(){
       Dog oliver = new Dog("Pitbull","Oliver",8);
       int age = oliver.age;
       System.out.println(age);
    }  //this is an instance of the class using the overriding constructor
    }
   //Static allows you to run code before creating the instance of the class