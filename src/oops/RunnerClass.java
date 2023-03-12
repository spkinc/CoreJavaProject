package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.Name = "Sweta";
		emp1.EmpId = 1000;
		emp1.Salary = 10000.00;
		emp1.DisplayName();
		emp1.DisplaySalary();
		
		Employee emp2 = new Employee();
		emp2.Name = "David";
		emp2.EmpId = 1001;
		emp2.Salary = 12000.00;
		emp2.DisplayName();
		emp2.DisplaySalary();

		Employee emp3 = new Employee("Rohan", 1002, 11000.00);
		emp3.DisplayName();
		emp3.DisplaySalary();
		
		System.out.println("**** Creating ct1");
		Citizen ct1 = new Citizen();
		ct1.age = 50;
		ct1.Name = "Mike";
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.Print();
		
		System.out.println("**** Creating ct2");
		Citizen ct2 = new Citizen("Rahul","India",30,6789);
		ct2.Print();
		
		System.out.println("**** Creating obj1");
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.Print();
		obj1.Print("Hello Class");

		HDFCBank bank = new HDFCBank();
		bank.Print();
		
		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(5000);
		System.out.println("The salary is " + emp.getSalary());

	}

}
