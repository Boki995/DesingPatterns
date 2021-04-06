
public class NoCard implements ATMState {
	
	ATMMachine atmMachine;

	public NoCard(ATMMachine newATMMachine) {
		atmMachine=newATMMachine;
	}

	@Override
	public void inserCard() {
		System.out.println("Please enter your pin");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	@Override
	public void ejectCard() {
		System.out.println("You didnt enter a card");
		
	}

	@Override
	public void inserPin(int pinEntered) {
		System.out.println("You have not entered your card");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("You have not entered your card");
		
	}

}
