package pkg_day12;

import java.util.Scanner;

public class LeaveDetails {
	int earnedLeave;
	int casualLeave;
	int sickLeave;
	int usedLeave;
	int remaningLeave;
	
	
	
	
public LeaveDetails(int earnedLeave, int casualLeave, int sickLeave, int usedLeave, int remaningLeave) {
		super();
		this.earnedLeave = earnedLeave;
		this.casualLeave = casualLeave;
		this.sickLeave = sickLeave;
		this.usedLeave = usedLeave;
		this.remaningLeave = remaningLeave;
	}





	void display() {
		System.out.println("\n----Dispaly Employee Leave Details:  ----");
        System.out.println("Earned Leaves: " + earnedLeave);
        System.out.println("Casual Leaves: " + casualLeave);
        System.out.println("Sick Leaves: " + sickLeave);
        System.out.println("Maternity Leaves: " + usedLeave);
        System.out.println("Unpaid Leaves: " + remaningLeave);
	}

}
