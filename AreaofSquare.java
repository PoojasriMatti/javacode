package assignment;
import java.util.Scanner;
public class AreaofSquare{
	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter a value = ");
     
        float a = s1.nextFloat(); 
        double area = a * a;
        System.out.println("area ofsquare = "+ area);
        s1.close();
     
     
	}

}
