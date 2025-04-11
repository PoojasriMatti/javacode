package assignment;
import java.util.Scanner;
public class AreaofRectangle {
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter length = ");
     System.out.println("enter breadth = ");
        float l = s1.nextFloat();
        float b = s1.nextFloat();
        double area = l * b;
        System.out.println("area of rectangle = "+ area);
        s1.close();
     
     
	}

}
