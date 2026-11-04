public class RentalCar{
    private Double dailyrate;
    private Double mileagerate;
    private Double maxamount;
    private int year;

    public RentalCar(Double daily, Double mileage, Double max, int yr){
        dailyrate = daily;
        mileagerate = mileage;
        maxamount = max;
        year = yr;
    }

    public Double displayDaily(){
        return dailyrate;
    }
    public Double displayMileage(){
        return mileagerate;
    }
    public Double dislplayMax(){
        return maxamount;
    }

    public void setDaily(Double new_rate){
        dailyrate = new_rate;
    }

    public void setmileage(Double new_rate){
        mileagerate = new_rate;
    }
    public void setmaxamount(Double new_rate){
        maxamount = new_rate;
    }

    public double cost(int days, int miles){
        double amount = (miles * mileagerate) + (days * dailyrate);
        boolean lux_check = this.luxury();
        if (lux_check){
            return amount * 1.25;
        }
        else{
        return amount;
        }
    }
    public String toString(){
        return "Daily Rate: $" + dailyrate + "\nMileage Rate: $" + mileagerate + "\nMax Amount: $" + maxamount + "\nYear: " + year;
    }
    public boolean luxury(){
        if (year > 2015){
            return true;
        }
        else{
            return false;
        }
    }
}