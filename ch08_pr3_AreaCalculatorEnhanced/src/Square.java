
public class Square implements Shape {

	// Field
	private double width;

	// Constructor
	public Square(double width) {
		this.width = width;
	}

	// Getter and Setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Override of abstract method getArea
	@Override
	public double getArea() {
		return (width * width);
	}

}
