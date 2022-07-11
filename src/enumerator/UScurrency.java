package enumerator;

public enum UScurrency {
	PENNY(0.01f),
	NICKLE(0.05f),
	DIME(0.1f),
	QUARTER(0.25f); 
	
	float value;
	
	UScurrency(float value){
		this.value = value;
	}
/*
        UScurrency money = UScurrency.DIME;
		
		System.out.println(money.value);	
 */

}
