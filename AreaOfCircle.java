package assignment;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		double pi = Math.PI;
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter radius = ");
        float r = s1.nextFloat();
        double area = pi * r * r;
        System.out.println("area of circle = "+ area);
        s1.close();
     
     
	}

}
