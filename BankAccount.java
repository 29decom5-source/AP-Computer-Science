class BankAccount{
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
        return this.owner + ":" + this.balance;   
    }

    public static void main(){
       BankAccount fine = new BankAccount("William Fine",4000000);
       fine.withdraw(1000000);
       System.out.println(fine.getbalance());
       fine.deposit(1000000);
       fine.setbalance(4000);
       System.out.println(fine.getbalance());
       System.out.println(fine);

    }

    public void deposit(double money){
        this.balance = balance + money;
    }
    public void withdraw(double money_take){
        this.balance = balance - money_take;
    }
}