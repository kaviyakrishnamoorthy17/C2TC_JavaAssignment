// File: StudentDetails.java
package entityclassassignment1;

class Student {
    int rollNumber;
    String name;
    String department;

    // Constructor
    Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating 3 student objects
        Student s1 = new Student(101, "Arjun", "CSE");
        Student s2 = new Student(102, "Bhavya", "ECE");
        Student s3 = new Student(103, "Charan", "IT");

        // Display student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
