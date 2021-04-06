
public class Necessity implements Visitable {
	
	private double price;
	
	

	 Necessity(double item) {
		 
		 price = item;
	
	}

	@Override
	public double accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
	
	public double getPrice(){
		
		return price;
	}

}
