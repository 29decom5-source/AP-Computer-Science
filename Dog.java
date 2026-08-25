class Dog {
    String breed;
    String name;
    String owner;
    int age;
    //constructor method for dog
    public Dog(String breed, String name, String owner, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public void main(){
       Dog winston = new Dog("GoldenDoodle","Winston","Nick Delaune",12);

    }
}