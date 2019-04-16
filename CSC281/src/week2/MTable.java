package week2;

public class MTable {

	public static void main(String[] args) {
		
		int[][] table = new int[5][5];

		// How would we need to change this to display an
		// addition table instead?

		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table[0].length; j++)
			{
				System.out.print("(" + i + "," + j + ") = " + (i*j) + "  ");
				table[i][j] = i*j;
			}
			System.out.println();
		}
	}
}
