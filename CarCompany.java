public class CarCompany{
    private int carsAvailable;
    private int carsInUse;

    public CarCompany(int ca, int ciu){
        carsAvailable = ca;
        carsInUse = ciu;
    }
    
    }
    public static void main(){
        RentalCar toyota = new RentalCar(1200.00, 1.00, 2000.00,2017);
        double total_cost = toyota.cost(4,700);
        System.out.println("$" + total_cost);
        System.out.println(toyota);

        RentalCar honda = new RentalCar(1200.00, 1.00, 2000.00,2017);
        toyota.setDaily(1000.00);
        System.out.println("The Daily rate for honda is " + honda.displayDaily());
        //When changing a static variable, all variables of that are changed
        //example above: honda daily rate was updated and toyota was changed
        boolean standerd = toyota.luxury();
        if (standerd){
            System.out.println("Is Luxury");
        }
        else{
            System.out.println("Not Luxury");
        }
}
    public void showCarInfo(RentalCar c){
                System.out.println(c.displayDaily() + c.displayMileage());
                //System.out.println(c.dailyRate)-doesn't work because it is private
            }

