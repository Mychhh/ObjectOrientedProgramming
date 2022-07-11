package enumerator;

public enum USCoins {
    PENNY(0.01f, "Penny"), 
    NICKLE(0.05f, "Nickle"), 
    DIME(0.1f, "Dime"), 
    QUARTER(0.25f, "Quarter"); 
	
	float value;
	String name;
	
	USCoins(float value, String name){
		this.value = value;
		this.name = name;
	}
/*
 	USCoins coins[] = new USCoins[4];
		
		coins[0] = USCoins.PENNY;
		coins[1] = USCoins.NICKLE;
		coins[2] = USCoins.DIME;
		coins[3] = USCoins.QUARTER;
		
		float sum = 0;
		
		for (USCoins coin : coins ) {
			sum = sum + coin.value;
			System.out.println(coin.value +" "+ coin.name);
		}
		System.out.println(sum);	
 */

}
