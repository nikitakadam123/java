import java.util.Scanner;
import java.util.List;
public class AccountMain {

	public static void main(String[] args) {
		AccountInfo ainfo=new AccountInfo();
		List<Account> acclist=ainfo.create();
		ainfo.display(acclist);

	}

}
