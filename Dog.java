

class Dog {
    String breed;
    String name;
    String owner;
    int age;
    //null constructor

    public Dog(){
        this.owner = "ASPCA";
    }

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
        public String toString(){
            return breed + ":" + name + ":" + age + ":" + owner;
        }
        //accessors
        public String getName(){
            return name;
            //return name;
        }
        public String getbreed(){
            return this.breed;
        } 
        public Integer getage(){
            return this.age;
        } 
        //cannot mix static and this commands
        public String getowner(){
            return this.owner;
        } 

        //setters
        public void setage(int age){
            this.age = age;
        }
        public void setname(String name){
            this.name = name;
        }
        public void setowner(String owner){
            this.owner = owner;
        }
        public void setbreed(String breed){
            this.breed = breed;
        }

    public static void main(){
       Dog winston = new Dog("GoldenDoodle","Winston","Nick Delaune",12);
        //instance of object dog
       Dog oliver = new Dog("Pitbull","Oliver",8);
       int age = oliver.age;

        String breed = oliver.getbreed();
        System.out.println(breed);
        String breed2 = winston.getbreed();
        System.out.println(breed2);

       oliver.owner = "Graeme Brewer";
       System.out.println(oliver);
       Dog unknownDog = new Dog();
       unknownDog.setname("Clifford");
       unknownDog.setage(3);
       System.out.println(unknownDog);
        //this is an instance of the class using the overriding constructor
    }
   //Static allows you to run code before creating the instance of the class
}
   // public void main() {}
   //public : 
   //void : what is expected to be returned. In void, it is nothing
   // (): what is being sent to the method, void. For example, breed, age, and name
   // {}: 