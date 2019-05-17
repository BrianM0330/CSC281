package shapes;

public class Polygon {
	
	protected int dim1;
	protected int dim2;
	protected int numSides;
	
	public Polygon() {
		dim1 = 0;
		dim2 = 0;
		numSides = 0;
	}
	
	public Polygon(int n1, int n2, int sides) {
		if (n1 > 0)
			dim1 = n1;
		else dim1 = 0;
		if (n2 > 0)
			dim2 = n2;
		else dim2 = 0;
		numSides = sides;
		
	}
	
	public int longestSide() {
		if (dim1 > dim2)
			return dim1;
		else return dim2;
	}
	
	public String toString() {
		return String.format("Polygon: first dim = %d, second dim = %d, number of sides = %d", dim1, dim2, numSides);
	}
	
	// We would want to make this method abstract, i.e. not implemented, in reality
	// since we need to know the particular polygon to compute its area
	public double area() {
		return 0.0;
	}
}
