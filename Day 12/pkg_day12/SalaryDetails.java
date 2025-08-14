package pkg_day12;

import java.util.Scanner;

public class SalaryDetails {
	double basicPay;
	double bonus;
	double deductions;
	
	
	
	
public SalaryDetails(double basicPay, double bonus, double deductions) {
		super();
		this.basicPay = basicPay;
		this.bonus = bonus;
		this.deductions = deductions;
	}





	
	void display() {
		System.out.println("\n----Display Employee Salary Details: ----");
		System.out.println("Basic Pay: Rs "+basicPay);
		
		System.out.println("Bonus: Rs"+bonus);
		System.out.println("Deductions: Rs "+ deductions);
	}

}
