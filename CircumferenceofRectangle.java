package assignment;
import java.util.Scanner;
public class CircumferenceofRectangle {
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter length = ");
     System.out.println("enter breadth = ");
        float l = s1.nextFloat();
        float b = s1.nextFloat();
        double cor = 2*(l+b);
        System.out.println("circumference of rectangle = "+ cor);
        s1.close();
     
     
	}

}
