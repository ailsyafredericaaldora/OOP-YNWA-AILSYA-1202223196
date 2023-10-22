public class account {
    private String name;
    private String accountnumber;
    private double balance;

    public account(String name, String accountnumber , double balance){
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    public String getname(){
        return name;
    }
    public String getaccountnumber() {
        return accountnumber;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println( " saldo akun " + name + " setelah menarik uang:" + balance);
    }
    public void whitdraw(double amount) {
        if (balance >= amount){ 
            balance -= amount;
            System.out.println("saldo akun" + name+ "setelah menarik uang:" + balance);
         }else{
            System.out.println(" saldo tidak mencukupi untuk melakukan penarikan");
         }
    }
}
