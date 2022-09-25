import java.util.Random;

/**
 * 
 */

/**
 * @author Asha
 *
 */
public class TestDemo {
	
	public static int addPositive (int a, int b) {
		
		if (a > 0 && b > 0) {
			return a + b ;
		} 
		else {
			throw new IllegalArgumentException("Both parameters must be positive");
		}

	}
	
	
	int randomNumberSquared() {
		
		int randomInt = getRandomInt();
		return (randomInt * randomInt);
	}
	

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

	
	
	
	
	
	
	
	
}
