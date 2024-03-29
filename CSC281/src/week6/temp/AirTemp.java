package week6.temp;

//Brian Mendoza. No collaborators.

public class AirTemp extends Temp {

	private final int MAXC = 60;
	private final int MINC = -90;
	private final int MAXF = 140;
	private final int MINF = -130;

	protected static int numAir = 0;

	public static int getNumAir() {
		return numAir;
	}

	public AirTemp() {
		super(50, 'F');
		numAir = numAir + 1;
	}

	public AirTemp(double initT, char initS) {
		if (initS == 'f' || initS == 'c' || initS == 'F' || initS == 'C') {
			scale = initS;
		} else {
			scale = 'c';
		}
		if (scale == 'c') {
			if (initT <= MAXC && initT >= MINC) {
				tValue = initT;
				numAir = numAir + 1;
			} else {
				tValue = MAXC;
				numAir = numAir + 1;
			}
		} else {
			if (initT <= MAXF && initT >= MINF) {
				tValue = initT;
				numAir = numAir + 1;
			} else {
				tValue = MAXF;
				numAir = numAir + 1;
			}
		}
	}

	public String toString() {
		if (scale == 'c') {
			return String.format("%2f Celsius", tValue);
		} else {
			return String.format("%2f Fahrenheit", tValue);
		}
	}

	public boolean equals(AirTemp other) {
		return this.getF() == other.getF();
	}
}