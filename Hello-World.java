package meiju;
enum Coin1{
	NICKEL(5),PENNY(1),DIME(10),QUARTER(25);
	private final int value;
	Coin1(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
}
enum Coincolor1{
	COPPER,NICKEL,SILVER
}
public class Coin {
	public static void main(String[]args){
		for(Coin1 c:Coin1.values()){
			System.out.print(c+" "+c.getValue()+",");
			switch(c){
			case NICKEL:
				System.out.println(Coincolor1.NICKEL);
			    break;
			case PENNY:
				System.out.println(Coincolor1.COPPER);
				break;
			case DIME:
			case QUARTER:
				System.out.println(Coincolor1.SILVER);
				break;
			default:
				System.out.println("Something wrong");
				break;    	 
			}
		}
	}

}
