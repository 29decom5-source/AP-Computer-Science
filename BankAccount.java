public class BankAccount{
    String owner;
    Double balance;

    public BankAccount(){}

    public BankAccount(String owner, double balance) {
        this.owner = owner; //attribute
        this.balance = balance; //attribute
    }

    public void setowner(String owner){
        this.owner = owner;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }

    public String getowner(){
        return this.owner;
    }
    public double getbalance(){
        return this.balance;
    }

    public String toString(){
        return "Hello," + this.owner + " your balane is: " + this.balance; 
    }

    public static void main(){
       BankAccount fine = new BankAccount("William Fine",4000000);
       /*This is a multi-line comment
       I can write on as many lines as I want */
       fine.withdraw(1000000);
       System.out.println(fine.getbalance());
       fine.deposit(1000000);
       fine.setbalance(4000);
       System.out.println(fine.getbalance());
       System.out.println(fine);
       fine.toString();

    }
    /**
     * Description: this allows us to add money to an existing account
     * @param double: this is the money being added to the account
     * @return void
     */
    public void deposit(double money){
        this.balance = balance + money;
    }
    /**
     * Description: this allows us to withdraw money to an existing account
     * @param double: this is the money being taken from the account
     * @return void
     */
    public void withdraw(double money_take){
        this.balance = balance - money_take;
    }
}

