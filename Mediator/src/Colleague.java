
public abstract class Colleague {
	
	private Mediator mediator;
	public int colleagueCode;

	public Colleague(Mediator newMediator) {
		Mediator mediator=newMediator;
		mediator.addColeague(this);
	}
	
	public void saleOffer(String stock, int shares){
		
		mediator.saleOffer(stock, shares, colleagueCode);
		
	}

	public void buyOffer(String stock, int shares){
		
		mediator.buyOffer(stock, shares, colleagueCode);
		
	}
	
	public void setCollCode(int collCode){
		colleagueCode=collCode;
	}
}
