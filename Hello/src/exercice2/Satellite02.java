package exercice2;
import java.util.Scanner;
public class Satellite02 {
	public static void main(String[] args) {
		double distance ;
		double duree;
		double vitesse;
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la distance");
		distance =sc.nextDouble();
		System.out.println("donner la duree");
		duree =sc.nextDouble();
		vitesse=distance/duree;
		System.out.println("la vitesse est  "+ vitesse );
		sc.close();
	}
	
	
}
