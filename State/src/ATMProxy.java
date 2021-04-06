
public class ATMProxy implements GetATMData {
	
	public ATMState getATMState(){
		
		ATMMachine realATMMachine = new ATMMachine();
		
		return realATMMachine.getATMState();
		
	}
	
	public int getCashInMachine(){
		
		ATMMachine realATMMachine = new ATMMachine();
		
		return realATMMachine.getCashInMachine();
		
	}

	

}
