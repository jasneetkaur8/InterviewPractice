package comparatorAndComparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		String e1Name = e1.getName();
		String e2Name = e2.getName();
		return e1Name.compareTo(e2Name);
	}
	

}
