import java.util.Scanner;
public class Main {
  public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Press 1 for Circle \nPress 2 for Square\nPress 3 for Triangle ");
	
                System.out.print("Press: ");
                int A = sc.nextInt();

	Circle c = new Circle();
	Square s = new Square();
	Triangle t = new Triangle();
        if(A==1){       
                System.out.println(" ");
                System.out.print("Enter the redius of circle: ");
                double circle = sc.nextDouble();

                System.out.println(" ");
                System.out.println("The area of the circle is: " +c.Area(circle));
		System.out.println("The boundary length of circle is: " +c.Boundary_length(circle));
		}



	else if(A==2){
		
                System.out.println(" ");
                System.out.print("Enter the Length of Square: ");
                double square = sc.nextDouble();

                System.out.println(" ");
                System.out.println("The area of Square is: " +s.Area(square));
		System.out.println("The boundary length of Square is: " +s.Boundary_length(square));
		}


	else if(A==3){
		System.out.println(" ");
		System.out.print("Enter the edge of triangle: ");
		double triangle = sc.nextDouble();

		System.out.println(" ");
		System.out.println("The area of Triangle is: " +t.Area(triangle));
		System.out.println("The boundary length of Triangle is : " +t.Boundary_length(triangle));
		System.out.println(" ");	
		}

	else{
		System.out.println("No Output");
		}	

	}


}
