package week1;

public class RandomLoop {

	public static void main(String[] args) {
		
		System.out.println("Five pseudorandom ints in the range [1, 6]:");
		int count = 1;
		while (count <= 5) {
			System.out.println(1+(int)(6*Math.random()));
			count++;
		}
		
		/*System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println();
		*/
/*
		System.out.println("Five pseudorandom doubles in the range [0,6):");
		System.out.println(6 * Math.random());
		System.out.println(6 * Math.random());
		System.out.println(6 * Math.random());
		System.out.println(6 * Math.random());
		System.out.println(6 * Math.random());
		System.out.println();

		System.out.println("Five pseudorandom integers in the range [0,5]:");
		System.out.println((int) (6 * Math.random()));
		System.out.println((int) (6 * Math.random()));
		System.out.println((int) (6 * Math.random()));
		System.out.println((int) (6 * Math.random()));
		System.out.println((int) (6 * Math.random()));
		System.out.println();

		System.out.println("Five pseudorandom integers in the range [1,6]:");
		System.out.println(1 + ((int) (6 * Math.random())));
		System.out.println(1 + ((int) (6 * Math.random())));
		System.out.println(1 + ((int) (6 * Math.random())));
		System.out.println(1 + ((int) (6 * Math.random())));
		System.out.println(1 + ((int) (6 * Math.random())));
		System.out.println();
*/
	}

}
