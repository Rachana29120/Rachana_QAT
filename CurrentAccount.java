
 abstract class CurrentAccount implements BankAccount {
	 
	 @Override
		public void checkbankbalance() {
			System.out.println("the balance of current account can be viewed here");
			
		}

		@Override
		public void validateUser() {
			System.out.println("Valid current account holder");
		}
	}
