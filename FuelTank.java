public class FuelTank{
    private double maximum_capacity;
    private double current_capacity;
    public FuelTank(double max_cap,double curr_cap){
        maximum_capacity = max_cap;
        maximum_capacity = curr_cap;
    }

    public double addFuel(double fueling){
        current_capacity += fueling;
        while(current_capacity >= maximum_capacity){
            current_capacity -= maximum_capacity;
        }
        return maximum_capacity - current_capacity;

    }

}