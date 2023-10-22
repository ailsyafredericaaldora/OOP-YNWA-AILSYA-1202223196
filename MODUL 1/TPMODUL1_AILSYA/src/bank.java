import java.util.ArrayList;

public class bank {
    private ArrayList<account>accountList;
    public bank (){
        accountList = new ArrayList<account>();
 }
 public void addaccount(account account){
    accountList.add(account);
 }
 public void removeaccount(String accountnumber)
 {
    for (account account : accountList){
        if 
        (account.getaccountnumber().equals(accountnumber))
        {
            accountList.remove(account);
            System.out.println(" akun" + account.getname()+ " berhasil dihapus!");
            return;
        }
    }
    System.out.println(" akun dengan account number " + accountnumber+ "tidak ditemukan.");
}
public account getaccount(String accountnumber)
{
for(account account : accountList){
    if 
    (account.getaccountnumber().equals(accountnumber))
    {
        return account;
     }
}
return null;// akun tidak ditemukan
}
public ArrayList<account>getAllaccounts(){
    return accountList;
    }
}


