

public class Circle implements MyShape{

	double radius, Pi=3.1416;
	public double Area(double radius){
		this.radius=radius;

		return Pi*radius*radius;

	}

	
	public double Boundary_length(double radius){
		this.radius=radius;

		return 2*Pi*radius;

	
	}



}
