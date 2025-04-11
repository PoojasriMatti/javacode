package assignment;
import java.util.Scanner;
public class CircumferenceofCircle {
	public static void main(String[] args) {
		double pi = Math.PI;
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter radius = ");
        float r = s1.nextFloat();
        double coc = 2 * pi * r;
        System.out.println("circumference of circle = "+ coc);
        s1.close();
     
     
	}

}
