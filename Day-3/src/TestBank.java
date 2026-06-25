import com.mmcoe.bank.Accounts;
import com.mmcoe.bank.BalanceException;

public class TestBank {

	public static void main(String[] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(3000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ac);
		try {
			ac.withdraw(7000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ac);
		
		ac.deposit(2000);
		System.out.println(ac);
		ac.deposit(8000);
		System.out.println(ac);
		
	}
}
