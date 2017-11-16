package comparatorAndComparable;

import java.util.Comparator;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static Comparator<Employee> salaryComparator = new Comparator<Employee>(){
		public int compare(Employee e1, Employee e2){
			return Double.compare(e1.getSalary(),e2.getSalary());
		}
	};
	
	public static Comparator<Employee> salaryComparatorWithLambda = (Employee e1, Employee e2)->Double.compare(e1.getSalary(),e2.getSalary());
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
