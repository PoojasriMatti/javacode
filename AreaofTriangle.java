package assignment;
import java.util.Scanner;
public class AreaofTriangle {
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter base = ");
     System.out.println("enter height = ");
        float b = s1.nextFloat();
        float h = s1.nextFloat();
        double area = 0.5*b*h;
        System.out.println("area of triangle = "+ area);
        s1.close();
     
     
	}

}
