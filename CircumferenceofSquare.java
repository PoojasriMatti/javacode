package assignment;
import java.util.Scanner;
public class CircumferenceofSquare{
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter a value = ");
     
        float a = s1.nextFloat(); 
        double cos= 4 * a;
        System.out.println("circumference of square = "+ cos);
        s1.close();
     
     
	}

}

