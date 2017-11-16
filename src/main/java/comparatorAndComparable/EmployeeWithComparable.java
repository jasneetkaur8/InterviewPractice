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
		int result= this.name.compareTo(e1.getName());
		if(result==0)
			result = Integer.compare(this.getAge(), e1.getAge());
		if(result==0)
			result = Double.compare(this.getSalary(), e1.getSalary());
		return result;
	}

	@Override
	public String toString() {
		return "EmployeeWithComparable [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


}
