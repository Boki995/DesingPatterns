
public class HasPin implements ATMState {
	
	ATMMachine atmMachine;

	public HasPin(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	@Override
	public void inserCard() {
		System.out.println("Please enter your card");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Your card has ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	@Override
	public void inserPin(int pinEntered) {
		System.out.println("You already have entered PIN");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw > atmMachine.cashInMachine){
			System.out.println("You dont have that much cash avaible");
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		}else{
			System.out.println(cashToWithdraw+" is provide by machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine<=0){
				
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
			
		}
		
	}

}
