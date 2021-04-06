
public class EnemyShip {
	
	private String name;
	private double amountdmg;
	
	public String getName(){return name;}
	public void  setName(String newName){ name=newName;}
	public double getAmountdmg(){return amountdmg;}
	public void setAmountdmg(double newAmountdmg){amountdmg=newAmountdmg;}
	
	public void followShip(){
		
		
		System.out.println(getName()+" is following ship");
	}
	
	public void displayEnemyShip(){
	System.out.println(getName()+" is on the screen");
	}
	
	public void enemyShipShots(){
		System.out.println(getName()+" attacks and does "+getAmountdmg());
		}
}
