import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountInfo {
    public List<Account> create() {
        Scanner sc = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();

        do {
            System.out.println("Enter account number, customer name, and account balance:");
            String accNo = sc.next();
            String custName = sc.next();
            double accBal = sc.nextDouble();
            Account account = new Account(22, "Sunil", 220002);
            accountList.add(account);

            System.out.println("Do you want to continue? (yes/no)");
        } while (sc.next().equals("yes"));

        System.out.println("--------------------------------");
        return accountList;
    }

    public void display(List<Account> accountList) {
        for (Account account : accountList) {
            System.out.println(account.getAccNo() + "\t" + account.getCustName() + "\t" + account.getAccBal());
        }
    
    }}
  
    	/*public Account search(List<Account> accountList, String accNo) {
        for (Account account : accountList) {
            if (account.getAccNo().equals(accNo)) {
                return account;
            }
        }
        return null;
    }

    public void delete(List<Account> accountList, String accNo) {
    	Account account = search(accountList, accNo);
        if (account != null) {
            accountList.remove(account);
            System.out.println("Account deleted: " + account.getAccNo());
        } else {
            System.out.println("Account not found.");
        }
    }
}*/
