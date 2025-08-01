package assignment2;

public class Student {
	String name;
    int age;
    String department;

    // Constructor
    public Student (String name, int age, String department) 
    {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);

}
}