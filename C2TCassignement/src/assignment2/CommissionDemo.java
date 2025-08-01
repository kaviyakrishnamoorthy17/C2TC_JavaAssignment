package assignment2;

import java.util.*;
public class CommissionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	     // Input details
	     System.out.print("Enter Employee Name: ");
	     String name = sc.nextLine();

	     System.out.print("Enter Employee ID: ");
	     int id = sc.nextInt();

	     System.out.print("Enter Sales Amount: ");
	     double sales = sc.nextDouble();

	     // Create object of Commission class
	     Commission emp = new Commission(name, id, sales);

	     // Display results
	     emp.display();

	     sc.close();

	}

}