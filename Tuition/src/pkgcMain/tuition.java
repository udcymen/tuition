package pkgcMain;

import java.util.Scanner;

public class tuition {
	public static void main(String[] args){
		double tuition, percentage, total;
		Scanner var = new Scanner(System.in);
		System.out.println("Enter your yearly tuition : ");
		tuition = var.nextDouble();
		System.out.println("Enter the inflation : ");
		percentage = var.nextDouble();
		total = tuition;
		for(int i = 0; i < 3; i++){
			total += Math.pow(tuition, (1 + percentage));
		}
		System.out.printf("The total amount of tuition is %.2f", total);
	}
}
