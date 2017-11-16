package comparatorAndComparable;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		if(e1.getAge()==e2.getAge()){
			return 0;
		}
		return e1.getAge()>e2.getAge()? 1:-1;
	}

}
