abstract class SavingsAccount implements BankAccount{
	@Override
	public void checkbankbalance() {
				System.out.println("the balanace of savings account can be viewd here");
				}
		

	@Override
	public void validateUser() {
		System.out.println("Only a valid user of savings account can pass through");
		
	}
	
}
	
	

