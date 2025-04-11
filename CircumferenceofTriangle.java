package assignment;
import java.util.Scanner;
public class CircumferenceofTriangle {
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter  a value= ");
     System.out.println("enter b value = ");
     System.out.println("enter c value = ");
        float a = s1.nextFloat();
        float b = s1.nextFloat();
        float c = s1.nextFloat();
        double cot = a+b+c;
        System.out.println("circumference of triangle = "+ cot);
        s1.close();
     
     
	}

}

