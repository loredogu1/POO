

package bozo;
import java.util.Calendar; // classe feita em aula e feita pelo professor delamaro

public class Random {
	private long p = 2147483648L;
	private long m = 843314861L;
	private long a = 453816693L;
	private long xi = 1023L; // semente usada 
	
	@Override
	public String toString() {
		return ""+(xi);
	}

	public Random(int k) {
		xi = k;
	}
	

	public Random() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		
		xi = Calendar.getInstance().getTimeInMillis() % p;
	}
	
	public void setSemente(int k) { // achar a semente
		xi = k % p;
	}
	
	public double getRand() {
		xi = (a + m * xi ) % p;
		double d = xi;
		return d / p;
	}
	

	public int getIntRand(int max) {
		double d = max * getRand();
		return (int) d;
	}
	
	public int getIntRand() {
		double d = getRand();
		return (int) d;
	}
	

	public int getIntRand(int min, int max) throws IllegalArgumentException {
		if(max <= min) {
			throw new IllegalArgumentException("parametro errado");
		}
		double d = min + getIntRand(max-min);
		return (int) d;
	}
}