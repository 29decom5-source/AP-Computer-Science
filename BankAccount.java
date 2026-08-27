class BankAccount{
    String owner;
    Double balance;

    public BankAccount(){}

    public BankAccount(String owner, double balance) {
        this.owner = owner; //attribute
        this.balance = balance; //attribute
    }

    public String setowner(){
        return this.owner;
    }
    public Integer setbalance(){
        return this.balance;
    }

    public static void main(){
       BankAccount account = new BankAccount("Johnson",12112.56);

    }
}