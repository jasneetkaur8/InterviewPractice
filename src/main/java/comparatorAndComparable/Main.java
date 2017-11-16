package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("John",27,1000.00));
		employeeList.add(new Employee("Amanda",17,500));
		employeeList.add(new Employee("kerry",36,9999.99));
		employeeList.add(new Employee("leela",20,8273));
		employeeList.add(new Employee("John",52,1400.00));
		employeeList.add(new Employee("John",27,300.00));
		
		System.out.println("\nEmployees before sort");
		printEmployees(employeeList);
		
		Collections.sort(employeeList, new EmployeeAgeComparator());
		System.out.println("\nEmployees after sorted on age");
		printEmployees(employeeList);

		Collections.sort(employeeList, new EmployeeNameComparator());
		System.out.println("\nEmployees after sorted on name");
		printEmployees(employeeList);
		
		Collections.sort(employeeList, Employee.salaryComparator);
		System.out.println("\nEmployees after sorted on salary");
		printEmployees(employeeList);
		
		Collections.sort(employeeList, Employee.salaryComparatorWithLambda);
		System.out.println("\nEmployees after sorted on salary with lambda expression");
		printEmployees(employeeList);
		
		List<EmployeeWithComparable> employeeList2 = new ArrayList<>();
		employeeList2.add(new EmployeeWithComparable("John",27,1000));
		employeeList2.add(new EmployeeWithComparable("Amanda",17,500));
		employeeList2.add(new EmployeeWithComparable("kerry",36,9999.99));
		employeeList2.add(new EmployeeWithComparable("leela",20,8273));
		employeeList2.add(new EmployeeWithComparable("John",52,1400.00));
		employeeList2.add(new EmployeeWithComparable("John",27,300.00));
		System.out.println("\nEmployeesWithComparable before sort");
		printEmployees(employeeList2);
		
		Collections.sort(employeeList2);
		System.out.println("\nEmployeesWithComparable after sort");
		printEmployees(employeeList2);
		
		//Java 8 supports sort directly on list
		employeeList2.sort(new Comparator<EmployeeWithComparable>(){
			public int compare(EmployeeWithComparable e1, EmployeeWithComparable e2){
				return e1.getAge()-e2.getAge();
			}
		});
		System.out.println("\nEmployeesWithComparable after sort on age directly with list");
		printEmployees(employeeList2);
		
		//sort directly on list with lambda expression
		employeeList2.sort((EmployeeWithComparable e1, EmployeeWithComparable e2)->e1.getAge()-e2.getAge());
		System.out.println("\nEmployeesWithComparable after sort on age directly with list");
		printEmployees(employeeList2);

	}
	
	public static void printEmployees(List list){
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

}
