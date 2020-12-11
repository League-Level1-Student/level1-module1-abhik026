package _05_vault;

import java.util.Random;

public class Vault {
int code;
	Vault() {
	Random ran = new Random();
	code = ran.nextInt(999999-100000+1) + 100000;
}

	boolean tryCode(int guess) {
		
		return(guess == code);
		
		}
	}

	


