import java.util.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	long salary;
	Employee(int id, String name, long salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int compareTo(Employee emp){
		System.out.println(name+" "+emp.name);
		return name.compareTo(emp.name);
	}
}

public class ArrayList2{
	static ArrayList<Employee> empList = new ArrayList<Employee>();

	public static void main(String arg[]){
		Employee e1 = new Employee(10,"Sai",50000L);
		Employee e2 = new Employee(95,"Sreenu",45000L);
		Employee e3 = new Employee(32,"Mahendra",48000L);
		Employee e4 = new Employee(12,"Ajay",57000L);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		Collections.sort(empList);
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext()){
			Employee temp = it.next();
			System.out.println(temp.id+"  "+temp.name+"  "+temp.salary);
		}
	}
}
	



		
