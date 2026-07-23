package Classes_Objects;

public class BankAccount {

		
		String accountHolder;
		int balance;
		
		void deposit(int amount) {
			this.balance += amount;
			
			// System.out.println("Amount : " + amount);
		}
		
		void withdraw(int amount) {
			this.balance -= amount;
		}
		
		void checkbalance() {
			System.out.println("Balance : " + this.balance);
		}
		
		public static void main(String args[]) {
			
			BankAccount account = new BankAccount();
			
			account.accountHolder = "Akshay";
			
			account.balance = 1000;
			
			account.checkbalance();
			
			account.withdraw(250);
			
			account.checkbalance();
			
			account.deposit(250000);
			
			account.checkbalance();
			
			
			
			
		}
		
		
		

	

}
