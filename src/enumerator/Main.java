package enumerator;

public class Main {

	public static void main(String[] args) {
		
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
   }
}
