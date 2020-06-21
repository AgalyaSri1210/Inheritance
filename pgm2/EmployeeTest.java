package inheritance1;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(sc.next(),sc.nextDouble(),sc.nextInt(),sc.next());
		System.out.println("Name : "+emp.getName()+"\nSalary : "+emp.getSalary()+"\nYear of join : "+emp.getYear()+"\nInsurance number : "+emp.getInsurancenum());
		
	}

}
