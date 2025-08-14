package pkgday8_task;


class BankAccount{
	private int balance = 1000;
	
	
	public synchronized void withdraw(String user, int amount) {
		System.out.println(user + " is trying to withdraw "+ amount+ " units.");
		
		if(balance >= amount) {
			System.out.println(user + " - Sufficient balance. Processing......");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			balance -= amount;
			System.out.println(user + " - Withdrawal Successful. Remaining balance: "+ balance);
		}else {
			System.out.println(user +" - Insufficient funds. Current balance: "+ balance);
		}
	}
	
	public int getBalance() {
		return balance;
	}
}

public class BankATMSystem {

	public static void main(String[] args) {
		BankAccount sharedAccount = new BankAccount();
		
		Thread t1 = new Thread(() -> {
			sharedAccount.withdraw("User1", 600);
		});
		
		
		Thread t2 = new Thread(()-> {
			sharedAccount.withdraw("User2", 400);
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance in Account: "+ sharedAccount.getBalance());

	}

}
