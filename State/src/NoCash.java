
public class NoCash implements ATMState {
	
	ATMMachine atmMachine;

	public NoCash(ATMMachine newATMMachine) {
		atmMachine= newATMMachine;
	}

	@Override
	public void inserCard() {
		System.out.println("You dont have any money");
		System.out.println("Your card is ejected");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("You dont have any money");
		System.out.println("There is no card to ejected");
		
	}

	@Override
	public void inserPin(int pinEntered) {
		System.out.println("You dont have any money");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("You dont have any money");
		
	}

}
