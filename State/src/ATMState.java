
public interface ATMState {
	
	void inserCard();
	
	void ejectCard();
	
	void inserPin(int pinEntered);
	
	void requestCash(int cashToWithdraw);

}
