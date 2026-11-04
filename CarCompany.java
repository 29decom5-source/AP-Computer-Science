public class CarCompany{
    private int carsAvailable;
    private int carsInUse;

    public CarCompany(int ca, int ciu){
        carsAvailable = ca;
        carsInUse = ciu;
    }
    
    }
    public static void main(){
        RentalCar toyota = new RentalCar(100.00, 1.00, 2000.00,2017);
        double total_cost = toyota.cost(4,700);
        System.out.println("$" + total_cost);
        System.out.println(toyota);

        boolean standerd = toyota.luxury();
        if (standerd){
            System.out.println("Is Luxury");
        }
        else{
            System.out.println("Not Luxury");
        }
}

