package assignment2;

public class Commission {
	String empName;
    int empId;
    double salesAmount;

    // Constructor
    public Commission(String empName, int empId, double salesAmount) {
        this.empName = empName;
        this.empId = empId;
        this.salesAmount = salesAmount;
    }

    // Method to calculate commission
    public double calculateCommission() {
        if (salesAmount > 50000) {
            return salesAmount * 0.10;
        } else if (salesAmount > 30000) {
            return salesAmount * 0.07;
        } else if (salesAmount > 10000) {
            return salesAmount * 0.05;
        } else {
            return 0.0;
        }
    }

    // Method to display employee and commission details
    public void display() {
        double commission = calculateCommission();
        System.out.println("\nEmployee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Sales Amount: Rs. " + salesAmount);
        System.out.println("Commission Earned: Rs. " + commission);

}
}