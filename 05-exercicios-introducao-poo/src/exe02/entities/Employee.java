package exe02.entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary * 10 / 100 + grossSalary;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
