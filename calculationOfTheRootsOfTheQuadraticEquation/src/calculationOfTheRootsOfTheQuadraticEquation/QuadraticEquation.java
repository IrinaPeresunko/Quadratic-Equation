package calculationOfTheRootsOfTheQuadraticEquation;

public class QuadraticEquation {

	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		System.out.println("a="+a+" "+ "b="+b+" "+"c="+c);
		System.out.println("The quadratic equation: "+a+"x^2"+"+"+b+"x"+"+"+c+"=0");
		
		double discriminant=Math.pow(b, 2)-4*a*c;
		double x1=(-b+Math.sqrt(discriminant))/(2*a);
		double x2=(-b-Math.sqrt(discriminant))/(2*a);
		System.out.println("discriminant= "+discriminant);
		System.out.println("x1="+x1+" "+"x2="+x2);

	}

}
