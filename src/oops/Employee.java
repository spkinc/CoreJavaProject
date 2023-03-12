package oops;

public class Employee {
	public String Name;
	public int EmpId;
	public double Salary;

	public Employee() {

		System.out.println("Inside default cons");
	}

	public Employee(String var1, int var2, double var3) {

		System.out.println("Inside param cons");

		Name = var1;
		EmpId = var2;
		Salary = var3;
	}

	public void DisplayName() {

		System.out.println("Name of the Employee is " + Name);
	}

	public void DisplaySalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary of the Employee is " + Salary);
		System.out.println();
	}
}
