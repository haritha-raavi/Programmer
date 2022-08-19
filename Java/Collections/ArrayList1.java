
import java.util.*;

 class Student{
	int rollNo;
	String name;
	String branch;
	public Student(int rollNo, String name,String branch){
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
	}
}

class SortByRoll implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		if(s1.rollNo == s2.rollNo)
			return 0;
		else if(s1.rollNo > s2.rollNo)
			return 1;
		else return -1;
	}
}

class SortByName implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class SortByBranch implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s1.branch.compareTo(s2.branch);
	}
}

public class ArrayList1{
	static ArrayList<Student> ar = new ArrayList<Student>();

	public static void main(String arg[]){
		Student s1 = new Student(95,"Haritha", "CSE");
		Student s2 = new Student(110,"Jyoshna", "CIVIL");
		Student s3 = new Student(401,"Anupama", "ECE");
		Student s4 = new Student(92,"Tharuni", "CSE");
		Student s5 = new Student(63,"Vyshnavi", "CSE");
		Student s6 = new Student(101,"Sravani", "CIVIL");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		ar.add(s6);
		SortByRoll r = new SortByRoll();
		SortByName n = new SortByName();
		SortByBranch b = new SortByBranch();
		Collections.sort(ar,b);
		ListIterator<Student> itr = ar.listIterator();
		while(itr.hasNext()){
			Student temp =itr.next();
			System.out.println(temp.rollNo+" "+temp.name+" "+temp.branch);
		}
	}
}