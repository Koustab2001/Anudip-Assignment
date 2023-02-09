package labtest2;

//Implementation of Interface Shape in Class Area
public class Area implements Shape{
	
    //Instance variables
	int length;
	int breadth;
	int side;
	int radius;
	static double PI=3.14; //Static variable
	
	//Default Constructor
	public Area()
	{
		super();
	}
	
	//Parameterized Constructor
	public Area(int length, int breadth, int side, int radius)
	{
		super();
		this.length = length;
		this.breadth= breadth;
		this.side = side;
		this.radius = radius;
	}
	
    //Getter and setter method 
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	 //Overriding abstract methods
	public void rectangleArea()
	{
		System.out.println("Area of Rectangle:" +(length*breadth));
	}
	
	public void squareArea()
	{
		System.out.println("Area of Square:" +(side*side));
	}
	
	public void circleArea()
	{
		System.out.println("Area of Circle:" +(PI*radius));
	}
}



