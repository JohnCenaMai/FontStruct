package regular.expression.first;

public class Square extends Shape {

	public Square(Color color) {
		// TODO Auto-generated constructor stub
		super(color);
	}
	
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn. " + color.fill();
	}
	
}
