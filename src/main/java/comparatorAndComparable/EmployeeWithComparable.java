package comparatorAndComparable;

public class EmployeeWithComparable implements Comparable{
	
	private String name;
	private int age;
	private double salary;

	public EmployeeWithComparable(String name, int age, double salary) {
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

	public int compareTo(Object o) {
		EmployeeWithComparable e1 = (EmployeeWithComparable)o;
		return this.name.compareTo(e1.getName());
	}

	@Override
	public String toString() {
		return "EmployeeWithComparable [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


}
