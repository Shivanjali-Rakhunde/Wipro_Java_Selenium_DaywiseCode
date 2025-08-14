package pkd_day12task;

class SalaryDetails {
   private double basicPay, pf, incentive, bonus, deductions;

    SalaryDetails(double basicPay, double pf, double incentive, double bonus, double deductions) {
        this.basicPay = basicPay;
        this.pf = pf;
        this.incentive = incentive;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    void display() {
        System.out.println("\n-- Salary Details --");
        System.out.println("Basic Pay: ₹" + basicPay);
        System.out.println("Provident Fund (PF): ₹" + pf);
        System.out.println("Incentive: ₹" + incentive);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Deductions: ₹" + deductions);
    }
}
