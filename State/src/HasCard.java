
public class HasCard implements ATMState {
	
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
	}

	@Override
	public void inserCard() {
		System.out.println("You can only insert one card at time");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());

		
	}

	@Override
	public void inserPin(int pinEntered) {
		if(pinEntered == 1234){
			
			System.out.println("You entered correct PIN");
			atmMachine.correctPinEntered=true;
			atmMachine.setATMState(atmMachine.getHasPin());

		}else{
			
			System.out.println("You have entered wrong PIN");
			atmMachine.correctPinEntered=false;
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());


			
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("You have not entered PIN");

		
	}

}
