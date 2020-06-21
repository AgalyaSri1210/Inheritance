package inheritance1;

public class Employee extends Person{
	private double salary;
	private int year;
	private String insurancenum;
	Employee(String name,double salary,int year,String insurancenum){
		super(name);
		this.salary=salary;
		this.year=year;
		this.insurancenum=insurancenum;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsurancenum() {
		return insurancenum;
	}
	public void setInsurancenum(String insurancenum) {
		this.insurancenum = insurancenum;
	}
	
}
