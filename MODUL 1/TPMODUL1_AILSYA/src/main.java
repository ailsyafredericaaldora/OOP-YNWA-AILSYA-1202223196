import java.util.ArrayList;

public class main {
    
    public static void main(String[] args ){
        bank bank  = new bank();
        account account1 = new account("Bunga Citra", "1202224567", 200000.0);
        account account2 = new account ( " Clarissa", "1202224810" ,300000.0);
        account account3 = new account("Raras", "1022223930", 400000.0);
        account account4 = new account(" AILSYA_SI46004","1202223196", 600000.0);
    
        bank.addaccount(account1);
        bank.addaccount(account2);
        bank.addaccount(account3);
        bank.addaccount(account4);
        System.out.println();
        System.out.println(" saldo akun Bunga Citra:" + account1.getbalance());
        System.out.println(" saldo akun Clarissa:" + account2.getbalance());
        System.out.println(" saldo Raras:" + account3.getbalance());
        System.out.println(" saldo akun AILSYA:" + account4.getbalance());
        System.out.println();

        account1.deposit(20000);
        account2.withdraw(600000);
        account4.deposit(150000.0);

        System.out.println("saldo akun Bunga Citra setelah menyetor:" + account1.getbalance());
        System.out.println("saldo akun Clarissa setelah menarik uang:"+ account2.getbalance());
        System.out.println("saldo akun AILSYA setelah menyetor:" + account4.getbalance());
        System.out.println();

        bank.removeaccount("1202224810");
        System.out.println();

        System.out.println(" daftar semuaa akun dalam bank:");
        ArrayList<account>allAccounts =
        bank.getAllaccounts();
        for(account account : allAccounts){
        System.out.println(" nama:"+ account.getname() + ",nomor akun:" + account.getaccountnumber() + ", saldo: " + account.getbalance());

        }
        System.out.println();

    
    }
}
