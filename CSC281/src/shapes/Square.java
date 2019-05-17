package shapes;

public class Square extends Polygon {
	
	public Square(int num) {
		super(num, num, 4);
	}
	
	// Square: side = val
	// where val is the value of the side
	public String toString() {
		return "Square: side = " + dim1;
	}
	
	public double area() {
		return dim1 * dim2;
	}

}
