
public class Triangle implements MyShape {
    double base;
	public double Area(double base){
		this.base=base;

		return ((Math.sqrt(3))/4)*base*base;

	}

	public double Boundary_length(double base){
		this.base=base;

		return 3*base;
	
	}
}
